package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/***
 * @Author : 갈색토마토
 * @Date   : 2023.06.01 (Thu)
 * @Description : Pascal's Triangle
 * @URL         : https://leetcode.com/problems/pascals-triangle/
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for ( int i = 0 ; i < numRows ; i += 1 ) {
            List<Integer> row = new ArrayList<>(1);
            if( i != 0 ) {
                row.add(1);
            }

            for ( int j = 0; j < i - 1 ; j += 1) {
                List<Integer> before = answer.get(i - 1) ;
                row.add(before.get(j) + before.get(j + 1));
            }

            row.add(1);
            answer.add(row);
        }
        return answer;
    }

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> generate = pascalsTriangle.generate(5);

        for(List<Integer> outer : generate) {
            for(int inner : outer) {
                System.out.print(inner);
            }
            System.out.println();
        }
    }
}
