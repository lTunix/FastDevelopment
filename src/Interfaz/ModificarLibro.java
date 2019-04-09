package Interfaz;

import Clases.ConexionBD;
import Clases.Libro;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permite modificar un Libro por medio del dato Número de serie (rut).
 * Llena los ComboBox con el script de la base de datos.
 * @author Marcos Fernandez.
 * @since 27/06/2017
 * @version 1.0
 */
public class ModificarLibro extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();
    
    /**
     * Llena los combobox con lo registrado de la base de datos de libros.
     */
    public ModificarLibro() throws SQLException {
        initComponents();
        LlenarComboIdioma();
        LlenarComboAutor();
        LlenarComboCategoria();
        LlenarComboEditorial();
        LlenarComboEstado();
        MostrarTabla();
    }
    
    /**
     * Llena el Combobox de Idioma con los datos del script en la base de datos.
     */
    public void LlenarComboIdioma(){
        DefaultComboBoxModel modelo_combo = new DefaultComboBoxModel();
        modelo_combo = primera_conexion.ConstruirComboBoxIdioma();
        combIdio.setModel(modelo_combo);
    }
    
    /**
     * Llena el Combobox de Categoria con los datos del script en la base de datos.
     */
    public void LlenarComboCategoria(){
        DefaultComboBoxModel modelo_combo = new DefaultComboBoxModel();
        modelo_combo = primera_conexion.ConstruirComboBoxCategoria();
        combCat.setModel(modelo_combo);
    }
    
    /**
     * Llena el Combobox de Editorial con los datos del script en la base de datos.
     */
    public void LlenarComboEditorial(){
        DefaultComboBoxModel modelo_combo = new DefaultComboBoxModel();
        modelo_combo = primera_conexion.ConstruirComboBoxEditorial();
        combEdi.setModel(modelo_combo);
    }
    
    /**
     * Llena el Combobox de Estado con los datos del script en la base de datos.
     */
    public void LlenarComboEstado(){
        DefaultComboBoxModel modelo_combo = new DefaultComboBoxModel();
        modelo_combo = primera_conexion.ConstruirComboBoxEstado();
        combEst.setModel(modelo_combo);
    }
    
    /**
     * Llena el Combobox de Autor con los datos del script en la base de datos.
     */
    public void LlenarComboAutor(){
        DefaultComboBoxModel modelo_combo = new DefaultComboBoxModel();
        modelo_combo = primera_conexion.ConstruirComboBoxAutor();
        combAutor.setModel(modelo_combo);
    }
    
    /**
     * Actualiza y guarda en la base de datos los datos que se modificaron de los campos de la interfaz.
     * Poniendo los ComboBox automaticamente e incrementandolos en 1 cada vez que se guarda alguno.
     */
    public void ActualizarLibro(){
        Libro l = new Libro();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        l.setNum_serie(Integer.parseInt(txtNumSer.getText()));
        l.setNom_edi(combEdi.getSelectedItem().toString());
        l.setNom_est(combEst.getSelectedItem().toString());
        l.setIsbn(Integer.parseInt(txtISBN.getText()));
        l.setTitulo(txtTitulo.getText());
        l.setCant_pag(Integer.parseInt(txtCantidad.getText()));
        l.setPrecio(Integer.parseInt(txtPrecio.getText()));
        Date fecha = AñoPubli.getDate();  
        l.setAno_publicacion(sdf.format(fecha));
        l.setNom_cate(combCat.getSelectedItem().toString());
        l.setNom_idio(combIdio.getSelectedItem().toString());
        l.setNom_autor(combAutor.getSelectedItem().toString());
        primera_conexion.ActualizarLibro(l);
    }
    
    /**
     * Limpia los campos ingresados anteriormente.
     */
    public void Limpiar(){
        txtNumSer.setText("");
        txtISBN.setText("");
        txtTitulo.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        combEdi.setSelectedIndex(0);
        combEst.setSelectedIndex(0);
        combCat.setSelectedIndex(0);
        combIdio.setSelectedIndex(0);
        combAutor.setSelectedIndex(0);
    }
    
    /**
    * Muestra los datos que se piden y se muestran Panel de la interfaz.
    */   
    public void MostrarTabla() throws SQLException{
    DefaultTableModel bosquejo_tabla = new DefaultTableModel();
    bosquejo_tabla = primera_conexion.MostrarTablaLibro();
    tbMostrar.setModel(bosquejo_tabla);    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        txtTitulo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        combEst = new javax.swing.JComboBox<>();
        combCat = new javax.swing.JComboBox<>();
        combAutor = new javax.swing.JComboBox<>();
        combEdi = new javax.swing.JComboBox<>();
        combIdio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        AñoPubli = new com.toedter.calendar.JDateChooser();
        txtNumSer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

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
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 373, -1, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Modificar Libro");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 6, 363, 33));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 45, 403, 16));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 330, 403, 8));

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 373, -1, -1));

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 6, 650, 408));

        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTituloKeyTyped(evt);
            }
        });
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 146, 133, -1));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 196, 133, -1));

        txtISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtISBNKeyTyped(evt);
            }
        });
        getContentPane().add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 63, 129, -1));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 146, 129, -1));

        getContentPane().add(combEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 104, 129, -1));

        getContentPane().add(combCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 196, 130, -1));

        getContentPane().add(combAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 253, 130, -1));

        combEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combEdiActionPerformed(evt);
            }
        });
        getContentPane().add(combEdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 108, 133, -1));

        getContentPane().add(combIdio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 133, -1));

        jLabel1.setText("Numero de Serie");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));

        jLabel2.setText("Editorial");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, -1, -1));

        jLabel3.setText("ISBN:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 66, -1, -1));

        jLabel4.setText("Estado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 107, -1, -1));

        jLabel5.setText("Título:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, -1, -1));

        jLabel6.setText("Cant. Páginas:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 149, -1, -1));

        jLabel7.setText("Precio Referencial:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 199, -1, -1));

        jLabel10.setText("Categoria:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 199, -1, -1));

        jLabel11.setText("Idioma:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 256, -1, -1));

        jLabel12.setText("Autor:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 256, -1, -1));

        jLabel13.setText("Año Publicación:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, -1, -1));
        getContentPane().add(AñoPubli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 291, 133, 28));

        txtNumSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSerActionPerformed(evt);
            }
        });
        txtNumSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumSerKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 63, 133, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón "Actualizar" que modifica y registra un libro en la base de datos.
     * También limpia los campos de la interfaz y muestra los datos modificados.
     * @param evt
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ActualizarLibro();
        Limpiar();
        try {
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(ModificarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * Limpia todos los campos de la interfaz.
     * En el caso de los Combobox deja la primera opción.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNumSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumSerActionPerformed

    private void combEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combEdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combEdiActionPerformed

    /**
     * Le pone un limitador al campo Nº de serie para que solo ingrese 10 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtNumSerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumSerKeyTyped
        //Variable que permitira limitar el largo.
        int limite = 10;
        
        //Condicion que pregunta SI los caracteres son de tipo NUMERO, ESPACIO, 
        //LARGO MAX. DE 20 y CARACTERES ESPECIALES SEGUN ASCII, se ejecutada un mensaje de envio y sonido.
        if(txtNumSer.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)                
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 10.");
        } 
    }//GEN-LAST:event_txtNumSerKeyTyped

    /**
     * Le pone un limitador al campo ISBN para que solo ingrese 10 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISBNKeyTyped
        //Variable que permitira limitar el largo.
        int limite = 12;
        
        //Condicion que pregunta SI los caracteres son de tipo NUMERO, ESPACIO, 
        //LARGO MAX. DE 20 y CARACTERES ESPECIALES SEGUN ASCII, se ejecutada un mensaje de envio y sonido.
        if(txtISBN.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)                
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 12.");
        } 
    }//GEN-LAST:event_txtISBNKeyTyped

    /**
     * Le pone un limitador al campo cantidad para que solo ingrese 4 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped

        int limite = 4;
        
        if(txtCantidad.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)                
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 4.");
        } 
    }//GEN-LAST:event_txtCantidadKeyTyped

    /**
     * Le pone un limitador al campo precio para que solo ingrese 9 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        int limite = 9;
        
        if(txtPrecio.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)                
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 9.");
        } 
    }//GEN-LAST:event_txtPrecioKeyTyped

    /**
     * Le pone un limitador al campo titulo para que solo ingrese 50 caracteres.
     * Solo le permite ingresar letras, números y simbolos.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyTyped
        int limite = 50;
        
        if(txtTitulo.getText().length()==limite || (int)evt.getKeyChar() >= 123 && (int)evt.getKeyChar()<= 255)
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Letras', 'Numeros', y 'Simbolos' con un máx. de largo de 50.");
        } 
    }//GEN-LAST:event_txtTituloKeyTyped

    
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
            java.util.logging.Logger.getLogger(ModificarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificarLibro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificarLibro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AñoPubli;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> combAutor;
    private javax.swing.JComboBox<String> combCat;
    private javax.swing.JComboBox<String> combEdi;
    private javax.swing.JComboBox<String> combEst;
    private javax.swing.JComboBox<String> combIdio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbMostrar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNumSer;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
