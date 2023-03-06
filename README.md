# Getting Started

Requirement java8+ and maven

## Information

#### Anagram
Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example;
```
 "Balikci" and "Bicakla" are not 
 anagram.
 Because they should be equal to each chars of words and with lengths
```

You can anagram check between two words with `Anagram.class` default constructor.


#### Clever
You can clever algorithm check with `Clever.class` default construstor. 


String[] args is important for both Clever and Anagram classes. 


## Usage

String[] args should be like for Anagram:
    
    {"word1", "word2"}

String[] args should be like for Clever:

    {"A", "F", "E"}

You will pass these letters to a function.

F(x,y,...,z) = (xp) * (yp)*... *(zp)

you have to replace EOF comment from `App.java` to which class do want to call

    //new Clever();
    new Anagram()

or:

    new Clever();
    //new Anagram();


## RUN
    
    mvn clean install

    mvn compile exec:java -Dexec.mainClass="com.anagram.App" -Dexec.args="first tsrif" -q

