package com.github.compare;

import java.util.Scanner;

public class qurdrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = 1;
        if(A > 0){
            if(B < 0) result = 4;
        }else{
            result = 2;
            if(B < 0) result = 3;
        }
        System.out.print(result);
    }
}
