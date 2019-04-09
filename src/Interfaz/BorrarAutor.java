
package Interfaz;

import Clases.Autor;
import Clases.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permite el borrado de datos de un autor.
 * @author Gabriela Troncoso.
 * @since 27/06/2017
 * @version 1.0
 */
public class BorrarAutor extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();
    
    /**
     * Deshabilita el botón "Eliminar".
     */
    public BorrarAutor() throws SQLException {
        initComponents();
        MostrarTabla();
        btnEliminar.setEnabled(false);
    }

    /**
    * Muestra los datos que se piden y se muestran Panel de la interfaz.
    */ 
    public void MostrarTabla() throws SQLException{
    DefaultTableModel bosquejo_tabla = new DefaultTableModel();
    bosquejo_tabla = primera_conexion.MostrarTablaAutor();
    tbMostrar.setModel(bosquejo_tabla);    
    }
    
    /**
     * Busca en la base de datos los datos que están registrados en autor.
     */
    public void Buscar() throws SQLException{
        Autor a = new Autor();
        a.setCod(Integer.parseInt(txtCod.getText()));
        DefaultTableModel bosquejo_tabla = new DefaultTableModel();
        bosquejo_tabla = primera_conexion.BuscarAutor(a);
        tbMostrar.setModel(bosquejo_tabla);    
    }
    
    /**
     * Habilita el botón eliminar en la interfaz.
     */
    public void HabilitarEliminar(){
         btnEliminar.setEnabled(true);
     }
    
    /**
    * Elimina al autor que se busco en la base de datos según su código.
    */ 
    public void Eliminar() throws SQLException{
        Autor a = new Autor();
        a.setCod(Integer.parseInt(txtCod.getText()));
        primera_conexion.EliminarAutor(a);
        MostrarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        btnBuscar2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        btnBuscar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 462, 10));

        btnBuscar2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnBuscar2.setText("Mostrar Todo");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 54, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 41, 452, 11));

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 142));

        btnBuscar1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 99, -1, -1));

        jLabel3.setText("Codigo de Autor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 62, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 99, -1, -1));

        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 59, 163, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eliminar Autor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 452, 30));

        btnEliminar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 99, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón que limpia todos los campos de la interfaz.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCod.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * Solo le permite ingresar números.
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

    /**
     * Botón "Buscar" busca a un autor en la base de datos y verifica si existe o no.
     * @param evt
     */
    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        try {
            Buscar();
            if(tbMostrar.getRowCount() == 0 && tbMostrar.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(null, "No existe el Autor", "ERROR", 0);
            }else{
               HabilitarEliminar();
            }  
        } catch (SQLException ex) {
            Logger.getLogger(BuscarDistribuidor.class.getName()).log(Level.SEVERE, null, ex);
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    /**
     * Botón "Eliminar" elimina al autor buscado en la base de datos y le pregunta si lo desea borrar o no.
     * @param evt
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea Borrar al Autor?", "Opciones",  JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(seleccion == 0){
                Eliminar();
                btnEliminar.setEnabled(false);
                txtCod.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Ha cancelado la operación", "Cancelado", 0);
                btnEliminar.setEnabled(false);
                txtCod.setText("");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(BorrarDistribuidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * Botón "Mostrar Todo" muestra a todos los autores en la base de datos.
     * @param evt
     */
    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        try {
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(BorrarAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscar2ActionPerformed

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
            java.util.logging.Logger.getLogger(BorrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BorrarAutor().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BorrarAutor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbMostrar;
    private javax.swing.JTextField txtCod;
    // End of variables declaration//GEN-END:variables
}
