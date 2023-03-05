package com.example.algorithm.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void testAll() {
        assertAll(
                () -> test("()", Assertions::assertTrue),
                () -> test("()[]{}", Assertions::assertTrue),
                () -> test("[({})]", Assertions::assertTrue),
                () -> test("(]", Assertions::assertFalse)
        );
    }

    private void test(String given, Consumer<Boolean> consumer) {
        // when
        ValidParentheses validParentheses = new ValidParentheses();

        consumer.accept(validParentheses.isValid(given));
    }

}