package com.generics;

public class GetMaximum<E extends Comparable> {

    E value1;
    E value2;
    E value3;

    GetMaximum(E value1,E value2,E value3)
    {
        this.value1=value1;
        this.value2=value2;
        this.value3=value3;
    }

    public E getmaximum()
    {
       E result= getmaximum(value1,value2,value3);
        return result;
    }
    public static<E extends Comparable> E getmaximum(E value1,E value2,E value3)
    {
        E max=value1;
        if(value2.compareTo(max) > 0 && value2.compareTo(value3) > 0)
            max=value2;
        else if(value3.compareTo(max) > 0)
            max=value3;

        return max;
    }

}
