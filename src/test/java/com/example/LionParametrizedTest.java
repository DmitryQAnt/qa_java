package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private Feline feline;

    private final String sex;
    private final boolean expected;


    public LionParametrizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testLionConstructor() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, lion.doesHaveMane());
    }
    @Test
    public void isLionIsEmpty() throws Exception {
        assertThrows(Exception.class, () -> new Lion("абракадабра", feline));
    }
}


