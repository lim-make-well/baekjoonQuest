
package com.github.io;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){


    }

}

//NO: 11021
class Sum7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for(int i = 0; i < times; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            System.out.printf("Case #%d: %d \n", i + 1, x1 + x2 );
        }
    }
}

//NO:11022
class Sum8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for(int i = 0; i < times; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d \n", i + 1, x1, x2, x1 + x2 );
        }
    }
}

//NO:2438
class printStar1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for(int i = 0; i < times; i++){
            for(int j= 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//NO:2439
class printStar2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for(int i = 0; i < times; i++){
            for(int j = i; j < times - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//NO:10871
class smallerX{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[times];

        for(int i = 0; i < times; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < target){
                System.out.printf("%d ",arr[i]);
            }
        }
    }

}