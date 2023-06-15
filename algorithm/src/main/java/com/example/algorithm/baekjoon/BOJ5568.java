package com.example.algorithm.baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BOJ5568 {

    static FastReader scan = new FastReader();
    static StringBuffer sb = new StringBuffer();
    static Set<String> set = new HashSet<>();

    static int N, K;
    static int[] selected, used, basket;

    static void init() {
        N = scan.nextInt();
        K = scan.nextInt();

        selected = new int[K + 1];
        used = new int[N +1];
        basket = new int[N + 1];

        for ( int i = 1 ; i <= N ; i += 1 ) {
            basket[i] = scan.nextInt();
        }

        Arrays.sort(basket);
    }

    static void dfs(int row) {
        if ( row == K + 1) {
            sb = new StringBuffer();
            for ( int i = 1 ; i <= K ; i += 1 ) {
                sb.append(selected[i]);
            }
            set.add(sb.toString());
        } else {
            for ( int cand = 1 ; cand <= N ; cand += 1 )  {
                if(used[cand] == 1) continue;
                selected[row] = basket[cand];
                used[cand] = 1;
                dfs(row + 1);
                selected[row] = 0;
                used[cand] = 0;

            }
        }
    }

    public static void main(String[] args) {
        init();

        dfs(1);

        System.out.println(set.size());
    }



}
