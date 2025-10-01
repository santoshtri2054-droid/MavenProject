package com.mycompany.mavenproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class MavenProjectTest {

    @Test
    public void testAdd() {
        assertEquals("2 + 3 should equal 5", 5, MavenProject.add(2, 3));
        assertEquals("-2 + 2 should equal 0", 0, MavenProject.add(-2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals("10 - 4 should equal 6", 6, MavenProject.subtract(10, 4));
        assertEquals("2 - 3 should equal -1", -1, MavenProject.subtract(2, 3));
    }

    @Test
    public void testIsEven() {
        assertTrue("4 should be even", MavenProject.isEven(4));
        assertTrue("0 should be even", MavenProject.isEven(0));
        assertFalse("5 should not be even", MavenProject.isEven(5));
    }
}
