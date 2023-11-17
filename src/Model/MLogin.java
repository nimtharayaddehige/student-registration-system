/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import View.VHome;
/**
 *
 * @author Thara
 */
public class MLogin {
    public void Login(String username,String password)
    {
        ResultSet rst2;
        try
        {
            Statement st2 = DBConnection.connectDB().createStatement();
            
            rst2 = st2.executeQuery("select * from admin where mail = '"+username+"' AND password = '"+password+"';");
            if(rst2.next())
            {
                VHome h1 = new VHome();
                h1.setVisible(true);
            }            
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Credentials", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
