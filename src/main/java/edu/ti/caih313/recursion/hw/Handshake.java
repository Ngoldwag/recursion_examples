package edu.ti.caih313.recursion.hw;

public class Handshake {
    static int factorial(int n) {
        if (n == 0){
            return 0;
        }else if (n==1){
        return 0;
        }else if (n==2) {
            return 1;
        }else
            return(n-1 + factorial(n-1));
            }
    public static void main(String args[]){
        int fact;
        int numberOfHandshakes=9;//this is where you put the amount of people in the room
        fact = factorial(numberOfHandshakes);
        System.out.println("The number of handshakes in a  room of "+numberOfHandshakes+" people is: "+ fact);
    }
}

//taken from https://www.javatpoint.com/factorial-program-in-java
