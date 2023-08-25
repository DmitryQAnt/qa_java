package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void doesGetKittensIsTheSame() {
        feline.getKittens(1);
        assertEquals(1, feline.getKittens());
    }
    @Test
    public void doesGetKittensNoArgument() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
    @Test
    public void doesGetFamilyIsTrue() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }

}