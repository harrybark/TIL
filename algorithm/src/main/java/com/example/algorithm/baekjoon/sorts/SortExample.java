package com.example.algorithm.baekjoon.sorts;

import com.example.algorithm.baekjoon.FastReader;

import java.util.Arrays;

public class SortExample {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int N;
    static Elem[] a;

    public static void main(String[] args) {
        input();
        pro();
    }
    static void input() {
        N = scan.nextInt();
        a = new Elem[N];

        for (int i = 0 ; i < N ; i += 1) {
            a[i] = new Elem();
            a[i].name = scan.next();
            a[i].korean = scan.nextInt();
            a[i].english = scan.nextInt();
            a[i].math = scan.nextInt();
        }
    }
    static void pro() {
        // TODO
        // 정렬
        Arrays.sort(a);

        for ( int i = 0 ; i < a.length ; i += 1 ) {
            sb.append(a[i].name).append('n');
        }
        System.out.println(sb.toString());
    }
    static class Elem implements Comparable<Elem> {
        public String name;
        public int korean, english, math;

        @Override
        public int compareTo(Elem other) {
            // TODO
            // 국어, 영어, 수학, 이름 값을 가지고 정렬 기준 정의하기

            // 국어 내림 차순
            if( korean != other.korean ) {
                return other.korean - korean;
            }
            // 영어 점수
            if( english != other.english ) {
                return english - other.english;
            }
            // 수학 점수
            if ( math != other.math ) {
                return other.math - math;
            }
            return name.compareTo(other.name);
        }
    }

}
