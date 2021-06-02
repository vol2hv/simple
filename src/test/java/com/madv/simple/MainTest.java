package com.madv.simple;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
@Log4j2
class MainTest {

    @AfterEach
    void tearDown() {
        log.info("Тест завершился.");
    }

    @Test
    void main() {
        assumeFalse(5 < 1);
    }
}