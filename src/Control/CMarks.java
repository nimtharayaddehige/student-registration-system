/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.MMarks;
/**
 *
 * @author Thara
 */
public class CMarks {
    public void addMarks(String studID , String sub_name , Double marks , String grade)
    {
        MMarks m1 = new MMarks();
        m1.addMarks(studID, sub_name, marks , grade);
    }
}
