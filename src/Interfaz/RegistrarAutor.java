package Interfaz;

import Clases.ConexionBD;
import javax.swing.JOptionPane;
import Clases.Autor;

/**
 * Clase para registrar un autor en la base de datos.
 * @author Marcos Fernandez.
 * @since 27/06/2017
 * @version 1.0
 */
public class RegistrarAutor extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();

    public RegistrarAutor() {
        initComponents();
    }
    
    /**
     * Guarda en la base de datos el nombre del autor.
     */
    public void GuardarAutor(){
        Autor a = new Autor();
        a.setNombre(txtNomb.getText());
        a.setApep(txtNomb2.getText());
        a.setApem(txtNomb1.getText());
        primera_conexion.RegistrarAutor(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtNomb1 = new javax.swing.JTextField();
        txtNomb2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombActionPerformed(evt);
            }
        });
        txtNomb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombKeyTyped(evt);
            }
        });
        getContentPane().add(txtNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 154, -1));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 73, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registar Autor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, -1));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        btnAgregar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 54, 240, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, 4));

        txtNomb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomb1ActionPerformed(evt);
            }
        });
        txtNomb1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomb1KeyTyped(evt);
            }
        });
        getContentPane().add(txtNomb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 154, -1));

        txtNomb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomb2ActionPerformed(evt);
            }
        });
        txtNomb2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomb2KeyTyped(evt);
            }
        });
        getContentPane().add(txtNomb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 154, -1));

        jLabel3.setText("Apellido Paterno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setText("Apellido Materno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Le pone un limitador al campo nombre para que solo ingrese 20 caracteres.
     * Solo le permite ingresar letras.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtNombKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombKeyTyped
       //Variable que permitira limitar el largo.
        int limite = 20;
        
        //Condicion que pregunta SI los caracteres son de tipo NUMERO, ESPACIO, 
        //LARGO MAX. DE 20 y CARACTERES ESPECIALES SEGUN ASCII, se ejecutada un mensaje de envio y sonido.
        if(txtNomb.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 64 ||
                (int)evt.getKeyChar() >= 91 && (int)evt.getKeyChar()<= 96 ||
                (int)evt.getKeyChar() >= 123 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Letras', con un máx. de largo de 20.");
        } 
    }//GEN-LAST:event_txtNombKeyTyped

    /**
     * Botón "Limpiar" que limpia todos los campos de la interfaz.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNomb.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * Botón "Agregar" que guarda al autor.
     * @param evt 
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        GuardarAutor();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombActionPerformed

    private void txtNomb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomb1ActionPerformed

    /**
     * Le pone un limitador al campo nombre para que solo ingrese 20 caracteres.
     * Solo le permite ingresar letras.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtNomb1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomb1KeyTyped
        //Variable que permitira limitar el largo.
        int limite = 20;
        
        //Condicion que pregunta SI los caracteres son de tipo NUMERO, ESPACIO, 
        //LARGO MAX. DE 20 y CARACTERES ESPECIALES SEGUN ASCII, se ejecutada un mensaje de envio y sonido.
        if(txtNomb1.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 64 ||
                (int)evt.getKeyChar() >= 91 && (int)evt.getKeyChar()<= 96 ||
                (int)evt.getKeyChar() >= 123 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Letras', con un máx. de largo de 20.");
        } 
    }//GEN-LAST:event_txtNomb1KeyTyped

    /**
     * Le pone un limitador al campo nombre para que solo ingrese 20 caracteres.
     * Solo le permite ingresar letras.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtNomb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomb2ActionPerformed

    /**
     * Le pone un limitador al campo nombre para que solo ingrese 20 caracteres.
     * Solo le permite ingresar letras.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtNomb2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomb2KeyTyped
        //Variable que permitira limitar el largo.
        int limite = 20;
        
        //Condicion que pregunta SI los caracteres son de tipo NUMERO, ESPACIO, 
        //LARGO MAX. DE 20 y CARACTERES ESPECIALES SEGUN ASCII, se ejecutada un mensaje de envio y sonido.
        if(txtNomb2.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 64 ||
                (int)evt.getKeyChar() >= 91 && (int)evt.getKeyChar()<= 96 ||
                (int)evt.getKeyChar() >= 123 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Letras', con un máx. de largo de 20.");
        } 
    }//GEN-LAST:event_txtNomb2KeyTyped

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
            java.util.logging.Logger.getLogger(RegistrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAutor().setVisible(true);
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtNomb;
    private javax.swing.JTextField txtNomb1;
    private javax.swing.JTextField txtNomb2;
    // End of variables declaration//GEN-END:variables
}
