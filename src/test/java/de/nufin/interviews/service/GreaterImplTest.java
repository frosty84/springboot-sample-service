package de.nufin.interviews.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreaterImplTest {
    private Greater greater;

    @BeforeEach
    void setUp() {
        this.greater = new GreaterImpl();
    }

    @Test
    void great() {
        Assertions.assertEquals("Hello test", greater.great("test"));
    }
}