/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Thara
 */
public class DBConnection {
    //C:\Program Files\Java

    static Connection con;
    
    public static Connection connectDB()
    {
        try
        {
            String path = "jdbc:mysql://localhost:3306/newead";
            con = DriverManager.getConnection(path,"root","");
        }
        
        catch (SQLException e)
        {
            System.err.println("Exception "+e);
        }
        
        return con;
    }

    static Connection java() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
