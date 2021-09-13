package service;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerServiceQuyen {

    protected Connection connection = null;
    protected boolean ketNoi = true;

    public SQLServerServiceQuyen(String tenServer, String taiKhoan, String matKhau) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://" + tenServer + ";databaseName=NGANHANG";
            String user = taiKhoan;
            String pass = matKhau;
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            ketNoi = false;
            e.printStackTrace();
        }
    }

}
