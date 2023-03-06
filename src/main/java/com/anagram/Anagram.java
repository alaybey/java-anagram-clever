package com.anagram;

import java.util.Arrays;


public class Anagram {
    

    public Anagram(String[] args){
        if(args == null || args.length != 2){
            System.out.println("Error: There are just need two words. Please check");
            return;
        }
        if(args[0].length() != args[1].length()){
            System.out.println("Error: These words are not anagram");
            return;
        }
        int lengthOfWords = args[0].length();

        args[0] = args[0].toLowerCase();
        args[1] = args[1].toLowerCase();

        char[] a1 = args[0].toCharArray();
        char[] a2 = args[1].toCharArray();

        
        int[] letters = new int[26];

        for(int i=0; i<lengthOfWords; i++){
            letters[a1[i] - 'a']++;
            letters[a2[i] - 'a']++;
        }

        for(int let: letters){
            if(let % 2 ==1){
                System.out.println("Error: These words are not anagram");
                return;
            }
        }
        
        System.out.println("These word are anagram");

    }
}
