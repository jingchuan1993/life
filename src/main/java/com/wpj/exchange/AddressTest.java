package com.wpj.exchange;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress add = InetAddress.getByName("www.baidu.com");
        System.out.println(add);
        System.out.println(add.getHostName());
        System.out.println(add.getHostAddress());
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

    }
}
