package Interfaz;

import javax.swing.JOptionPane;
import Clases.Distribuidor;
import Clases.ConexionBD;
import java.text.ParseException;
import javax.swing.DefaultComboBoxModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase para registrar un distribuidor en la base de datos.
 * @author Marcos Fernandez.
 * @since 13/06/2017
 * @version 1.0
 */
public class RegistrarDistribuidor extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();
    
    
    /**
    * Toma los datos que se ingresan en los campos en la interfaz.
     * @throws java.text.ParseException
    */    
    
    
    /**
     * Guarda en la base de datos los datos que se tomaron de los campos de la interfaz.
     */
    public void GuardarDistribuidor(){
        Distribuidor d = new Distribuidor();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        d.setRut(rutEmp.getText());
        d.setTelefono(Integer.parseInt(txtTel.getText()));
        d.setDireccion(txtDir.getText());
        d.setNombempr(nombEmp.getText());
        d.setComuna(combCom.getSelectedItem().toString());
        d.setRegion(combReg.getSelectedItem().toString());
        Date fecha = Fechareg.getDate();        
        d.setAñoinicio(sdf.format(fecha));
        primera_conexion.GuardarDistribuidor(d);
    }
    
    /**
     * Llena el Combobox de Región con los datos del script en la base de datos.
     */
    public void LlenarComboRegion(){
        DefaultComboBoxModel modelo_combo = new DefaultComboBoxModel();
        modelo_combo = primera_conexion.ConstruirComboBoxRegion();
        combReg.setModel(modelo_combo);
    }
    
    /**
     * Llena el Combobox de Comuna con los datos del script en la base de datos.
     */
    public void LlenarComboComuna(){
        DefaultComboBoxModel modelo_combo2 = new DefaultComboBoxModel();
        modelo_combo2 = primera_conexion.ConstruirComboBoxComuna();
        combCom.setModel(modelo_combo2);
    }

    /**
     * Llena los ComboBox con el script de la base de datos.
     */
    public RegistrarDistribuidor() {
        initComponents();
        LlenarComboRegion();
        LlenarComboComuna();
    }
    
    /**
     * Limpia los campos ingresados anteriormente.
     */
    public void Limpiar(){
        nombEmp.setText("");
        rutEmp.setText("");       
        txtDir.setText("");
        combCom.setSelectedItem(1);
        combReg.setSelectedItem(1);
        txtTel.setText("");
        combCom.setSelectedIndex(0);
        combReg.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        combCom = new javax.swing.JComboBox<>();
        combReg = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nombEmp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rutEmp = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Fechareg = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Teléfono:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel5.setText("Año inicio de ventas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 305, -1, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registrar Nuevo Distribuidor");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 482, 33));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 371, -1, -1));

        btnAgregar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 371, -1, -1));

        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel7.setText("Comuna:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel8.setText("Región:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirKeyTyped(evt);
            }
        });
        getContentPane().add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 130, -1));

        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 128, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 478, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, 478, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 264, 478, -1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 478, 13));

        combCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combComActionPerformed(evt);
            }
        });
        getContentPane().add(combCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 125, -1));

        combReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        combReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combRegActionPerformed(evt);
            }
        });
        getContentPane().add(combReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 130, -1));

        jLabel1.setText("Nombre Empresa:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        nombEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombEmpActionPerformed(evt);
            }
        });
        nombEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombEmpKeyTyped(evt);
            }
        });
        getContentPane().add(nombEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 128, -1));

        jLabel3.setText("RUT:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 67, -1, -1));

        rutEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rutEmpKeyTyped(evt);
            }
        });
        getContentPane().add(rutEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 64, 129, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 478, -1));
        getContentPane().add(Fechareg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 190, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Limpia todos los campos de la interfaz.
     * En el caso de los Combobox deja la primera opción.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     *  * Le pone un limitador al campo dirección para que solo ingrese 20 caracteres.
     * Solo le permite ingresar letras, números y la tecla espacio.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt 
     */
    private void txtDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirKeyTyped

        int limite = 20;
        
        //Condicion que pregunta SI los caracteres son de tipo NUMERO, ESPACIO, 
        //LARGO MAX. DE 20 y CARACTERES ESPECIALES SEGUN ASCII, se ejecutada un mensaje de envio y sonido.
        if(txtDir.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 64 ||
                (int)evt.getKeyChar() >= 91 && (int)evt.getKeyChar()<= 96 ||
                (int)evt.getKeyChar() >= 123 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Letras' y 'Numeros', con un máx. de largo de 20.");
        } 
    }//GEN-LAST:event_txtDirKeyTyped

    /**
     * Le pone un limitador al campo teléfono para que solo ingrese 9 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        int limite = 9;
        
        if(txtTel.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 9.");
        } 
    }//GEN-LAST:event_txtTelKeyTyped

    /**
     * Evento del Combobox Región.
     * @param evt
     */
    private void combRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combRegActionPerformed

    /**
     * Le pone un limitador al campo dirección para que solo ingrese 30 caracteres.
     * Solo le permite ingresar letras, números y simbolos.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void nombEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombEmpKeyTyped
        int limite = 30;
        
        if(nombEmp.getText().length()==limite || (int)evt.getKeyChar() >= 123 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Letras', 'Numeros', y 'Simbolos' con un máx. de largo de 30.");
        } 
    }//GEN-LAST:event_nombEmpKeyTyped

    /**
     * Le pone un limitador al campo dirección para que solo ingrese 10 caracteres.
     * Solo le permite ingresar números, la tecla guión y la letra "k".
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void rutEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rutEmpKeyTyped
        int limite = 10;
        
        if(rutEmp.getText().length()==limite || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 44 
                || ((int)evt.getKeyChar() >= 46 && (int)evt.getKeyChar()<= 47)
                || ((int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 74)
                || ((int)evt.getKeyChar() >= 76 && (int)evt.getKeyChar()<= 106)
                || ((int)evt.getKeyChar() >= 108 && (int)evt.getKeyChar()<= 255))
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', 'Guión' y 'K' con un máx. de largo de 10.");
        } 
    }//GEN-LAST:event_rutEmpKeyTyped

    /**
     * Botón "Agregar" registra al distribuidor en la base de datos.
     * @param evt
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        GuardarDistribuidor();
        Limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * Evento del Combobox Mes.
     * @param evt
     */
    private void combComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combComActionPerformed

    private void nombEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombEmpActionPerformed

    /**
     * Habilita la visibilidad de la interfaz.
     * @param args 
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarDistribuidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fechareg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> combCom;
    private javax.swing.JComboBox<String> combReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nombEmp;
    private javax.swing.JTextField rutEmp;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
