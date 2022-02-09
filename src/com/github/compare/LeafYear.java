package com.github.compare;

import java.util.Scanner;

public class LeafYear {    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    //int B = sc.nextInt();

    int result = 0;

    if(A % 4 == 0 && (A % 100 != 0 || A % 400 == 0 )){
        result = 1;
    }
    System.out.print(result);
}
}
