package com.test.zip;

import org.zeroturnaround.zip.ZipUtil;

import java.io.File;

/**
 * @author 陈彬
 * Date 2018/11/30
 * Time 14:49
 */
public class ZipFileTest {
    public static void main(String[] args) {

        ZipUtil.pack(new File("D:\\JDK8"),new File("D:\\JDK88.zip"));




    }
}
