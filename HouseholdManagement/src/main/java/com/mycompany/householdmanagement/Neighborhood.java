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
public class Neighborhood {

    ArrayList<Household> house = new ArrayList<Household>();

    Neighborhood() {

    }

    void InputNeighborhood() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of house: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Household h = new Household();
            h.InputHousehold();
            house.add(h);

        }

    }
    void OutputNeighborhood(){
        for(int i=0;i<house.size();i++){
            house.get(i).OutputHousehold();
        }
    }
           
}
