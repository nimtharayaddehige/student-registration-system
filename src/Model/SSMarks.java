/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Thara
 */
public class SSMarks {
    private String studid;
    private String subname;
    private String Marks; 
    private String Grade;
     
    /**
     *
     * @param subname
     * 
     */
      public SSMarks(String subname, String Marks, String Grade)
    {
       this.subname = subname;
       this.Marks = Marks;
       this.Grade = Grade;
       
    }

    public SSMarks() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public String getsubname()
    {
        return subname;
    }
  public String getMArks()
    {
        return Marks;
    }
  public String getGrade()
    {
        return Grade;
    }

        
   }
    