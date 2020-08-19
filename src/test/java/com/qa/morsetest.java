package com.qa;
import com.qa.Day7.Morsecode;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class morsetest{
    @Before
    public void setUp(){
        Morsecode Morse = new Morsecode();
    }
    @Test
    public void returnEnglish(){
        assertEquals("hello world!",Morsecode.morseToEng(".... . .-.. .-.. --- / .-- --- .-. .-.. -.. -.-.--"));
    }
    @Test
    public void returnMorse(){
        assertEquals(".... . .-.. .-.. --- / .-- --- .-. .-.. -.. -.-.-- ",Morsecode.engToMorse("hello world!"));
    }
}