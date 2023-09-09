/*
Write a sample program that will decide whether two strings are anagram.
 */

import java.util.*;

//Count the frequency of each characters in each String and if frequency matches then it's anagram else it's not.

public class AnagramTestAnotherApproach {

    public static boolean isAnagram(String s1, String s2){
        if (s1.length()==0 ||s2.length()==0)
            throw new IllegalArgumentException("Invalid String");
        if(s1==null || s2==null)
            throw new IllegalArgumentException("Invalid String");
        HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hMap1 = new HashMap<Character, Integer>();
        if(s1.length()!=s2.length())
            return false;
        else{
            for(int i=0;i<s1.length();i++){
                if(hMap.containsKey(s1.charAt(i)))
                    hMap.put(s1.charAt(i),hMap.get(s1.charAt(i))+1);
                else
                    hMap.put(s1.charAt(i),1);
            }
            for(int j=0;j<s2.length();j++){
                if(hMap1.containsKey(s2.charAt(j)))
                    hMap1.put(s2.charAt(j), hMap1.get(s2.charAt(j))+1);
                else
                    hMap1.put(s2.charAt(j),1);
            }
        }
//        for(HashMap.Entry<Character, Integer> entry:hMap.entrySet()){
//            char key = entry.getKey();
//            Integer value = entry.getValue();
//        }
//        for(HashMap.Entry<Character, Integer> entry1:hMap1.entrySet()){
//            char key1 = entry1.getKey();
//            Integer value1 = entry1.getValue();
//        }
//        if(hMap.entrySet()==hMap1.entrySet())
//            return true;

        /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        if(hMap.keySet().equals(hMap1)) // This is how you compare Keys of two different hashmaps.
            //Do this..
            HashSet<Integer> set1 = new HashSet<>(hMap1.values());
            HashSet<Integer> set2 = new HashSet<>(hMap1.values());
            if(set1.equals(set2))//This is how you compare the values of two different hashmaps.
        */

        if(hMap.equals(hMap1))
            return true;


        return false;
    }

    public static void main (String args[]){
        System.out.println("Enter the Strings");
        Scanner in = new Scanner(System.in);

        String str1= in.nextLine();
        String str2 = in.nextLine();
        if(isAnagram(str1,str2))
            System.out.println("Two Strings are Anagrams");
        else
            System.out.println("Two Strings are not Anagrams");
    }
}


