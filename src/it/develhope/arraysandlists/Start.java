package it.develhope.arraysandlists;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        String[] carBrands = {"Audi", "BMW", "Lamborghini", "Mercedes", "Porsche"};
        System.out.println("Number of car brands is: " + carBrands.length);
        System.out.println("3rd car brand is: " + carBrands[2]);

        int[] primeNumbers = new int[6];

        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        System.out.println("Prime numbers: " + Arrays.toString(primeNumbers));
    }
}


        // remember that array's index start from 0, not from 1!
        

        // here we use `new` to initialise an empty array of 6 items
        

        // populating the array
        

        // we use the method toString() from java.utils.Arrays
        

