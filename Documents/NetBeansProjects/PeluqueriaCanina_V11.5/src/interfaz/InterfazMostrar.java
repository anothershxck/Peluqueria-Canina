
package interfaz;

import aaprincipal.PetOwner;
public class InterfazMostrar extends javax.swing.JFrame {
//*************************************************************************    
//--1.VARIABLE GLOBAL
    
//1.1. Variables globales estatica indice:
//1.1.1.Contendrá la ultima posición de todos los vectores
//1.1.2.En esta ultima posición tengo los últimos datos ingresados por el usuario. En:
 //PetOwner.vecCodigoCliente[indice] --> 
    //tendré el último número de cliente generado
//PetOwner.vecNombrePerro[indice] --> 
    //tendré el último nombre de mascota ingresados por el usuario
//PetOwner.vecNombreDuenio[indice] --> 
    //tendré el último nombre de dueño ingresado por el usuario
//PetOwner.vecColor[indice] --> 
    //tendré el último color de mascota seleccionado por el usuario
//PetOwner.vecRaza[indice] --> 
    //tendré la última razas seleccionada por el usuario
//etc.    
    public static  int indice;//[VARIABLE GLOBAL]

//*************************************************************************    
//--2.OBJETO GLOBAL
    InterfazPrincipal interfaz2 = new InterfazPrincipal(1);//[VARIABLE GLOBAL]
 
//*************************************************************************    
//--3.MÉTODO CONSTRUCTOR InterfazMostrar:
    
//Se invoca este método constructor cuando abro este formulario (InterfazMostrar)    
//Cuando abro este formulario (InterfazMostrar), se inicializan todas las componentes
//que están dentro de este método constructor     
    
    public InterfazMostrar() {
        initComponents();
//*************************************************************************    
//4.PROPIEDFAD setUndecorated

//OCULTA BARRA DE TÍTULO DESDE PROPIEDADES DEL FORM
        //this.setUndecorated(true);
       // System.out.println("INFORMO DESDE INTERFAZ MOSTRAR****************");
       // System.out.println("[InterfazMostrar] -- PetOwner.i :" + PetOwner.i);
//*************************************************************************    
//5.VARIABLE GLOBAL ESTATICA INDICE

//5.1.Recibe la ultima posición de los vctores
////5.2.Aca es donde la variable indice recibe la posición de los
// últimos datos ingresados por el usuario.
        indice =PetOwner.i-1;
        //System.out.println("[INTERFAZ MOSTRAR]valor variable indice luego de hacer indice = PetOwner.i-1: " + indice);
        //System.out.println("[INTERFAZ MOSTRAR]PetOwner.vecCodigoCliente[indice]: " +PetOwner.vecCodigoCliente[indice]);
        //System.out.println("[INTERFAZ MOSTRAR]PetOwner.vecCodigoCliente[0]: " +PetOwner.vecCodigoCliente[0]);
        
        tableDatos.removeAll();
        tableDatos.setValueAt(PetOwner.vecCodigoCliente[indice], 0, 0);
        tableDatos.setValueAt(PetOwner.vecNombreDuenio[indice], 0, 1);
        tableDatos.setValueAt(PetOwner.vecCelular[indice], 0, 2);
        tableDatos.setValueAt(PetOwner.vecNombrePerro[indice], 0, 3);
        tableDatos.setValueAt(PetOwner.vecRaza[indice], 0, 4);
        tableDatos.setValueAt(PetOwner.vecColor[indice], 0, 5);
        tableDatos.setValueAt(PetOwner.vecAlergico[indice], 0, 6);
        tableDatos.setValueAt(PetOwner.vecAencionEspecial[indice], 0, 7);
        //for (int j = 0; j < interfaz.i; j++) {
        for (int j = 0; j < indice; j++) {
            tableDatos.setValueAt(PetOwner.vecCodigoCliente[j], j+1, 0);
            tableDatos.setValueAt(PetOwner.vecNombreDuenio[j], j+1, 1);
            tableDatos.setValueAt(PetOwner.vecCelular[j], j+1, 2);
            tableDatos.setValueAt(PetOwner.vecNombrePerro[j], j+1, 3);
            tableDatos.setValueAt(PetOwner.vecRaza[j], j+1, 4);
            tableDatos.setValueAt(PetOwner.vecColor[j], j+1, 5);
            tableDatos.setValueAt(PetOwner.vecAlergico[j], j+1, 6);
            tableDatos.setValueAt(PetOwner.vecAencionEspecial[j], j+1, 7);
            
//            System.out.print("[INTERFAZ MOSTRAR]" + j + " " +PetOwner.vecCodigoCliente[j]);
//            System.out.print( " " +PetOwner.vecNombrePerro[j]);
//            System.out.print( " " +PetOwner.vecRaza[j]);
//            System.out.print( " " +PetOwner.vecColor[j]);
//            System.out.print( " " +PetOwner.vecAlergico[j]);
//            System.out.print( " " +PetOwner.vecAencionEspecial[j]);
//            System.out.print( " " +PetOwner.vecNombreDuenio[j]);
//            System.out.print( " " +PetOwner.vecCelular[j]);
//            System.out.println( " " +PetOwner.vecObservaciones[j]);
        }
        
        
        
//        tableDatos.setValueAt("C01", 0, 0);
//        tableDatos.setValueAt("JUAN", 0, 1);
//        tableDatos.setValueAt("12345", 0, 2);
//        tableDatos.setValueAt("ROCO", 0, 3);
//        tableDatos.setValueAt("CANICHE", 0, 4);
//        tableDatos.setValueAt("ROJO", 0, 5);
//        tableDatos.setValueAt("SI", 0, 6);
//        tableDatos.setValueAt("SI", 0, 7);
        
    }

   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setUndecorated(true);

        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "CELULAR", "MASCOTA", "RAZA", "COLOR", "ALERGIA", "At. Especial"
            }
        ));
        jScrollPane1.setViewportView(tableDatos);

        btnVolver.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE))
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeneralLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnVolver))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
  
        //HAGO VISIBLE  LA INTERFAZ InferfazPrincipal
        interfaz2.setVisible(true);
        //CENTRO LA INTERFAZ InferfazPrincipal
        interfaz2.setLocationRelativeTo(null);
        //CIERRO ESTA VENTANA
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JTable tableDatos;
    // End of variables declaration//GEN-END:variables
}
