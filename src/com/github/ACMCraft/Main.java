//NO:1005
package com.github.ACMCraft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //테스트케이스 개수 입력
        int testCaseNum = sc.nextInt();

        for (int t = 0; t < testCaseNum; t++){
            int buildingAmount = sc.nextInt();
            int buildingRuleSize = sc.nextInt();

            int[][] durationIndex = new int[buildingAmount][buildingRuleSize];  //소요시간 인덱스
            int[] durationTime = new int[buildingAmount];       //소요 시간
            int[] buildingRule = new int[buildingAmount];     //도착지점 인덱스 개수

            //사용자 소요시간 입력
            for (int dt = 0; dt < buildingAmount; dt++){
                durationTime[dt] = sc.nextInt();
            }

            //룰 입력
            for (int r = 0; r < buildingRuleSize; r++){
                int currentBuilding = sc.nextInt() - 1;
                int nextBuilding = sc.nextInt() - 1;

                durationIndex[nextBuilding][ buildingRule[nextBuilding] ] = currentBuilding;

                buildingRule[nextBuilding]++;
            }

            //타겟 입력
            int targetNum = sc.nextInt() - 1;

            //로직 구현
            int targetTime;

            Compare cp = new Compare();
            cp.setDurationIndex(durationIndex);
            cp.setDurationTime(durationTime);
            cp.setBuildingRule(buildingRule);
            cp.setCompareArray(buildingAmount);
            targetTime = cp.compareDuration(targetNum);

            System.out.println(targetTime);
        }
    }

    /*
        IN:
        {
            1, 테스트케이스 수
            4 4, 건물의 개수 N 건물간의 건설 순서 규칙의 총 개수 K
            10 1 100 10, 각 건물당 건설에 걸리는 시간 D_n
            1 2, 건설 순서 X Y (X 건설 후 Y 건설 가능)
            1 3,
            2 4,
            3 4,
            4, 건설해야 할 건물 W
        }
    */
}

class Compare {

    public int[] durationTime;
    public int[][] durationIndex;
    public int[] buildingRule;
    public int[] compareArray;
    public int[] isSetCompareArray;

    public void setDurationIndex(int[][] durationIndex) {
        this.durationIndex = durationIndex;
    }

    public void setDurationTime(int[] durationTime) {
        this.durationTime = durationTime;

    }

    public void setBuildingRule(int[] buildingRule){
        this.buildingRule = buildingRule;
    }

    public void setCompareArray(int length){
        this.isSetCompareArray = new int[length];
        this.compareArray = new int[length];
    }


    public int compareDuration(int targetNum) {
        if (this.buildingRule[targetNum] == 0) {
            return this.durationTime[targetNum];
        }else if(this.buildingRule[targetNum] == 1){
            return this.durationTime[targetNum] + compareDuration(this.durationIndex[targetNum][0]);
        }else if(this.isSetCompareArray[ targetNum ] == 1){
            return this.compareArray[ targetNum ];
        }
        int current = this.durationTime[targetNum] + compareDuration(this.durationIndex[targetNum][0]);
        for (int i = 0; i < this.buildingRule[targetNum] - 1; i++) {
            int next = this.durationTime[targetNum] + compareDuration(this.durationIndex[targetNum][i + 1]);
            if (current < next) {
                current = next;
            }
        }
        this.isSetCompareArray[targetNum] = 1;
        return this.compareArray[ targetNum ] = current ;

    }
}