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
public class SimpleCalculator {
    
    public static void main(String[] args){
        char operation;
        float a, b;
        String s, result = "";
        
        JOptionPane.showMessageDialog(null, "Prosty kalkulator");
        
        do{
            s=JOptionPane.showInputDialog(null, 
                    "Podaj jeden operator:\n"
                    + "+ lub d - dodawanie\n"
                    + "- lub m - odejmowanie\n"
                    + "* lub x - mnożenie\n"
                    + "/ lub \\ - dzielenie\n"
                    + "k - koniec programu");
            operation = s.charAt(0);
            if(operation == 'k') break;
            
            s = JOptionPane.showInputDialog(null, "Podaj pierwsza liczbe");
            a = Float.parseFloat(s);
            s = JOptionPane.showInputDialog(null, "Podaj druga liczbe: ");
            b = Float.parseFloat(s);
            
            switch(operation){
                case '+':
                case 'd':
                    result = a +" "+ operation + " " + b + " = " + (a+b);
                    break;
                case '-':
                case 'm':
                    result = a +" "+ operation + " " + b + " = " + (a-b);
                    break;
                case '*':
                case 'x':
                    result = a +" "+ operation + " " + b + " = " + (a*b);
                    break;
                case '/':
                case '\\':
                    result = a +" "+ operation + " " + b + " = " + (a/b);
                    break;
                default:
                    result = "Nieznany operator";
            }
            JOptionPane.showMessageDialog(null, result);
        }while(operation != 'k');
        
        result = "Koniec programu";
        JOptionPane.showMessageDialog(null, result);
        System.exit(0);
    }
}
