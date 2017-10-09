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
public class FirstWindow {
    
    public static void main(String[] args){
        
        int i, j, num_line;
        String s, picture;
        boolean condition;
        
        do{
            s=JOptionPane.showInputDialog(null, "Podaj liczbe wierszy");
            num_line=Integer.parseInt(s);
            condition=!(num_line >= 3 && num_line <=10);
            
            if(condition){
                JOptionPane.showMessageDialog(null, "Nieprawidłowa liczba wierszy " + num_line);
            }
        }while(condition);
        s = JOptionPane.showInputDialog(null,"Podaj znak wypelnienia");
        
        //Rysuj kwadrat
        picture = "";
        
        for(i = 0; i<num_line; i++){
            for(j = 0; j<num_line; j++){
                picture += (s+ " ");
            }
            picture += "\n";
        }
        
        JOptionPane.showMessageDialog(null, picture);
    }
}
