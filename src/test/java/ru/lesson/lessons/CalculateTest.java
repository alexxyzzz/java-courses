package ru.lesson.lessons;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void operation() throws Exception {

        assertEquals(64, Calculate.operation(2,6, '^'),0.1 );

    }


}