package com.example.stringmanipulations;

public class OccurenceOfCharacterNoLoop {

    public static void main(String[] args){
        String str = "BettybutterBitterButter";
        char c = 'e';
        int occurencecount =  0;

        occurencecount = str.length() - str.replace("e","").length();
        System.out.println("occurence count :" + occurencecount);
    }
}
