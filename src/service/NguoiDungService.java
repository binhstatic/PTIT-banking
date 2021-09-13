/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.NguoiDung;

/**
 *
 * @author Binh
 */
public class NguoiDungService extends SQLServerServiceQuyen {

    public NguoiDungService(String tenServer, String taiKhoan, String matKhau) {
        super(tenServer, taiKhoan, matKhau);
    }

    public NguoiDung docDuLieu(String username) {
        try {
            String sql = "exec [dbo].[SP_Lay_Thong_Tin_NV_Tu_Login] '" + username + "'";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            if (result.next()) {
                NguoiDung nd = new NguoiDung();
                nd.setMaNV(result.getString(1));
                nd.setHoTen(result.getString(2));
                nd.setTenNhom(result.getString(3));
                
                return nd;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public boolean isConnected() {
        if(ketNoi){
            return true;
        }
        else{
            return false;
        }
    }
}
