package com.qa.Day3;

public class Blackjack {
    public static void main(String[] args){
        blackjack(50,20);

    }
    public static int blackjack(int a, int b){
        if (a >= 21 & b >= 21){
            System.out.println("0");
            return 0;
        }
        if (a<21 & b<21){
            if (a > b){
                System.out.println(a);
            }else {
                System.out.println(b);
            }
        } else {
            if (a<21 & b>21){
                System.out.println(a);
            } else{
                System.out.println(b);
            }
        }

        return a;
    }
}
