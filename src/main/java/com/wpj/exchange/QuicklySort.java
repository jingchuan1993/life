package com.wpj.exchange;

public class QuicklySort {


    public static void quicklySort(int[] arr,int low,int high){
        int i,j,tmp,t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        tmp = arr[low];
        while (i < j) {
            while (tmp <= arr[j] && i < j) {
                j--;
            }
            while (tmp >= arr[i] && i < j) {
               i++;
            }
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = tmp;
        quicklySort(arr,low,j-1);
        quicklySort(arr,j+1,high);
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 4, 3, 2, 1};
        quicklySort(arr,0,arr.length-1);
    for (int i = 0 ;i < arr.length  ;i++){
        System.out.println(arr[i]);
    }
    }



}
