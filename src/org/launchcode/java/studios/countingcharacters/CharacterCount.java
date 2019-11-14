package org.launchcode.java.studios.countingcharacters;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to count");
        String phrase = input.nextLine();
//        String phrase = "helloWorld";
        getCharCount(phrase);
    }

    public static void getCharCount(String phrase) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] charArr = phrase.toCharArray();
        for (char characters : charArr) {
            if (charCountMap.containsKey(characters)) {
                charCountMap.put(characters, charCountMap.get(characters) + 1);
            } else {
                charCountMap.put(characters, 1);
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }System.out.println(charCountMap);
    }
}




