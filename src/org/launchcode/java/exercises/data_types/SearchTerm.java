package org.launchcode.java.exercises.data_types;

import java.util.Scanner;

public class SearchTerm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a search term: ");
        String searchTerm = input.next();
        input.close();
        String phrase = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";

        System.out.println(phrase.contains(searchTerm.toLowerCase()));
        System.out.println("Your search term: (" + searchTerm + ") is found at index: " + phrase.indexOf(searchTerm.toLowerCase()) + " \nYour search term has a length of: " + searchTerm.length());
        String startPhrase = phrase.substring(0,phrase.indexOf(searchTerm.toLowerCase()));
        String endPhrase = phrase.substring(phrase.indexOf(searchTerm.toLowerCase() ) + searchTerm.length() +1 );
        System.out.println(startPhrase + endPhrase);
    }
}
