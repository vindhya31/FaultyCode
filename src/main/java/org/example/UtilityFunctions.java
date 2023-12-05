package org.example;

public class UtilityFunctions {

    // Method 1: Adds two numbers
    public static int add(int a, int b) {

        return (a + b);
    }

    // Method 2: Checks if a number is even
    public static boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
        }
        return false;
    }

    // Method 3: Finds the maximum of two numbers
    public static int max(int a, int b) {

        if (a >= b){
            return a;
        }else{
            return b;
        }
    }

    // Method 4: Multiplies two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method 5: Calculates the factorial of a number
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int factorial = 1;
        for (int i = 1; i <=n ; i++) {
            factorial= factorial*i;
            System.out.println(factorial);

        }
        return factorial;
    }
    // Method 6: Checks is a fibonacci.
    public static int fibonacci(int n) {
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(int i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        return n;
    }

    // Method 7: Checks if a string is a palindrome
    public static boolean isPalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }

    // Method 8: Finds the greatest common divisor (GCD) of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method 9: Reverses a string
    public static String reverseString(String str) {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }


    // Method 10: Checks if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Additional methods can be added here...
}
