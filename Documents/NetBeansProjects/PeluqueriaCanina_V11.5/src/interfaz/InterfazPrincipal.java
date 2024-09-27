
package interfaz;

import Alumnos.Grupo2_celular;
import Alumnos.Grupo2_concatenacion;
import aaprincipal.PetOwner;
import javax.swing.JOptionPane;

public class InterfazPrincipal extends javax.swing.JFrame {
    //*************************************************************************    
//--1.VARIABLES GLOBALES
    
//1.1. Variables globales comunes (mensajes de JOptionPane) 
    String msj_in="Debe ingresar ",
    msj_name="nombre del ";
    String title="Warning"; 

//*************************************************************************    
//--2.OBJETOS GLOBALES    
    Grupo2_concatenacion g2_id = new Grupo2_concatenacion();
    Grupo2_celular g2_celular = new Grupo2_celular();
    
//*************************************************************************    
//--3.MÉTODO CONSTRUCTOR InterfazPrincipal:
    
//Se invoca este método constructor cuando abro este formulario    
//Cuando abro este formulario, se inicializan todas las componentes
//que están dentro de este método constructor     
    public InterfazPrincipal(int opcion) {
        initComponents();
        //this.txtId.setEnabled(false);
        if (opcion==0){
            CargarAutomaticamente();//NOOO BORRAR
            debuggear();      //borrar
        }  
        else { cargarUlitimoIngresado(); }
    }
 ///---3FIN --> FIN DEL MÉTODO CONSTRUCTOR    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGral = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        numCliente = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        raza = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        alergico = new javax.swing.JLabel();
        atencionSpecial = new javax.swing.JLabel();
        nombreDuenio = new javax.swing.JLabel();
        celDuenio = new javax.swing.JLabel();
        txtObservacion = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbRaza = new javax.swing.JComboBox<>();
        cmbAlergia = new javax.swing.JComboBox<>();
        cmbAtencion = new javax.swing.JComboBox<>();
        txtNameDuenio = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtArea = new javax.swing.JScrollPane();
        areaObservaciones = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        imgPerro = new javax.swing.JLabel();
        cmbColor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(0, 51, 51));
        titulo.setFont(new java.awt.Font("Yu Gothic", 1, 32)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText(" PELUQUERIA CANINA");
        titulo.setOpaque(true);
        PanelGral.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 370, 50));

        numCliente.setBackground(new java.awt.Color(0, 51, 51));
        numCliente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        numCliente.setText("Nº Cliente:");
        PanelGral.add(numCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 130, 30));

        Name.setBackground(new java.awt.Color(0, 51, 51));
        Name.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Name.setText("Nombre:");
        PanelGral.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 130, 30));

        raza.setBackground(new java.awt.Color(0, 51, 51));
        raza.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        raza.setText("Raza:");
        raza.setToolTipText("");
        PanelGral.add(raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 130, 30));

        color.setBackground(new java.awt.Color(0, 51, 51));
        color.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        color.setText("Color:");
        PanelGral.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, 30));

        alergico.setBackground(new java.awt.Color(0, 51, 51));
        alergico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        alergico.setText("Alergico:");
        alergico.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PanelGral.add(alergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 130, -1));

        atencionSpecial.setBackground(new java.awt.Color(0, 51, 51));
        atencionSpecial.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        atencionSpecial.setText("Atención especial:");
        PanelGral.add(atencionSpecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 271, 220, -1));

        nombreDuenio.setBackground(new java.awt.Color(0, 51, 51));
        nombreDuenio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nombreDuenio.setText("Nombre Dueño:");
        PanelGral.add(nombreDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 220, 30));

        celDuenio.setBackground(new java.awt.Color(0, 51, 51));
        celDuenio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        celDuenio.setText("Celular Dueño:");
        PanelGral.add(celDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 220, 30));

        txtObservacion.setBackground(new java.awt.Color(0, 51, 51));
        txtObservacion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtObservacion.setText("Observaciones:");
        PanelGral.add(txtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 220, 30));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelGral.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 240, 30));

        txtName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        PanelGral.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 240, 30));

        cmbRaza.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cmbRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Beagle", "Boxer", "Bulldog", "Bull Terrier", "Cocker", "Caniche", "Chihuahua", "Cocker Spaniel", "Dalmata", "Doberman", "Dogo", "Galgo", "Golden Retriever", "Labrador Retriever", "Pastor Alemán", "Poodle", "Rottweiler", "Salchicha", "Shar pei", "Mestizos", "OTROS..." }));
        PanelGral.add(cmbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 240, 30));

        cmbAlergia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cmbAlergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        cmbAlergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlergiaActionPerformed(evt);
            }
        });
        PanelGral.add(cmbAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 240, 30));

        cmbAtencion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cmbAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        PanelGral.add(cmbAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 140, 30));

        txtNameDuenio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNameDuenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameDuenioKeyTyped(evt);
            }
        });
        PanelGral.add(txtNameDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 170, 30));

        txtCelular.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelGral.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 170, 30));

        areaObservaciones.setColumns(20);
        areaObservaciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        areaObservaciones.setRows(5);
        txtArea.setViewportView(areaObservaciones);

        PanelGral.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 580, 160));

        btnRegistrar.setBackground(new java.awt.Color(0, 102, 102));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(65, 23));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        PanelGral.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 140, 40));

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 102));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLimpiar.setMaximumSize(new java.awt.Dimension(65, 23));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(65, 23));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(65, 23));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelGral.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 140, 40));

        btnVisualizar.setBackground(new java.awt.Color(0, 102, 102));
        btnVisualizar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        PanelGral.add(btnVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 140, 40));

        imgPerro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sin título.jpg"))); // NOI18N
        PanelGral.add(imgPerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 360, 270));

        cmbColor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Blanco", "Gris", "Marrón", "Negro", "Blanco y Gris", "Blanco y Marrón", "Blanco y Negro", "Gris y Marrón", "Gris y Negro", "Marrón y Negro", "Blanco, Gris y Marrón", "Blanco, Gris y Negro", "Blanco, Marrón y Negro", "Gris, Marrón y Negro", "Blanco, Gris, Marrón y Negro" }));
        PanelGral.add(cmbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 240, 30));

        getContentPane().add(PanelGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //*************************************************************************    
//--4.MÉTODO debuggear:

//4.1. Carga los datos la primera vez que abro el formulario    
    public void debuggear(){ 
        //this.txtCodigoCliente.setText("A001");
         this.txtName.setText("MORO");
         this.cmbRaza.setSelectedIndex(1);
         this.cmbColor.setSelectedIndex(1);
         //this.txtColor.setText("Negro");
         this.cmbAlergia.setSelectedIndex(1);
         this.cmbAtencion.setSelectedIndex(1);
         this.txtNameDuenio.setText("JUAN");
         //this.txtCelular.setText("12346");
         this.areaObservaciones.setText("Observaciones:\n\n");
    }

//5. MÉTODO vaciarCampos:

//5.1. Borra los datos del formulario    
    public void vaciarCampos(){
            //this.txtId.setText("");
            CargarAutomaticamente();
           // this.txtId.setText(g2_id.concatenarString(PetOwner.i+1));
            this.txtName.setText("");
            this.cmbRaza.setSelectedIndex(0);
            this.cmbColor.setSelectedIndex(0);
            //this.txtColor.setText("");
            this.cmbAlergia.setSelectedIndex(0);
            this.cmbAtencion.setSelectedIndex(0);
            this.txtNameDuenio.setText("");
            //this.txtCelular.setText("");
            this.areaObservaciones.setText("Observaciones:\n\n");
    }
    
//6. MÉTODO CargarAutomaticamente

//6.1. Genera código de cliente aleatorio
//6.2. Genera número de celular aleatorio    
    private void CargarAutomaticamente(){
//System.out.println("[InterfazPrincipal.CargarAutomaticamente()] -- PetOwner.i: " + PetOwner.i);        
//System.out.println("[InterfazPrincipal.CargarAutomaticamente()] -- PetOwner.i+1: " + (PetOwner.i+1));        
        this.txtId.setText(g2_id.concatenarString(PetOwner.i+1));
        this.txtCelular.setText(g2_celular.crearCelular());
    }
    
//7. MÉTODO cargarUlitimoIngresado

//7.1. Coloca en el formulario (text field, combo box) los últimos datos ingresados    

//7.2. Cuando digo ÚLTIMOS DATOS INGRESADOS me refiero a: 
    //último número de cliente
    //último nombre de mascota ingresada por el usuario
    //último nombre de dueño ingresado por el usuario
    //último color de mascota seleccionado por el usuario
    //última raza seleccionada por el usuario
    //etc

//7.3. Cada dato ingresado está en un vector ESTATICO distinto:    
//PetOwner.vecCodigoCliente[i] --> contiene todos números de clientes generados
//PetOwner.vecNombrePerro[i] --> contiene todos nombre de mascota ingresados por el usuario
//PetOwner.vecNombreDuenio[i] --> contiene todos nombre de dueño ingresado por el usuario
//PetOwner.vecColor[i] --> contiene todos color de mascota seleccionado por el usuario
//PetOwner.vecRaza[i] --> contiene todas razas seleccionada por el usuario
//etc

//7.4. PetOwner.i-1:     
//7.4.1.Tiene la última posición del vector

//7.4.2.En esta última posición esta almacenado los últimos datos guardados. En:
//PetOwner.vecCodigoCliente[PetOwner.i-1] --> 
    //tengo el último número de cliente generado
//PetOwner.vecNombrePerro[PetOwner.i-1] --> 
    //tengo el último nombre de mascota ingresados por el usuario
//PetOwner.vecNombreDuenio[PetOwner.i-1] --> 
    //tengo el último nombre de dueño ingresado por el usuario
//PetOwner.vecColor[PetOwner.i-1] --> 
    //tengo el último color de mascota seleccionado por el usuario
//PetOwner.vecRaza[PetOwner.i-1] --> 
    //tengo la última razas seleccionada por el usuario
//etc.    
    
     public void cargarUlitimoIngresado(){
        //PetOwner.i-1
//System.out.println("[InterfazPpal.cargarUlitimoIngresado()] -- PetOwner.i: " + PetOwner.i);
          this.txtId.setText(PetOwner.vecCodigoCliente[ PetOwner.i-1]);
        this.txtName.setText(PetOwner.vecNombrePerro[ PetOwner.i-1]);
            this.cmbRaza.setSelectedItem(PetOwner.vecRaza[ PetOwner.i-1]);
            this.cmbColor.setSelectedItem(PetOwner.vecColor[ PetOwner.i-1]);
            //this.txtColor.setText(PetOwner.vecColor[ PetOwner.i-1]);
            this.cmbAlergia.setSelectedItem(PetOwner.vecAlergico[PetOwner.i-1]);
            this.cmbAtencion.setSelectedItem(PetOwner.vecAencionEspecial[ PetOwner.i-1]);
            this.txtNameDuenio.setText(PetOwner.vecNombreDuenio[ PetOwner.i-1]);
            this.txtCelular.setText(PetOwner.vecCelular[ PetOwner.i-1]);
            this.areaObservaciones.setText(PetOwner.vecObservaciones[ PetOwner.i-1]);
    }
     
//8. MÉTODO encontrarIngresoCanino

//8.1.Verifica que el user haya ingresado (text field) datos del canino      
     public boolean encontrarIngresoCanino(){
       
        //[VARIABLE GLOBAL] String msj_in="Debe ingresar ",
        //[VARIABLE GLOBAL] msj_name="nombre del ";
        //[VARIABLE GLOBAL] String title="Warning";
        
        String nombrePerro=txtName.getText();//[MODULARIZAR]
        //String cadColor=txtColor.getText();         //[MODULARIZAR]
        String observacion=areaObservaciones.getText();//[MODULARIZAR]
        if (nombrePerro.isEmpty() || cmbColor.getSelectedIndex()==0) {
            if (nombrePerro.isEmpty() ) {
                JOptionPane.showMessageDialog(null, msj_in+msj_name+"perro",title,JOptionPane.WARNING_MESSAGE);                        
                return false;
            }//cmbRaza.getSelectedIndex()==0 
            //if (cadColor.isEmpty() ) {
            if (cmbColor.getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar color del perro",title,2);
                return false;
            }
        }
        return true;
    }

//10. MÉTODO encontrarSeleccion

//10.1.Verifica que el user haya selecionado (JOptionPane) datos del canino
    public boolean encontrarSeleccion(){
        String msj_in2="Debe seleccionar ";
        //[VARIABLE GLOBAL] String title="Warning";
        if (cmbRaza.getSelectedIndex()==0 || cmbAlergia.getSelectedIndex()==0 ||cmbAtencion.getSelectedIndex()==0 ) {
            if(cmbRaza.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null, msj_in2+"raza",title,2);
                return false;
            }
            if(cmbAlergia.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null,msj_in2+"si tiene alergia",title,2);
                return false;
            }
            if(cmbAtencion.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null,msj_in2+"si requiere atención especial",title,2);
                return false;
            }
        }
        return true;
    }
          
//11. MÉTODO encontrarIngresoDuenio

//11.1.Verifica que el user haya ingresado (text field) datos del dueño
    public boolean  encontrarIngresoDuenio(){
        
        //[VARIABLE GLOBAL] String msj_in="Debe ingresar ",
        //[VARIABLE GLOBAL] msj_name="nombre del ";
        //[VARIABLE GLOBAL] String title="Warning";
        
         //DUEÑO
         //String codigo=txtCodigoCliente.getText();
         String nomDuenio=txtNameDuenio.getText();//[MODULARIZAR]
         String celular=txtCelular.getText();       //[MODULARIZAR]
         if (nomDuenio.isEmpty() || celular.isEmpty()) {
            if (nomDuenio.isEmpty() ) {
                JOptionPane.showMessageDialog(null,msj_in+msj_name+"dueño",title,1);
                return false;
            }
            if (celular.isEmpty() ) {
                JOptionPane.showMessageDialog(null,msj_in+"celular del dueño",title,1);
                return false;
            }
        }
         return true;
    }


//12. MÉTODO verificarCamposNOvacios
    
//12.1.PseudoMenú--> Pregunta:
    //si estan todos los text field ingresados
    //Y
    //si estan todos los comobo box seleccionados
    
    public boolean  verificarCamposNOvacios(){
        if (encontrarIngresoCanino() && encontrarSeleccion() && encontrarIngresoDuenio())
            return true;
        return false;             
    }


    private void cmbAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAlergiaActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed
//*********************************************************************************
//13. BOTON REGISTRAR 

//13.1.Guarda en un vector los datos ingresados por el uusuario
//13.2.Todos los vectores están en la clase PetOwner
//13.3.Cada elemento ingresado lo guardo en un vector distinto de la clase PetOwner    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
//System.out.println("///     CLIC BOTON REGISTRAR        ///");
//System.out.println("[InterfazPrincipal.btnRegistrar()] -- PetOwner.i: " + PetOwner.i);
//System.out.println("[InterfazPrincipal.btnRegistrar()] -- PetOwner.vecCodigoCliente[PetOwner.i]: " + PetOwner.vecCodigoCliente[PetOwner.i]);
//System.out.println("[InterfazPrincipal.btnRegistrar()] -- this.txtId.getText(): " + this.txtId.getText());

        if (verificarCamposNOvacios()) {
            //this.txtId.getText()
//             if (PetOwner.i >0 && PetOwner.vecCodigoCliente[PetOwner.i]==PetOwner.vecCodigoCliente[ PetOwner.i-1]) {
//             if (PetOwner.i >0 && PetOwner.vecCodigoCliente[PetOwner.i]==this.txtId.getText()) {

             if (PetOwner.i >0 && PetOwner.vecCodigoCliente[PetOwner.i-1].equals(this.txtId.getText())==true) {
                JOptionPane.showMessageDialog(null, "Ya existe ese códidgo de cliente en nuestros registros","Warning",2);
            } else {
                PetOwner.vecCodigoCliente[ PetOwner.i]=g2_id.concatenarString(PetOwner.i+1);
//System.out.println("[InterfazPrincipal.btnRegistrar()] -- PetOwner.vecCodigoCliente[ PetOwner.i]: luego de hacer\n"
//+ "[PetOwner.vecCodigoCliente[PetOwner.i]=g2_id.concatenarString(PetOwner.i+1)]: " + PetOwner.vecCodigoCliente[PetOwner.i]);                
                PetOwner.vecNombrePerro[ PetOwner.i]=this.txtName.getText();
                PetOwner.vecRaza[ PetOwner.i]=(String)this.cmbRaza.getSelectedItem();
                //PetOwner.vecColor[ PetOwner.i]=this.txtColor.getText();
                PetOwner.vecColor[ PetOwner.i]=(String)this.cmbColor.getSelectedItem();
                PetOwner.vecAlergico[ PetOwner.i]=(String)this.cmbAlergia.getSelectedItem();
                PetOwner.vecAencionEspecial[ PetOwner.i]=(String)this.cmbAtencion.getSelectedItem();
                PetOwner.vecNombreDuenio[ PetOwner.i]=this.txtNameDuenio.getText();
                PetOwner.vecCelular[ PetOwner.i]=this.txtCelular.getText();
                PetOwner.vecObservaciones[ PetOwner.i]=this.areaObservaciones.getText();
                PetOwner.i++;
//System.out.println("[InterfazPrincipal] -- PetOwner.i luego de hacer i++ al final del metodo .btnRegistrar(): " + PetOwner.i);                
                JOptionPane.showMessageDialog(null, "Los datos se registraron exitosamente");
                    }  
         }
    }//GEN-LAST:event_btnRegistrarActionPerformed

//********************************************************************************    
//15. BOTÓN LIMPIAR
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
//System.out.println("///     CLIC BOTON LIMPIAR        ///");
        vaciarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed
//*********************************************************************************    
//14. BOTÓN MOSTRAR    

//14.1.Hago clic en este boton y Abre la interfaz llamada InterfazMostrar    
    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
//System.out.println("///     CLIC BOTON VISUALIZAR        ///");
        if ( PetOwner.i > 0) {
            InterfazMostrar mostrar = new InterfazMostrar();
            mostrar.setVisible(true);
            this.setVisible(false);
            mostrar.setLocationRelativeTo(null);

        } else {
            JOptionPane.showMessageDialog(null, "Acutalmente NO hay datos cargados","Warning creado por el programador:",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        validarSoloLetras(evt);
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){//Todo lo que ingresa se pone em mayúscula
            String cad=(""+c).toUpperCase();
            c=cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtNameKeyTyped

    public void validarSoloLetras(java.awt.event.KeyEvent eventoTeclado){
        //https://matixa.co/categoria/programacion/java/validar-ingreso-de-caracteres-en-un-jtextfield
        int key = eventoTeclado.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {   //consume evento del teclado
        //ejecuta consume() (o sea consume la tecla) mientras escriba minuscula
        //mayuscula o espacio
        eventoTeclado.consume();
    }
    }
    
    private void txtNameDuenioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameDuenioKeyTyped
        validarSoloLetras(evt);
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){//Todo lo que ingresa se pone em mayúscula
            String cad=(""+c).toUpperCase();
            c=cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtNameDuenioKeyTyped



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JPanel PanelGral;
    private javax.swing.JLabel alergico;
    private javax.swing.JTextArea areaObservaciones;
    private javax.swing.JLabel atencionSpecial;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JLabel celDuenio;
    private javax.swing.JComboBox<String> cmbAlergia;
    private javax.swing.JComboBox<String> cmbAtencion;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JComboBox<String> cmbRaza;
    private javax.swing.JLabel color;
    private javax.swing.JLabel imgPerro;
    private javax.swing.JLabel nombreDuenio;
    private javax.swing.JLabel numCliente;
    private javax.swing.JLabel raza;
    private javax.swing.JLabel titulo;
    private javax.swing.JScrollPane txtArea;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameDuenio;
    private javax.swing.JLabel txtObservacion;
    // End of variables declaration//GEN-END:variables
}
