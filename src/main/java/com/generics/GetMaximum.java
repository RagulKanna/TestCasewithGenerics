package com.generics;

public class GetMaximum {

    public static Integer getmaximum(Integer a,Integer b,Integer c)
    {
        Integer max=a;
        if(b.compareTo(max) > 0 && b.compareTo(c) > 0)
            max=b;
        else if(c.compareTo(max) > 0)
            max=c;

        return max;
    }

}
