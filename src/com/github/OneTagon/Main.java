// NO:1006
package com.github.OneTagon;

import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        for( int t = 0; t < time; t++ ) {
            int circleSize = sc.nextInt();
            int platoonSize = sc.nextInt();

            int[] innerCircle = new int[circleSize];
            int[] outerCircle = new int[circleSize];

            for( int c = 0; c < circleSize; c++){
                innerCircle[c] = sc.nextInt();
            }
            for( int c = 0; c < circleSize; c++){
                outerCircle[c] = sc.nextInt();
            }

            //구현
            /* 인접한 값의 합이 소대원 크기보다 작은지 체크
            *  우측의 인접값과의 합이 작을경우 해당위치 배열에 입력
            * */

            int[] checkIO = new int[circleSize];
            int[] checkInnerLeft = new int[circleSize];
            int[] checkOuterLeft = new int[circleSize];

            for( int c = 0; c < circleSize - 1; c++){
                if( platoonSize >= innerCircle[c] + outerCircle[c] ) checkIO[c] = 1;
                if( platoonSize >= innerCircle[c] + innerCircle[c + 1] ) checkInnerLeft[c] = 1;
                if( platoonSize >= outerCircle[c] + outerCircle[c + 1] ) checkOuterLeft[c] = 1;


            }
            if( platoonSize >= innerCircle[circleSize - 1] + outerCircle[circleSize - 1] ) checkIO[circleSize - 1] = 1;
            if( platoonSize >= innerCircle[circleSize - 1] + innerCircle[0] ) checkInnerLeft[circleSize - 1] = 1;
            if( platoonSize >= outerCircle[circleSize - 1] + outerCircle[0] ) checkOuterLeft[circleSize - 1] = 1;
            if( circleSize == 1){
                checkInnerLeft[0] = 0;
                checkOuterLeft[0] = 0;
            }

            //좌우 우선 확인
            int startPoint = -1;
            //소대가 2칸 커버할 수 있는 지역의 양
            int checkTarget = 0;

            //시작 지점 찾기
            if ( checkIO[0] == 1 ) {
                if( !(checkInnerLeft[0] == 1 || checkInnerLeft[checkIO.length - 1] == 1
                        || checkOuterLeft[0] == 1 || checkOuterLeft[checkIO.length - 1] == 1) ){
                    startPoint = 0;
                }

            }else{ //checkIO[i] != 1
                if( !(checkInnerLeft[0] == 1 && checkOuterLeft[checkIO.length - 1] == 1) ||
                        ( checkOuterLeft[0] == 1 && checkOuterLeft[checkIO.length - 1] == 1) ){
                    startPoint = 0;
                }
            }
            if(startPoint == -1) {
                //모든 값이 연결되어있는경우
                startPoint = 0;
                for (int i = 1; i < checkIO.length; i++) {
                    //정보가 겹치지 않는 위치에서 시작
                    if ( checkIO[i] == 1 ) {
                        if( checkInnerLeft[i] == 1 || checkOuterLeft[i] == 1 || checkInnerLeft[i - 1] == 1 || checkOuterLeft[i - 1] == 1){
                            continue;
                        }
                        startPoint = i;
                        break;

                    }else{ //checkIO[i] != 1
                        if( ( checkInnerLeft[i] == 1 && checkOuterLeft[i - 1] == 1) || ( checkOuterLeft[i] == 1 && checkOuterLeft[i - 1] == 1) ){
                            continue;
                        }
                        startPoint = i;
                        break;
                    }
                }
            }

            int endPoint = startPoint;
            do {


                startPoint ++;

                if(startPoint == checkIO.length) startPoint = 0;
            }while(startPoint != endPoint);

            System.out.println( circleSize * 2 - checkTarget );
        }
    }
}