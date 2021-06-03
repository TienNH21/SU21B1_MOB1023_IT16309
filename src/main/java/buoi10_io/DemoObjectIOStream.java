/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author tiennh
 */
public class DemoObjectIOStream {
    public static void main(String[] args) {
        System.out.println("Bắt đầu ghi file");
        ghiFile();
        System.out.println("Kết thúc ghi file");
        System.out.println("==============================");
        System.out.println("Bắt đầu đọc file");
        docFile();
        System.out.println("Kết thúc đọc file");
    }
    
    private static void ghiFile() {
        String filename = "src/main/java/buoi10_io/demo_object_io.txt";
        try { 
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            SinhVienPoly sv1 = new SinhVienPoly("Ng Van A", "PH12321"),
                sv2 = new SinhVienPoly("Tran Thi B", "PH22134");
            
            oos.writeObject(sv1);
            oos.writeObject(sv2);
            
            fos.close();
            oos.close();
            System.out.println("Ghi file thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }

    private static void docFile() {
        String filename = "src/main/java/buoi10_io/demo_object_io.txt";
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            SinhVienPoly sv1 = (SinhVienPoly) ois.readObject(),
                sv2 = (SinhVienPoly) ois.readObject();

            System.out.printf("%s - %s\n", sv1.getName(), sv1.getMaSV());
            System.out.printf("%s - %s\n", sv2.getName(), sv2.getMaSV());
            
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
