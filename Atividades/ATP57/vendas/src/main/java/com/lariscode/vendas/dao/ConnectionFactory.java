package com.lariscode.vendas.dao;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    private DataSource dataSource;
    // Poll conexões
    public ConnectionFactory() {
        ComboPooledDataSource pool = new ComboPooledDataSource();
        this.dataSource = pool;
    }

    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
