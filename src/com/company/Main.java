package com.company;

import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int banyakBilangan = 0;
        int a = 1;
        int b = 1;
        int c;
        int i;
        System.out.println("-----------------------------");
        System.out.println("Bilangan Fibonacci");
        System.out.println("-----------------------------");
        System.out.print("Input:\n ");
            try {
            input = dataInput.readLine();
            banyakBilangan = Integer.parseInt(input);
        } catch (NumberFormatException error) {
            System.out.println("Error !!");
        }
        System.out.print("Output: \n" + a + " " + b + " ");
        for (i = 0; i < banyakBilangan - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println("");
    }
}