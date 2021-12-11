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
public class GDGoiRutService extends SQLServerServiceQuyen {

    public GDGoiRutService(String tenServer, String taiKhoan, String matKhau) {
        super(tenServer, taiKhoan, matKhau);
    }

    public int guiTien(String sotk, long sotien, String manv) {
        try {
            String sql = "exec [dbo].[sp_GuiTien] ?, ?, ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, sotk);
            preStatement.setLong(2, sotien);
            preStatement.setString(3, manv);
            
            int kq = preStatement.executeUpdate();
            System.out.println(kq);
            return kq;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public int rutTien(String sotk, long sotien, String manv) {
        try {
            String sql = "exec [dbo].[sp_RutTien] ?, ?, ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, sotk);
            preStatement.setLong(2, sotien);
            preStatement.setString(3, manv);
            
            int kq = preStatement.executeUpdate();
            System.out.println(kq);
            return kq;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

}
