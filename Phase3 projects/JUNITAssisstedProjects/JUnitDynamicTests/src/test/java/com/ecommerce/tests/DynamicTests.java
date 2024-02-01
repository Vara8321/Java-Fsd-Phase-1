package com.ecommerce.tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.DynamicTest;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

@DisplayName("JUnit 5 Dynamic Tests Example")
public class DynamicTests {

    @TestFactory
    Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
            dynamicTest("simple dynamic test", () -> assertTrue(true)),
            dynamicTest("My Executable Class", new MyExecutable()),
            dynamicTest("Exception Executable", () -> { throw new Exception("Exception Example"); }),
            dynamicTest("simple dynamic test-2", () -> assertTrue(true))
        );
    }

}

class MyExecutable implements Executable {

    @Override
    public void execute() throws Throwable {
        System.out.println("Hello World!");
    }

}
