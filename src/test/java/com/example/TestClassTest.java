package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestClassTest {

    @Test
    void sum() {
        TestClass testClass = new TestClass();

        int a = 2;
        int b = 2;

        int sum = testClass.sum(a, b);

        assertEquals(4, sum);
    }
}