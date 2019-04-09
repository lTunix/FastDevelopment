package Interfaz;
import Clases.ConexionBD;
import Clases.Distribuidor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permite el borrado de datos del distribuidor.
 * @author Gabriela Troncoso.
 * @since 13/06/2017
 * @version 1.0
 */
public class BorrarDistribuidor extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();
    
    /**
     * Busca en la base de datos los datos que están registrados en distribuidor.
     */
    public void Buscar() throws SQLException{
        Distribuidor d = new Distribuidor();
        d.setRut(rutEmp.getText());
        DefaultTableModel bosquejo_tabla = new DefaultTableModel();
        bosquejo_tabla = primera_conexion.BuscarDistribuidor(d);
        tbMostrar.setModel(bosquejo_tabla);    
    }
    
    /**
    * Muestra los datos que se piden y se muestran Panel de la interfaz.
    */ 
     public void MostrarTabla() throws SQLException{
    DefaultTableModel bosquejo_tabla = new DefaultTableModel();
    bosquejo_tabla = primera_conexion.MostrarTabla();
    tbMostrar.setModel(bosquejo_tabla);    
}

    /**
    * Elimina al distribuidor que busco en la base de datos.
    */ 
     public void Eliminar() throws SQLException{
        Distribuidor d = new Distribuidor();
        d.setRut(rutEmp.getText());
        primera_conexion.EliminarDistribuidor(d);
        MostrarTabla();
    }
     
     /**
    * Habilita el Botón eliminar en la interfaz.
    */
     public void HabilitarEliminar(){
         btnEliminar.setEnabled(true);
     }
    
     /**
    * Deshabilita el Botón eliminar en la interfaz.
    */
    public BorrarDistribuidor() {
        initComponents();
        btnEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnBuscar2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        rutEmp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eliminar Distribuidor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 551, -1));

        btnBuscar2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnBuscar2.setText("Mostrar Todo");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, 551, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 551, 10));

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 161, 551, 161));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel3.setText("Rut de Distribuidor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        btnBuscar1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        btnEliminar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        rutEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rutEmpKeyTyped(evt);
            }
        });
        getContentPane().add(rutEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 77, 189, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Limpia todos los campos de la interfaz.
     * En el caso de los Combobox deja la primera opción.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        rutEmp.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * Botón "Mostrar Todo" muestra al distribuidor que se busco en la base de datos.
     * @param evt
     */
    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        try {
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(BorrarDistribuidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    /**
     * Botón "Buscar" busca a un distribuidor en la base de datos.
     * @param evt
     */
    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        try {
            Buscar();
            if(tbMostrar.getRowCount() == 0 && tbMostrar.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(null, "No existe el Distribuidor", "ERROR", 0);
            }else{
               HabilitarEliminar();
            }  
        } catch (SQLException ex) {
            Logger.getLogger(BuscarDistribuidor.class.getName()).log(Level.SEVERE, null, ex);
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    /**
     * Botón "Eliminar" elimina al distribuidor buscado en la base de datos.
     * @param evt
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        try {
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea Borrar al distribuidor?", "Opciones",  JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(seleccion == 0){
                Eliminar();
                btnEliminar.setEnabled(false);
                rutEmp.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Ha cancelado la operación", "Cancelado", 0);
                btnEliminar.setEnabled(false);
                rutEmp.setText("");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(BorrarDistribuidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * Le pone un limitador al campo rut del distribuidor para que solo ingrese 10 caracteres.
     * Solo le permite ingresar números, la tecla guión y la letra "k".
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void rutEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rutEmpKeyTyped
        int limite = 10;

        if(rutEmp.getText().length()==limite || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 44
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
    }//GEN-LAST:event_rutEmpKeyTyped

    /**
     * Habilita la visibilidad de la interfaz.
     * @param args 
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrarDistribuidor().setVisible(true);
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
    private javax.swing.JTextField rutEmp;
    private javax.swing.JTable tbMostrar;
    // End of variables declaration//GEN-END:variables
}
