package com.qa.Day2;

import java.util.Arrays;

public class Exercise2 {

    public static int Physics;
    public static int Chemistry;
    public static int Biology;
    public static int total;
    public static int percentage;

    public static void main(String[] args) {

        Physics = 12;
        Chemistry = 10;
        Biology = 10;
        total = Physics + Chemistry + Biology;

        System.out.println("Chemistry:"+ Chemistry);
        System.out.println("Physics:" + Physics);
        System.out.println("Biology:" + Biology);
        System.out.println("Total:" + total);
        result();
        pass();

    }
    public static void result(){
        percentage = total * 100 /450;
        System.out.println("Percentage:" + percentage + "%");
    }
    public static void pass(){
        if (percentage > 60){
            System.out.println("Congratulations, You Have passed");
        } else {
            System.out.println("You failed, You suck");
        }
    }
}
/** Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage.
  This class should also have 2 methods:

 Method 1 - displays the results that the person got for each exam and then the total mark.
 Try to make the output neat and bespoke for each exam.
 Method 2 - which finds and displays the percentage that the person received for the exams overall. */