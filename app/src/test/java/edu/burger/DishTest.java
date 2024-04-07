package edu.burger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DishTest {
    @Test
    public void constructorTest(){
        Dish burger = new Dish("Krabby Patty",1.25);
        assertEquals("Krabby Patty", burger.getName());
        assertTrue(burger.getPrice().equals(1.25));
    }

    public void addExtraTest(){
        Dish burger = new Dish("Krabby Patty",1.25);
        burger.addExtra(new Extra("cheese", 0.25));
        assertEquals(1, burger.countExtras());
        assertEquals(1.5, burger.getTotalPrice(), 0);
    }
}
