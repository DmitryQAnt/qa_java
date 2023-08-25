package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionAlexTest {
    @Test
    public void getFriends() throws Exception {
        LionAlex lionAlex = new LionAlex();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = lionAlex.getFriends();
        assertEquals(expected, actual);

    }
    @Test
    public void doesLionAlexGetKittensIsTrue() throws Exception {
        LionAlex lionAlex = new LionAlex();
        int expectedResult = 0;
        int actualResult = lionAlex.getKittens();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void doesGetPlaceOfLivingIsTrue() throws Exception {
        LionAlex lionAlex = new LionAlex();
        String expectedResult = "Нью-Йоркский зоопарк";
        String actualResult = lionAlex.getPlaceOfLiving();
        assertEquals(expectedResult, actualResult);
    }

}