package com.mrbigman.java11.tutorial;

public class DeclareArray {

    // declares an array of integers
    int[] anArray;

    byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
    String[] anArrayOfStrings;


    // Second stype of declaring arrays .. ie after the variable name
//    However, convention discourages this form; the brackets identify the array type and should appear with the type designation.


    byte anArrayOfBytes2[];
    short anArrayOfShorts2[];
    long anArrayOfLongs2[];
    float anArrayOfFloats2[];
    double anArrayOfDoubles2[];
    boolean anArrayOfBooleans2[];
    char anArrayOfChars2[];
    String anArrayOfStrings2[];

    public void initializeArray() {

        // create an array of integers
        anArray = new int[10];

        anArray[0] = 100; // initialize first element
        anArray[1] = 200; // initialize second element
        anArray[2] = 300; // and so forth

        System.out.println("Element 1 at index 0: " + anArray[0]);
        System.out.println("Element 2 at index 1: " + anArray[1]);
        System.out.println("Element 3 at index 2: " + anArray[2]);

        // create and initialize array in one step
        int[] anArray2 = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };


    }





}
