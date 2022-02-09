package com.github.compare;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        //int B = sc.nextInt();
        String str;
        switch(A/10) {
            case 10:
            case 9:
                str = "A";
                break;
            case 8:
                str = "B";
                break;
            case 7:
                str = "C";
                break;
            case 6:
                str = "D";
                break;
            default:
                str = "F";
        }
        System.out.print(str);
    }
}
