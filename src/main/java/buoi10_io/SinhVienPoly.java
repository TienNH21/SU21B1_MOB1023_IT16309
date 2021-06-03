/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10_io;

import java.io.Serializable;

/**
 *
 * @author tiennh
 */
public class SinhVienPoly
    implements Serializable {
    private String name;
    private String maSV;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String name, String maSV) {
        this.name = name;
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
}
