package com.generics;

public class GetMaximum {


    public static<E extends Comparable> E getmaximum(E a,E b,E c)
    {
        E max=a;
        if(b.compareTo(max) > 0 && b.compareTo(c) > 0)
            max=b;
        else if(c.compareTo(max) > 0)
            max=c;


        System.out.println(max);
        return max;
    }

}
