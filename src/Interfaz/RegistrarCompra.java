package Interfaz;

import javax.swing.*;
import Clases.Compra;
import Clases.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 * Clase para registrar una compra en la base de datos.
 * @author Marcos Fernandez.
 * @since 04/07/2017
 * @version 1.0
 */
public class RegistrarCompra extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();

    /**
     * Deshabilita la visibilidad la interfaz.
     */
    public RegistrarCompra() throws SQLException {
        initComponents();
        MostrarTabla();
        btnGenerar1.setVisible(false);
    }
    
    /**
     * Guarda en la base de datos los datos que se tomaron de los campos de la interfaz.
     */
    public void AgregarCompra(){
        Compra c = new Compra();
        c.setRutdis(txtRut.getText());
        c.setNumser(txtSerie.getText());
        c.setFolio(txtNumFolio.getText());
        primera_conexion.RegistrarCompra(c);
    }
    
    /**
    * Muestra los datos que se piden y se muestran Panel de la interfaz.
    */ 
    public void MostrarTabla() throws SQLException{
    DefaultTableModel bosquejo_tabla = new DefaultTableModel();
    bosquejo_tabla = primera_conexion.MostrarTablaCompra();
    tbMostrar.setModel(bosquejo_tabla);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtSerie = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtNumFolio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        btnGenerar = new javax.swing.JButton();
        txtRut = new javax.swing.JTextField();
        btnGenerar1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Rut Distribuidor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setText("N° de Serie de Libro:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setText("N° de Folio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 74, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registrar Compra de Libro");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, 523, -1));

        btnAgregar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 51, 548, -1));

        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });
        txtSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSerieKeyTyped(evt);
            }
        });
        getContentPane().add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 103, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 147, 548, 10));

        txtNumFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumFolioKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 109, -1));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbMostrar.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tbMostrar);
        tbMostrar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 11, 433, 148));

        btnGenerar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnGenerar.setText("Registrar Factura");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 177, 164, -1));

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutKeyTyped(evt);
            }
        });
        getContentPane().add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 103, -1));

        btnGenerar1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnGenerar1.setText("Detalle Compra");
        btnGenerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 177, 164, -1));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buscador.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 40, 40));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buscador.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 40, 40));

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buscador.png"))); // NOI18N
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 40, 40));

        jToggleButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jToggleButton4.setText("No deseo Registrar Una Compra");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerieActionPerformed

    /**
     * Le pone un limitador al campo Nº de serie para que solo ingrese 12 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerieKeyTyped
        int limite = 12;

        if(txtSerie.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 12.");
        }
    }//GEN-LAST:event_txtSerieKeyTyped

    /**
     * Le pone un limitador al campo Nº de folio para que solo ingrese 12 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtNumFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumFolioKeyTyped
        int limite = 10;

        if(txtNumFolio.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 10.");
        }
    }//GEN-LAST:event_txtNumFolioKeyTyped

    /**
     * Botón "Limpiar" que limpia todos los campos de la interfaz.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNumFolio.setText("");
        txtSerie.setText("");        
        txtRut.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * Botón "Agregar" registra al distribuidor en la base de datos.
     * Muestra un mensaje en caso de que sea ingresado exitosamente o no.
     * @param evt
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //
          AgregarCompra();
        try {
            MostrarTabla();
            //
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Ventana emergente que me permitira el ingreso de otra compra
        int ventana = JOptionPane.showConfirmDialog(null, "La compra a sido ingresada exitosamente. \n ¿Desea ingresar otra compra?");
        
        //Condicion que me permitira ingresar otra compra (Solo limpia los campos jajaja.)
        if (ventana == JOptionPane.YES_OPTION)
            {
                btnLimpiarActionPerformed(evt); 
            }
        
        //Condicion que me cerrara la venta de ingreso de compra, pero me enviara al menu.
        else if(ventana == JOptionPane.NO_OPTION)
              {
               //Codigo donde dericcione al menu.
                  JOptionPane.showMessageDialog(this, "Detalle Compra Disponible!", "Listo", 1);
                  btnGenerar1.setVisible(true);
              }
              
              
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * Habilita la visibilidad la interfaz.
     */
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        RegistrarFactura rf = new RegistrarFactura();
         rf.setVisible(true);
    }//GEN-LAST:event_btnGenerarActionPerformed

    /**
     * Habilita la visibilidad la interfaz.
     */
    private void btnGenerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerar1ActionPerformed
        DetalleFactura df = new DetalleFactura();
        df.setVisible(true);
        btnGenerar1.setVisible(false);
    }//GEN-LAST:event_btnGenerar1ActionPerformed

    /**
     * Le pone un limitador al campo rut para que solo ingrese 10 caracteres.
     * Solo le permite ingresar números, guión y la letra 'k'.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyTyped
        int limite = 10;
        
        if(txtRut.getText().length()==limite || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 44 
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
    }//GEN-LAST:event_txtRutKeyTyped

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        new BuscarFactura().setVisible(true);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            new BuscarDistribuidor().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        new BuscarLibro().setVisible(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        JOptionPane.showMessageDialog(null, "Generar Detalle Factura Habilitado", "Generado", 1);
        btnGenerar1.setVisible(true);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegistrarCompra().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarCompra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGenerar1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JTable tbMostrar;
    private javax.swing.JTextField txtNumFolio;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
