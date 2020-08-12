package com.qa.Day4;

public class Calculator {
    public static void main(String[] args){
        /**calc(4,2,8);*/
        calc2(9,3,1,7);

    }
    public static void calc(int a, int b, int c){
        if (a*b == c){
            System.out.println(a+ "*"+ b + "=" + c);
            System.out.println(c+ "/"+ b + "=" + a);
            System.out.println(c+ "/"+ a + "=" + b);
        }
        if (a/b == c){
            System.out.println(a+ "/"+ b + "=" + c);
            System.out.println(c+ "*"+ b + "=" + a);
        }
        if (a-b == c){
            System.out.println(a+ "-"+ b + "=" + c);
        }
        if (a+b == c){
            System.out.println(a+ "+"+ b + "=" + c);
        }



    }
    public static void calc2(double a, double b, double c, double d){
        double num1 = a*b;

        System.out.println(a+ "*" + b + "=" + num1);
        System.out.println(num1+ "/" + b + "=" + a);
        if (a+b == c){
            System.out.println(a+ "+"+ b + "=" + c);
            System.out.println(c+ "-"+ b + "=" + a);
            System.out.println(c+ "-"+ a + "=" + b);
        }
        if (a+b == d){
            System.out.println(a+ "+"+ b + "=" + d);
            System.out.println(d+ "-"+ b + "=" + a);
            System.out.println(d+ "-"+ a + "=" + b);
        }
        if (a-b == d){
            System.out.println(a+ "-"+ b + "=" + d);
            System.out.println(d+ "+"+ b + "=" + a);

        }
    }
}
