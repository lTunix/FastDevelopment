package Interfaz;

import javax.swing.JOptionPane;
import Clases.ConexionBD;
import Clases.Distribuidor;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permite modificar un distribuidor por medio del dato verificador (rut).
 * @author Marcos Fernandez.
 * @since 13/06/2017
 * @version 1.0
 */
public class ModificarDistribuidor extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();
    
    /**
     * Llena los ComboBox con el script de la base de datos.
     */
    public ModificarDistribuidor() throws SQLException {
        initComponents();
        MostrarTabla();
        LlenarComboRegion();
        LlenarComboComuna();
    }
    
    /**
    * Muestra los datos que se piden y se muestran Panel de la interfaz.
    */   
    public void MostrarTabla() throws SQLException{
    DefaultTableModel bosquejo_tabla = new DefaultTableModel();
    bosquejo_tabla = primera_conexion.MostrarTabla();
    tbMostrar.setModel(bosquejo_tabla);    
}
    /**
     * Llena el Combobox de Comuna con los datos del script en la base de datos.
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
     * Actualiza y guarda en la base de datos los datos que se modificaron de los campos de la interfaz.
     */
    public void ActualizarDistribuidor(){
        Distribuidor d = new Distribuidor();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        d.setRut(rutEmp1.getText());
        d.setTelefono(Integer.parseInt(txtTel.getText()));
        d.setDireccion(txtDir.getText());
        d.setNombempr(nombEmp.getText());
        Date fecha = Fechareg.getDate();   
        d.setAñoinicio(sdf.format(fecha));
        d.setComuna(combCom.getSelectedItem().toString());
        d.setRegion(combReg.getSelectedItem().toString());
        primera_conexion.ActualizarDistribuidor(d);
    }
    
    /**
     * Metodo que limpia todos los campos de la interfaz.
     */
    public void Limpiar(){
        nombEmp.setText("");
        rutEmp1.setText("");
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nombEmp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        combCom = new javax.swing.JComboBox<>();
        combReg = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rutEmp1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Fechareg = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Modificar Nuevo Distribuidor");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 464, 33));

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 11, 823, 437));

        jLabel1.setText("Nombre Empresa:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 72, -1, -1));

        nombEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombEmpKeyTyped(evt);
            }
        });
        getContentPane().add(nombEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 128, -1));

        jLabel2.setText("Telefono:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setText("Año inicio de ventas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 120, -1, -1));

        jLabel7.setText("Comuna:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 123, -1, -1));

        jLabel8.setText("Región:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 158, -1, -1));

        txtDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirKeyTyped(evt);
            }
        });
        getContentPane().add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 120, 128, -1));

        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 128, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 191, 484, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, 484, 10));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 304, 484, 10));

        combCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combComActionPerformed(evt);
            }
        });
        getContentPane().add(combCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 129, -1));

        combReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        combReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combRegActionPerformed(evt);
            }
        });
        getContentPane().add(combReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 158, 130, -1));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        btnActualizar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jLabel3.setText("Ingrese RUT:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 72, -1, -1));

        rutEmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutEmp1ActionPerformed(evt);
            }
        });
        rutEmp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rutEmp1KeyTyped(evt);
            }
        });
        getContentPane().add(rutEmp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 128, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 484, -1));
        getContentPane().add(Fechareg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 190, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
     * Le pone un limitador al campo dirección para que solo ingrese 20 caracteres.
     * Solo le permite ingresar letras, números y la tecla espacio.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt 
     */
    private void txtDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirKeyTyped
        //Variable que permitira limitar el largo.
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
     * Limpia todos los campos de la interfaz.
     * En el caso de los Combobox deja la primera opción.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * Botón "Actualizar" que modifica y registra al distribuidor en la base de datos.
     * @param evt
     */
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ActualizarDistribuidor();
        Limpiar();
        try {
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(ModificarDistribuidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * Evento del Combobox Región.
     * @param evt
     */
    private void combComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combComActionPerformed
        
    }//GEN-LAST:event_combComActionPerformed

    /**
     * Le pone un limitador al campo dirección para que solo ingrese 10 caracteres.
     * Solo le permite ingresar números, la tecla guión y la letra "k".
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void rutEmp1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rutEmp1KeyTyped
        int limite = 10;

        if(rutEmp1.getText().length()==limite || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 44
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
    }//GEN-LAST:event_rutEmp1KeyTyped

    /**
     * Evento del campo Rut.
     * @param evt
     */
    private void rutEmp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutEmp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutEmp1ActionPerformed

    /**
     * Habilita la visibilidad de la interfaz.
     * @param args 
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificarDistribuidor().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificarDistribuidor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fechareg;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> combCom;
    private javax.swing.JComboBox<String> combReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nombEmp;
    private javax.swing.JTextField rutEmp1;
    private javax.swing.JTable tbMostrar;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
