package edu.ti.caih313.recursion.hw;
import java.util.Scanner;
public class FindLargestInt {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the sixe of an array greater than zero");
        int size = keyboard.nextInt();
        int [] arrayOfNums = new int [size];
        System.out.println("Enter " + size + " numbers to add into the array");
        for (int i =0; i<size;i++){
            arrayOfNums[i] = keyboard.nextInt();
        }
        int maxVal = findLargestInt(arrayOfNums, 0, arrayOfNums.length-1);
    System.out.println("Maximum value in your array is "+maxVal);
    }

    public static int findLargestInt(int[] arr, int start, int end){
        if (start ==end){
            return arr[start];
        }else{
            int middle = (start+end)/2;
            int leftMaxValue = findLargestInt(arr, start, middle);
            int rightMaxVal = findLargestInt(arr, middle+1,end);
            return Math.max(leftMaxValue, rightMaxVal);

        }
    }
}
