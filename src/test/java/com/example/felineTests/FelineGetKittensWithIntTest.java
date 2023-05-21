package com.example.felineTests;

import org.junit.runners.Parameterized.Parameter;

@org.junit.runner.RunWith(org.junit.runners.Parameterized.class)
public class FelineGetKittensWithIntTest {
    @Parameter
    public int kittensCount;
    @Parameter(1)
    public int kittensResult;

    @org.junit.runners.Parameterized.Parameters
    public static Object[][] kittenAmmount() {

        return new Object[][] {
                {1, 1},
                {5, 5},
                {0, 0},
                {-1, -1},

        };
    }
    @org.junit.Test
            public void getKittensWithInt() {
        com.example.Feline feline = new com.example.Feline();
        org.junit.Assert.assertEquals(kittensResult, feline.getKittens(kittensCount));

    }
}
