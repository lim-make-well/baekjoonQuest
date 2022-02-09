package com.github.compare;

import java.util.Scanner;

public class TwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String str;
        if(A > B){
            str = ">";
        }  else if(A == B){
            str = "==";
        }  else{
            str = "<";
        }
        System.out.print(str);
    }
}
