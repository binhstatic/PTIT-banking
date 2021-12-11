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
import model.NhanVien;

/**
 *
 * @author Binh
 */
public class NhanVienService extends SQLServerServiceQuyen {

    public NhanVienService(String tenServer, String taiKhoan, String matKhau) {
        super(tenServer, taiKhoan, matKhau);
    }

    public ArrayList<NhanVien> docToanBoNhanVien() {
        ArrayList<NhanVien> vec = new ArrayList<NhanVien>();
        try {
            String sql = "select manv, ho, ten, diachi, phai, sodt, macn from NhanVien";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(result.getString(1));
                nv.setHo(result.getString(2));
                nv.setTen(result.getString(3));
                nv.setDiachi(result.getString(4));
                nv.setPhai(result.getString(5));
                nv.setSdt(result.getString(6));
                nv.setMaCN(result.getString(7));
                vec.add(nv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vec;
    }
     public int themNV(String maNV, String ho, String ten, String diaChi, String phai, String soDT, String login, String pass) {
        try {
            String sql = "exec [dbo].[sp_ThemNV] ?, ?, ?, ?, ?, ?, ?, ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, maNV);
            preStatement.setString(2, ho);
            preStatement.setString(3, ten);
            preStatement.setString(4, diaChi);
            preStatement.setString(5, phai);
            preStatement.setString(6, soDT);
            preStatement.setString(7, login);
            preStatement.setString(8, pass);
            return preStatement.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getMessage().equalsIgnoreCase("Ma Nhan Vien da ton tai"))
            {
                return 0;
            }
            if(ex.getMessage().contains("The server principal"))
            {
                return 2;
            }
            System.out.println(ex.getMessage());
        }
        return -1;
    }
}
