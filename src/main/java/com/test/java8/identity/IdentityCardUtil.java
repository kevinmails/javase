package com.test.java8.identity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 陈彬
 * Date 2018/9/5
 * Time 9:47
 */
public interface IdentityCardUtil {
    Pattern pattern = Pattern.compile("^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$");

    /**
     * 通过 @param id 解析出用户的基本信息
     *
     * @param id 18位身份证号
     * @return IdentityCard
     */
    static IdentityCard extIdentityInfo(String id) {
        Objects.requireNonNull(id, "身份证号不能为空");
        if (Objects.equals(id, "")) {
            throw new IllegalArgumentException("身份证号不能为空");
        }
        Matcher matcher = pattern.matcher(id);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("身份证号码不合法");
        }

        String birthdayStr = id.substring(6, 14);
        LocalDate birthday = LocalDate.from(DateTimeFormatter.ofPattern("yyyyMMdd").parse(birthdayStr));
        long age = ChronoUnit.YEARS.between(birthday, LocalDate.now());
        IdentityCard identityCard = IdentityCard.builder().ID(id).birthday(birthday).age(age).build();
        if (Integer.parseInt(id.substring(16).substring(0, 1)) % 2 == 0) {
            identityCard.setSex(IdentityCard.Sex.FEMALE);
        } else {
            identityCard.setSex(IdentityCard.Sex.MALE);
        }
        return identityCard;

    }

}
