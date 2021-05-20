/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi12;

/**
 *
 * @author tiennh
 */
public class Nguoi {
    // Thuộc tính
    private String hoTen;
    private String queQuan;
    private String diaChi;
    private int gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String queQuan, String diaChi, int gioiTinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }
    
    // Phương thức
    public String getHoTen() {
        return hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void xuatThongTin()
    {
        System.out.printf("%s - %d - %s - %s\n", this.hoTen, this.gioiTinh, this.queQuan, this.diaChi);
    }
}
