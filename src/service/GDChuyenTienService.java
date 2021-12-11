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

    public int chuyenTien(String sotk_chuyen, long sotien, String sotk_nhan, String manv) {
        try {
            String sql = "exec [dbo].[sp_ChuyenTien] ?, ?, ?, ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, sotk_chuyen);
            preStatement.setLong(2, sotien);
            preStatement.setString(3, sotk_nhan);
            preStatement.setString(4, manv);
            
            int kq = preStatement.executeUpdate();
            System.out.println(kq);
            return kq;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
