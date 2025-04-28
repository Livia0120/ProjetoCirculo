
package principal;

import javax.swing.JOptionPane;
import model.Circulo;


public class Principal {
    public static void main(String args[]){
        Circulo cir1 = new Circulo();
        
        cir1.setRaio(Double.parseDouble(JOptionPane.showInputDialog("informe o raio: ")));
        
        JOptionPane.showMessageDialog(null, "a area do circulo com raio " + cir1.getRaio() + " é " + cir1.getAreaArredondada());
   
    }
}

