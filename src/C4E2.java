/**
 * Created by kaba on 19/02/16.
 */
package com.java21days;

public class C4E2 {

    public static void main(String[] args) {

        int result = 0;

        for (int i = 0; i < args.length; i++) {
            int addvalue = 0;
            switch (args[i]) {
                case "nine":
                    addvalue++;
                case "eight":
                    addvalue++;
                case "seven":
                    addvalue++;
                case "six":
                    addvalue++;
                case "five":
                    addvalue++;
                case "four":
                    addvalue++;
                case "three":
                    addvalue++;
                case "two":
                    addvalue++;
                case "one":
                    addvalue++;
            }

            result = 10 * result + addvalue;
        }

        System.out.println("Result: " + result);
    }

}
