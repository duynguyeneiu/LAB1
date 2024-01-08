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
public class Q1 {
     public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int lastDigit= number%10;
        while(number>10){
            number/=10;        
        }
        int firstDigit=number;
        System.out.println(firstDigit+lastDigit);
                
      
    }
}
