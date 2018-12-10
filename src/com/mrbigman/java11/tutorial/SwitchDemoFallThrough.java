package com.mrbigman.java11.tutorial;

public class SwitchDemoFallThrough {

    public static void main(String[] args) {
        java.util.ArrayList<String> futureMonths =
                new java.util.ArrayList<String>();

        int month = 8;

        addMonth(month, futureMonths);
/*

        switch (month) {
            case 1:
                futureMonths.add("January");
            case 2:
                futureMonths.add("February");
            case 3:
                futureMonths.add("March");
            case 4:
                futureMonths.add("April");
            case 5:
                futureMonths.add("May");
            case 6:
                futureMonths.add("June");
            case 7:
                futureMonths.add("July");
            case 8:
                futureMonths.add("August");
            case 9:
                futureMonths.add("September");
            case 10:
                futureMonths.add("October");
            case 11:
                futureMonths.add("November");
            case 12:
                futureMonths.add("December");
                break;
            default:
                break;
        }
*/

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }

        futureMonths.clear();
        month = 11;
        addMonth(month, futureMonths);


        System.out.println("  New Code");
        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }

    }


    public static void addMonth(int num, java.util.ArrayList anArrayList) {

        switch (num) {
            case 1:
                anArrayList.add("January");
            case 2:
                anArrayList.add("February");
            case 3:
                anArrayList.add("March");
            case 4:
                anArrayList.add("April");
            case 5:
                anArrayList.add("May");
            case 6:
                anArrayList.add("June");
            case 7:
                anArrayList.add("July");
            case 8:
                anArrayList.add("August");
            case 9:
                anArrayList.add("September");
            case 10:
                anArrayList.add("October");
            case 11:
                anArrayList.add("November");
            case 12:
                anArrayList.add("December");
                break;
            default:
                break;
        }

    }
}
