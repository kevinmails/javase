package com.test.java8;


import java.io.File;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author KEVIN
 */
public interface FileUtil {

    static void main(String[] args) {


        File f = new File("D:\\mydir\\新建文件夹");
        System.out.println(f.getName());


        System.out.println("创建文件夹：" + createDirs("D:\\mydir\\新建文件夹"));

//        System.out.println("removed:" + remove(f));

    }

    /**
     * 递归删除文件（夹）
     *
     * @param file 待删除的文件（夹）
     * @return
     */

    static boolean remove(File file) {
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        Arrays.asList(file.listFiles()).forEach(FileUtil::remove);
        return file.delete();
    }

    /**
     * 创建级联文件夹
     *
     * @param dirPath
     * @return
     */
    static boolean createDirs(String dirPath) {
        if (Objects.equals("", dirPath) || Objects.equals(null, dirPath)) {
            return false;
        }
        File file = new File(dirPath);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }
}
