package com.generics;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaximumTest {

    @Test
    public void checkmaximumInteger1() {
        int max=GetMaximum.getmaximum(8,9,2);
        Assert.assertEquals(9,max);
    }
    @Test
    public void checkmaximumInteger2() {
        int max=GetMaximum.getmaximum(9,8,2);
        Assert.assertEquals(9,max);
    }
    @Test
    public void checkmaximumInteger3() {
        int max = GetMaximum.getmaximum(8, 2, 9);
        Assert.assertEquals(9, max);
    }

    @Test
    public void checkmaximumFloat1() {
        float max=GetMaximum.getmaximum(8.3f,9.55f,2.66f);
        Assert.assertEquals(9.55f,max,0.0f);
    }
    @Test
    public void checkmaximumFloat2() {
        float max=GetMaximum.getmaximum(9f,8f,2f);
        Assert.assertEquals(9f,max,0.0f);
    }
    @Test
    public void checkmaximumFloat3() {
        float max = GetMaximum.getmaximum(8.66f, 2.5f, 9.7f);
        Assert.assertEquals(9.7f, max, 0.0f);
    }

    @Test
    public void checkmaximumString1() {
        String max=GetMaximum.getmaximum("peaches","apple","banana");
        Assert.assertEquals("peaches",max);
    }
    @Test
    public void checkmaximumString2() {
        String max=GetMaximum.getmaximum("apple","peaches","banana");
        Assert.assertEquals("peaches",max);
    }
    @Test
    public void checkmaximumString3() {
        String max=GetMaximum.getmaximum("banana","apple","peaches");
        Assert.assertEquals("peaches",max);
    }

    @Test
    public void checkmaximumIntegerwithClass() {
        GetMaximum getmax =new GetMaximum(5,6,2);
        int max=(int)(getmax.getmaximum());
        Assert.assertEquals(6,max);
    }

    @Test
    public void checkmaximumFloatrwithClass() {
        GetMaximum getmax =new GetMaximum(5.5f,6.98f,2.05f);
        float max=(float)(getmax.getmaximum());
        Assert.assertEquals(6.98f,max,0.0f);
    }

    @Test
    public void checkmaximumStringwithClass() {
        GetMaximum getmax =new GetMaximum("apple","peaches","banana");
        String max=(String)(getmax.getmaximum());
        Assert.assertEquals("peaches",max);
    }
}