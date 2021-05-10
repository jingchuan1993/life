package com.wpj.exchange;

public class Test_Array {
    public static void main(String[] args) {
  int[] arr = new int[10];
  int max = 0;
  int min = 100;
  int avg = 0;
  int total = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
            total += arr[i];
            System.out.println(arr[i]);

        }
        avg = total/arr.length;
        System.out.println("total=" + total + ",max=" + max + ",min=" + min + ",avg=" + avg);


    }

}

