package com.example.lionTests;


import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
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