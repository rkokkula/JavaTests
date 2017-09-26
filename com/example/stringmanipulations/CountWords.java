package com.example.stringmanipulations;

//program to count the number of words in a string
public class CountWords {


    public static void main(String[] args){
        String str1 = "Betty butter bought some butter";
        countWordsInString(str1);
    }

    private static void countWordsInString(String str){
        String[] myarr = str.split(" ");
        System.out.println(myarr.length);
    }


}
