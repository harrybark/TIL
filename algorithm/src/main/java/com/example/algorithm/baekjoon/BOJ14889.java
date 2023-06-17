package com.example.algorithm.baekjoon;

import com.example.algorithm.utils.Utils;

/***
 * @Author : 갈색토마토
 * @Date   : 2023.06.17 (Sat)
 * @Description : BAEKJOON No.14889
 * @URL         : https://www.acmicpc.net/problem/14889
 */
public class BOJ14889 {

    static FastReader scan = new FastReader();

    // N명을 입력, 최소 값인 MIN
    static int N, MIN;
    // i, j를 위한 2차원 배열
    static int[][] nums;
    // 중복 허용 안함
    static int[] used;

    static void input() {
        N = scan.nextInt();
        nums = new int[N+1][N+1];
        used = new int[N+1];

        for ( int i = 1 ; i <= N ; i += 1 ) {
            for ( int j = 1 ; j <= N ; j += 1 ) {
                nums[i][j] = scan.nextInt();
            }
        }

        MIN = Integer.MAX_VALUE;
    }

    static void diff() {
        int team_start = 0;
        int team_link  = 0;



        int value = Math.abs(team_link - team_start);
        if( value == 0 ) {
            MIN = value;
            System.exit(0);
        }

        MIN = Math.min(MIN, value);
    }

    static void dfs(int K, int idx) {
        if ( K == N / 2 ) {
            diff();
        } else {
            for ( int cand = idx ; cand <= N ; cand += 1 ) {
                if ( used[cand] == 1 ) continue;

                used[cand] = 1;
                dfs(K + 1, idx + 1);
                used[cand] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();

        dfs(1, 1);

        Utils.print2Array(nums, 1);
    }

}
