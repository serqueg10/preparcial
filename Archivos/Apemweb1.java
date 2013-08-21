/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apemweb1;

import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class Apemweb1 {

    int a;
    int b;
    int c;
    int resta;
    

    public static void main(String[] args) {
       
        new Apemweb1();
        
    }
    public menu()
    {
        this.Apemweb1();

         int k = 1;
        while (k != 0) {
            String menu0Input = JOptionPane.showInputDialog(null, "Bienvenido al menusito, escoja la opcion que desee. \n"
                    + "1. Suma \n"
                    + "2. Resta \n"
                    + "0. salir\n", JOptionPane.QUESTION_MESSAGE);

            int menu0 = Integer.parseInt(menu0Input);
            switch (menu0) 
            {
                case 1:
                    this.suma();
                    break;
                case 2:
                    this.resta();
                    break;
                case 0:
                    System.exit(1);

                    break;
            }
    }
  public Apemweb1() {
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer digito"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo digito"));

        c = a + b;
        resta = a-b;
    }
    public suma()
    {
       JOptionPane.showMessageDialog(null, "El resultado es " + c); 
    }
    public resta()
    {
       JOptionPane.showMessageDialog(null, "El resultado es " + resta);
    }
}