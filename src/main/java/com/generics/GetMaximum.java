package com.generics;

public class GetMaximum {

    public static void main(String[] args) {
        String a="apple",b="peaches",c="banana";
        getmaximum(a,b,c);
    }
    public static String getmaximum(String a,String b,String c)
    {
        String max=a;
        if(b.compareTo(max) > 0 && b.compareTo(c) > 0)
            max=b;
        else if(c.compareTo(max) > 0)
            max=c;


       // System.out.println(max);
        return max;
    }

}
