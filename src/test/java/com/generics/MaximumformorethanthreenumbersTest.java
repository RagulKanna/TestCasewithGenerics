package com.generics;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Maximumformorethanthreenumbers {

    @Test
    public void checkmaximumIntegerformorethanthreevalues1() {
        Integer[] inputarray={5,8,9,6,2};
        int max = GetMaximummorethanThreeNumber.getmaximummorethanthreevalue(inputarray);
        Assert.assertEquals(9, max);
    }
    @Test
    public void checkmaximumIntegerformorethanthreevaluesr2 () {
        Integer[] inputarray={8, 2, 6, 7};
        int max = GetMaximummorethanThreeNumber.getmaximummorethanthreevalue(inputarray);
        Assert.assertEquals(8, max);
    }
    @Test
    public void checkmaximumIntegerformorethanthreevalues3 () {
        Integer[] inputarray={5, 6, 1, 7, 3, 2, 4};
        int max = GetMaximummorethanThreeNumber.getmaximummorethanthreevalue(inputarray);
        Assert.assertEquals(7, max);
    }

    @Test
    public void checkmaximumFloatformorethanthreevalues1 () {
        Float[] inputarray={8.3f, 9.55f, 2.66f,7.25f,6.25f};
        float max = GetMaximummorethanThreeNumber.getmaximummorethanthreevalue(inputarray);
        Assert.assertEquals(9.55f, max, 0.0f);
    }
    @Test
    public void checkmaximumFloatformorethanthreevalues2 () {
        Float[] inputarray={9f, 7.25f,6.25f,8f, 2f};
        float max = GetMaximummorethanThreeNumber.getmaximummorethanthreevalue(inputarray);
        Assert.assertEquals(9f, max, 0.0f);
    }
    @Test
    public void checkmaximumFloatformorethanthreevalues3 () {
        Float[] inputarray={7.25f,6.25f,8.66f, 2.5f, 9.7f};
        float max = GetMaximummorethanThreeNumber.getmaximummorethanthreevalue(inputarray);
        Assert.assertEquals(9.7f, max, 0.0f);
    }

    @Test
    public void checkmaximumStringformorethanthreevalues1 () {
        String[] inputarray={"peaches", "apple", "banana","mango","litchi"};
        String max = GetMaximummorethanThreeNumber.getmaximummorethanthreevalue(inputarray);
        Assert.assertEquals("peaches", max);
    }
    @Test
    public void checkmaximumStringformorethanthreevalues2 () {
        String[] inputarray={"apple", "mango","litchi","peaches", "banana"};
        String max = GetMaximummorethanThreeNumber.getmaximummorethanthreevalue(inputarray);
        Assert.assertEquals("peaches", max);
    }
    @Test
    public void checkmaximumStringformorethanthreevalues3 () {
        String[] inputarray={"peaches","litchi","banana", "mango", "apple"};
        String max = GetMaximummorethanThreeNumber.getmaximummorethanthreevalue(inputarray);
        Assert.assertEquals("peaches", max);
    }

    @Test
    public void checkmaximumIntegerformorethanthreevalueswithClass () {
        Integer[] inputarray={5, 6, 2,8,9};
        GetMaximummorethanThreeNumber getmax = new GetMaximummorethanThreeNumber(inputarray);
        int max = (int) (getmax.getmaximummorethanthreevalue());
        Assert.assertEquals(9, max);
    }

    @Test
    public void checkmaximumFloatformorethanthreevalueswithClass () {
        Float[] inputarray={5.5f, 6.98f, 2.05f,4.22f,9.82f};
        GetMaximummorethanThreeNumber getmax = new GetMaximummorethanThreeNumber(inputarray);
        float max = (float) (getmax.getmaximummorethanthreevalue());
        Assert.assertEquals(9.82f, max, 0.0f);
    }

    @Test
    public void checkmaximumStringformorethanthreevalueswithClass () {
        String[] inputarray={"apple", "peaches", "banana","watermelon","mango"};
        GetMaximummorethanThreeNumber getmax = new GetMaximummorethanThreeNumber(inputarray);
        String max = (String) (getmax.getmaximummorethanthreevalue());
        Assert.assertEquals("watermelon", max);
    }
}
