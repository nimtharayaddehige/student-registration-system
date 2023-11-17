/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MStudentinfo;
import java.sql.*;

/**
 *
 * @author Thara
 */
public class CStudentinfo {
    public void addStudent(String studentid, String fname, String surname, String dob, String gender, String email, String phn, String address)
    {
        MStudentinfo s1 = new MStudentinfo();
        s1.addStudent(studentid, fname, surname, dob, gender, email, phn, address);
    }
    
    public ResultSet getStudentInfo()
    {
        MStudentinfo m2 = new MStudentinfo();
        return m2.getStudentInfo();
    }
    
    public void updateStudent(String studentid, String fname, String surname, String dob, String gender, String email, String phn, String address)
    {
        MStudentinfo s1 = new MStudentinfo();
        s1.updateStudent(studentid, fname, surname, dob, gender, email, phn, address);
    }
    
    public void deleteStudent(String studentid, String fname, String surname, String dob, String email, String phn, String address)
    {
        MStudentinfo s1 = new MStudentinfo();
        s1.deleteStudent(studentid, fname, surname, dob, email, phn, address);
    }
}
