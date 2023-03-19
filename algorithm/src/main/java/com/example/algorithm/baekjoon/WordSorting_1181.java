package com.example.algorithm.baekjoon;

import java.util.*;
import java.util.stream.Collectors;

/***
 * @Author : 갈색토마토
 * @Date   : 2023.03.19 (Sun)
 * @Description : BAEKJOON No.1181
 * @URL         : https://www.acmicpc.net/problem/1181
 */

public class WordSorting_1181 {

    public List<String> solution(List<String> basket) {
        Comparator<String> compare = Comparator
                .comparing(String::length)
                .thenComparing(String::compareToIgnoreCase);


        return basket.stream().distinct().sorted(compare).collect(Collectors.toList());
    }

}
