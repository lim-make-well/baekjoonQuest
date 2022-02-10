//NO:1002
package com.github.turret;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt = sc.nextInt();

        for(int i = 0; i < attempt; i++){
            int xAxis1 = sc.nextInt();
            int yAxis1 = sc.nextInt();
            int radius1 = sc.nextInt();
            int xAxis2 = sc.nextInt();
            int yAxis2 = sc.nextInt();
            int radius2 = sc.nextInt();

            int displacementEstimatedPoint;

            int distanceTurretX = xAxis1 - xAxis2;
            int distanceTurretY = yAxis1 - yAxis2;
            double distanceTurret = Math.sqrt(distanceTurretX * distanceTurretX + distanceTurretY * distanceTurretY);

            if (xAxis1 == xAxis2 && yAxis1 == yAxis2){
                if(radius1 == radius2){
                    displacementEstimatedPoint = -1;
                } else{
                    displacementEstimatedPoint = 0;
                }

            }else {
                if( radius2 > radius1 + distanceTurret || radius1 > radius2 + distanceTurret || distanceTurret > radius1 + radius2){
                    displacementEstimatedPoint = 0;

                }else if (distanceTurret == radius1 + radius2 || radius2 == radius1 + distanceTurret || radius1 == radius2 + distanceTurret){
                    displacementEstimatedPoint = 1;

                }else if (distanceTurret < radius1 + radius2){
                    displacementEstimatedPoint = 2;

                }else {
                    displacementEstimatedPoint = 0;
                }
            }

            System.out.println(displacementEstimatedPoint);
        }
    }
}