/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11_io_character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author tiennh
 */
public class DemoBufferIOStream {
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
        String filename = "src/main/java/buoi11_io_character/demo_buffer_io.txt";
        try {
            FileWriter fWriter = new FileWriter(filename);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            
            bWriter.write("Xin chào ong vàng kỳ SU2021\n");
            bWriter.write("Ong vàng Thúy Linh\n");
            bWriter.write("Ong vàng Thái Sơn\n");
            bWriter.write("Ong vàng Lê Hải\n");
            
//            fWriter.close();
            bWriter.close();
        } catch (Exception e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        }
    }

    private static void docFile() {
        String filename = "src/main/java/buoi11_io_character/demo_buffer_io.txt";
        try {
            File file = new File(filename);
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);

            while (true) {
                String txt = bReader.readLine();
                if (txt == null) {
                    break;
                }

                System.out.println(txt);
            }
            
//            fReader.close();
            bReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
