package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;
;

public class FelineTest {

    Feline feline = new Feline();
    List<String> meat = List.of("Животные", "Птицы", "Рыба");
  String family = "Кошачьи";

    @Test
    public void eatMeat() throws Exception {

        Assert.assertTrue(Objects.equals(feline.eatMeat(), meat));
    }

  @Test
   public void getFamily() {
      Assert.assertTrue(Objects.equals(family, (feline.getFamily())));

  };


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

