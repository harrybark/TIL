package com.example.algorithm.baekjoon.sorts;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BOJ20291Sorting {

    public static void main(String[] args) {
        System.out.println("answer : " + new BOJ20291Sorting().solution(new int[]{0,1,0,0}, 1));
    }



    public int solution(int[] student, int k) {
        int answer = -1;
        int idx = student.length - 1;
        int[] repStr = null;

        Set<String> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        for ( int i = idx ; i >= k ; i -= 1 ) {
            sb.delete(0, sb.length());
            int cur = idx - i + 1;
            System.out.println(idx + " / " + i + " / " + cur);

            for ( int start = cur ; start > 0 ; start -= 1 ) {

                repStr = Arrays.copyOfRange(student, 0, student.length - start);
                for ( int c = (repStr.length-1) - i ; c < repStr.length ; c += 1 ) {
                    sb.append(repStr[c]);
                }
                System.out.println(start + " copy : " + Arrays.toString(repStr));

                set.add(sb.toString());
            }
        }
/*
        String[] strArr = set.toArray(new String[]{});

        for (int i = 0 ; i < strArr.length ; i += 1 ) {
            char[] chArr = strArr[i].toCharArray();
            int kCnt = 0;
            for ( int j = 0 ; j < chArr.length; j += 1 ) {
                if ( chArr[j] == '1' ) {
                    kCnt += 1;
                }
            }

            if ( kCnt == k ) {
                answer += 1;
            }
        }
*/
        return answer;
    }

}
