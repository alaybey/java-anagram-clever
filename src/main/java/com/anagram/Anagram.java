package com.anagram;

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
        for(int i=0; i<lengthOfWords; i++){
            if(args[0].charAt(i) != args[1].charAt(lengthOfWords-1-i)){
                System.out.println("Error: These words are not anagram");
                return;
            }
        }
        System.out.println("These word are anagram");
    }
}
