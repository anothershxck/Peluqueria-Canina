
package Alumnos;

import javax.swing.JOptionPane;

public class TPentrada {
    //    public void Validacion(String name){
//        salida out = new salida();
//        
//        name=JOptionPane.showInputDialog("ingrese nombre");
//        //out.informar("nombre ingresado: ", name);
//        
//        while( name == null || name.isEmpty()){
//            
//        name=JOptionPane.showInputDialog("ingrese nombre");    
//        out.informar("nombre ingresado: ", name);
//        }
//    }
    public static String Ingresar(String msj_in){
        String name;
        
        name=JOptionPane.showInputDialog(msj_in);
        
        while( name == null || name.isEmpty()){
            
        name=JOptionPane.showInputDialog(msj_in);    
        
        }
        return name;
    }
}
