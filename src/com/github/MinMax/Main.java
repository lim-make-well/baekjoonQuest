package com.github.MinMax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();
        int[] arr = new int[times];
        int max = -1000000;
        int min = 1000000;
        for (int t = 0; t < times; t++) {
            arr[t] = sc.nextInt();
            if(max < arr[t]) max = arr[t];
            if(min > arr[t]) min = arr[t];
        }
        System.out.printf("%d %d", min, max);
    }
}

class MaxSection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int maxValue = 0;
        int maxSection = 0;

        for(int t = 0; t < 9; t++){
            arr[t] = sc.nextInt();
            if(maxValue < arr[t]){
                maxValue = arr[t];
                maxSection = t + 1;
            }
        }
        System.out.printf("%d %d", maxValue, maxSection);
    }

}

class NumberCounting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] number = new int[3];
        int[] count = new int[10];

        number[0] = sc.nextInt();
        number[1] = sc.nextInt();
        number[2] = sc.nextInt();

        int times = number[0] * number[1] * number[2];
        for(int i = 0; i < (int) Math.log10(times) + 1; i++) {
            System.out.println(Math.log10(times) + 1);
            count[(int) (times / (Math.pow(10, i))) % 10]++;
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}