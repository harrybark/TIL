package com.example.algorithm.baekjoon.sorts;

import com.example.algorithm.baekjoon.FastReader;

import java.util.Arrays;

public class BOJ1015 {

    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int N;
    static Elem[] B;
    static int[] P;

    public static void main(String[] args) {
        input();
        pro();
    }
    static void input() {
        N = scan.nextInt();
        B = new Elem[N];
        P = new int[N];

        for (int i = 0 ; i < N ; i += 1) {
            B[i] = new Elem();
            B[i].num = scan.nextInt();
            B[i].idx = i;
        }
    }
    static void pro() {
        // TODO
        // 정렬
        Arrays.sort(B);

        for( int b_idx = 0; b_idx < N ; b_idx += 1 ) {
            P[B[b_idx].idx] = b_idx;
        }

        for ( int i = 0 ; i < N ; i += 1 ) {
            sb.append(P[i]).append(' ');
        }
        System.out.println(sb.toString());
    }

    static class Elem implements Comparable<Elem> {

        /***
         * @param idx A 배열의 idx 위치를 기억하는 변수
         * @param num A[idx] 의 원래 값
         */
        public int num, idx;

        // TODO
        /*
        1. num 의 비내림차순
        2. num 이 같으면 오름차순
         */
        @Override
        public int compareTo(Elem other) {
            if ( num != other.num ) {
                return  num - other.num;
            }
            return idx - other.idx;
        }
    }
}
