package metodospractica;

import javax.swing.JOptionPane;

public class MisMetodosPractica {
    
        
    public void multiplicarNumeros(){
        int a=10;
        int b=20;
        int c=2;
        int d=3;
        int multiplicacion=a*b*c*d;
        JOptionPane.showMessageDialog(null,"EL resultado de la multiplicación es: \n"+  multiplicacion); 
    
}
    public String concatenarValores(){
        String nombre="David";
        String apellido="anaya";
        String apellidoM="Salinas";
        String nc=nombre+" "+apellido+" "+apellidoM;
        JOptionPane.showMessageDialog(null,"Mi nombre completo es: \n"+  nc); 
        return null;
        
    }

}