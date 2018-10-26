package com.test;

import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;

/**
 * @author 陈彬
 * Date 2018/10/25
 * Time 12:21
 * 图片压缩
 */
public class ThumbnailatorTest {
    public static void main(String[] args) throws IOException {


        Thumbnails.of("C:\\Users\\KEVIN\\Desktop\\id.jpg").scale(0.5f).outputQuality(0.2f).toFile("C:\\Users\\KEVIN\\Desktop\\id2.jpg");

    }
}
