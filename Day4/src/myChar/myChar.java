package myChar;
import jdk.swing.interop.SwingInterOpUtils;

public class myChar {

    private char ch;

    public myChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel(){
        if(ch == 'a' || ch == 'A'){
            return true;
        }
        if(ch == 'e' || ch == 'E'){
            return true;
        }
        if(ch == 'i' || ch == 'I'){
            return true;
        }
        if(ch == 'o' || ch == 'O'){
            return true;
        }
        if(ch == 'u' || ch == 'U'){
            return true;
        }
        return false;
    }

    public boolean isConsonant(){
        if(isAlphabet() && !isVowel()){
            return true;
        }
        return false;
    }

    public boolean isDigit(){
        if(ch >= 48 && ch <= 57){
            return true;
        }
        return false;
    }

    public boolean isAlphabet(){
        if(ch >= 97 && ch <= 122){
            return true;
        }
        if(ch >= 65 && ch <=90){
            return true;
        }
        return false;
    }

    public boolean isLowerCase(){
        if(ch >= 97 && ch <= 122){
            return true;
        }
        return false;
    }

    public boolean isUpperCase(){
        if(ch >=65 && ch<=90){
            return true;
        }
        return false;
    }

    public void printLowerCaseAlphabets(){
        for(ch='a';ch<='z';ch++){
            System.out.printf("%c",ch);
        }
        System.out.println();
    }

    public void printUpperCaseAlphabets(){
        for(ch='A';ch<='Z';ch++){
            System.out.printf("%c",ch);
        }
    }
}