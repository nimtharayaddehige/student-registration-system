/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.MLogin;
/**
 *
 * @author Thara
 */
public class Clogin {
    public void Login(String Username , String Password)
    {
        MLogin m1 = new MLogin();
        m1.Login(Username, Password);
    }
}
