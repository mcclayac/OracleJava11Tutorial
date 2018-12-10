package com.mrbigman.java11.tutorial;

public class EnhancedForDemo {
    public static void main(String[] args){
        int[] numbers =
                {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.printf("Count is : %d\n", item);
//            System.out.println("Count is: " + item);
        }
    }
}
