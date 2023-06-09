package com.example.algorithm.baekjoon;

import java.util.Arrays;
/***
 * @Author : 갈색토마토
 * @Date   : 2023.06.09 (Fri)
 * @Description : BAEKJOON No.15657
 * @URL         : https://www.acmicpc.net/problem/15657
 */
public class BOJ15657 {

    /*
	   1.자연수 N과 M 이 주어진다.
	   2.같은 행의 중복을 허용한다. / 다른 행의 중복은 허용하지 않는다.
	   3.오름차순
	 */

    static FastReader scan = new FastReader();
    static StringBuffer sb = new StringBuffer();

    static int N, M;
    static int[] selected, used, basket;

    static void init() {
        N = scan.nextInt();
        M = scan.nextInt();

        selected = new int[M + 1];
        used 	 = new int[N + 1];
        basket 	 = new int[N + 1];

        for ( int i = 1 ; i <= N ; i += 1 ) {
            basket[i] = scan.nextInt();
        }

        Arrays.sort(basket);
    }

    static void rec_func(int row) {

        if ( row == M + 1 ) {
            for ( int i = 1; i <= M ; i += 1 ) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for ( int i = 1 ; i <= N ; i += 1 ) {
                if(selected[row - 1] > basket[i]) continue;

                selected[row] = basket[i];
                used[i]		  = basket[i];
                rec_func(row + 1) ;

                selected[row] = 0;
                used[i]       = 0;
            }
        }
    }

    public static void main(String[] args) {

        init();

        rec_func(1);
        System.out.println(sb.toString());
    }
}
