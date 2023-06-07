package com.example.algorithm.baekjoon;

import java.util.Arrays;

/***
 * @Author : 갈색토마토
 * @Date   : 2023.06.07 (Wed)
 * @Description : BAEKJOON No.15654
 * @URL         : https://www.acmicpc.net/problem/15654
 */
public class BOJ15654 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    // 입력되는 정수 N, M
    static int N, M;
    // 선택된 값, 사용된 값
    static int []selected, used, basket;

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();

        basket = new int[N + 1];
        selected = new int[N + 1];
        used 	 = new int[N + 1];

        for ( int i = 1; i <= N ; i += 1 ) {
            basket[i] = scan.nextInt();
        }
        Arrays.sort(basket);

    }

    static void rec_func(int k) {

        if ( k == M + 1 ) {
            for ( int i = 1 ; i <= M ; i += 1 ) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for ( int cand = 1; cand <= N ; cand += 1 ) {
                if ( used[cand] == basket[cand ] ) {
                    continue;
                }

                selected[k] = basket[cand];
                used[cand]	   = basket[cand];

                rec_func(k + 1);
                selected[k] = 0;
                used[cand] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();
        rec_func(1);

        System.out.println(sb.toString());
    }
}
