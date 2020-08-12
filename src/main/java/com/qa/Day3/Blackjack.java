package com.qa.Day3;

public class Blackjack {
    public static void main(String[] args){
        blackjack(1,22);

    }
    public static int blackjack(int a, int b){
        if (a >= 21 & b >= 21){
            System.out.println("0");
            return 0;
        }
        if (a > b | a<21 | b<21){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
        return a;
    }
}
