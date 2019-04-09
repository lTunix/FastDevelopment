
package Interfaz;

import Clases.ConexionBD;
import Clases.Libro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permite el borrado de datos de un libro.
 * @author Gabriela Troncoso.
 * @since 27/06/2017
 * @version 1.0
 */
public class BorrarLibro extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();
    
    /**
    * Elimina un libro que busco en la base de datos.
    */ 
    public BorrarLibro() throws SQLException {
        initComponents();
        MostrarTabla();
        btnEliminar.setEnabled(false);
    }

    /**
    * Muestra los datos que se piden y se muestran Panel de la interfaz.
    */ 
    public void MostrarTabla() throws SQLException{
    DefaultTableModel bosquejo_tabla = new DefaultTableModel();
    bosquejo_tabla = primera_conexion.MostrarTablaLibro();
    tbMostrar.setModel(bosquejo_tabla);  
}
    /**
     * Busca en la base de datos los datos que están registrados en libros.
     */
    public void Buscar() throws SQLException{
        Libro l = new Libro();
        l.setNum_serie(Integer.parseInt(txtCod.getText()));
        DefaultTableModel bosquejo_tabla = new DefaultTableModel();
        bosquejo_tabla = primera_conexion.BuscarLibro(l);
        tbMostrar.setModel(bosquejo_tabla);    
    }
    
    /**
     * Habilita el botón eliminar en la interfaz.
     */
    public void HabilitarEliminar(){
         btnEliminar.setEnabled(true);
     }
    
    /**
    * Elimina al libro que se busco en la base de datos según el número se serie.
    */ 
    public void Eliminar() throws SQLException{
        Libro l = new Libro();
        l.setNum_serie(Integer.parseInt(txtCod.getText()));
        primera_conexion.EliminarLibro(l);
        MostrarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        btnBuscar2 = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 97, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eliminar Libro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 17, 550, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, 614, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 43, 550, 10));

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 169, 614, 176));

        btnBuscar2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnBuscar2.setText("Mostrar Todo");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 59, -1, -1));

        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 64, 163, -1));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 97, -1, -1));

        jLabel3.setText("Codigo de Libro:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        btnEliminar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 97, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Le pone un limitador al número serie libro para que solo ingrese 10 caracteres.
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
     * Botón que limpia todos los campos de la interfaz.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCod.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * Botón "Eliminar" elimina al libro buscado en la base de datos y le pregunta si la desea borrar o no.
     * En caso de elimininarla deshabilita el botón "Eliminar" y limpia los campos.
     * @param evt
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     try {
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea Borrar el Libro?", "Opciones",  JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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
     * Botón "Buscar" busca un libro en la base de datos.
     * Y comprueba la compra si existe o no.
     * En caso de que exista habilita el botón "Eliminar".
     * @param evt
     */
    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        try {
            Buscar();
            if(tbMostrar.getRowCount() == 0 && tbMostrar.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(null, "No existe el Libro", "ERROR", 0);
            }else{
               HabilitarEliminar();
            }  
        } catch (SQLException ex) {
            Logger.getLogger(BuscarDistribuidor.class.getName()).log(Level.SEVERE, null, ex);
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    /**
     * Botón "Mostrar Todo" que muestra todos los datos que hay en la base de datos.
     * @param evt 
     */
    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        try {
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(BorrarLibro.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(BorrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BorrarLibro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BorrarLibro.class.getName()).log(Level.SEVERE, null, ex);
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
