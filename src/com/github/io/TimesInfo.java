package com.github.io;

import java.util.Scanner;

public class TimesInfo {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.print(
                (B % 10 * A)                + "\n" +
                        ((B % 100 - B % 10)/10 * A) + "\n" +
                        ((B - B % 100)/100 * A)     + "\n" +
                        A * B
        );
    }
}
