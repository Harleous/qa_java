package com.example.lionTests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;

public class StrangeLionTest  {
    @Mock
    Feline feline;


    @Test(expected = Exception.class)
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion("Странный лев",feline);




    }


}
