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
public class Q5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            array[i] = sc.nextInt();
            list.add(array[i]);
        }
        
        System.out.println(removeDuplicate(array));
        
    }
    
    static boolean removeFirstElement(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return false;
        } else {
            list.remove(0);
            return true;
        }
    }
    
    static void insertElement(int value, int position, ArrayList<Integer> list) {
        list.add(position, value);
        list.remove(list.size() - 1);
    }
    
    static int countOccurence(int n, int[] array) {
        int count = 0;
        for (int i : array) {
            if (i == n) {
                count++;
            }
        }
        return count;
    }
    
    static ArrayList<Integer> findDuplicate(int[] array) {
        ArrayList<Integer> newList = new ArrayList<>();
        
        for (int i = 0; i < array.length; i++) {
            if (countOccurence(array[i], array) != 1 && !newList.contains(array[i])) {
                newList.add(array[i]);
            }
        }
        return newList;
    }
    
    static ArrayList<Integer> removeDuplicate(int[] array) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!newList.contains(array[i])) {
                newList.add(array[i]);
            }
        }
        return newList;
    }
    
}
