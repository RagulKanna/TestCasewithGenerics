package com.generics;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaximumTest {
    @Test
    public void checkmaximum1() {
        String max=GetMaximum.getmaximum("peaches","apple","banana");
        Assert.assertEquals("peaches",max);
    }
    @Test
    public void checkmaximum2() {
        String max=GetMaximum.getmaximum("apple","peaches","banana");
        Assert.assertEquals("peaches",max);
    }
    @Test
    public void checkmaximum3() {
        String max=GetMaximum.getmaximum("banana","apple","peaches");
        Assert.assertEquals("peaches",max);
    }
}