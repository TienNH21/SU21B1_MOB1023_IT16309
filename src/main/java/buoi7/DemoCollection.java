/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author tiennh
 */
public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(2);
        myList.add(3);
        myList.add(1);
        myList.add(1);
        
        System.out.println("myList = " + myList.toString());
        
        Set<Integer> mySet = new HashSet<Integer>();
        
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(2);
        mySet.add(3);
        mySet.add(5);
        mySet.add(6);
        mySet.add(7);
        
        System.out.println("mySet = " + mySet.toString());

        System.out.println("-------------------");
        
//        myList.addAll(mySet);
        mySet.addAll(myList);
        System.out.println("myList = " + myList.toString());
        System.out.println("-------------------");
        System.out.println("mySet = " + mySet.toString());
    }
}
