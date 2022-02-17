package com.github.BreakEvenPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int trueCost = sc.nextInt();
        int varCost  = sc.nextInt();
        int saleValue = sc.nextInt();
        int breakPoint;

        if ( saleValue <= varCost ) breakPoint = -1;
        else breakPoint = trueCost / ( saleValue - varCost ) + 1;

        System.out.println(breakPoint);
    }
}
