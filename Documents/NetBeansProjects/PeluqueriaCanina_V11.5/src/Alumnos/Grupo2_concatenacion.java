
package Alumnos;
public class Grupo2_concatenacion {
    //VARIABLE
    int indice;
   
    //OBJETO STRING
    String concate = "";
    String letra = "A"; //[CONSTANTE]
    
    public String concatenarString(int indiceArgum){
        indice = indiceArgum;
        if(indice > 0 && indice <=9 ){
            concate = letra +0 + 0 + indice;
        }
        
        if(indice > 9 && indice <=99 ){
         concate = letra + 0 + indice;
        }

        if(indice > 99 && indice <=999 ){
            concate = letra + indice;
        }
        //vecCodigoCliente[indice]=concate;
        return concate;
    }
}
