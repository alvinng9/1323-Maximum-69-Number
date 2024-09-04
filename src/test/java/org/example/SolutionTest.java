package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maximum69NumberTest() {
        Solution solution = new Solution();
        assertEquals(9969, solution.maximum69Number(9669));
        assertEquals(9999, solution.maximum69Number(9996));
        assertEquals(9999, solution.maximum69Number(9999));
    }
}