package com.qa.Day2;

import java.util.Arrays;

public class Exercise2 {

    public static int Physics;
    public static int Chemistry;
    public static int Biology;
    public static int total;
    public static int percentage;
    public static int PGrade;
    public static int CGrade;
    public static int BGrade;

    public static void main(String[] args) {

        Physics = 120;
        Chemistry = 100;
        Biology = 100;
        total = Physics + Chemistry + Biology;
        PGrade = Physics*100/150;
        BGrade = Biology*100/150;
        CGrade = Chemistry*100/150;




        System.out.println("Chemistry:"+ Chemistry);
        System.out.println("Physics:" + Physics);
        System.out.println("Biology:" + Biology);
        System.out.println("Total:" + total);

        result();

        if (PGrade < 60 | CGrade < 60 | BGrade < 60){
            System.out.println("You failed, You suck");
            return;
        }

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