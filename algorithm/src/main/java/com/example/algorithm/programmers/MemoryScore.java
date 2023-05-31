package com.example.algorithm.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/***
 * @Author : 갈색토마토
 * @Date   : 2023.05.31 (Wed)
 * @Description : 추억점수
 * @URL         : https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */
public class MemoryScore {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> box = new HashMap<>();
        int idx = 0;
        for ( String nameStr : name ) {
            box.put(nameStr, yearning[idx]);
            idx += 1;
        }

        idx = 0 ;
        for ( String[] photoArr : photo ) {
            int sum = 0 ;
            for ( String photoKey : photoArr ) {
                sum += box.getOrDefault(photoKey, 0);
            }

            answer[idx] = sum;
            idx += 1;
        }

        return answer;
    }

}
