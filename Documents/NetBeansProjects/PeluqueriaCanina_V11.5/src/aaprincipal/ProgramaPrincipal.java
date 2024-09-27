package aaprincipal;

import interfaz.InterfazPrincipal;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        InterfazPrincipal interfaz = new InterfazPrincipal(0);
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
    }
    
}
