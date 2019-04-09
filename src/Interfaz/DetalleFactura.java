
package Interfaz;

import Clases.ConexionBD;
import Clases.Factura;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permite la busqueda de un detalle de factura registrado en la base de datos.
 * @author Gabriela Troncoso.
 * @since 04/07/2017
 * @version 1.0
 */
public class DetalleFactura extends javax.swing.JFrame {
    ConexionBD primera_conexion = new ConexionBD();

    
    public DetalleFactura() {
        initComponents();
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        txtTotal.setVisible(false);
        txtTotalIva.setVisible(false);
        txtTotalNeto.setVisible(false);
    }

    /**
     * Busca en la base de datos el detalle de la factura.
     */
    public void Buscar() throws SQLException{
        Factura f = new Factura();
        f.setFolio(Integer.parseInt(txtFolio.getText()));
        DefaultTableModel bosquejo_tabla = new DefaultTableModel();
        bosquejo_tabla = primera_conexion.BuscarFactura(f);
        tbMostrar.setModel(bosquejo_tabla);    
    }
    
    /**
     * Busca en la base de datos el detalle de la factura.
     */
    public void DetalleFactura() throws SQLException{
        Factura f = new Factura();
        f.setFolio(Integer.parseInt(txtFolio.getText()));
        DefaultTableModel bosquejo_tabla = new DefaultTableModel();
        bosquejo_tabla = primera_conexion.MostrarTablaDetalleFactura(f);
        tbMostrar2.setModel(bosquejo_tabla); 
}
    
    public void CalcularTotalIva(){
        double sumatoria1=0.0;
        int totalRow= tbMostrar2.getRowCount();
        totalRow-=1;
        for(int i=0;i<=(totalRow);i++)
        {
             double sumatoria= Double.parseDouble(String.valueOf(tbMostrar2.getValueAt(i,8)));
             sumatoria1+=sumatoria;
          txtTotalIva.setText(""+sumatoria1);
           }
    }
    
    public void CalcularTotalNeto(){
        double sumatoria1=0.0;
        int totalRow= tbMostrar2.getRowCount();
        totalRow-=1;
        for(int i=0;i<=(totalRow);i++)
        {
             double sumatoria= Double.parseDouble(String.valueOf(tbMostrar2.getValueAt(i,7)));
             sumatoria1+=sumatoria;
          txtTotalNeto.setText(""+sumatoria1);
           }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMostrar2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtTotalIva = new javax.swing.JTextField();
        txtTotalNeto = new javax.swing.JTextField();
        btnTotal = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 20, 714, 161));

        tbMostrar2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbMostrar2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 214, 714, 161));

        jLabel1.setText("Introduzca Folio de Factura a Detallar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 148, -1, -1));

        txtFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFolioKeyTyped(evt);
            }
        });
        getContentPane().add(txtFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 117, -1));

        jToggleButton1.setText("Detallar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Detalle Factura");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 249, 33));

        txtTotal.setEditable(false);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));

        txtTotalIva.setEditable(false);
        getContentPane().add(txtTotalIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, -1));

        txtTotalNeto.setEditable(false);
        getContentPane().add(txtTotalNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 100, -1));

        btnTotal.setText("Calcular Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        getContentPane().add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buscador.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 40, 40));

        jLabel3.setText("Total Bruto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel4.setText("Total Iva");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel5.setText("Total Neto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5722026770_4a4957da5b_b.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón "Buscar" busca un detalle de factura en la base de datos.
     * @param evt
     */
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            Buscar();            
        } catch (SQLException ex) {
            Logger.getLogger(DetalleFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DetalleFactura();
        } catch (SQLException ex) {
            Logger.getLogger(DetalleFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * Validación que solo permite ingresar 10 caracteres en el campo folio.
     * Solo le permite ingresar números en el campo código.
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

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        txtTotal.setVisible(true);
        txtTotalIva.setVisible(true);
        txtTotalNeto.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        double sumatoria1=0.0;
        int totalRow= tbMostrar2.getRowCount();
        totalRow-=1;
        for(int i=0;i<=(totalRow);i++)
        {
             double sumatoria= Double.parseDouble(String.valueOf(tbMostrar2.getValueAt(i,9)));
             sumatoria1+=sumatoria;
          txtTotal.setText(""+sumatoria1);
           }
        
        CalcularTotalIva();
        CalcularTotalNeto();
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtFolio.setText("");
        txtTotal.setText("");
        txtTotalIva.setText("");
        txtTotalNeto.setText("");
        txtTotal.setVisible(false);
        txtTotalIva.setVisible(false);
        txtTotalNeto.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        new BuscarFactura().setVisible(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JToggleButton btnTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable tbMostrar;
    private javax.swing.JTable tbMostrar2;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalIva;
    private javax.swing.JTextField txtTotalNeto;
    // End of variables declaration//GEN-END:variables
}
