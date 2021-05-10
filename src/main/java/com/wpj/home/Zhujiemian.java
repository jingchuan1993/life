package com.wpj.home;

import java.util.Scanner;

public class Zhujiemian {
    public static void main(String[] args) {
        Account account = new Account(10000);
        boolean flag = true;
        while (flag) {
            show();
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    account.dayin();
                    break;
                case 2: {
                    System.out.println("请输入金额");
                    int jine = scanner.nextInt();
                    System.out.println("钱是哪来的");
                    String s = scanner.next();
                    account.cunqian(jine, s);
                    break;
                }
                case 3: {
                    System.out.println("请输入金额");
                    int jine = scanner.nextInt();
                    System.out.println("花钱干嘛");
                    String s = scanner.next();
                    account.quqian(jine, s);
                    break;
                }
                case 4:
                    System.out.println("退出系统");
                    flag = false;
                    break;
            }
        }

    }

    public static void show() {
        System.out.println("-------家庭收支记账软件-----------");
        System.out.println("----------1 收支明细-------------");
        System.out.println("----------2 登记收入-------------");
        System.out.println("----------3 登记支出-------------");
        System.out.println("----------4 退    出--------------");
        System.out.print(" ----------请选择(1-4):------------");

    }
}
