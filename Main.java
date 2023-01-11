package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * function that returns nth element of a fibbonaci sequence
     * @param n index of element of fibbonaci sequence you want
     * @return nth element of fibbonaci sequence requested
     */
    public static int fib(int n)
    {
        if(n<0){
            throw new IllegalArgumentException("argument cant be less than 0");
        }
        if (n==0||n==1)
            return 0;
        else if(n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * function that returns number raised to a requested power
     * @param base base of a power
     * @param exponent exponent of a power
     * @return base number raised to requested power
     */
    public static int power(int base, int exponent)
    {
        int power = 1;
        for (int i = 1; i <= exponent; i++)
            power = power * base;
        return power;
    }

    /**
     * function that returns a factiorial of a number
     * @param n number you want factorial of
     * @return factorial of number n
     */
    public static int factorial (int n) {
        if(n<0){
            throw new IllegalArgumentException("argument cant be less than 0");
        }
        int product = 1;
        for (int i=1; i<=n; i++) {
            product *= i;
        }
        return product;
    }
}