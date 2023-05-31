package com.example.algorithm.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class MemoryScoreTest {

    @Autowired
    private MemoryScore memoryScore;

    @BeforeEach
    public void init() {

        if(memoryScore != null) {
            memoryScore = null;
        } else {
            memoryScore = new MemoryScore();
        }
    }

    @Test
    void testAll() {

        assertAll(
                () -> {
                    assertArrayEquals(memoryScore.solution(
                            new String[] {"may", "kein", "kain", "radi"},
                            new int[]{5, 10, 1, 3},
                            new String[][] {
                                    {"may", "kein", "kain", "radi"},
                                    {"may", "kein", "brin", "deny"},
                                    {"kon", "kain", "may", "coni"}
                            }

                    ), new int[]{19, 15, 6});
                }
        );
    }
}