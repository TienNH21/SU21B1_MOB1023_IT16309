/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi12;

import java.util.ArrayList;

/**
 *
 * @author tiennh
 */
public class QuanLyDanhSach implements QLNguoi {
    private ArrayList<Nguoi> danhSach;

    public QuanLyDanhSach() {
        this.danhSach = new ArrayList<>();
    }

    @Override
    public void them(Nguoi nguoi) {
        this.danhSach.add(nguoi);
    }

    @Override
    public boolean xoa(int viTri) {
        this.danhSach.remove(viTri);
        return true;
    }

    @Override
    public ArrayList<Nguoi> xuatDanhSach()
    {
        return this.danhSach;
    }
    
    @Override
    public Nguoi getByViTri(int viTri)
    {
        return this.danhSach.get(viTri);
    }
    
    @Override
    public void taoDoiTuongAo()
    {
        if (this.danhSach.size() > 0) {
            return ;
        }

        SinhVien sv1 = new SinhVien("PH12321", "UDPM", "Ng Van A", "HN", "HN", 1),
            sv2 = new SinhVien("PH12347", "UDPM", "Ng Van A", "HN", "HN", 1),
            sv3 = new SinhVien("PH12374", "TKTW", "Tran Thi C", "HN", "HN", 0);
        
        this.danhSach.add(sv1);
        this.danhSach.add(sv2);
        this.danhSach.add(sv3);
    }
}
