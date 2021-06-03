/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tiennh
 */
public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("lab_1", 10);
        myMap.put("lab_2", 8);
        myMap.put("lab_3", 7);
        myMap.put("lab_4", 9);
        myMap.put("lab_5", 10);
        myMap.put("lab_6", 9);
        myMap.put("lab_1", 2);
        myMap.put("lab_1", 1);
        
        System.out.println("myMap = " + myMap);
        
        System.out.println("myMap.keySet() = " + myMap.keySet());
        System.out.println("myMap.values() = " + myMap.values());
        
        for (String key: myMap.keySet()) {
            System.out.println(key + " - " + myMap.get(key));
        }
    }
}
