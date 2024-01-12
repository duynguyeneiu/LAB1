/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.householdmanagement;

import java.util.Scanner;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class Person {

    //cac thuoc tinh
    String firstName;
    String lastName;
    int age;
    String occupation;
    String identityCardNumber;

    // phuong thuc
    Person() {

    }
    Person(String firstName, String lastName,int age, String occupation,String identityCardNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.occupation=occupation;
        this.identityCardNumber=identityCardNumber;
        
        
    }

    void inputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        firstName = sc.nextLine();
        System.out.println("Last Name: ");
        lastName =sc.nextLine();
        System.out.println("Age: ");
        age=sc.nextInt();
    }
    void OutputPerson(){
        System.out.println("First Name: "+firstName+" Last Name: "+lastName+" Age: "+age);
    }
    
}
