package com.example.algorithm.baekjoon;

import com.example.algorithm.leetcode.ValidParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

class Problem2869Test {
    @Test
    void testAll() {
        assertAll(
                () -> test(2, 1, 5, (e)-> {
                    assertEquals(4, e);
                }),
                () -> test(5, 1, 6, (e)-> {
                    assertEquals(2, e);
                }),
                () -> test(100, 99, 1000000000, (e)-> {
                    assertEquals(999999901, e);
                })
                );
    }

    private void test(int move, int slide, int peak, Consumer<Integer> consumer) {
        // when
        Problem2869 problem = new Problem2869();
        consumer.accept(problem.solution(move, slide, peak));
    }
}