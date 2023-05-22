package com.example.catTests;

@org.junit.runner.RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class CatTest {
@org.mockito.Mock
    com.example.Feline feline;
    @org.junit.Test
    public void getSound() {
        com.example.Cat cat = new com.example.Cat(feline);

        org.junit.Assert.assertEquals("Мяу", cat.getSound());
    }

    @org.junit.Test
    public void getFood() throws Exception {

        com.example.Cat cat = new com.example.Cat(feline);
        org.mockito.Mockito.when(feline.eatMeat()).thenReturn(java.util.List.of("Животные", "Птицы", "Рыба"));
        org.junit.Assert.assertEquals(java.util.List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}