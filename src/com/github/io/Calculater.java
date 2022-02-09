package com.github.io;

import java.util.Scanner;

public class Calculater {

    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        System.out.print(
                ( int1 + int2 ) + "\n" +
                        ( int1 - int2 ) + "\n" +
                        ( int1 * int2 ) + "\n" +
                        ( int1 / int2 ) + "\n" +
                        ( int1 % int2 )
        );
    }
}
