package com.example.felineTests;

@org.junit.runner.RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class FelineTest {

    @org.junit.Test
    public void eatMeatTest() throws Exception {
        com.example.Feline feline = new com.example.Feline();
        org.junit.Assert.assertEquals(java.util.List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }

    @org.junit.Test
    public void getFamilyTest() {
        com.example.Feline feline = new com.example.Feline();
        org.junit.Assert.assertEquals("Кошачьи", feline.getFamily());
    }

@org.mockito.Mock
    com.example.Feline feline;
    @org.junit.Test
    public void getKittensTestNoParameters() {
        feline.getKittens(5);
        org.mockito.Mockito.verify(feline).getKittens(org.mockito.Mockito.anyInt());
    }
}