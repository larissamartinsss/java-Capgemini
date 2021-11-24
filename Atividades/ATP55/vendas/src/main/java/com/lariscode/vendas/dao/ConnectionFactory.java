package com.lariscode.vendas.dao;



import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    String driverType = "jdbc";  String driverName = "postgresql";
    String host = "localhost";   String database = "postgres";
    String user = "postgres";    String pwd = "123456";
    private DataSource dataSource;
    int port = 5432;
    String connectionString = String.format("%s:%s://%s:%d/%s", driverType,driverName, host, port, database);

    // Poll conexões
    public ConnectionFactory() {
        ComboPooledDataSource pool = new ComboPooledDataSource();
        try{
        pool.setDriverClass("org.postgresql.Driver");
        }catch(PropertyVetoException e) {
            e.printStackTrace();
        }
        pool.setJdbcUrl(this.connectionString);
        pool.setUser(this.user);
        pool.setPassword(this.pwd);
        pool.setMaxPoolSize(50);
        this.dataSource = pool;
    }

    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
