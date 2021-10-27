/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Binh
 */
public class TaiKhoan {
    String soTK;
    String cmnd;
    double soDu;
    String maCN;
    Date ngayMoTK;

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public Date getNgayMoTK() {
        return ngayMoTK;
    }

    public void setNgayMoTK(Date ngayMoTK) {
        this.ngayMoTK = ngayMoTK;
    }
    
    
}
