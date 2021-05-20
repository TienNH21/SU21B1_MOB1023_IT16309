/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi12;

import java.util.Scanner;

/**
 *
 * @author tiennh
 */
public class Main {
    public static void main(String[] args) {
        Scanner _sc = new Scanner(System.in);

        System.out.println("Nhập thông tin:");
        
        System.out.println("Nhập họ tên: ");
        String hoTen = _sc.nextLine();
        
        System.out.println("Nhập giới tính: ");
//        int gioiTinh = Integer.parseInt(_sc.nextLine());
        int gioiTinh = _sc.nextInt();
        _sc.nextLine(); // Đọc ký tự enter

        // Trôi lệnh
        System.out.println("Nhập quê quán: ");
        String queQuan = _sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = _sc.nextLine();

        System.out.println("Nhập mã sinh viên: ");
        String maSV = _sc.nextLine();
        System.out.println("Nhập chuyên ngành: ");
        String chuyenNganh = _sc.nextLine();
        
        SinhVien sv = new SinhVien(maSV, chuyenNganh, hoTen, queQuan, diaChi, gioiTinh);
//        Nguoi n = new Nguoi(hoTen, queQuan, diaChi, gioiTinh);
//        n.xuatThongTin();

        QLNguoi qlds = new QuanLyDanhSach();
        
        qlds.them(sv);
    }
}
