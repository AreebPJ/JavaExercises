package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import com.qa.Day2.Day2;
import org.junit.Assert;
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
}
