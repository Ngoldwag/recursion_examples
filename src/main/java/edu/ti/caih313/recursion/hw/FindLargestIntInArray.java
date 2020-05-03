package edu.ti.caih313.recursion.hw;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindLargestIntInArray {
    static int findLargestInArray(Array array) {
        int searcher = 0;
        int max=0;
        if (array.length == 0) {
            return array[0];
        }else{
            if (array[searcher] > max) {
                max = array[searcher];
                findLargestInArray(array[searcher + 1]);
            } else{
            findLargestInArray(array[searcher + 1]);
        }
            return max;


    }
    static int findLargerOfTwoNumbers(int max1, int max2) {
        if (max1>max2){return max1;}
        else {return max2;}

}
    public static void main(String args[]){
        int sampleArray[2,45,3,4,6,3,7,5,56,78,3,1]; //this is the array gor the example
        int length = sampleArray.length; //this finds the length of the array
        int middle = length/2; //this gives the midpoint of the array
        int maxFromFirstHalf= findLargestInArray(Arrays.copyOfRange(sampleArray, 0, sampleArray[middle-1])); //this gets the max of the first half of the array
        int maxFromSecondHalf =findLargestInArray(Arrays.copyOfRange(sampleArray, sampleArray[middle], sampleArray[length]));//this gets the max from the second half of the array
        System.out.println("The largest number in the array is "+ findLargerOfTwoNumbers(maxFromFirstHalf, maxFromSecondHalf));//this finds the larger of the two max and prints to user
    }
}
}
