/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WindowApp;
import javax.swing.JOptionPane;

/**
 *
 * @author Pawel
 */
public class Banknoty {
    
    public static void main(String[] args){
        int B20, B10, B5, value, way = 0;
        String s, result = "";
        
        do{
            s = JOptionPane.showInputDialog(null, "Podaj liczbe banknotow po 20 tysiecy");
            B20 = Integer.parseInt(s);
            s = JOptionPane.showInputDialog(null, "Podaj liczbe banknotow po 10 tysiecy");
            B10 = Integer.parseInt(s);
            s = JOptionPane.showInputDialog(null, "Podaj liczbe banknotow po 5 tysiecy");
            B5 = Integer.parseInt(s);
            s = JOptionPane.showInputDialog(null, "Podaj kwote");
            value = Integer.parseInt(s);
        }while(B20 <= 0 || B10 <=0 || B5 <= 0 || value <= 0);
        
        for(int i = 0; i <= B20; i++){
            for(int j = 0; j <= B10; j++){
                for(int k = 0; k <= B5; k++){
                    if(20*i + 10*j + 5*k == value){
                        way++;
                        result += "kwota: " + value + "tys.zl = ";
                        if(k > 0) result += k + "* 5 tys.";
                        if(j > 0) result += j + "* 10 tys.";
                        if(i > 0) result += i + "* 20 tys.";
                        result += "\r\n";
                    }
                }
            }
        }
        result += "liczba sposobow: " + way + "\r\n";
        JOptionPane.showMessageDialog(null, result);
        System.exit(0);
    }
    
}
