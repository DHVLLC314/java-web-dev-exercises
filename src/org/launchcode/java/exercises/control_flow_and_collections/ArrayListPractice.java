package org.launchcode.java.exercises.control_flow_and_collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Collections.addAll(num,1,2,3,4,5,6,7,8,9,10);

//        ArrayList<String> wordList = new ArrayList<>();
//        Collections.addAll(wordList,"happy","sad","confused","learn");

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        sumEvenNumber(num);
        wordsByLetterCount(phrase);
    }
    public static void sumEvenNumber(ArrayList<Integer> numList) {
        int sum = 0;
        for (int number : numList) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(numList);
        System.out.println("The sum of all even numbers in this arrayList is: " + sum);
    }
    public static void wordsByLetterCount(String phrase){
        String[] words = phrase.split(" ");
        List<String> newWord = new ArrayList<String>();
        newWord = Arrays.asList(words);

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the word you would like to search");
        int searchLength = input.nextInt();
        input.close();

        for (String word : newWord) {
           if (word.length()==searchLength) {
               System.out.println(word);
           }
        }
    }
}

