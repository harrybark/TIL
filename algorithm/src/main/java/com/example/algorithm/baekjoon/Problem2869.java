package com.example.algorithm.baekjoon;

/***
 * @Author : 갈색토마토
 * @Date   : 2023.03.09 (Thur)
 * @Description : BAEKJOON No.2869
 * @URL         : https://www.acmicpc.net/problem/2869
 */
public class Problem2869 {
    public int solution(int move, int slide, int peak) {

        int location = (peak - slide) / (move - slide);

        if ( (peak - slide) % ( move - slide ) != 0) {
            location += 1;
        }
        return location;
    }

}
