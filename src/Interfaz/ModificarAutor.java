package Interfaz;

import Clases.Autor;
import Clases.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permite modificar un autor por medio del código del autor.
 * @author Marcos Fernandez.
 * @since 27/06/2017
 * @version 1.0
 */
public class ModificarAutor extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();
    
    /**
     * Muestra la tabla que se busca.
     */
    public ModificarAutor() throws SQLException {
        initComponents();
        MostrarTabla();
    }
    
    /**
    * Muestra los datos que se piden del autor y se muestran Panel de la interfaz.
    */   
    public void MostrarTabla() throws SQLException{
    DefaultTableModel bosquejo_tabla = new DefaultTableModel();
    bosquejo_tabla = primera_conexion.MostrarTablaAutor();
    tbMostrar.setModel(bosquejo_tabla);    
    }
    
    /**
     * Actualiza y guarda en la base de datos los datos que se modificaron del autor.
     */
    public void ActualizarAutor(){
        Autor a = new Autor();
        a.setNombre(txtNomb.getText());
        a.setCod(Integer.parseInt(txtCod.getText()));
        a.setApep(txtNomb2.getText());
        a.setApem(txtNomb1.getText());
        primera_conexion.ActualizarAutor(a);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomb = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        txtNomb1 = new javax.swing.JTextField();
        txtNomb2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
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
        getContentPane().add(txtNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 94, 110, -1));

        btnAgregar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAgregar.setText("Actualizar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Modificar Autor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 245, -1));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 97, -1, -1));

        jLabel1.setText("Codigo de Autor:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 65, -1, -1));

        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 62, 107, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, 245, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 245, 10));

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 11, 456, 268));

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
        getContentPane().add(txtNomb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 110, 30));

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
        getContentPane().add(txtNomb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 110, 30));

        jLabel4.setText("Apellido Paterno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 10));

        jLabel6.setText("Apellido Materno:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 290));

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
        txtCod.setText("");
        txtNomb.setText("");
        txtNomb1.setText("");
        txtNomb2.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    /**
     * Validación que solo le permite ingresar números en el campo código.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtCodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isAlphabetic(validar)|| Character.isSpaceChar(validar) )
        {
             getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros'.");
        }
    }//GEN-LAST:event_txtCodKeyTyped

    private void txtNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombActionPerformed

    /**
     * Botón "Actualizar" que modifica y registra un autor en la base de datos.
     * También muestra los datos modificados.
     * @param evt
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ActualizarAutor();
        try {
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(ModificarAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificarAutor().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificarAutor.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbMostrar;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNomb;
    private javax.swing.JTextField txtNomb1;
    private javax.swing.JTextField txtNomb2;
    // End of variables declaration//GEN-END:variables
}
