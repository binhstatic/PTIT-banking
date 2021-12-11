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
import java.sql.Date;
import javax.swing.JOptionPane;

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
     public int themKH(String CMND, String ho, String ten, String diaChi, String phai, String ngayCap, String soDT) {
        try {
            String sql = "exec [dbo].[sp_ThemKH] ?, ?, ?, ?, ?, ?, ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, CMND);
            preStatement.setString(2, ho);
            preStatement.setString(3, ten);
            preStatement.setString(4, diaChi);
            preStatement.setString(5, phai);
            preStatement.setString(6, ngayCap);
            preStatement.setString(7, soDT);
            return preStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
      public int xoaKH(String CMND) {
        try {
            String sql = "exec [dbo].[sp_XoaKH] ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, CMND);
            return preStatement.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getMessage().equalsIgnoreCase("Khong the xoa KH da tao tai khoan"))
            {
                return 0;
            }
        }
        return -1;
    }
       public int suaKH(String CMND,String CMNDnew , String ho, String ten, String diaChi, String phai, String ngayCap, String soDT) {
        try {
            String sql = "exec [dbo].[sp_SuaKH] ?, ?, ?, ?, ?, ?, ?, ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, CMND);
            preStatement.setString(2, CMNDnew);
            preStatement.setString(3, ho);
            preStatement.setString(4, ten);
            preStatement.setString(5, diaChi);
            preStatement.setString(6, phai);
            preStatement.setString(7, ngayCap);
            preStatement.setString(8, soDT);
            return preStatement.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getMessage().equalsIgnoreCase("Da tao TK khong the thay doi CMND"))
            {
                return 0;
            }
        }
        return -1;
    }
       
      public KhachHang timKH(String CMND) {
          KhachHang kh= new KhachHang();
        try {
            String sql = "exec [dbo].[sp_TimKH] ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, CMND);
            ResultSet result = preStatement.executeQuery();
            if (result.next()) {
                kh.setCmnd(result.getString(1));
                kh.setHo(result.getString(2));
                kh.setTen(result.getString(3));
                kh.setDiachi(result.getString(4));
                kh.setPhai(result.getString(5));
                kh.setNgaycap(result.getString(6));
                kh.setSdt(result.getString(7));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            return null;
        }
        return kh;
    }
}
