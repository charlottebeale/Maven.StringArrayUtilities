package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean answer = false;
        for(int i =0;i<array.length;i++){
            if(array[i].equals(value)){
                answer = true;
            }
        }
        return answer;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int counter = 0;
        String[] answer = new String[array.length];
        for(int i = array.length-1; i >= 0;i--){


            answer[counter] = array[i];
            counter++;
        }
        return answer;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
    int a = array.length - 1;

        String palindromic[] = new String[array.length];

        for (int i = 0; i < palindromic.length; i++) {
            palindromic[a] = array[i];
            a--;
            }
         return Arrays.equals(palindromic, array);
    }
    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        int index = 0;
        boolean[] visited = new boolean[26];
        String tester = "";

        for(int i = 0; i < array.length; i++){
            tester += array[i];
        }
        tester = tester.replace(" ","");

        System.out.println(tester);

        for(int j = 0; j < tester.length(); j++){
            if('a' <= tester.charAt(j) && tester.charAt(j) <= 'z'){
                index = tester.charAt(j) - 'a';
            }
            else if('A' <= tester.charAt(j) && tester.charAt(j) <= 'Z'){
                index = tester.charAt(j) - 'A';
            }
            visited[index] = true;
        }

        for(int i = 0; i <= 25; i++){

            if(!visited[i]){
                return false;
            }
        }

        return true;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int counter = 0;
        for(int i = 0; i < array.length; i++)
            if(array[i].contains(value)){

                counter++;
            }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] output = new String[array.length - 1];
        int count = 0;
        for (String i : array) {
            if (!i.equals(valueToRemove)) {
                output[count++] = i;
            }

        }

        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] tempArray = new String[array.length];
        int counter = 1;

        tempArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != tempArray[counter - 1]) {
                tempArray[counter] = array[i];
                counter++;
            }
        }
        String[] output = new String[counter];
        for (int i = 0; i < counter; i++) {
            output[i] = tempArray[i];
        }

        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int counter = 1;

        for(int i = 1; i < array.length; i++)
            if(array[i] != array[i-1])counter++;

        String[] output = new String[counter];
        counter = 0;

        StringBuilder sb = new StringBuilder(array[0]);

        for(int i = 1; i < array.length; i++){
            if(array[i] == array[i-1]){
                sb.append(array[i]);
            }
            else{
                output[counter] = sb.toString();
                sb = new StringBuilder(array[i]);
                counter++;
            }
        }
        output[counter] = sb.toString();
        return output;
    }


}
