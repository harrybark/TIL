package com.example.algorithm.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class DeskTopCleanUpTest {

    @Autowired
    DeskTopCleanUp deskTopCleanUp;

    @BeforeEach
    public void init() {
        deskTopCleanUp = null;
        deskTopCleanUp = new DeskTopCleanUp();
    }

    @Test
    public void testAll() throws Exception {

        assertAll(
                () -> {
                    assertArrayEquals(deskTopCleanUp.solution(
                            new String[]{".#...", "..#..", "...#."}), new int[]{0, 1, 3, 4});
                },
                () -> {
                    assertArrayEquals(deskTopCleanUp.solution(
                            new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."}), new int[]{1, 3, 5, 8});
                },
                () -> {
                    assertArrayEquals(deskTopCleanUp.solution(
                            new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."}), new int[]{0, 0, 7, 9});
                }

        );
    }

}