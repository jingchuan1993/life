package com.wpj.exchange;

import org.junit.Test;

public class Base {
    public static void main(String[] args) {
        char[] arr = new char[] { 'a', 'b', 'c' };
        System.out.println(arr);//abc

        int[] arr1 = new int[] { 1, 2, 3 };
        System.out.println(arr1);//地址值

        double[] arr2 = new double[] { 1.1, 2.2, 3.3 };
        System.out.println(arr2);//地址值
    }

    public static void test1(int b) {
        int a = b % 1000;
        int bai = a / 100;
        int shi = (a - bai * 100) / 10;
        int ge = (a - bai * 100 - shi * 10);
        System.out.println(bai + "," + shi + "," + ge);

    }

    public static void test2(int m, int n) {
        int tmp = 0;
        tmp = m;
        m = n;
        n = tmp;
        System.out.println("m = " + m);


    }

    public static int test3(int a) {
        if (a == 1) {
            return 1;
        }

        return a * test3(a - 1);

    }

    public static int test4(int a){
        if (a == 0){
            return 1;
        }
        if (a == 1) {
            return 4;
        }
        return 2 * test4( a - 1) + test4( a - 2);
    }

    public  static   double test5(double a){
        if ( a == 20){
            return 1;
        }
        if (a == 21) {
            return 4;
        }
        return test5( a + 2) - 2 * test5( a + 1);
    }
}

class Father {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Son extends Father {
    int count = 20;

    @Override
    public void display() {
        System.out.println(this.count);
    }
}
