package com.qa.Day3;

public class iterators {
    public static void main(String[] args){
        flowchart1();

    }
    public static void flowchart1(){
        int A = 100;
        boolean bigA = true;
        while(bigA){

            if (A>200){
                System.out.println("Finito");
                bigA = false;
            } else {
                System.out.println("A");
                A++;

            }
    }
    }
}
