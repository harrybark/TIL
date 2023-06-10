package com.example.algorithm.baekjoon;

public class BOJ1182 {

    static FastReader scan = new FastReader();

    /*
     * 입력 : N, 결과 도출 값 : S, 결과 : ans
     * */
    static int N, S, ans;
    static int[] nums;

    static void input() {
        N = scan.nextInt();
        S = scan.nextInt();

        nums = new int[N + 1];
        for ( int i = 1 ; i <= N ; i += 1 ) {
            nums[i] = scan.nextInt();
        }
    }

    /***
     * @param k : K번째 원소를 포함시킬 지 정하는 수
     * @param value : K-1번째 원소까지 골라진 원소들의 합
     */
    static void rec_func(int k, int value) {
        if ( k == N + 1 ) {
            if( value == S ) {
                ans += 1;
            }
        } else {
            // k 번째 원소를 포함시킬 지 결정하고 재귀
            // Include
            rec_func(k + 1, value + nums[k]);

            // Exclude
            rec_func(k + 1, value);
        }
    }

    public static void main(String[] args) {

        input();

        rec_func(1, 0);

        // ans가 "진 부분 집합"만 다루는 지 확인
        if( S == 0) {
            ans -= 1;
        }

        System.out.println(ans);
    }
}
