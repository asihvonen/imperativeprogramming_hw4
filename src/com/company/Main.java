package com.company;

public class Main
{
    public static void main(String[] args)
    {
        // imperative programming homework 4
        int n = 1;
        while ((n*n*n + 91) % 47 != 0)
            n = n + 1;

        System.out.println (n);
    }
}
