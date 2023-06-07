package com.example.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
/***
 * @Author : 갈색토마토
 * @Date   : 2023.06.07 (Wed)
 * @Description : BAEKJOON No.15655
 * @URL         : https://www.acmicpc.net/problem/15655
 */
public class BOJ15655 {

    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] used, selected, basket;

    static void init() {
        N = scan.nextInt();
        M = scan.nextInt();

        selected = new int[M + 1];
        used = new int[N + 1];

        basket = new int[N + 1];

        for (int input = 1; input <= N; input += 1) {
            basket[input] = scan.nextInt();
        }

        Arrays.sort(basket);

    }

    static void rec_func(int k) {

        if (k == M + 1) {
            for (int i = 1; i <= M; i += 1) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int cand = 1; cand <= N; cand += 1) {
                if (selected[k - 1] >= basket[cand]) continue;
                selected[k] = basket[cand];
                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        init();
        rec_func(1);
        System.out.println(sb.toString());
    }
}
