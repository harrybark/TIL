package com.example.algorithm.baekjoon;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordSorting_1181Test {

    @Test
    void testAll() {
        WordSorting_1181 problem = new WordSorting_1181();
        List<String> res = new ArrayList<>();

        // given
        String[] inputArr = {
                "but", "i", "wont", "hesitate", "no", "more",
                "no", "more", "it", "cannot", "wait", "im", "yours"};

        String[] resArr = {
                "i", "im", "it", "no", "but",
                "more", "wait", "wont", "yours", "cannot", "hesitate"};
        List<String> answer = Arrays.asList(resArr);

        // when
        res = problem.solution(Arrays.asList(inputArr));

        // then
        Assertions.assertThat(res).hasSameElementsAs(answer);

    }

}