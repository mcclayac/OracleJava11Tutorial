package com.mrbigman.java11.tutorial;

public class PrePostDemo2 {
    public static void main(String[] args){
        int J = 3;
        J++;
        System.out.println(J);    // "4"
        ++J;
        System.out.println(J);    // "5"
        System.out.println(++J);  // "6"
        System.out.println(J++);  // "6"
        System.out.println(J);    // "7"
    }
}
