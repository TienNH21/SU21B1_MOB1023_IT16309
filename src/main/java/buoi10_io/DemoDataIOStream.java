/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiennh
 */
public class DemoDataIOStream {
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
        String filename = "src/main/java/buoi10_io/demo_data_io.txt";
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            DataOutputStream dataOS = new DataOutputStream(fos);
            
            int i1 = 123, i2 = 987;
            double d1 = 4.5, d2 = 9.8;
            char c1 = 'a', c2 = 'b';
            
            dataOS.writeInt(i1);
            dataOS.writeInt(i2);
            
            dataOS.writeDouble(d1);
            dataOS.writeDouble(d2);
            
            dataOS.writeChar(c1);
            dataOS.writeChar(c2);
            
            dataOS.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Không tìm thấy");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ghi không thành công");
        }
    }
    
    private static void docFile() {
        String filename = "src/main/java/buoi10_io/demo_data_io.txt";
        try {
            FileInputStream fis = new FileInputStream(filename);
            DataInputStream dataIS = new DataInputStream(fis);
            
            int i1 = dataIS.readInt(), i2 = dataIS.readInt();
            double d1 = dataIS.readDouble(), d2 = dataIS.readDouble();
            int c1 = dataIS.readChar(), c2 = dataIS.readChar();
            
            System.out.printf("i1 = %d\ti2 = %d\n", i1, i2);
            System.out.printf("d1 = %f\td2 = %f\n", d1, d2);
            System.out.printf("c1 = %c\tc2 = %c\n", c1, c2);
            
            fis.close();
            dataIS.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Đọc file không thành công");
        }
    }
}
