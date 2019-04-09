
package Interfaz;

import Clases.ConexionBD;
import Clases.Libro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permite la busqueda de datos de un libro registrado.
 * @author Gabriela Troncoso.
 * @since 27/06/2017
 * @version 1.0
 */
public class BuscarLibro extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();
    
    public BuscarLibro() {
        initComponents();
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
     * Limpia todos los campos de la interfaz.
     */
    public void Limpiar(){
        txtCod.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        btnBuscar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buscar Libro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 543, -1));

        btnBuscar1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 91, -1, -1));

        jLabel3.setText("Numero Serie Libro:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 91, -1, -1));

        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 63, 163, -1));

        btnBuscar2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnBuscar2.setText("Mostrar Todo");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 58, -1, -1));

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 145, 590, 199));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 606, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 129, 543, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón "Limpiar" que limpia todos los campos de la interfaz.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCod.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * Validación que solo le permite ingresar números.
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
     * Botón "Mostrar Todo" muestra todos los libros que están en la base de datos.
     * @param evt
     */
    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        try {
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    /**
     * Botón "Buscar" busca un libro en la base de datos.
     * @param evt
     */
    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        
        try {
            Buscar();
            Limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
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
