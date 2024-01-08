/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class Q2 {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int min=number1;
        if (min>number2)
            min=number2;
        else if(min>number3)
            min=number3;
        System.out.println(min);

    }

}
