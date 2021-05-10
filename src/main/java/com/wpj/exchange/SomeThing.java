package com.wpj.exchange;

public class SomeThing {
    public static void main(String[] something_to_do) {
        Man man = new Man();
        man.help();
    }
}

interface Filial {
    default void help() {
        System.out.println("哈哈哈");
    }
}

interface Spoony {
    default void help() {
        System.out.println("嘻嘻嘻");
    }
}

class Man implements Filial, Spoony {

    @Override
    public void help() {
        System.out.println("呵呵");
        Filial.super.help();
        Spoony.super.help();
    }
}
