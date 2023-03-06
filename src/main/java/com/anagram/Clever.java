package com.anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Clever {
    private static char[] US_ALPHABET = fillPrimeNumber();
    private static char[] fillPrimeNumber(){
        return IntStream.rangeClosed('A', 'Z')
        .mapToObj(c -> "" + (char) c).collect(Collectors.joining()).toCharArray();
    }

    private static Map<Character, Integer> primeAlpha = new HashMap<>();
    static {
        for(int i=0; i<US_ALPHABET.length; i++){
            int divider = 0;
            int counter = 0;
            int j=0;
            for(j=1; j<Integer.MAX_VALUE; j++){
                for(divider = j; divider >= 1; divider--){
                    if(j%divider==0){
                        counter++;
                    }
                }
                if(counter == 2){
                    if(i==26) break;
                    primeAlpha.put(US_ALPHABET[i], j);
                    i++;
                }
                counter = 0;
            }
        }
        System.out.println(primeAlpha);
    }

    public Clever(String[] args){
                // Arrange
                char[] charArray = new char[args.length];
                if(args == null) System.out.println("Error: args should be filled");
                int i =0;
                for(String arg: args){
                    if(arg.length() >1 || arg.length() == 0){
                        System.out.println("Error: args should be char type");
                    }
                    try{
                        charArray[i] = arg.charAt(0); 
                        i++;
                    } catch (Exception e){
                        System.out.println("Error: args should be char and included in us alphabet");
                    }
                }
        
                // Act
                int result = 1;
                for(char alpha: charArray){
                    result *= primeAlpha.get(alpha);
                }
                System.out.println("Result is " + result);
    }
}
