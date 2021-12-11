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
import model.TaiKhoan;

/**
 *
 * @author Binh
 */
public class TaiKhoanService extends SQLServerServiceQuyen {

    public TaiKhoanService(String tenServer, String taiKhoan, String matKhau) {
        super(tenServer, taiKhoan, matKhau);
    }

    public boolean checkSoTK(String sotk) {
        try {
            String sql = "exec [dbo].[sp_CheckSOTK] ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, sotk);
            preStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<TaiKhoan> docToanBoTaiKhoan() {
        ArrayList<TaiKhoan> vec = new ArrayList<TaiKhoan>();
        try {
            String sql = "select sotk, cmnd, sodu, macn from TaiKhoan";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setSoTK(result.getString(1));
                tk.setCmnd(result.getString(2));
                tk.setSoDu(result.getLong(3));
                tk.setMaCN(result.getString(4));
                vec.add(tk);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vec;
    }

     public int themTK(String soTK, String CMND, long soDu) {
        try {
            String sql = "exec [dbo].[sp_ThemTK] ?, ?, ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, soTK);
            preStatement.setString(2, CMND);
            preStatement.setLong(3, soDu);
            return preStatement.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getMessage().equalsIgnoreCase("khong ton tai CMND"))
            {
                return 0;
            }
            else if(ex.getMessage().equalsIgnoreCase("SOTK da ton tai"))
            {
                return 2;
            }
        }
        return -1;
    }
     public int xoaTK(String soTK) {
        try {
            String sql = "exec [dbo].[sp_XoaTK] ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, soTK);
            return preStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            if(ex.getMessage().equalsIgnoreCase("TK da giao dich khong duoc xoa"))
            {
                return 0;
            }
            else if(ex.getMessage().equalsIgnoreCase("So Tai Khoan khong ton tai"))
            {
                return 2;
            }
        }
        return -1;
    }
     
        public int suaTK(String soTK, String soTKnew, String CMND, long soDu) {
        try {
            String sql = "exec [dbo].[sp_SuaTK] ?, ?, ?, ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, soTK);
            preStatement.setString(2, soTKnew);
            preStatement.setString(3, CMND);
            preStatement.setLong(4, soDu);
            return preStatement.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getMessage().equalsIgnoreCase("TK da giao dich khong duoc sua"))
            {
                return 0;
            }
            if(ex.getMessage().equalsIgnoreCase("TK cua chi nhanh khac khong duoc sua"))
            {
                return 2;
            }
        }
        return -1;
    }
        
        public TaiKhoan timTK(String SoTK) {
          TaiKhoan tk= new TaiKhoan();
        try {
            String sql = "exec [dbo].[sp_TimTK] ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, SoTK);
            ResultSet result = preStatement.executeQuery();
            if (result.next()) {
                tk.setSoTK(result.getString(1));
                tk.setCmnd(result.getString(2));
                tk.setSoDu(result.getLong(3));
     
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return tk;
    }
}
