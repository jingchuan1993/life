package com.wpj.exchange;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        InputStream input = s.getInputStream();
        OutputStream out = s.getOutputStream();
        byte[] data = new byte[1024];
        int len;
        while ((len = input.read(data)) != -1) {
            System.out.println(new String(data,0,len));

        }
        out.write("欢迎".getBytes());
        out.flush();
        s.close();
        ss.close();
    }
}
