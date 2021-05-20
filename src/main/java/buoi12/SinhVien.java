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
public class SinhVien extends Nguoi {
    /*
     * SinhVien được quyền truy cập tới những thuộc tính & phương thức (KO PRIVATE) của lớp Nguoi
     */
    private String maSV;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String chuyenNganh, String hoTen, String queQuan, String diaChi, int gioiTinh) {
        super(hoTen, queQuan, diaChi, gioiTinh);
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    @Override
    public void xuatThongTin()
    {
        super.xuatThongTin();
        System.out.printf("%s - %s", this.maSV, this.chuyenNganh);
    }
    
    public void xuatThongTin(int tuoi)
    {
        System.out.println("Tuổi: " + tuoi);
    }
}
