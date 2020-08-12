package com.qa.Day4;

public class Factorial {
    public static void main(String[] args){
        factors(3);


    }
    public static void factors(int x){

        int i = 1;
        double ans=x;

        while (ans > 1){
            i++;
            ans = ans/i;
        }
        if (ans !=1){
            System.out.println("None");
        } else {
            System.out.println(i);
        }

    }
}
