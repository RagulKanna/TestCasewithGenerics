package com.generics;

public class GetMaximum {

    public static Float getmaximum(Float a,Float b,Float c)
    {
        Float max=a;
        if(b.compareTo(max) > 0 && b.compareTo(c) > 0)
            max=b;
        else if(c.compareTo(max) > 0)
            max=c;


        //System.out.println(max);
        return max;
    }

}
