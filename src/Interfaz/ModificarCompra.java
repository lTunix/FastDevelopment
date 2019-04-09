package Interfaz;

import Clases.Compra;
import Clases.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permite modificar una compra por medio del código de compra.
 * @author Marcos Fernandez.
 * @since 04/07/2017
 * @version 1.0
 */
public class ModificarCompra extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();

    /**
     * Muestra la tabla que se busca.
     */
    public ModificarCompra() throws SQLException {
        initComponents();
        MostrarTabla();
    }
    
    /**
    * Muestra los datos que se piden y se muestran Panel de la interfaz.
    */
    public void MostrarTabla() throws SQLException{
    DefaultTableModel bosquejo_tabla = new DefaultTableModel();
    bosquejo_tabla = primera_conexion.MostrarTablaCompra();
    tbMostrar.setModel(bosquejo_tabla);    
    }
    
    /**
     * Actualiza y guarda en la base de datos los datos que se modificaron de los campos de la interfaz.
     */
    public void ActualizarCompra(){
        Compra c = new Compra();
        c.setCod(Integer.parseInt(txtCodCompra.getText()));
        c.setNumser(txtSerie.getText());
        c.setRutdis(txtRut.getText());
        c.setFolio(txtNumFolio.getText());
        primera_conexion.ActualizarCompra(c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtSerie = new javax.swing.JTextField();
        txtNumFolio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodCompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Modificar Compra");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 540, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 540, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 154, 540, 10));

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 15, 769, 182));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 170, -1, -1));

        btnAgregar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAgregar.setText("Actualizar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 170, -1, -1));

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
        getContentPane().add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 116, 111, -1));

        txtNumFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumFolioKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 64, 109, -1));

        jLabel2.setText("Rut Distribuidor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 119, -1, -1));

        jLabel3.setText("N° de Serie de Libro:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 119, -1, -1));

        jLabel4.setText("N° de Folio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 67, -1, -1));

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutKeyTyped(evt);
            }
        });
        getContentPane().add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 116, 103, -1));

        jLabel5.setText("Inserte Cod Compra:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 67, -1, -1));

        txtCodCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodCompraKeyTyped(evt);
            }
        });
        getContentPane().add(txtCodCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 64, 101, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón "Limpiar" que limpia todos los campos de la interfaz.
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCodCompra.setText("");
        txtNumFolio.setText("");
        txtSerie.setText("");
        txtRut.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * Botón "Actualizar" que modifica y registra al distribuidor en la base de datos.
     * @param evt
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ActualizarCompra();
        try {
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(ModificarCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
     * Le pone un limitador al campo Nº de folio para que solo ingrese 10 caracteres.
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
     * Le pone un limitador al campo Nº de folio para que solo ingrese 10 caracteres.
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

    /**
     * Validación que solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtCodCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodCompraKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isAlphabetic(validar)|| Character.isSpaceChar(validar) )
        {
             getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros'.");
        }
    }//GEN-LAST:event_txtCodCompraKeyTyped

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
            java.util.logging.Logger.getLogger(ModificarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificarCompra().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificarCompra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbMostrar;
    private javax.swing.JTextField txtCodCompra;
    private javax.swing.JTextField txtNumFolio;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
