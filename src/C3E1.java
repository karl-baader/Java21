/**
 * Created by kaba on 13/02/16.
 */
package com.java21days;

import java.util.StringTokenizer;

public class C3E1 {

    public static void main(String[] args) {
        String birthDay = "5/27/2007";

        StringTokenizer st = new StringTokenizer(birthDay, "/");

        System.out.println("Original birthday" + birthDay);
        System.out.println("Birthday month: " + st.nextToken());
        System.out.println("Birthday day: " + st.nextToken());
        System.out.println("Birthday year: " + st.nextToken());
    }
}
