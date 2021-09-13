package service;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerService {

    protected Connection connection = null;

    public SQLServerService() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-6RP733C;databaseName=NGANHANG";
            String user = "sa";
            String pass = "123456";
            connection = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
