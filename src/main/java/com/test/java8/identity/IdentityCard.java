package com.test.java8.identity;

import lombok.*;

import java.time.LocalDate;

/**
 * @author 陈彬
 * Date 2018/9/5
 * Time 9:34
 */
@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString
public class IdentityCard {

    /**
     * 身份证号
     */
    private String ID;
    private Sex sex;
    private LocalDate birthday;
    private long age;


    @ToString
    @Getter
    public enum Sex {
        MALE(1, "男"), FEMALE(2, "女");

        private int code;
        private String value;

        Sex(int type, String value) {
            this.code = type;
            this.value = value;
        }
    }
}
