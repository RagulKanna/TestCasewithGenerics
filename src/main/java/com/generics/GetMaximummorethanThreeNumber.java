package com.generics;


    public class GetMaximummorethanThreeNumber<E extends Comparable> {

        E[] inputarray;
        GetMaximummorethanThreeNumber(E[] inputarray)
        {
            this.inputarray=inputarray;

        }

        public E getmaximummorethanthreevalue()
        {
            E result= getmaximummorethanthreevalue(inputarray);
            return result;
        }


        public static<E extends Comparable> E getmaximummorethanthreevalue(E[] inputarray)
        {
            E max =inputarray[0];
            for(E element:inputarray) {
                if( element.compareTo(max) > 0)
                {
                    max=element;
                }
            }

            return max;
        }
}
