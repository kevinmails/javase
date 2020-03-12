package com.test.java8;

import org.apache.commons.io.FilenameUtils;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

/**
 * @author kevin
 */
public class Base64Test {

    public static void main(String[] args) {


        String extension = FilenameUtils.getExtension("abc.txt");
        System.out.println(extension);

        byte[] imgBytes = new byte[0];
        try {
            imgBytes = Files.readAllBytes(Path.of("/Users/kevin/Desktop/dfsaf.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String baseStr = Base64.getEncoder().encodeToString(imgBytes);
        System.out.println(baseStr);


    }
}
