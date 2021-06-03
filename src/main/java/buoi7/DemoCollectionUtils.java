/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

import buoi12.Nguoi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tiennh
 */
public class DemoCollectionUtils {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        
        myList.add(3);
        myList.add(9);
        myList.add(13);
        myList.add(1);
        myList.add(4);
        myList.add(2);
        myList.add(27);
        myList.add(6);
        
        System.out.println("myList = " + myList);

        Collections.shuffle(myList);
        System.out.println("Collections.shuffle(myList) = " + myList);

        Collections.sort(myList);
        System.out.println("Collections.sort(myList) = " + myList);

        int viTriTimDuoc = Collections.binarySearch(myList, (Integer) 4);
        System.out.printf("Vị trí tìm được của giá trị 4: %d \n", viTriTimDuoc);
        
        viTriTimDuoc = Collections.binarySearch(myList, (Integer) 44);
        System.out.printf("Vị trí tìm được của giá trị 44: %d \n", viTriTimDuoc);
        
        Collections.reverse(myList);
        System.out.println("Collections.reverse(myList) = " + myList);
        
        List<Nguoi> listNguoi = new ArrayList<>();
        Nguoi n1 = new Nguoi("B", "HN", "HN", 1),
            n2 = new Nguoi("C", "HN", "HN", 1),
            n3 = new Nguoi("A", "HN", "HN", 0);
        
        listNguoi.add(n1);
        listNguoi.add(n2);
        listNguoi.add(n3);
        
        Comparator<Nguoi> comparator = new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi n1, Nguoi n2) {
                return n1.getHoTen().compareTo(n2.getHoTen());
            }
        };
        
        Collections.sort(listNguoi, comparator);
        
        for (Nguoi nguoi: listNguoi) {
            System.out.println("listNguoi = " + nguoi.getHoTen());
        }
    }
}
