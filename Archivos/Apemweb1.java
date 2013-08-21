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

    public static void main(String[] args) {
       
        new Apemweb1();
        
    }

  public Apemweb1() {
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer digito"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo digito"));

        c = a + b;
        JOptionPane.showMessageDialog(null, "El resultado es " + c);
    }
}