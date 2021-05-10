package com.wpj.exchange;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StringTest {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        for (Integer i : list) {
            System.out.println(i);
        }


    }

    public static void add(List<? super Object> list) {
        list.add(new StringTest());
    }

    }

