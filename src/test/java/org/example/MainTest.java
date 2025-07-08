package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class MainTest {
    // memory based output
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void setOriginalOut() {
        System.setOut(originalOut);
    }

    @Test
    public void testValidIndex() {
        int[] numbers = {10, 20, 30, 40, 50};

        assertDoesNotThrow(() -> {
            int value = numbers[2];
            assertEquals(30, value);
        });
    }

    @Test
    public void testInvalidFormat() {

        String input = "a\n";
        String input = "a\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Scanner sc = new Scanner(System.in);

        assertThrows(InputMismatchException.class, ()-> {
            sc.nextInt();
        });
    }
}