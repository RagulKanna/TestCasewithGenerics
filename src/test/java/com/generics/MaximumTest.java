package com.generics;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaximumTest {
    @Test
    public void checkmaximum1() {
        int max=GetMaximum.getmaximum(8,9,2);
        Assert.assertEquals(9,max);
    }
    @Test
    public void checkmaximum2() {
        int max=GetMaximum.getmaximum(9,8,2);
        Assert.assertEquals(9,max);
    }
    @Test
    public void checkmaximum3() {
        int max=GetMaximum.getmaximum(8,2,9);
        Assert.assertEquals(9,max);
    }
}