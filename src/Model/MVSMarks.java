/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Thara
 */
public class MVSMarks {
     public ResultSet getStudentInfo()
    {
        ResultSet rt = null;
        try
        {
            Statement st = DBConnection.connectDB().createStatement();
            rt =  st.executeQuery("SELECT StudentID FROM studentID;");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return rt;
    }
    
    public void executeSQLQuery(String query, String message)
        {
            DBConnection.connectDB();
            Statement st;
            try
            {
                st = DBConnection.connectDB().createStatement();
                if((st.executeUpdate(query)) == 1)
                {
    
                    JOptionPane.showMessageDialog(null,"Data "+message+" Sucessfully");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Data Not " +message);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }  
        }

    public void showMarks(String studID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
