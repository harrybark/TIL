package com.example.algorithm.baekjoon;

import java.util.Arrays;

public class BOJ2738 {

    static FastReader scan = new FastReader();
    static StringBuffer sb = new StringBuffer();

    static int N, M;
    static int[][] arr1, arr2;

    static void input() {

        N = scan.nextInt();
        M = scan.nextInt();

        arr1 = new int[N][M];
        arr2 = new int[N][M];

        for ( int row = 0; row < N ; row += 1 ) {
            for ( int col = 0 ; col < M ; col += 1 ) {
                arr1[row][col] = scan.nextInt();
            }
        }

        for ( int row = 0; row < N ; row += 1 ) {
            for ( int col = 0 ; col < M ; col += 1 ) {
                arr2[row][col] = scan.nextInt();
            }
        }
    }

    static void rec_func() {

        for ( int row = 0 ; row < N ; row += 1 ) {
            for ( int col = 0 ; col < M ; col += 1 ) {
                sb.append( arr1[row][col] + arr2[row][col] ).append(" ");
            }
            sb.append("\n");
        }
    }

    public static void main(String[] args) {
        input();

        rec_func();

        System.out.println(sb.toString());
    }
}
