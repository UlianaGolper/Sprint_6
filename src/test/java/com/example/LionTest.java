package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class LionTest {
 private final String gender;
 private final boolean expected;


 public LionTest(String gender, boolean expected) {
     this.gender=gender;
     this.expected=expected;

 }

 @Before
 public void init(){
     MockitoAnnotations.initMocks(this);
 }
    @Mock
 Feline feline;

 @Parameterized.Parameters(name = "gender={0}, expected={1}")
 public static Object[][] getGender() {
     return new Object[][]{
             {"Самец", true},
             {"Самка", false},


     };
 }
    @Test
    public void getKittens() throws Exception {
        when(feline.getKittens()).thenReturn(2);
        Lion lion = new Lion(gender, feline);
        assertEquals(2, lion.getKittens());
    }

    @Test
    public void doesHaveMane() throws Exception {
        var lion = new Lion ("Самец", feline);
        assertEquals(true,lion.doesHaveMane());

    }

    @Test
    public void getFood() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        var lion = new Lion (gender, feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

    @Test
    public void checkExсeption() {
        Exception actualExсeption = assertThrows(Exception.class, ()->
      new Lion("Другой пол", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", actualExсeption.getMessage());
    }
}

