package com.madv.simple;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

class MainTest {

    @AfterEach
    void tearDown() {
        System.out.println("Тест завершился.");
    }

    @Test
    void main() {
        assumeFalse(5 < 1);
    }
}