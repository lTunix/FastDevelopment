package Interfaz;

import Clases.ConexionBD;
import javax.swing.*;
import java.util.*;
import Clases.Factura;
import java.text.SimpleDateFormat;

/**
 * Clase para registrar una Factura en la base de datos.
 * @author Marcos Fernandez.
 * @since 04/07/2017
 * @version 1.0
 */
public class RegistrarFactura extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();

    /**
     * Llena Combobox metodo.
     */
    public RegistrarFactura() {
        initComponents();
        LlenarComboMetodo();
    }
    
    /**
     * Guarda en la base de datos los datos que se tomaron de los campos de la interfaz.
     * Poniendo los ComboBox automaticamente e incrementandolos en 1 cada vez que se guarda alguno.
     */
    public void RegistrarFactura(){
        Factura f = new Factura();
        f.setFolio(Integer.parseInt(txtFolio.getText()));
        f.setMetodo(cbMetodo.getSelectedIndex() + 1);
        f.setIva(Integer.parseInt(txtIva.getText()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = Fechareg.getDate();  
        f.setFecha(sdf.format(fecha));
        f.setHora(txtHora.getText() + ":" + txtMin.getText());
        primera_conexion.RegistrarFactura(f);
    }
    
    /**
     * Llena el Combobox de Metodo con los datos del script en la base de datos.
     */
    public void LlenarComboMetodo(){
        DefaultComboBoxModel modelo_combo = new DefaultComboBoxModel();
        modelo_combo = primera_conexion.ConstruirComboBoxMetodo();
        cbMetodo.setModel(modelo_combo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        cbMetodo = new javax.swing.JComboBox<>();
        Fechareg = new com.toedter.calendar.JDateChooser();
        txtHora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Metodo de Pago:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 119, -1, -1));

        jLabel5.setText("Valor IVA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 157, -1, -1));

        jLabel6.setText("Fecha de Compra: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 192, -1, -1));

        jLabel7.setText("Hora de Compra:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registro de Factura de Compra");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 383, -1));

        txtIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaKeyTyped(evt);
            }
        });
        getContentPane().add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 154, 103, -1));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 285, -1, -1));

        btnAgregar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 285, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 383, 5));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, 383, -1));

        jLabel4.setText("N° Folio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 79, -1, -1));

        txtFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFolioKeyTyped(evt);
            }
        });
        getContentPane().add(txtFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 76, 102, -1));

        getContentPane().add(cbMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 116, 103, -1));
        getContentPane().add(Fechareg, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 192, 103, -1));

        txtHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraKeyTyped(evt);
            }
        });
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 227, 34, -1));

        jLabel1.setText(":");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 230, -1, -1));

        txtMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinKeyTyped(evt);
            }
        });
        getContentPane().add(txtMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 227, 35, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón "Limpiar" que limpia todos los campos de la interfaz.
     * En el caso de los Combobox deja la primera opción.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtFolio.setText(""); 
        cbMetodo.setSelectedIndex(0);
        txtIva.setText("");
        txtHora.setText("");
        txtMin.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    
    
    
    private void txtIvaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaKeyTyped
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
     * Botón "Agregar" que registra una factura en la base de datos.
     * @param evt 
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        RegistrarFactura();
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * Le pone un limitador al campo hora para que solo ingrese 2 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraKeyTyped
        int limite = 2;
      
        if(txtHora.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 2.");
        }
    }//GEN-LAST:event_txtHoraKeyTyped

    /**
     * Le pone un limitador al campo minutos para que solo ingrese 2 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinKeyTyped
        int limite = 2;
      
        if(txtMin.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 2.");
        }
    }//GEN-LAST:event_txtMinKeyTyped

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
            java.util.logging.Logger.getLogger(RegistrarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fechareg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbMetodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtMin;
    // End of variables declaration//GEN-END:variables
}
