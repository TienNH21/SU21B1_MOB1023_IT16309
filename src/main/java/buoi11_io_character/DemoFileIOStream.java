/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11_io_character;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiennh
 */
public class DemoFileIOStream {
    public static void main(String[] args) {
        System.out.println("Bắt đầu ghi file");
        ghiFile();
        System.out.println("Kết thúc ghi file");
        System.out.println("-----------------");
        System.out.println("Bắt đầu đọc file");
        docFile();
        System.out.println("Kết thúc đọc file");
    }
    
    private static void ghiFile() {
        String filename = "src/main/java/buoi11_io_character/demo_file_io.txt";
        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            
            writer.write("Xin chào các ong vàng của FPT Polytechnic\n");
            writer.write("Học kỳ SU2021\n");
            writer.write("Lớp IT16309-UD môn MOB1023\n");
            
            writer.close();
        } catch (Exception e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        }
    }
    
    private static void docFile() {
        String filename = "src/main/java/buoi11_io_character/demo_file_io.txt";
        File file = new File(filename);
        try {
            FileReader reader = new FileReader(file);
            
            while (true) {
                int b = reader.read();
                if (b == -1) {
                    break;
                }
                System.out.printf("%c", (char) b);
            }
            
            reader.close();
        } catch (Exception e) {
            System.out.println("Đọc file thất bại");
            e.printStackTrace();
        }
    }
}
