package Interfaz;

import Clases.ConexionBD;
import Clases.Editorial;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permite modificar una editorial por medio del código de la editorial.
 * @author Marcos Fernandez.
 * @since 27/06/2017
 * @version 1.0
 */
public class ModificarEditorial extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();

    /**
     * Muestra la tabla que se busca.
     */
    public ModificarEditorial() throws SQLException {
        initComponents();
        MostrarTabla();
    }
    
    /**
    * Busca los datos que se piden de la editorial y se muestran Panel de la interfaz.
    */   
    public void MostrarTabla() throws SQLException{
    DefaultTableModel bosquejo_tabla = new DefaultTableModel();
    bosquejo_tabla = primera_conexion.MostrarTablaEditorial();
    tbMostrar.setModel(bosquejo_tabla);    
    }

    /**
     * Actualiza y guarda en la base de datos los datos que se modificaron de la editorial.
     */
    public void ActualizarEditorial(){
        Editorial ed = new Editorial();
        ed.setNombre(txtNomb.getText());
        ed.setCod(Integer.parseInt(txtCod.getText()));
        primera_conexion.ActualizarEditorial(ed);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNomb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAgregar.setText("Actualizar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 290, 13));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 131, 300, 0));

        jLabel2.setText("Nombre :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

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
        getContentPane().add(txtNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 127, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Modificar Editorial");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 14, 272, -1));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbMostrar);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 11, 424, 158));

        jLabel1.setText("Codigo de Editorial:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 63, 130, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 310, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombActionPerformed

    /**
     * Le pone un limitador al campo nombre para que solo ingrese 50 caracteres.
     * Solo le permite ingresar letras.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtNombKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombKeyTyped
        int limite = 50;
        
        if(txtNomb.getText().length()==limite || (int)evt.getKeyChar() >= 123 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Letras', 'Numeros', y 'Simbolos' con un máx. de largo de 50.");
        } 
    }//GEN-LAST:event_txtNombKeyTyped

    /**
     * Botón "Limpiar" que limpia todos los campos de la interfaz.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNomb.setText("");
        txtCod.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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

    /**
     * Botón "Actualizar" que modifica y registra una editorial en la base de datos.
     * También muestra los datos modificados.
     * @param evt
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ActualizarEditorial();
        try {
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(ModificarEditorial.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ModificarEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificarEditorial().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificarEditorial.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbMostrar;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNomb;
    // End of variables declaration//GEN-END:variables
}
