package com.generics;


    public class GetMaximummorethanThreeNumber<E extends Comparable> {

        E[] inputarray;
        E max;
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

        public static<E> void printarray(E[] inputarray,E max)
        {
            System.out.print("Maximum of the following array { ");
            for(E element : inputarray) {
                System.out.printf("%s ", element);
            }
            System.out.println("} is "+max);
            System.out.println();
        }
}
