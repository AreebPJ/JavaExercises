package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import com.qa.Day2.Day2;
import com.qa.Day2.Exercise2;
import com.qa.Day3.Blackjack;
import com.qa.Day6.Temp;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * Rigorous Test :-)
     */
    @Test
    public void addition()
    {
        Day2 calc = new Day2 ();
        assertEquals(120,calc.addition(100,20));

    }
    @Test
    public void subtraction()
    {
        Day2 calc = new Day2 ();
        assertEquals(80,calc.subtraction(100,20));

    }
    @Test
    public void multiply()
    {
        Day2 calc = new Day2 ();
        assertEquals(2000,calc.multiplication(100,20));

    }
    @Test
    public void divide()
    {
        Day2 calc = new Day2 ();
        assertEquals(0,calc.division(10,20),0);

    }
    @Test
    public void result()
    {
        Exercise2 calc = new Exercise2 ();
        assertEquals(100,calc.result(450),0);

    }
    @Test
    public void pass()
    {
        Exercise2 calc = new Exercise2 ();
        assertEquals(100,calc.pass(100));

    }
    @Test
    public void blackjack()
    {
        Blackjack calc = new Blackjack ();
        assertEquals(1,calc.blackjack(1,22));
        assertEquals(0,calc.blackjack(21,21));
        assertEquals(0,calc.blackjack(21,21));
        assertEquals(50,calc.blackjack(50,20));
        assertEquals(1,calc.blackjack(1,2));
        assertEquals(20,calc.blackjack(5,20));

    }
     static Temp calc;
    @BeforeClass
    public static void initialising(){
        Temp calc = new Temp();
    }
    @Test
    public void Temp()
    {
       assertEquals(37.7778, calc.convertFahrenheitToCelsius(100),0.10);
    }
    @Test
    public void Temp2()
    {

        assertEquals(50, calc.convertCelsiusToFahrenheit(10),0.10);

    }
    @Test
    public void Temp3()
    {

        assertEquals(27, calc.convertKelvinToCelsius(300),0);

    }
    @Test
    public void Temp4()
    {

        assertEquals(283, calc.convertCelsiusToKelvin(10),0);

    }
    @Test
    public void Temp5()
    {

        assertEquals(80.6, calc.convertKelvinToFahrenheit(300),0.10);

    }
    boolean bool;
    @Test
    public void Temp6()
    {

        assertEquals(283, calc.convertFahrenheitToKelvin(50),0.10);
        if (calc.convertFahrenheitToKelvin(32) == 273){
             bool = true;
        }
        assertTrue("True",bool);



    }
}
