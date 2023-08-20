package com.example.algorithm.baekjoon.sorts;

import com.example.algorithm.baekjoon.FastReader;

import java.util.Arrays;

public class BOJ11652Sorting {

    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static long[] a;
    static int N;

    static void input() {
        N = scan.nextInt();
        a = new long[N + 1];
        for ( int i = 0 ; i < N ; i += 1 ) {
            a[i] = scan.nextLong();
        }
    }

    static void pro() {
        // TODO
        // Sort 정렬하기
        Arrays.sort(a, 1, N + 1);

        // mode : 최빈값, modeCnt : 최빈값의 등장 횟수, curCnt : 현재 값(a[1])의 등장 횟수
        long mode = a[1];
        int modeCnt = 1, curCnt = 1;

        // TODO
        // 2번 원소부터 차례대로 보면서, 같은 숫자가 이어서 나오고 있는지, 새로운 숫자가 나왔는지를 판단하여
        // curCnt 를 갱신하고, 최빈 값을 갱신하는 작업을 한다.
        for ( int i = 2 ; i <= N; i += 1 ) {
            if( a[i] == a[i-1] ) {
                curCnt += 1;
            } else {
                curCnt = 1;
            }

            if ( modeCnt < curCnt ) {
                mode = a[i];
            }
        }

        System.out.println(mode);
    }

}
