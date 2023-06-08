package com.example.algorithm.baekjoon;

import java.util.Arrays;

public class BOJ15656 {

    static FastReader scan = new FastReader();
    static StringBuffer sb = new StringBuffer();

    static int N, M;
    static int[] selected, basket;

    static void init() {
        N = scan.nextInt();
        M = scan.nextInt();

        basket = new int[N + 1];
        selected = new int[M + 1];

        for (int i = 1 ; i <= N ; i += 1) {
            basket[i] = scan.nextInt();
        }
        Arrays.sort(basket);
    }

    static void rec_func(int row) {

        if ( row == M + 1 ) {
            for ( int i = 1 ; i <= M ; i += 1 ) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for ( int cand = 1; cand <= N ; cand += 1 ) {
                selected[row] = basket[cand];
                rec_func(row + 1);
                selected[row] = 0;
            }
        }
    }

    public static void main(String[] args) {
        init();
        rec_func(1);
        System.out.println(sb.toString());
    }
}
