//NO:1004
package com.github.fibonacci;

import java.util.Scanner;

public class Main{
    public static int[] fibonacciArray = new int [41];

    public static void main(String[] args){
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;

        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++ ){
            int number = sc.nextInt();
            fibonacci(number);

            if(number == 0 ){
                System.out.print("1 0\n");
            }else if(number == 1 ){
                System.out.print("0 1\n");
            }else{
                System.out.print(fibonacciArray[number-2] + " " + fibonacciArray[number-1] + "\n");
            }
        }
    }

    public static int fibonacci(int n){
        if (n == 0){
            return 1;
        } else if (n == 1){
            return 1;
        }else if (fibonacciArray[n] != 0){
            return fibonacciArray[n];
        } else {
            fibonacciArray[n] = fibonacci(n - 1) + fibonacci(n - 2);
            return fibonacciArray[n];
        }
    }
}

