package com.test.ulid;

import io.azam.ulidj.MonotonicULID;
import io.azam.ulidj.ULID;

/**
 * @author kevin.chen
 * Date 2024/5/17
 * Time 23:05
 */
public class ULIDUtil {

    private static final MonotonicULID instance = new MonotonicULID();

    private ULIDUtil() {

    }

    /**
     * 生成一个字符长度为26的单调递增的唯一标识符（ULID）字符串。
     *
     * @return 返回一个字符串形式的单调递增的ULID。
     */
    public static String monotonicULID() {
        return instance.generate();
    }

    /**
     * 生成一个字符长度为26的随机的ULID（Universally Unique Lexicographically Sortable Identifier）字符串。
     * ULID是一种通用的、字典序可排序的唯一标识符生成算法。
     *
     * @return 生成的ULID字符串
     */
    public static String ulid() {
        return ULID.random();
    }

    /**
     * 通过ULID字串，获取ULID的生成时间戳。然后将时间戳转换为时间类型
     */
    public static long getTimestamp(String ulid) {
        // 验证输入是否为null或空
        if (ulid == null || ulid.isEmpty()) {
            throw new IllegalArgumentException("ULID不能为空");
        }
        if (ulid.length() != 26) {
            throw new IllegalArgumentException("ULID长度不正确");
        }
        if (!ULID.isValid(ulid)) {
            throw new IllegalArgumentException("ULID格式不正确");
        }
        return ULID.getTimestamp(ulid);
    }

}
