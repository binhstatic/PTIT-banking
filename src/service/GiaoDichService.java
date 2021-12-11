/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.GiaoDich;

/**
 *
 * @author Binh
 */
public class GiaoDichService extends SQLServerServiceQuyen{
    
    public GiaoDichService(String tenServer, String taiKhoan, String matKhau) {
        super(tenServer, taiKhoan, matKhau);
    }
    
    public ArrayList<GiaoDich>  displayMovements(String sotk) {
        ArrayList<GiaoDich> vec = new ArrayList<GiaoDich>();
        try {
            String sql = "exec [dbo].[sp_DisplayMovements] ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, sotk);
            ResultSet result = preStatement.executeQuery();
            
            while (result.next()) {
                GiaoDich gd = new GiaoDich();
                gd.setMaGD(result.getString(1));
                gd.setLoaiGD(result.getString(2));
                gd.setNgayGD(result.getDate(3));
                gd.setSotien(result.getLong(4));
                vec.add(gd);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return vec;
    }
    
}
