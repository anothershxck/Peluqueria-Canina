package Alumnos;

public class Grupo2_celular {
    //Ejemplo celu: 11 32553634 
    public String crearCelular(){
         return "11"+ (int) (10000000 + Math.random() * 90000000);        
    }
}
