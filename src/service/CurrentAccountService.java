/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.CurrentAccount;

/**
 *
 * @author Binh
 */
public class CurrentAccountService extends SQLServerServiceQuyen {

    public CurrentAccountService(String tenServer, String taiKhoan, String matKhau) {
        super(tenServer, taiKhoan, matKhau);
    }

    public CurrentAccount currentAccount(String sotk) {
        CurrentAccount ca = new CurrentAccount();
        try {
            String sql = "exec [dbo].[sp_CurrentAccount] ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, sotk);

            ResultSet result = preStatement.executeQuery();
            if (result.next()) {
                ca.setSoTK(result.getString(1));
                ca.setSoDu(result.getLong(2));
                ca.setCmnd(result.getString(3));
                ca.setHo(result.getString(4));
                ca.setTen(result.getString(5));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return ca;
    }
}
