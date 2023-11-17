/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.MStudentinfo;
import Model.MSubject;
import java.sql.*;

/**
 *
 * @author Thara
 */
public class CSubject {
     public void addSubject(String subname)
    {
        MSubject J1 = new MSubject();
        J1.addSubject(subname);
    }
    
    public ResultSet getSubjectInfo()
    {
        MSubject m3 = new MSubject();
        return m3.getStudentInfo();
    }
    
    public void resetStudent(String subname)
    {
        MSubjectinfo J1 = new MSubjectinfo();
        J1.resetSubject(subname);
    }
    
    public void deleteSubject(String subname)
    {
        MSubject J1 = new MSubject();
        J1.deleteStudent(subname);
    }

    public void addAdmin(String subname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ResultSet getMArksInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class MSubjectinfo extends MStudentinfo {

        public MSubjectinfo() {
        }

        private void resetSubject(String subname) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void deleteSubject(String subname) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
