package com.example.algorithm.programmers;

/***
 * @Author : 갈색토마토
 * @Date   : 2023.04.01 (Sat)
 * @Description : 바탕화면 정리
 * @URL         : https://school.programmers.co.kr/learn/courses/30/lessons/161990
 */
public class DeskTopCleanUp {

    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int maxRow = Integer.MIN_VALUE;
        int minRow = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;
        int minCol = Integer.MAX_VALUE;


        for ( int row = 0; row < wallpaper.length; row += 1) {
            for ( int col = 0; col < wallpaper[0].length(); col += 1 ) {
                if(wallpaper[row].charAt(col) == '#' ) {

                    maxRow = Math.max(maxRow, row);
                    minRow = Math.min(minRow, row);

                    maxCol = Math.max(maxCol, col);
                    minCol = Math.min(minCol, col);
                }
            }
        }
        answer = new int[]{ minRow, minCol, maxRow + 1, maxCol + 1 };
        return answer;
    }
}
