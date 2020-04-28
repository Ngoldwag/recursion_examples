package edu.ti.caih313.recursion.hw;

import java.math.BigInteger;
import java.util.Scanner;

public class TenToTheN {
     public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        boolean fraction = false;
        if (number < 0) {
            number = -1 * number;
            fraction = true;
        }

        BigInteger tenToNum = tenToTheN(number);
        System.out.println("10^" + number + " =" + ((fraction)?" 1/":" ") + tenToNum);
    }

   static BigInteger tenToTheN(int n) {
        BigInteger val;
        if (n == 0) {
            val = BigInteger.ONE;
        } else if (n == 1) {
            val = BigInteger.TEN;
        } else {
            BigInteger valHalf = tenToTheN(n/2);
            val = valHalf.multiply(valHalf);
            if (n%2 == 1) {
                val = val.multiply(BigInteger.TEN);
            }
        }
        return val;
    }
}
