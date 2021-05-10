package com.wpj.exchange;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 8888);
        OutputStream out = s.getOutputStream();
        InputStream input = s.getInputStream();
        out.write("hello".getBytes());
        out.flush();
        s.shutdownOutput();
        byte[] data = new byte[1024];
        int len;
        while ((len = input.read(data)) != -1){
            System.out.println(new String(data,0 ,len));

        }
        s.close();
    }
}
