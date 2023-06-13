package com.example.algorithm.baekjoon;

public class BOJ11382 {

    static FastReader scan = new FastReader();
    static int A, B, C, sum;

    static void init() {
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        sum = 0;
    }

    static void rec_func() {
        sum = A + B + C;
    }

    public static void main(String[] args) {
        init();

        rec_func();

        System.out.println(sum);
    }
}
