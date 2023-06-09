package com.example.algorithm.baekjoon;


import java.util.Arrays;

/***
 * @Author : 갈색토마토
 * @Date   : 2023.06.09 (Fri)
 * @Description : BAEKJOON No.15663
 * @URL         : https://www.acmicpc.net/problem/15663
 */
public class BOJ15663 {

    static FastReader scan = new FastReader();
    static StringBuffer sb = new StringBuffer();

    static int N, M;
    static int[] basket, selected, used;

    static void init() {
        N = scan.nextInt();
        M = scan.nextInt();

        basket   = new int[N + 1];
        selected = new int[M + 1];
        used     = new int[N + 1];

        for ( int index = 1 ; index <= N ; index += 1 ) {
            basket[index] = scan.nextInt();
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

            int before = 0;
            for ( int cand = 1 ; cand <= N ; cand += 1 ) {
                if(used[cand] == 1) continue;

                if ( before != basket[cand]) {
                    used[cand]    = 1;
                    selected[row] = basket[cand];
                    before	      = basket[cand];
                    rec_func(row + 1);

                    used[cand] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        init();

        rec_func(1);

        System.out.println(sb.toString());
    }

}
