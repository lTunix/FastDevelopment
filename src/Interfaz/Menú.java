
package Interfaz;
import Clases.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que permite la visibilidades de las interfaces.
 * @author Gabriela Troncoso.
 * @since 04/07/2017
 * @version 1.0
 */
public class Menú extends javax.swing.JFrame {

    ConexionBD bd = new ConexionBD();
    public Menú() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menulibro = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        regCompra1 = new javax.swing.JMenuItem();
        modLibro = new javax.swing.JMenuItem();
        busLibro = new javax.swing.JMenuItem();
        borLibro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        regAutor = new javax.swing.JMenuItem();
        modAutor = new javax.swing.JMenuItem();
        busAutor = new javax.swing.JMenuItem();
        borAutor = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        regEditorial = new javax.swing.JMenuItem();
        modEditorial = new javax.swing.JMenuItem();
        busEditorial = new javax.swing.JMenuItem();
        borEditorial = new javax.swing.JMenuItem();
        menudistribuidor = new javax.swing.JMenu();
        regDistribuidor = new javax.swing.JMenuItem();
        modDistribuidor = new javax.swing.JMenuItem();
        busDistribuidor = new javax.swing.JMenuItem();
        borDistribuidor = new javax.swing.JMenuItem();
        menufactura = new javax.swing.JMenu();
        busFactura = new javax.swing.JMenuItem();
        modFactura = new javax.swing.JMenuItem();
        borFactura = new javax.swing.JMenuItem();
        menucompra = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        regCompra = new javax.swing.JMenuItem();
        busCompra = new javax.swing.JMenuItem();
        modCompra = new javax.swing.JMenuItem();
        anuCompra = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FastDevelopment v2.0");
        setLocation(new java.awt.Point(400, 250));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, 128, 32));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("FastDevelopment © ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 127, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Gestor de Libros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/papel.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 150));

        menulibro.setText("Libro");

        jMenu5.setText("Libros");

        regCompra1.setText("Registrar");
        regCompra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regCompra1ActionPerformed(evt);
            }
        });
        jMenu5.add(regCompra1);

        modLibro.setText("Modificar / ISBN");
        modLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modLibroActionPerformed(evt);
            }
        });
        jMenu5.add(modLibro);

        busLibro.setText("Buscar / ISBN");
        busLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busLibroActionPerformed(evt);
            }
        });
        jMenu5.add(busLibro);

        borLibro.setText("Borrar");
        borLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borLibroActionPerformed(evt);
            }
        });
        jMenu5.add(borLibro);

        menulibro.add(jMenu5);

        jMenu6.setText("Detalles");

        jMenu7.setText("Autor");

        regAutor.setText("Registrar");
        regAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAutorActionPerformed(evt);
            }
        });
        jMenu7.add(regAutor);

        modAutor.setText("Modificar");
        modAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modAutorActionPerformed(evt);
            }
        });
        jMenu7.add(modAutor);

        busAutor.setText("Buscar / Cod Autor");
        busAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busAutorActionPerformed(evt);
            }
        });
        jMenu7.add(busAutor);

        borAutor.setText("Borrar");
        borAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borAutorActionPerformed(evt);
            }
        });
        jMenu7.add(borAutor);

        jMenu6.add(jMenu7);

        jMenu8.setText("Editorial");

        regEditorial.setText("Registrar");
        regEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEditorialActionPerformed(evt);
            }
        });
        jMenu8.add(regEditorial);

        modEditorial.setText("Modificar");
        modEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modEditorialActionPerformed(evt);
            }
        });
        jMenu8.add(modEditorial);

        busEditorial.setText("Buscar / Cod Editorial");
        busEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busEditorialActionPerformed(evt);
            }
        });
        jMenu8.add(busEditorial);

        borEditorial.setText("Borrar");
        borEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borEditorialActionPerformed(evt);
            }
        });
        jMenu8.add(borEditorial);

        jMenu6.add(jMenu8);

        menulibro.add(jMenu6);

        jMenuBar1.add(menulibro);

        menudistribuidor.setText("Distribuidores");

        regDistribuidor.setText("Registrar");
        regDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regDistribuidorActionPerformed(evt);
            }
        });
        menudistribuidor.add(regDistribuidor);

        modDistribuidor.setText("Modificar");
        modDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modDistribuidorActionPerformed(evt);
            }
        });
        menudistribuidor.add(modDistribuidor);

        busDistribuidor.setText("Buscar / Cod Distribuidor");
        busDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busDistribuidorActionPerformed(evt);
            }
        });
        menudistribuidor.add(busDistribuidor);

        borDistribuidor.setText("Borrar");
        borDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borDistribuidorActionPerformed(evt);
            }
        });
        menudistribuidor.add(borDistribuidor);

        jMenuBar1.add(menudistribuidor);

        menufactura.setText("Gestión Factura");

        busFactura.setText("Buscar / Folio");
        busFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busFacturaActionPerformed(evt);
            }
        });
        menufactura.add(busFactura);

        modFactura.setText("Modificar / Folio");
        modFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modFacturaActionPerformed(evt);
            }
        });
        menufactura.add(modFactura);

        borFactura.setText("Borrar / Folio");
        borFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borFacturaActionPerformed(evt);
            }
        });
        menufactura.add(borFactura);

        jMenuBar1.add(menufactura);

        menucompra.setText("Gestión Compra");

        jMenu13.setText("Transacción");

        regCompra.setText("Comprar");
        regCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regCompraActionPerformed(evt);
            }
        });
        jMenu13.add(regCompra);

        busCompra.setText("Buscar Compras / Folio");
        busCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busCompraActionPerformed(evt);
            }
        });
        jMenu13.add(busCompra);

        modCompra.setText("Modificar Compras / Folio");
        modCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modCompraActionPerformed(evt);
            }
        });
        jMenu13.add(modCompra);

        anuCompra.setText("Anular / Borrar Compra");
        anuCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anuCompraActionPerformed(evt);
            }
        });
        jMenu13.add(anuCompra);

        menucompra.add(jMenu13);

        jMenuBar1.add(menucompra);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Habilita la visibilidad de la interfaz "Modificar Libro".
     * @param evt 
     */
    private void modLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modLibroActionPerformed
        try {
            new ModificarLibro().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modLibroActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Buscar Libro".
     * @param evt 
     */
    private void busLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busLibroActionPerformed
        new BuscarLibro().setVisible(true);
    }//GEN-LAST:event_busLibroActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Borrar Libro".
     * @param evt 
     */
    private void borLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borLibroActionPerformed
        try {
            new BorrarLibro().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_borLibroActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Registrar Autor".
     * @param evt 
     */
    private void regAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAutorActionPerformed
        new RegistrarAutor().setVisible(true);
    }//GEN-LAST:event_regAutorActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Modificar Autor".
     * @param evt 
     */
    private void modAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modAutorActionPerformed
        try {
            new ModificarAutor().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modAutorActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Buscar Autor".
     * @param evt 
     */
    private void busAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busAutorActionPerformed
        try {
            new BuscarAutor().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_busAutorActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Borrar Autor".
     * @param evt 
     */
    private void borAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borAutorActionPerformed
        try {
            new BorrarAutor().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_borAutorActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Registrar Editorial".
     * @param evt 
     */
    private void regEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEditorialActionPerformed
        new RegistrarEditorial().setVisible(true);
    }//GEN-LAST:event_regEditorialActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Modificar Editorial".
     * @param evt 
     */
    private void modEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modEditorialActionPerformed
        try {
            new ModificarEditorial().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modEditorialActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Buscar Editorial".
     * @param evt 
     */
    private void busEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busEditorialActionPerformed
        try {
            new BuscarEditorial().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_busEditorialActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Borrar Editorial".
     * @param evt 
     */
    private void borEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borEditorialActionPerformed
        try {
            new BorrarEditorial().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_borEditorialActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Buscar Factura".
     * @param evt 
     */
    private void busFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busFacturaActionPerformed
        new BuscarFactura().setVisible(true);
    }//GEN-LAST:event_busFacturaActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Modificar Factura".
     * @param evt 
     */
    private void modFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modFacturaActionPerformed
        try {
            new ModificarFactura().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modFacturaActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Borrar Factura".
     * @param evt 
     */
    private void borFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borFacturaActionPerformed
        new BorrarFactura().setVisible(true);
    }//GEN-LAST:event_borFacturaActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Registrar Compra".
     * @param evt 
     */
    private void regCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regCompraActionPerformed
        try {
            new RegistrarCompra().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_regCompraActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Buscar Compra".
     * @param evt 
     */
    private void busCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busCompraActionPerformed
        new BuscarCompra().setVisible(true);
    }//GEN-LAST:event_busCompraActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Modificar Compra".
     * @param evt 
     */
    private void modCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modCompraActionPerformed
        try {
            new ModificarCompra().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modCompraActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Borrar Compra".
     * @param evt 
     */
    private void anuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anuCompraActionPerformed
        new BorrarCompra().setVisible(true);
    }//GEN-LAST:event_anuCompraActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Registrar Distribuidor".
     * @param evt 
     */
    private void regDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regDistribuidorActionPerformed
        new RegistrarDistribuidor().setVisible(true);
    }//GEN-LAST:event_regDistribuidorActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Modificar Distribuidor".
     * @param evt 
     */
    private void modDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modDistribuidorActionPerformed
        try {
            new ModificarDistribuidor().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modDistribuidorActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Buscar Distribuidor".
     * @param evt 
     */
    private void busDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busDistribuidorActionPerformed
        try {
            new BuscarDistribuidor().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menú.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_busDistribuidorActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Borrar Distribuidor".
     * @param evt 
     */
    private void borDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borDistribuidorActionPerformed
        new BorrarDistribuidor().setVisible(true);
    }//GEN-LAST:event_borDistribuidorActionPerformed

    /**
     * Botón "Salir" te saca de la aplicación.
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Habilita la visibilidad de la interfaz "Registrar Libro".
     * @param evt 
     */
    private void regCompra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regCompra1ActionPerformed
        new RegistrarLibro().setVisible(true);
    }//GEN-LAST:event_regCompra1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem anuCompra;
    private javax.swing.JMenuItem borAutor;
    private javax.swing.JMenuItem borDistribuidor;
    private javax.swing.JMenuItem borEditorial;
    private javax.swing.JMenuItem borFactura;
    private javax.swing.JMenuItem borLibro;
    private javax.swing.JMenuItem busAutor;
    private javax.swing.JMenuItem busCompra;
    private javax.swing.JMenuItem busDistribuidor;
    private javax.swing.JMenuItem busEditorial;
    private javax.swing.JMenuItem busFactura;
    private javax.swing.JMenuItem busLibro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menucompra;
    private javax.swing.JMenu menudistribuidor;
    private javax.swing.JMenu menufactura;
    private javax.swing.JMenu menulibro;
    private javax.swing.JMenuItem modAutor;
    private javax.swing.JMenuItem modCompra;
    private javax.swing.JMenuItem modDistribuidor;
    private javax.swing.JMenuItem modEditorial;
    private javax.swing.JMenuItem modFactura;
    private javax.swing.JMenuItem modLibro;
    private javax.swing.JMenuItem regAutor;
    private javax.swing.JMenuItem regCompra;
    private javax.swing.JMenuItem regCompra1;
    private javax.swing.JMenuItem regDistribuidor;
    private javax.swing.JMenuItem regEditorial;
    // End of variables declaration//GEN-END:variables
}
