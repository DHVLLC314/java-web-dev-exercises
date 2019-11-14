package org.launchcode.java.exercises.control_flow_and_collections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] someOtherInts = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < someOtherInts.length; i++){
            if (someOtherInts[i]%2!=0) {
                System.out.println(someOtherInts[i]);
            }
        }
        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
        for (int j = 0; j < words.length; j++) {
            System.out.println(words[j]);
        }
        String[] sentence = phrase.split("\\.");
        System.out.println(Arrays.toString(sentence));
        for (int k = 0; k < sentence.length; k++) {
            System.out.println(sentence[k]);
        }
}
}
