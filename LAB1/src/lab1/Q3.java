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
public class Q3 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=number;i>=1;){
            if(i%2==0){
                System.out.println(i+" is even,so we take n/2:"+ i/2);
               i=i/2;
            }else if(i%2!=0){
                System.out.println(i+" is odd,so we take 3*n+1:"+ (i*3+1));
                i=i*3+1;
            }
            if(i==1)
                break;
        }
    }        
}
