/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.MMarks;
import Model.SSMarks;
import Model.MVSMarks;
/**
 *
 * @author Thara
 */
public class CSMarks {
    
    private String subject ;  
    private Double mark ;
    private String grade ;

    public void showMarks(String studID)
           
    {
        MVSMarks m1 = new MVSMarks();
        m1.showMarks(studID);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    
}
