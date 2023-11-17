/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Thara
 */
public class SStudentinfo {
    
    private String studentid;
    private String fname;
    private String surname;
    private String dob;
    private String gender;
    private String email;
    private String contact;
    private String address;
    
    public SStudentinfo(String studentid, String fname, String surname, String dob, String gender, String email, String contact, String address)
    {
        this.studentid = studentid;
        this.fname = fname;
        this.surname = surname;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.contact = contact;
        this.address = address;
    }
    
    public String getStudid()
    {
        return studentid;
    }

    public String getFname()
    {
        return fname;
    }
        
    public String getSurname()
    {
        return surname;
    }
            
    public String getDob()
    {
        return dob;
    }
                
    public String getGender()
    {
        return gender;
    }
                    
    public String getEmail()
    {
        return email;
    }
                        
    public String getContact()
    {
        return contact;
    }
                            
    public String getAddress()
    {
        return address;
    }
}
