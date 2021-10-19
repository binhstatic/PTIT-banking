/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.KhachHang;

/**
 *
 * @author Binh
 */
public class KhachHangService extends SQLServerServiceQuyen {

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

    public KhachHang timKhachHangBangSoTK(String sotk) {
        KhachHang kh = new KhachHang();
        try {
            String sql = "exec [dbo].[sp_LayThongTinTuSoTK] ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, sotk);

            ResultSet result = preStatement.executeQuery();
            if (result.next()) {
                kh.setCmnd(result.getString(1));
                kh.setHo(result.getString(2));
                kh.setTen(result.getString(3));
                kh.setDiachi(result.getString(4));
                kh.setPhai(result.getString(5));
                kh.setNgaycap(result.getString(6));
                kh.setSdt(result.getString(7));
                kh.setMaCN(result.getString(8));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return kh;
    }
}
