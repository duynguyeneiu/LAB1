/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.householdmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class Household {
    String houseNumber;
    int numberOfMember;
   // Person[] familyMember;
    ArrayList<Person> familyMember= new ArrayList<Person>();
    Household(){
        
    }
    void InputHousehold(){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of family member: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            Person p=new Person();
            p.inputPerson();
            familyMember.add(p);
        }
    }
    void OutputHousehold(){
        for(int i=0;i<familyMember.size();i++){
            familyMember.get(i).OutputPerson();
        }
    }
    int CountAgeOver60(){
       int count=0;
       for(Person p:familyMember){
           if (p.age>60){
               count++;
           }
       }
       return count; 
    }
}
