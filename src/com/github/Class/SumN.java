package com.github.Class;

class Test {
    public long sum ( int[] a ){
        long arrSum = 0;
        for(int i = 0 ; i < a.length; i++) arrSum += a[i];

        return arrSum;
    }
}