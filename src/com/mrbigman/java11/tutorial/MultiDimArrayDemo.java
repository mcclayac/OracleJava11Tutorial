package com.mrbigman.java11.tutorial;

public class MultiDimArrayDemo {

    public static void main(String[] args) {
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones", "Mcclay", "Seals", "carter"}
        };
        // Mr. Smith
//        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
//        System.out.println(names[0][2] + names[1][1]);

        for (int i = 0; i < names.length -1 ; i++) {
            for (int j = 0; j <  names[j].length -1; j++) {
                System.out.printf("Index[%d][%d] = %s %s \n", i, j, names[i][i], names[j][i]);
            }

        }

    }
}

