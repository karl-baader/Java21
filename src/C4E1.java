/**
 * Created by kaba on 19/02/16.
 */
package com.java21days;

public class C4E1 {

    public static void main(String[] args) {

        int year = 2015;
        String[] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October",
                "November", "December"};

        for (int i = 1; i <= 12; i++) {
            int days = countDays(i, year);

            System.out.println(months[i - 1] + " has " + days + " days: ");

            for (int j = 1; j <= days; j++) {
                System.out.println(months[i - 1] + " " + j);
            }

            System.out.println();
        }
    }

    private static int countDays(int month, int year) {

        int count = -1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;

            case 2:
                if (year % 4 == 0) {
                    count = 29;
                } else {
                    count = 28;
                }

                if ((year % 100 == 0) & (year % 400 != 0)) {
                    count = 28;
                }
        }

        return count;

    }
}
