/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vera
 */
public class ClsConexion {

    String user="sa";
    String pass="123456";
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://localhost:1433;databaseName=dbPreOlimpiada";
    

    public Connection getConecion() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void Cerrar1(Connection con, CallableStatement cstm) {
        try {
            if (con != null) {
                con.close();
            }
            if (cstm != null) {
                cstm.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Cerrar2(CallableStatement cstm, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (cstm != null) {
                cstm.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}