package com.generics;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaximumTest {
    @Test
    public void checkmaximum1() {
        float max=GetMaximum.getmaximum(8.3f,9.55f,2.66f);
        Assert.assertEquals(9.55f,max,0.0f);
    }
    @Test
    public void checkmaximum2() {
        float max=GetMaximum.getmaximum(9f,8f,2f);
        Assert.assertEquals(9f,max,0.0f);
    }
    @Test
    public void checkmaximum3() {
        float max=GetMaximum.getmaximum(8.66f,2.5f,9.7f);
        Assert.assertEquals(9.7f,max,0.0f);
    }
}