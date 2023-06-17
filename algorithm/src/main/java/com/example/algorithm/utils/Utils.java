package com.example.algorithm.utils;

public class Utils {

    public static void print2Array(int[][] arr, int startIdx) {

        for ( int i = startIdx ; i < arr.length ; i += 1 ) {
            for ( int j = startIdx ; j < arr[i].length ; j += 1 ) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
