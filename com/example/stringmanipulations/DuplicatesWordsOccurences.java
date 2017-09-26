package com.example.stringmanipulations;


import java.util.HashMap;
import java.util.Set;

public class DuplicatesWordsOccurences {

    public static String str = "Betty butter bought some butter but the butter was bitter";

    public static void main(String[] args){
        duplicateWordsAndOccurences(str);
    }

    public static void duplicateWordsAndOccurences(String str){
        //converting the string to array
        String[] myarr = str.split(" ");
        //creating a hashmap to put duplicate words as keys and occurences as values
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for (int i =  0 ; i < myarr.length; i++){
            if(!hm.containsKey(myarr[i])){
                hm.put(myarr[i],1);
            }
            else {
                hm.put(myarr[i],hm.get(myarr[i])+1);
            }
        }
        // extracting the keyset of the hashmap
        Set<String> duplicateWords = hm.keySet();
        //Iterating through keyset and extracting the key more more than one occurrence
        for (String duplicateword : duplicateWords){
            if(hm.get(duplicateword)>1){
                System.out.println(duplicateword+" "+":"+" "+hm.get(duplicateword));
            }
        }


    }


}
