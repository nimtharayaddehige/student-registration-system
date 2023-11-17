/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Thara
 */
public class MMarks {
    public void addMarks(String studID , String sub_name , Double Marks , String grade)
    {
        try
        {
            Statement st = DBConnection.connectDB().createStatement();
            int row_count = st.executeUpdate("INSERT INTO marks (StudentID , SubName , Marks) VALUES ('"+studID+"' , '"+sub_name+"' , '"+Marks+"' , '"+grade+"');");
            if(row_count > 0)
            {
                JOptionPane.showMessageDialog(null,"Marks Successfully Added");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    public void addMarks(String studID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
