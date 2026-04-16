package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testGPA() {
        Main.Student s = new Main.Student("Test", 30, 20, 40);
        assertEquals(10, s.getGPA());
    }

    @Test
    void testGrade() {
        Main.Student s = new Main.Student("Test", 25, 20, 35);
        assertEquals("A", s.getGrade());
    }
}