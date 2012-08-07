package com.git;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AppTest {
    @Test
    public void testName() {
        assertEquals("name", new App().getName());
    }

    @Test
    public void should_failed() {
        assertFalse(false);
    }
}