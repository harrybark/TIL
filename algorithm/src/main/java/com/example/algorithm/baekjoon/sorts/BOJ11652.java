package com.example.algorithm.baekjoon.sorts;

import com.example.algorithm.baekjoon.FastReader;

import java.util.HashMap;
import java.util.Map;

/***
 * @Author : 갈색토마토
 * @Date   : 2023.08.19 (Sat)
 * @Description : BAEKJOON No.11652
 * @URL         : https://www.acmicpc.net/problem/11652
 */
public class BOJ11652 {

    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static long N ;
    static Map<Long, Long> basket = new HashMap<>();

    static void input() {
        N = scan.nextInt();

        for ( int index = 0 ; index < N ; index += 1 ) {
            long cur = scan.nextInt();
            basket.put(cur, basket.getOrDefault(cur, 0L) + 1);
        }

    }

    static void calc() {
        long max = Long.MIN_VALUE, answer = 0;

        for ( Long key : basket.keySet() ) {
            long cur = basket.get(key);
            if ( cur > max) {
                max = cur;
                answer = key;
            }
            else if ( cur == max ) {
                answer = Math.min(answer, key);
            }
        }

        sb.append(answer);
    }

    public static void main(String[] args) {
        input();
        calc();
        System.out.println(sb.toString());
    }
}
