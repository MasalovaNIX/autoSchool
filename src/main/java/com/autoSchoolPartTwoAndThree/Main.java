package com.autoSchoolPartTwoAndThree;

public class Main {

    public static void main(String[] args){

        int q = 21;
        int w = 8;
        System.out.println(q + " / " + w + " = " +  q/w + " и " + q%w +
                " в остатке");

        int n = 99;
        System.out.println( n/10 + n%10 );


        double m = 169.91;
        System.out.println( (int )(m + 0.5) );

        double s = 169.91;
        int result = (int)Math.round(s);
        System.out.println( result );

        int a = 0;
        int b = 2;
        int c = 5;
        a += b;
        b = c - (a - b);
        c = c + (c + ( a - b )) + (a - (c + ( a - b )));
        System.out.println( "a=" + a + ", b=" +  b + " и c=" + c );
// 58  89  158




    }
}
