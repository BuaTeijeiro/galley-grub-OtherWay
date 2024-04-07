package edu.burger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExtraTest {
    @Test
    public void constructorTest(){
        Dish burger = new Dish("cheese",0.25);
        assertEquals("cheese", burger.getName());
        assertTrue(burger.getPrice().equals(0.25));
    }
}