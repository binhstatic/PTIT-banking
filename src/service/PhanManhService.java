/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import model.PhanManh;

/**
 *
 * @author Binh
 */
public class PhanManhService extends SQLServerService {
    public Vector<PhanManh> docToanBoPhanManh(){
        Vector<PhanManh> vec = new Vector<PhanManh>();
        try {
            String sql = "Select * From Get_Subscribes";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()){
                PhanManh pm = new PhanManh();
                pm.setTenCN(result.getString(1));
                pm.setTenServer(result.getString(2));
                vec.add(pm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vec;
    } 
}
