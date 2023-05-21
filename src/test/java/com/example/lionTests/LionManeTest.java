package com.example.lionTests;

import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(Parameterized.class)
public class LionManeTest {
    @Parameter
    public String sex;
    @Parameter(1)
    public boolean thereIsMane;
    Feline feline = Mockito.mock(Feline.class);
    @Parameterized.Parameters
    public static Object[][] isThereMane() {

        return new Object[][] {
                {"Самец", true},
                {"Самка", false},

        };
    }
    @Before
    public void init() {
        initMocks(this);

    }

    @Test
    public void doesHaveMane() throws Exception {
        com.example.Lion lion = new com.example.Lion(sex, feline);
        assertEquals( lion.doesHaveMane(), thereIsMane);
        System.out.println("Самец с гривой, самка без. Проверь того странного льва отдельным тестом!");

    }



}