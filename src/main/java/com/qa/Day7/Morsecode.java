package com.qa.Day7;
public class Morsecode {
    public static void main(String[] args) {
        System.out.println(engToMorse("hello world!"));
        System.out.println(morseToEng(".... . .-.. .-.. --- / .-- --- .-. .-.. -.. -.-.-- "));
    }

    public static String[] morseArray = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--..", "/", "-.-.--"};
    public static String[] englishArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?", " ", "!"};

    public static String morseToEng(String morseInput) {
        String[] morseArrayInput = morseInput.split(" ");
        String english = "";
        for (int i = 0; i < morseArrayInput.length; i++) {
            for (int y = 0; y < morseArray.length; y++) {
                if (morseArrayInput[i].equals(morseArray[y])) {
                    english = english + englishArray[y];
                    break;
                }
            }
        }
        return english;
    }

    public static String engToMorse(String engInput) {
        String[] engArrayInput = engInput.split("");
        String morse = "";
        for (int i = 0; i < engArrayInput.length; i++) {
            for (int y = 0; y < englishArray.length; y++) {
                if (englishArray[y].equals(engArrayInput[i])) {
                    morse = morse + morseArray[y] + " ";
                    break;
                }
            }
        }
        return morse;
    }
}