package com.test.sftp;

import com.jcraft.jsch.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * 使用 JSch 上传文件，并且控制上传的速度，同时监控上传进度
 */
public class FileUploadMain {
    public static void main(String[] args) {

        JSch jsch = new JSch();
        UploadMonitor monitor = null;

        try {
            Session session = jsch.getSession("ftpuser", "118.24.157.71", 22);
            session.setPassword("Pass!112%");
            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();

            Channel channel = session.openChannel("sftp");
            channel.connect();

            ChannelSftp c = (ChannelSftp) channel;

            String pwd = c.pwd();
            System.out.println(pwd);
            String src = "D:\\software\\apache-tomcat-6.0.36.zip";
            String dst = c.pwd() + "/apache-tomcat-6.0.36.zip";
            monitor = new UploadMonitor(new File(src).length());

            //是否限制上传速度
            boolean speedLimit = false;
            if (speedLimit) {
                OutputStream os = c.put(dst, monitor, ChannelSftp.OVERWRITE);
                byte[] buff = new byte[1024 * 10]; // 设定每次传输的数据块大小为256KB
                int read;
                if (os != null) {
                    FileInputStream fis = new FileInputStream(src);
                    do {
                        read = fis.read(buff, 0, buff.length);
                        if (read > 0) {
                            os.write(buff, 0, read);
                        }
                        os.flush();
                    } while (read >= 0);
                }
            } else {
                c.put(src, dst, monitor, ChannelSftp.OVERWRITE);
            }
            c.disconnect();
            session.disconnect();
        } catch (Exception e) {

            /**
             * 发生异常后，终止监听
             */
            monitor.stop();

        }

    }


}
