package myChar;

public class myCharRunner {

    public static void main(String[] args) {

        myChar mchar = new myChar('a');

        System.out.println("Is it a Vowel ? " +mchar.isVowel());
        System.out.println("Is it a Consonant ? " +mchar.isConsonant());
        System.out.println("Is it a Digit ? " +mchar.isDigit());
        System.out.println("is it an Alphabet ? " +mchar.isAlphabet());
        System.out.println("Is it a lowercase alphabet ? " +mchar.isLowerCase());
        System.out.println("Is it a Uppercase alphabet ? " +mchar.isUpperCase());
        System.out.println("Print lower case alphabets : ");
        mchar.printLowerCaseAlphabets();
        System.out.println("Print Upper case alphabets : ");
        mchar.printUpperCaseAlphabets();
    }
}