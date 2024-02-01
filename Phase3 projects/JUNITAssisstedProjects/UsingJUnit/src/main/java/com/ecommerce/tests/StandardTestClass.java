package com.ecommerce.tests;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.*;

@DisplayName("JUnit 5 Standard Test Class Example")
public class StandardTestClass {

    @BeforeAll
    static void initAll() {
        System.out.println("initAll()");
    }

    @BeforeEach
    void init() {
        System.out.println("init()");
    }

    @Test
    @DisplayName("A succeeding test")
    void succeedingTest() {
        System.out.println("succeedingTest()");
    }

    @Test
    @DisplayName("A failing test")
    void failingTest() {
        System.out.println("failingTest()");
        fail("a failing test");
    }

    @Test
    @Disabled("For demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    @DisplayName("An aborted test")
    void abortedTest() {
        System.out.println("abortedTest()");
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown()");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("tearDownAll()");
    }
}