package com.example.algorithm.baekjoon;

public class BOJ15658 {

    static FastReader scan = new FastReader();
    static StringBuffer sb = new StringBuffer();

    static int N, MAX, MIN;
    static int[] nums, operators, orders;

    static void init() {
        N = scan.nextInt();

        nums = new int[ N + 1];
        operators = new int[5];

        for ( int i = 1 ; i <= N ; i += 1 ) {
            nums[i] = scan.nextInt();
        }

        for (int i = 1; i <= 4; i++) operators[i] = scan.nextInt();

        MAX = Integer.MIN_VALUE;
        MIN = Integer.MAX_VALUE;
    }

    static void rec_func(int k, int value) {

        if ( k == N ) {
            MAX = Math.max(MAX, value);
            MIN = Math.min(MIN, value);
        } else {
            for ( int i = 1; i <= 4 ; i += 1 ) {
                if (operators[i] >= 1){
                    operators[i]-= 1;
                    rec_func(k + 1, calculator(value, i, nums[k + 1]));
                    operators[i] += 1;
                }
            }
        }
    }

    static int calculator(int operand1, int operator, int operand2) {
        if ( operator == 1 ) {
            return operand1 + operand2;
        } else if ( operator == 2 ) {
            return operand1 - operand2;
        } else if ( operator == 3 ) {
            return operand1 * operand2;
        } else {
            return operand1 / operand2;
        }

    }
    public static void main(String[] args) {

        init();

        rec_func(1, nums[1]);

        sb.append(MAX).append("\n").append(MIN);
        System.out.println(sb.toString());
    }
}
