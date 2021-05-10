package com.wpj.exchange;



import java.io.*;

public class IOTest {
    public static void main(String[] args) {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
          String s;
        try {
            while ((s = in.readLine()) != null) {

                if ("e".equals(s) || s.equals("exit")) {
                    break;
                }
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
