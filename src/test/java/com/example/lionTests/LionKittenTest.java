package com.example.lionTests;


import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class LionKittenTest  {
@Mock
com.example.Feline feline;


    @org.junit.Test
    public void getKittens() throws Exception {

        com.example.Lion lion = new com.example.Lion("Самка",feline);
        org.mockito.Mockito.when(feline.getKittens()).thenReturn(1);
       assertEquals(1, lion.getKittens());
    }
}