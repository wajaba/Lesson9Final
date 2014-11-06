
import java.net.URL;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tann1260
 */
public class Die {
    public static int DieRoll(){
       int num = (int)(Math.random()*6)+1;
       
        return num;
    }
}
