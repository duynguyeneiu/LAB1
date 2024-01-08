/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.*;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();

        System.out.println("Length of the sting: " + string1.length());
        System.out.println("Number of words: " + numberOfWord(string1));
        System.out.println("concat: " + concatenateString(string1, string2));

        if (palindrome(string1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    /*length of string without space*/
    static int numberOfWord(String string1) {
        String newstring = string1.replaceAll(" ", "");
        return newstring.length();
    }

    static String concatenateString(String string1, String string2) {
        return string1.concat(string2);
    }

    public static boolean palindrome(String string1) {
        int i = 0;
        int j = string1.length() - 1;
        while (i < j) {
            if (string1.charAt(i) != string1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
