package aaprincipal;

//TODAS VARIBLES Y CONSTANTES ESTÁTICAS
public class PetOwner {

//*************************************************************        
//----- A. MASCOTA
        public static final int TAMANIO_VECTOR=500;
        
        public static  int i=0;
        
        //A.1. declaro y creo vectores referente a mascota
        public static String[] vecNombrePerro = new String[TAMANIO_VECTOR];
        public static String[] vecRaza = new String[TAMANIO_VECTOR];
        public static String[] vecColor = new String[TAMANIO_VECTOR];
        public static String[] vecAlergico = new String[TAMANIO_VECTOR];
        public static String[] vecAencionEspecial = new String[TAMANIO_VECTOR];
        public static String[] vecObservaciones = new String[TAMANIO_VECTOR];
        
//*************************************************************        
//----- B. DUEÑO
        
        //B.1. declaro y creo vectores referente a DUEÑO
        public static String[] vecCodigoCliente = new String[TAMANIO_VECTOR];
        public static String[] vecNombreDuenio = new String[TAMANIO_VECTOR];
        public static String[] vecCelular = new String[TAMANIO_VECTOR];    
}
