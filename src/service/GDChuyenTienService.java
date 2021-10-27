/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Binh
 */
public class GDChuyenTienService extends SQLServerServiceQuyen {

    public GDChuyenTienService(String tenServer, String taiKhoan, String matKhau) {
        super(tenServer, taiKhoan, matKhau);
    }
   
     public int chuyenTien(String sotk, double sotien, String manv) {

        return -1;
    }
}
