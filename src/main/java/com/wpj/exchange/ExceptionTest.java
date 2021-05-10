package com.wpj.exchange;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) throws IOException {
        new ExceptionTest().manager();

    }
    public  void regist(int num ) throws MyException {
        if (num < 0) {
            throw new MyException("人数不合理,为负值");

        } else {
            System.out.println("登记人数为"  + num);
        }
    }

    public void manager() {
        try {
            regist(-1);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("登记失败");
        }
        System.out.println("本次登记操作结束");
    }

}

class MyException extends Exception {
    public MyException(String mseeage) {
        super(mseeage);
    }
}