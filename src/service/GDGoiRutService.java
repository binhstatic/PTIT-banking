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
import model.GDGoiRut;
import model.NguoiDung;

/**
 *
 * @author Binh
 */
public class GDGoiRutService extends SQLServerServiceQuyen {

    public GDGoiRutService(String tenServer, String taiKhoan, String matKhau) {
        super(tenServer, taiKhoan, matKhau);
    }
   
     public int chuyenTien(String sotk, double sotien, String manv) {
        try {
            String sql = "exec [dbo].[sp_GuiTien] ?, ?, ?";
            PreparedStatement preStatement=connection.prepareStatement(sql);
            preStatement.setString(1, sotk);
            preStatement.setDouble(2, sotien);
            preStatement.setString(3, manv);
            return preStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    
    
     
     
}
