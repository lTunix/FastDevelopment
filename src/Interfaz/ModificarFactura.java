package Interfaz;

import Clases.ConexionBD;
import Clases.Factura;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permite modificar una factura por medio del dato Número de folio.
 * Llena los ComboBox con el script de la base de datos.
 * @author Marcos Fernandez.
 * @since 04/07/2017
 * @version 1.0
 */
public class ModificarFactura extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();

    /**
     * Muestra la tabla que se busca.
     */
    public ModificarFactura() throws SQLException {
        initComponents();
        MostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cbMetodo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Fechareg = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        txtMin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 11, 665, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modificar Factura de Compra");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 11, 394, -1));

        btnAgregar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAgregar.setText("Actualizar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 340, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 340, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, 400, 8));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 324, 400, 10));

        getContentPane().add(cbMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 132, 103, -1));

        jLabel6.setText("Fecha de Compra: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 208, -1, -1));
        getContentPane().add(Fechareg, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 208, 103, -1));

        jLabel7.setText("Hora de Compra:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 246, -1, -1));
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 243, 34, -1));

        jLabel1.setText(":");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 246, -1, -1));

        txtIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaKeyTyped(evt);
            }
        });
        getContentPane().add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 170, 103, -1));
        getContentPane().add(txtMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 243, 35, -1));

        jLabel4.setText("N° Folio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 95, -1, -1));

        jLabel2.setText("Metodo de Pago:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 135, -1, -1));

        txtFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFolioKeyTyped(evt);
            }
        });
        getContentPane().add(txtFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 92, 102, -1));

        jLabel5.setText("Valor IVA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 173, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Limpia todos los campos de la interfaz.
     * En el caso de los Combobox deja la primera opción.
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtFolio.setText("");
        cbMetodo.setSelectedIndex(0);
        txtIva.setText("");
        txtHora.setText("");
        txtMin.setText("");        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
    * Muestra los datos que se piden y se muestran Panel de la interfaz.
    */  
     public void MostrarTabla() throws SQLException{
    DefaultTableModel bosquejo_tabla = new DefaultTableModel();
    bosquejo_tabla = primera_conexion.MostrarTablaFactura();
    tbMostrar.setModel(bosquejo_tabla);    
}
     /**
     * Actualiza y guarda en la base de datos los datos que se modificaron de los campos de la interfaz.
     * Poniendo los ComboBox automaticamente e incrementandolos en 1 cada vez que se guarda alguno.
     */
     public void ActualizarFactura(){
        Factura f = new Factura();
        f.setFolio(Integer.parseInt(txtFolio.getText()));
        f.setMetodo(cbMetodo.getSelectedIndex() + 1);
        f.setIva(Integer.parseInt(txtIva.getText()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = Fechareg.getDate();  
        f.setFecha(sdf.format(fecha));
        f.setHora(txtHora.getText() + ":" + txtMin.getText());
        primera_conexion.ActualizarFactura(f);
     }
    
    /**
     * Le pone un limitador al campo IVA para que solo ingrese 9 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtIvaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaKeyTyped
        int limite = 9;
        
        if(txtIva.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 9.");
        }
    }//GEN-LAST:event_txtIvaKeyTyped

    /**
     * Le pone un limitador al campo Nº de folio para que solo ingrese 10 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFolioKeyTyped
        int limite = 10;
        
        if(txtFolio.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 10.");
        }     
    }//GEN-LAST:event_txtFolioKeyTyped

    /**
     * Botón "Actualizar" que modifica y registra una factura en la base de datos.
     * También limpia los campos de la interfaz y muestra los datos modificados.
     * @param evt
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       ActualizarFactura();
        try {
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(ModificarFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * Habilita la visibilidad de la interfaz.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificarFactura().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificarFactura.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fechareg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbMetodo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbMostrar;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtMin;
    // End of variables declaration//GEN-END:variables
}
