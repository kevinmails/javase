package com.net;

import java.net.*;
import java.util.Enumeration;

import static java.net.InetAddress.getLocalHost;

/**
 * Created by KEVIN on 2017/4/2.
 */
public class IP {

    /**
     * 获取本机的ip
     *
     * @return
     */
    public static String getLocalIp() throws SocketException, UnknownHostException {
        String hostAddress = "";
        Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
        InetAddress ip = null;
        while (allNetInterfaces.hasMoreElements()) {
            NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
            Enumeration addresses = netInterface.getInetAddresses();
            while (addresses.hasMoreElements()) {
                ip = (InetAddress) addresses.nextElement();
                if (ip != null && ip instanceof Inet4Address && !ip.isLoopbackAddress()) {
                    hostAddress = getLocalHost().getHostAddress();
                }
            }
        }
        return hostAddress;
    }


    /**
     * 获取8位十六进制
     *
     * @return
     */
    public static String getHexLocalIP() {
        String localIp = getLocalIP();
        String[] ips = localIp.split("\\.");

        String hexLocalIP = "";
        for (String ip : ips) {
            hexLocalIP += String.format("%2s", Integer.toHexString(Integer.parseInt(ip))).replace(" ", "0");
            ;
        }
        return hexLocalIP;

    }

    public static String getLocalIP() {
        try {
            Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress ip;
            while (allNetInterfaces.hasMoreElements()) {
                NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
                Enumeration addresses = netInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    ip = (InetAddress) addresses.nextElement();
                    if (ip instanceof Inet4Address) {
                        if (ip.getHostAddress().equals("127.0.0.1")) {
                            continue;
                        }
                        return ip.getHostAddress();
                    }
                }
            }
        } catch (SocketException e) {
            throw new RuntimeException("获取本机IP Socket异常");
        }
        throw new RuntimeException("获取本机IP 异常");
    }

    public static void main(String[] args) {

        try {
            System.out.println(getLocalIp());
            System.out.println(getLocalIP());
            System.out.println(getHexLocalIP());
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
