package com.test;

import net.coobird.thumbnailator.Thumbnails;
import org.apache.commons.codec.binary.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 图片压缩工具类
 *
 * @Created with IntelliJ IDEA.
 * @author: ZhangYuSai
 * @Date: 2018/1/18
 * @Time: 14:33
 */
public class CompressUtils {

    //图片压缩比例
    private final static float scale = 0.8f;
    //图片压缩大小
    private final static float outSize = 0.8f;

    /**
     * 字节数组类型图片压缩
     *
     * @param img 字节数组类型
     * @return 字节数组
     */
    public static byte[] compressImg(byte[] img) throws IOException {
        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             ByteArrayInputStream in = new ByteArrayInputStream(img)) {
            Thumbnails.of(in).scale(scale).outputQuality(outSize).toOutputStream(out);
            byte[] compressed = out.toByteArray();
            return compressed;
        }
    }

    /**
     * base64类型图片压缩
     *
     * @param base64 base64类型图片
     * @return base64
     */
    public static String compressBase64Img(String base64) throws IOException {
        byte[] img = Base64.decodeBase64(base64);
        return Base64.encodeBase64String(compressImg(img));
    }

    public static void main(String[] args) {
        String img = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAUgAAAFIAQMAAAAI2vVwAAAABlBMVEUAAAD///+l2Z/dAAAAAnRSTlP//8i138cAAAAJcEhZcwAACxIAAAsSAdLdfvwAAAGCSURBVGiB7dbBbsMwDANQ/v9Pa0hEymqLdVJ2pYclsfNykQm5iOmApaWlpeW7RI6o/3vtuumN5UqytPeaJtf8TCxXMut93YNXfaadsHwg68KSW/5LcrATwPKxpL/zy8rr8oIsR1In1+ffb2ec5RdZo0qeCX5/ZzmTyAjnHGc3gq0BliuZFb9XK7+t4q09WE5ktoWe4ZyiQcuF5CKYaZZfrGfeciajzi7Z2oG3yltOJEEQKMtZecudjKAjjXxsZbfcSOgWkGiNoZDlXKr0mV60n1OqvuVGBj6erym3wHIrwQ6b5UfludJsuZDMMaPLOapBwHIlU6vOUG/IBtGahOVMnghrUo2itsRyLqMlOIIOSvnJuOVU1ga01qDG8NoZLP+WmeLTE85OsEFYrqQGCx6ozxqwHMs6n1hsbsX5ynIn+YjzmrvASFsuJaopUNwx1jbA8pHMUuP0BKXb8pkMRRoqfdQLy4Xsnr0VsvW95VTy5Mo6oyqtUwyWKzkalpaWlpZ9/AAoeza2tOgTCQAAAABJRU5ErkJggg==";

        try {
            byte[] result = CompressUtils.compressImg(Base64.decodeBase64(img));
          String resultStr =  Base64.encodeBase64String(result);
            System.out.println(resultStr);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}