
package Interfaz;
import Clases.ConexionBD;
import Clases.Libro;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Clase para registrar un libro en la base de datos.
 * @author Marcos Fernandez.
 * @since 27/06/2017
 * @version 1.0
 */
public class RegistrarLibro extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();
    
    /**
     * Llena los ComboBox con el script de la base de datos.
     */
    public RegistrarLibro() {
        initComponents();
        LlenarComboIdioma();
        LlenarComboAutor();
        LlenarComboCategoria();
        LlenarComboEditorial();
        LlenarComboEstado();
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
     * Guarda en la base de datos los datos que se tomaron de los campos de la interfaz.
     * Poniendo los ComboBox automaticamente e incrementandolos en 1 cada vez que se guarda alguno.
     */
    public void GuardarLibro(){
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
        primera_conexion.RegistrarLibro(l);
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
        LlenarComboAutor();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        AñoPubli = new com.toedter.calendar.JDateChooser();
        txtNumSer = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        combEst = new javax.swing.JComboBox<>();
        combCat = new javax.swing.JComboBox<>();
        combAutor = new javax.swing.JComboBox<>();
        combEdi = new javax.swing.JComboBox<>();
        combIdio = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registro de Libro");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 11, 414, -1));

        jLabel1.setText("Numero de Serie");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 69, -1, -1));

        jLabel2.setText("Editorial");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 110, -1, -1));

        jLabel3.setText("ISBN:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 69, -1, -1));

        jLabel4.setText("Estado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 110, -1, -1));

        jLabel5.setText("Título:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 152, -1, -1));

        jLabel6.setText("Cant. Páginas:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 152, -1, -1));

        jLabel7.setText("Precio Referencial:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 202, -1, -1));

        jLabel9.setText("Categoria:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 202, -1, -1));

        jLabel10.setText("Idioma:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 259, -1, -1));

        jLabel12.setText("Autor:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 259, -1, -1));

        jLabel13.setText("Año Publicación:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 308, -1, -1));
        getContentPane().add(AñoPubli, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 294, 138, 28));

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
        getContentPane().add(txtNumSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 66, 138, -1));

        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTituloKeyTyped(evt);
            }
        });
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 149, 138, -1));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 199, 138, -1));

        txtISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtISBNKeyTyped(evt);
            }
        });
        getContentPane().add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 66, 129, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 149, 129, -1));

        getContentPane().add(combEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 107, 129, -1));

        getContentPane().add(combCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 199, 131, -1));

        getContentPane().add(combAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 256, 131, -1));

        getContentPane().add(combEdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 111, 138, -1));

        getContentPane().add(combIdio, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 256, 138, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 364, -1, -1));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 364, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón "Agregar" registra un libro en la base de datos.
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GuardarLibro();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Botón "Limpiar" que limpia todos los campos de la interfaz.
     * En el caso de los Combobox deja la primera opción.
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void txtNumSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumSerActionPerformed

    /**
     * Le pone un limitador al campo Nº de serie para que solo ingrese 12 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtNumSerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumSerKeyTyped
        //Variable que permitira limitar el largo.
        int limite = 12;
        
        //Condicion que pregunta SI los caracteres son de tipo NUMERO, ESPACIO, 
        //LARGO MAX. DE 20 y CARACTERES ESPECIALES SEGUN ASCII, se ejecutada un mensaje de envio y sonido.
        if(txtNumSer.getText().length()==limite
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)                
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 12.");
        } 
    }//GEN-LAST:event_txtNumSerKeyTyped

    /**
     * Le pone un limitador al campo ISBN para que solo ingrese 10 caracteres.
     * Solo le permite ingresar números.
     * Envia un mensaje en caso de que estas condiciones no se cumplan.
     * @param evt
     */
    private void txtISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISBNKeyTyped
        char validar = evt.getKeyChar();
        int limite = 10;
        
        if(txtISBN.getText().length()==limite || Character.isAlphabetic(validar) ||  Character.isSpaceChar(validar) 
                || (int)evt.getKeyChar() >= 33 && (int)evt.getKeyChar()<= 47 ||
                (int)evt.getKeyChar() >= 58 && (int)evt.getKeyChar()<= 255)                
        {
            getToolkit().beep(); //Sonido. 
            evt.consume();
            
            //Mensaje.
            JOptionPane.showMessageDialog(null,"Solo puede ingresar 'Numeros', con un máx. de largo de 10.");
        } 
    }//GEN-LAST:event_txtISBNKeyTyped
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

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AñoPubli;
    private javax.swing.JComboBox<String> combAutor;
    private javax.swing.JComboBox<String> combCat;
    private javax.swing.JComboBox<String> combEdi;
    private javax.swing.JComboBox<String> combEst;
    private javax.swing.JComboBox<String> combIdio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNumSer;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
