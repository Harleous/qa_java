package com.example.lionTests;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)

public class LionFoodTest {
    @org.mockito.Mock
    com.example.Feline feline;
    @Test
    public void getFood() throws Exception {

        com.example.Lion lion = new com.example.Lion("Самец", feline);
        org.mockito.Mockito.when(feline.getFood("Хищник")).thenReturn(java.util.List.of("Животные", "Птицы", "Рыба"));
        org.junit.Assert.assertEquals(java.util.List.of("Животные", "Птицы", "Рыба"),lion.getFood());

        System.out.println("Все в порядке! Львы едят мясо, птицу или рыбу. :)");
    }
}