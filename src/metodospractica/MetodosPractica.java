package metodospractica;

import javax.swing.JOptionPane;

public class MetodosPractica {

    public static void main(String[] args) {
        
     //Metodos no estaticos   
    
    MisMetodosPractica metodo1=new MisMetodosPractica();
      metodo1.multiplicarNumeros();
      
    MisMetodosPractica metodo2=new MisMetodosPractica();
     metodo2.concatenarValores();
     
     //metodos estaticos
     
    dividirNumeros();
    
     
    exponenteNumeros();
     
    } 
    public static float dividirNumeros(){
        float c=800;
        float d=8;
        float division=c/d;
        JOptionPane.showMessageDialog(null,"La division de flotantes es: \n"+ division); 
        return 0;
    }
    
    public static double exponenteNumeros(){
        int n1=5;
        int n2=3;
        double expo =Math.pow(n1,n2);
        JOptionPane.showMessageDialog(null,"El exponente de los valores es: \n"+ expo); 
        return 0;
    }

    }