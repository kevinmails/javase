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

    public static void main(String[] args) {

        try {
            System.out.println(getLocalIp());
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
