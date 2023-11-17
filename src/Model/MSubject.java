/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import Control.CSubject;
import javax.swing.JOptionPane;
/**
 *
 * @author Thara
 */
public class MSubject {
     
    public void addSubject(String subname)
    {
        try
        {
            Statement st = DBConnection.connectDB().createStatement();
            int row_count = st.executeUpdate("INSERT INTO subject (subName) VALUES ('"+subname+"');");
            if(row_count > 0)
            {
                JOptionPane.showMessageDialog(null,"Subject Successfully Added");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public void resetStudent(String subname)
    {
        String query = "UPDATE studentinfo SET fname = '"+subname+"'";
        
        executeSQLQuery(query, "Reset");
    }
    
    
    public void deleteStudent(String subname)
    {
        String query = "DELETE FROM subject WHERE subName = '"+subname+"'";
        executeSQLQuery(query, "Deleted");
        
    }
    
    
    
    public ResultSet getStudentInfo()
    {
        ResultSet rt = null;
        try
        {
            Statement st = DBConnection.connectDB().createStatement();
            rt =  st.executeQuery("SELECT subName FROM subject;");
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

    public void deleteAdmin(String adminid, String fname, String surname, String dob, String email, String phn, String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
