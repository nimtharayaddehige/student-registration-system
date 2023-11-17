/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Thara
 */
public class MStudentinfo {
    
    public void addStudent(String studentid, String fname, String surname, String dob, String gender, String email, String phn, String address)
    {
        try
        {
            String sql = "INSERT INTO studentinfo (studid,fname,surname,dob,gender,email,contact,address) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement statement = DBConnection.connectDB().prepareStatement(sql);
        
                statement.setString(1,studentid);
                statement.setString(2,fname);
                statement.setString(3,surname);
                statement.setString(4,dob);
                statement.setString(5,gender);
                statement.setString(6,email);
                statement.setString(7,phn);
                statement.setString(8,address);
                statement.executeUpdate();
                statement.close();
                
                JOptionPane.showMessageDialog(null, "Details Inserted !","INFO",JOptionPane.INFORMATION_MESSAGE);
        
        
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateStudent(String studentid, String fname, String surname, String dob, String gender, String email, String phn, String address)
    {
        String query = "UPDATE studentinfo SET fname = '"+fname+"', surname = '"+surname+"', dob = '"+dob+"', gender = '"+gender+"', email = '"+email+"', contact = '"+phn+"', address = '"+address+"' WHERE studid = '"+studentid+"'";
        
        executeSQLQuery(query, "Updated");
    }
    
    
    public void deleteStudent(String studentid, String fname, String surname, String dob, String email, String phn, String address)
    {
        if(studentid.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Select a Student from the table to Delete","INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            int response = JOptionPane.showConfirmDialog(null, "You Sure you want to Delete", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if(response == JOptionPane.YES_OPTION)
            {
                String query = "DELETE FROM studentinfo WHERE studid = '"+studentid+"'";
                executeSQLQuery(query, "Deleted");
            }
        }
    }
    
    
    
    public ResultSet getStudentInfo()
    {
        ResultSet rt = null;
        try
        {
            Statement st = DBConnection.connectDB().createStatement();
            rt =  st.executeQuery("SELECT MAX(studid) FROM studentinfo;");
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

    

    public ResultSet getSubjectInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addStudentinfo(String subname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
