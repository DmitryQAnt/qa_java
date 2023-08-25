package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;
    Cat cat;


    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void testGetFoodList() throws Exception {
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

    @Test
    public void testGetSound() {
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals(expectedResult, actualResult);
    }

}
