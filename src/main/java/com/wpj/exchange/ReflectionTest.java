package com.wpj.exchange;

import jdk.nashorn.internal.ir.CallNode;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = Class.forName("com.wpj.exchange.Fatherr");



        Constructor c = clazz.getDeclaredConstructor(Integer.class);
        c.setAccessible(true);
        Object o1 = c.newInstance(5);
        System.out.println(o1);
    }

    }


class Fatherr implements Serializable {
    int b = 2;

    public Fatherr() {

    }

    private void test() {
        System.out.println("hello");
    }

    public Fatherr(int b) {
        this();
        this.b = b;
    }



}





