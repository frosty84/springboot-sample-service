package de.nufin.interviews.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class GreaterImplTest {
    private Greater greater;

    public static Stream<Arguments> namesProvider() {
        return Stream.of(Arguments.arguments("Nick", "Dave", "Lizzy"));
    }

    @BeforeEach
    void setUp() {
        this.greater = new GreaterImpl();
    }

    @ParameterizedTest
    @MethodSource("namesProvider")
    void great(String name) {
        Assertions.assertEquals("Hello " + name, greater.great(name));
    }
}