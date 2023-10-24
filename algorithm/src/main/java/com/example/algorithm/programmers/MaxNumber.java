package com.example.algorithm.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 *
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 *
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
 *
 * numbers의 길이는 1 이상 100,000 이하입니다.
 * numbers의 원소는 0 이상 1,000 이하입니다.
 * 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 *
 *
 * 완전 탐색
 * 6 10 2
 * 6 2 10
 * 10 6 2
 * 10 2 6
 * 2 10 6
 * 2 6 1
 */
public class MaxNumber {

    static int[] NUMBERS = new int[] {6, 10 ,2};
    //static int[] NUMBERS = new int[] {3, 30, 34, 5, 9};
    static int[] selected, used;
    static List<String> basket;

    static int M, N ;
    static StringBuffer sb = new StringBuffer();

    static void input() {
        N = NUMBERS.length;
        M = NUMBERS.length;
        selected = new int[M];
        used = new int[M];
        basket  = new ArrayList<>();
    }

    public static void main(String[] args) {
        input();
        dfs(0);

        Collections.sort(basket);
        System.out.println(basket.get(basket.size()-1));
    }

    private static void dfs(int k) {

        if ( k == M ) {
            for ( int i = 0 ; i < M ; i += 1 ) {
                sb.append(selected[i]);
            }
            basket.add(sb.toString());
            sb = new StringBuffer();


        } else {
            for ( int i = 0 ; i < N; i += 1 ) {
                if(used[i] == 1) continue;
                selected[k] = NUMBERS[i];
                used[i] = 1;
                dfs(k + 1);
                selected[k] = 0;
                used[i] = 0;
            }
        }
    }

}
