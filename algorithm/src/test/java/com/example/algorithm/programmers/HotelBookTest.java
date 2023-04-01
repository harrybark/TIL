package com.example.algorithm.programmers;

import com.example.algorithm.leetcode.ValidParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Consumer;


import static org.junit.jupiter.api.Assertions.*;

class HotelBookTest {

    @Autowired
    HotelBook hotelBook;

    @BeforeEach
    public void init() {
        hotelBook = null;
        if (hotelBook == null) {
            hotelBook = new HotelBook();
        }
    }

    @Test
    void testAll() {

        assertAll(
                () -> {
                    assertEquals(hotelBook.solution(new String[][]{
                            {"15:00", "17:00"}, {"16:40", "18:20"},
                            {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}
                    }), 3);
                },
                () -> {
                    assertEquals(hotelBook.solution(new String[][]{
                            {"09:10", "10:10"}, {"10:20", "12:20"}
                    }), 1, "Fail Case2");
                },
                () -> {
                    assertEquals(hotelBook.solution(new String[][] {
                            {"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}
                    }), 3);
                }
        );
    }

}