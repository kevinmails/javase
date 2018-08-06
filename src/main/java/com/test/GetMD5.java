package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by KEVIN on 2016/4/13.
 */
public class GetMD5 {

    private final static char[] HEXDIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
            '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final java.lang.String ALGORITHM = "MD5";


    public static String getMD5(File file) throws IOException {
        FileInputStream fis = null;
        try {
            MessageDigest md = MessageDigest.getInstance(ALGORITHM);
            fis = new FileInputStream(file);
            byte[] buffer = new byte[2048];
            int length = -1;
            long s = System.currentTimeMillis();
            while ((length = fis.read(buffer)) != -1) {
                md.update(buffer, 0, length);
            }
            byte[] b = md.digest();
            return byteArrayToHexString(b);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            if (null != fis) {
                fis.close();
            }
        }

    }

    public static String getMD5(String origin) {
        String resultString = origin;
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance(ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return byteArrayToHexString(md.digest(resultString.getBytes()));
    }

    /**
     * 把byte[]数组转换成十六进制字符串表示形式
     *
     * @param tmp 要转换的byte[]
     * @return 十六进制字符串表示形式
     */

    private static String byteArrayToHexString(byte[] tmp) {
        String s;

        // 用字节表示就是 16 个字节
        char str[] = new char[16 * 2]; // 每个字节用 16 进制表示的话，使用两个字符，

        // 所以表示成 16 进制需要 32 个字符
        int k = 0; // 表示转换结果中对应的字符位置
        for (int i = 0; i < 16; i++) { // 从第一个字节开始，对 MD5 的每一个字节

            // 转换成 16 进制字符的转换
            byte byte0 = tmp[i]; // 取第 i 个字节
            str[k++] = HEXDIGITS[byte0 >>> 4 & 0xf]; // 取字节中高 4 位的数字转换,

            // >>> 为逻辑右移，将符号位一起右移
            str[k++] = HEXDIGITS[byte0 & 0xf]; // 取字节中低 4 位的数字转换

        }

        s = new String(str); // 换后的结果转换为字符串
        return s;
    }


    public static void main(String arg[]) {
        String str = "a";

        System.out.println(getMD5(str));

        Thread thread = Thread.currentThread();

    }
}
