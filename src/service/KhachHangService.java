/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.KhachHang;

/**
 *
 * @author Binh
 */
public class KhachHangService extends SQLServerServiceQuyen{

    public KhachHangService(String tenServer, String taiKhoan, String matKhau) {
        super(tenServer, taiKhoan, matKhau);
    }
    public ArrayList<KhachHang> docToanBoKhachHang() {
        ArrayList<KhachHang> vec = new ArrayList<KhachHang>();
        try {
            String sql = "select cmnd, ho, ten, diachi, phai, ngaycap, sodt, macn from KHACHHANG";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                KhachHang nv = new KhachHang();
                nv.setCmnd(result.getString(1));
                nv.setHo(result.getString(2));
                nv.setTen(result.getString(3));
                nv.setDiachi(result.getString(4));
                nv.setPhai(result.getString(5));
                nv.setNgaycap(result.getString(6));
                nv.setSdt(result.getString(7));
                nv.setMaCN(result.getString(8));
                vec.add(nv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vec;
    }
}
