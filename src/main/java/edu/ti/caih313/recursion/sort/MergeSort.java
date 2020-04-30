package edu.ti.caih313.recursion.sort;

/**
 * Class for sorting an array of integers from smallest to largest
 * using the merge sort algorithm.
 */
public class MergeSort {
    public static int getNumberOfCopies(){
        return numberOfCopies;
    }
    /**
     * Precondition: Every indexed variable of the array a has a value.
     * Postcondition: a[0] <= a[1] <= ... <= a[a.length - 1].
     */
    private static int numberOfCopies = 0;
    public static void sort(int[] a, String prefix) {
        System.out.println(prefix + "Entering sort(a.length=" + a.length);
        if (a.length >= 2) {
            int halfLength = a.length / 2;
            int[] firstHalf = new int[halfLength];
            int[] lastHalf = new int[a.length - halfLength];
            System.out.println(prefix + "Calling divide(a.length=" + a.length);
            divide(a, firstHalf, lastHalf, "-" + prefix );
            System.out.println(prefix + "Calling sort(a.length=" + a.length);
            sort(firstHalf, "-"+prefix);
            System.out.println(prefix + "Calling sort(a.length=" + a.length);
            sort(lastHalf, "-"+prefix);
            System.out.println(prefix + "Calling merge(a.length=" + a.length);
            merge(a, firstHalf, lastHalf, "-" + prefix );
        }
        System.out.println(prefix + "Exiting sort(a.length=" + a.length);
    }


    //Precondition: a.length = firstHalf.length + lastHalf.length.
    //Postcondition: All the elements of a are divided
    //between the arrays firstHalf and lastHalf.
    private static void divide(int[] a, int[] firstHalf,
                               int[] lastHalf, String prefix) {
        System.out.println(prefix + "Entering divide(a.length=" + a.length);

        for (int i = 0; i < firstHalf.length; i++) {
            firstHalf[i] = a[i];
            numberOfCopies+=1;
        }
        for (int i = 0; i < lastHalf.length; i++) {
            lastHalf[i] = a[firstHalf.length + i];
            numberOfCopies+=1;
        }
        System.out.println(prefix + "Exiting divide(a.length=" + a.length);
        System.out.println("The amount of numbers being copied is "+getNumberOfCopies());

    }

    //Precondition: Arrays firstHalf and lastHalf are sorted from
    //smallest to largest; a.length = firstHalf.length +
    //lastHalf.length.
    //Postcondition: Array a contains all the values from firstHalf
    //and lastHalf and is sorted from smallest to largest.
    private static void merge(int[] a, int[] firstHalf,
                              int[] lastHalf, String prefix) {
        System.out.println(prefix + "Entering merge(a.length=" + a.length);
        int firstHalfIndex = 0, lastHalfIndex = 0, aIndex = 0;
        while ((firstHalfIndex < firstHalf.length) &&
                (lastHalfIndex < lastHalf.length)) {
            if (firstHalf[firstHalfIndex] < lastHalf[lastHalfIndex]) {
                a[aIndex] = firstHalf[firstHalfIndex];
                firstHalfIndex++;
                //numberOfCopies+=1;
            } else {
                a[aIndex] = lastHalf[lastHalfIndex];
                lastHalfIndex++;
                //numberOfCopies+=1;
            }
            aIndex++;
            numberOfCopies+=1;
        }
        //At least one of firstHalf and lastHalf has been
        //completely copied to a.
        //Copy rest of firstHalf, if any.
        while (firstHalfIndex < firstHalf.length) {
            a[aIndex] = firstHalf[firstHalfIndex];
            aIndex++;
            firstHalfIndex++;
        }
        //Copy rest of lastHalf, if any.
        while (lastHalfIndex < lastHalf.length) {
            a[aIndex] = lastHalf[lastHalfIndex];
            aIndex++;
            lastHalfIndex++;
        }
        System.out.println(prefix + "Exiting merge(a.length=" + a.length);
        System.out.println("the amount of numbers being copied is "+getNumberOfCopies());

    }

}