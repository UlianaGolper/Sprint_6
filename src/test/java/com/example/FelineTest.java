package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Objects;


public class FelineTest {
    String family = "Кошачьи";
    List<String> meat = List.of("Животные", "Птицы", "Рыба");
    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        Assert.assertEquals(feline.eatMeat(), meat);
    }

    @Test
    public void getFamily() {
        Assert.assertEquals(family, (feline.getFamily()));
    }

    @Test
    public void getKittens() {
        int expectedNumber = feline.getKittens();
        int actualNumber = 1;
        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void getKittensCount() {
        int expected = 1;
        int actual = feline.getKittens(1);
        Assert.assertEquals(expected, actual);
    }
}

