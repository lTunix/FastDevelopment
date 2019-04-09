package Clases;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Clase de la Conexion a base de datos.
 * @author Gabriela Troncoso.
 * @since 04/07/2017
 * @version 1.0
 */
public class ConexionBD {
    private String parametros;
    private Connection conexion;
    private Statement sentencia;
    private ResultSet rs;
    
    public ConexionBD(){
        try{
            parametros = "jdbc:mysql://localhost/biblioteca";
            Class.forName("com.mysql.jdbc.Driver"); 
            conexion = DriverManager.getConnection(parametros, "root", "12345"); 
            System.out.println("Conexion exitosa");     
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion a MySQL: " + e, "Error de conexion", 0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la conexion a MySQL: " + e, "Error de conexion", 0);
            System.exit(0);
        }
    }
    

    
    public void GuardarDistribuidor(Distribuidor d){
        String sql = "insert into distribuidor values ('"+d.getRut()+"', "+d.getTelefono()+", '"+d.getDireccion()+"', '"+d.getComuna()+"', '"+d.getRegion()+"', '"+d.getNombempr()+"', '"+d.getAñoinicio()+"');";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Distribuidor guardado exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso del distribuidor" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso del distribuidor" + e, "error", 0);
            System.exit(0);
        }
    }
    public DefaultComboBoxModel ConstruirComboBoxRegion(){
     DefaultComboBoxModel bosquejo_combo = new DefaultComboBoxModel();
     String sql = "select nombre_region from region;";
     try{
         sentencia = conexion.createStatement();
         rs = sentencia.executeQuery(sql);
         while(rs.next()){
             bosquejo_combo.addElement(rs.getString("nombre_region"));
         }
         sentencia.close();
         rs.close();
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }
     return bosquejo_combo;
    }
    
    public DefaultComboBoxModel ConstruirComboBoxComuna(){
     DefaultComboBoxModel bosquejo_combo2 = new DefaultComboBoxModel();
     String sql = "select nombre_comuna from comuna;";
     try{
         sentencia = conexion.createStatement();
         rs = sentencia.executeQuery(sql);
         while(rs.next()){
             bosquejo_combo2.addElement(rs.getString("nombre_comuna"));
         }
         sentencia.close();
         rs.close();
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }
     return bosquejo_combo2;
    }
    
    public DefaultTableModel MostrarTabla() throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select * from distribuidor;");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Rut Distribuidor");
        modelo.addColumn("Telefono");
        modelo.addColumn("Dirección");
        modelo.addColumn("Comuna");
        modelo.addColumn("Región");
        modelo.addColumn("Nombre Empresa");
        modelo.addColumn("Año Inicio Ventas");
        while (rs.next()){
            Object [] fila = new Object[7];
            for (int i=0;i<7;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
        return modelo;
    }
    
    public DefaultTableModel BuscarDistribuidor(Distribuidor d) throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select * from distribuidor where rut_distribuidor = '"+d.getRut()+"';");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Rut Distribuidor");
        modelo.addColumn("Telefono");
        modelo.addColumn("Dirección");
        modelo.addColumn("Comuna");
        modelo.addColumn("Región");
        modelo.addColumn("Nombre Empresa");
        modelo.addColumn("Año Inicio Ventas");
        while (rs.next()){
            Object [] fila = new Object[7];
            for (int i=0;i<7;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
            return modelo;
    }
    
    public void EliminarDistribuidor(Distribuidor d) throws SQLException{
            String sql = "delete from distribuidor where rut_distribuidor = '"+d.getRut()+"'";
            try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Distribuidor borrado exitosamente", "Borrado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion del distribuidor" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion del distribuidor" + e, "error", 0);
            System.exit(0);
        }
    }
    
    public void ActualizarDistribuidor(Distribuidor d){
        String sql = "update distribuidor set telefono = '"+d.getTelefono()+"', direccion = '"+d.getDireccion()+"', comuna = '"+d.getComuna()+"', region = '"+d.getRegion()+"', nombre_empresa = '"+d.getNombempr()+"', ano_inicio_ventas = '"+d.getAñoinicio()+"' where rut_distribuidor = '"+d.getRut()+"';";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Distribuidor actualizado exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion del distribuidor" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion del distribuidor" + e, "error", 0);
            System.exit(0);
        }
    }
    
    public void RegistrarLibro(Libro l){
        String sql = "insert into libro values ("+l.getNum_serie()+", (select cod_editorial from editorial where nombre_editorial = '"+l.getNom_edi()+"'), \n" +
                    "(select cod_estado from estado where estado = '"+l.getNom_est()+"'), "+l.getIsbn()+", '"+l.getTitulo()+"', "+l.getCant_pag()+", "+l.getPrecio()+", '"+l.getAno_publicacion()+"', \n" +
                    "(select cod_categoria from categoria where nombre_categoria = '"+l.getNom_cate()+"'), \n" +
                    "(select cod_idioma from idioma where nombre_idioma = '"+l.getNom_idio()+"'),\n" +
                    "(select cod_autor from autor where (select concat(nombre_autor, ' ', apep_autor, ' ', apem_autor)) = '"+l.getNom_autor()+"'));";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Libro guardado exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso del Libro" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso del Libro" + e, "error", 0);
            System.exit(0);
        }
    }
    
     public DefaultComboBoxModel ConstruirComboBoxIdioma(){
     DefaultComboBoxModel bosquejo_combo3 = new DefaultComboBoxModel();
     String sql = "select nombre_idioma from idioma;";
     try{
         sentencia = conexion.createStatement();
         rs = sentencia.executeQuery(sql);
         while(rs.next()){
             bosquejo_combo3.addElement(rs.getString("nombre_idioma"));
         }
         sentencia.close();
         rs.close();
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }
     return bosquejo_combo3;
    }
     
     public DefaultComboBoxModel ConstruirComboBoxEditorial(){
     DefaultComboBoxModel bosquejo_combo4 = new DefaultComboBoxModel();
     String sql = "select nombre_editorial from editorial;";
     try{
         sentencia = conexion.createStatement();
         rs = sentencia.executeQuery(sql);
         while(rs.next()){
             bosquejo_combo4.addElement(rs.getString("nombre_editorial"));
         }
         sentencia.close();
         rs.close();
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }
     return bosquejo_combo4;
    }
     
     public DefaultComboBoxModel ConstruirComboBoxEstado(){
     DefaultComboBoxModel bosquejo_combo5 = new DefaultComboBoxModel();
     String sql = "select estado from estado;";
     try{
         sentencia = conexion.createStatement();
         rs = sentencia.executeQuery(sql);
         while(rs.next()){
             bosquejo_combo5.addElement(rs.getString("estado"));
         }
         sentencia.close();
         rs.close();
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }
     return bosquejo_combo5;
    }
     
     public DefaultComboBoxModel ConstruirComboBoxCategoria(){
     DefaultComboBoxModel bosquejo_combo6 = new DefaultComboBoxModel();
     String sql = "select nombre_categoria from categoria;";
     try{
         sentencia = conexion.createStatement();
         rs = sentencia.executeQuery(sql);
         while(rs.next()){
             bosquejo_combo6.addElement(rs.getString("nombre_categoria"));
         }
         sentencia.close();
         rs.close();
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }
     return bosquejo_combo6;
    }
     
     public DefaultComboBoxModel ConstruirComboBoxAutor(){
     DefaultComboBoxModel bosquejo_combo7 = new DefaultComboBoxModel();
     String sql = "select nombre_autor, apep_autor, apem_autor from autor;";
     String consulta = "";
     try{
         sentencia = conexion.createStatement();
         rs = sentencia.executeQuery(sql);
         while(rs.next()){
             bosquejo_combo7.addElement(rs.getString("nombre_autor") + " " + rs.getString("apep_autor") + " " + rs.getString("apem_autor"));
         }
         sentencia.close();
         rs.close();
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }
     return bosquejo_combo7;
    }
     
     public void ActualizarLibro(Libro l){
        String sql = "update libro set cod_editorial = (select cod_editorial from editorial where nombre_editorial = '"+l.getNom_edi()+"'), "
                + "cod_estado = (select cod_estado from estado where estado = '"+l.getNom_est()+"'), "
                + "isbn = "+l.getIsbn()+", titulo = '"+l.getTitulo()+"', cantid_paginas = "+l.getCant_pag()+", "
                + "precio_referencia = "+l.getPrecio()+", ano_publicacion = '"+l.getAno_publicacion()+"', "
                + "cod_categoria = (select cod_categoria from categoria where nombre_categoria = '"+l.getNom_cate()+"'), "
                + "cod_idioma = (select cod_idioma from idioma where nombre_idioma = '"+l.getNom_idio()+"'), "
                + "cod_autor = (select cod_autor from autor where (select concat(nombre_autor, ' ', apep_autor, ' ', apem_autor)) = '"+l.getNom_autor()+"') where num_serie = "+l.getNum_serie()+";";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Libro actualizado exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion del Libro" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion del Libro" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public DefaultTableModel MostrarTablaLibro() throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select num_serie, nombre_editorial, estado, isbn, titulo, cantid_paginas, precio_referencia, ano_publicacion, nombre_categoria, nombre_idioma, nombre_autor\n" +
                                        "from libro, editorial, estado, categoria, idioma, autor where num_serie = num_serie && libro.`COD_EDITORIAL` = editorial.`COD_EDITORIAL` && libro.`COD_ESTADO` = estado.`COD_ESTADO` && libro.`COD_CATEGORIA` = categoria.`COD_CATEGORIA` &&\n" +
                                        "libro.`COD_IDIOMA` = idioma.`COD_IDIOMA` && libro.`COD_AUTOR` = autor.`COD_AUTOR`;");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Numero de Serie");
        modelo.addColumn("Nombre Editorial");
        modelo.addColumn("Estado");
        modelo.addColumn("ISBN");
        modelo.addColumn("Título");
        modelo.addColumn("Cantidad Páginas");
        modelo.addColumn("Precio de Referencia");
        modelo.addColumn("Año Publicación");
        modelo.addColumn("Categoría");
        modelo.addColumn("Idioma");
        modelo.addColumn("Autor");
        while (rs.next()){
            Object [] fila = new Object[11];
            for (int i=0;i<11;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
        return modelo;
    }
     
     public DefaultTableModel BuscarLibro(Libro l) throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select num_serie, nombre_editorial, estado, isbn, titulo, cantid_paginas, precio_referencia, ano_publicacion, nombre_categoria, nombre_idioma, nombre_autor\n" +
                                        "from libro, editorial, estado, categoria, idioma, autor where num_serie = "+l.getNum_serie()+" && libro.`COD_EDITORIAL` = editorial.`COD_EDITORIAL` && libro.`COD_ESTADO` = estado.`COD_ESTADO` && libro.`COD_CATEGORIA` = categoria.`COD_CATEGORIA` &&\n" +
                                        "libro.`COD_IDIOMA` = idioma.`COD_IDIOMA` && libro.`COD_AUTOR` = autor.`COD_AUTOR`;");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Numero de Serie");
        modelo.addColumn("Nombre Editorial");
        modelo.addColumn("Estado");
        modelo.addColumn("ISBN");
        modelo.addColumn("Título");
        modelo.addColumn("Cantidad Páginas");
        modelo.addColumn("Precio de Referencia");
        modelo.addColumn("Año Publicación");
        modelo.addColumn("Categoría");
        modelo.addColumn("Idioma");
        modelo.addColumn("Autor");
        while (rs.next()){
            Object [] fila = new Object[11];
            for (int i=0;i<11;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
        return modelo;
    }
     
     public void EliminarLibro(Libro l) throws SQLException{
            String sql = "delete from libro where num_serie = "+l.getNum_serie()+"";
            try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Libro borrado exitosamente", "Borrado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion del libro" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion del libro" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public void RegistrarAutor(Autor a){
        String sql = "insert into autor (nombre_autor, apep_autor, apem_autor) values('"+a.getNombre()+"', '"+a.getApep()+"', '"+a.getApem()+"');";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Autor guardado exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso del Autor" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso del Autor" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public DefaultTableModel MostrarTablaAutor() throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select * from autor;");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Codigo Autor");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        while (rs.next()){
            Object [] fila = new Object[4];
            for (int i=0;i<4;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
        return modelo;
    }
     
     public void ActualizarAutor(Autor a){
        String sql = "update autor set nombre_autor = '"+a.getNombre()+"', apep_autor = '"+a.getApep()+"', apem_autor = '"+a.getApem()+"' where cod_autor = "+a.getCod()+";";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Autor actualizado exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion del Autor" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion del Autor" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public DefaultTableModel BuscarAutor(Autor a) throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select * from autor where cod_autor = "+a.getCod()+";");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Codigo Autor");
        modelo.addColumn("Nombre Completo");
        while (rs.next()){
            Object [] fila = new Object[2];
            for (int i=0;i<2;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
            return modelo;
    }
     
     public void EliminarAutor(Autor a) throws SQLException{
            String sql = "delete from autor where cod_autor = "+a.getCod()+"";
            try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Autor borrado exitosamente", "Borrado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion del Autor" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion del Autor" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public void RegistrarEditorial(Editorial ed){
        String sql = "insert into editorial (nombre_editorial) values('"+ed.getNombre()+"');";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Editorial guardada exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso de la Editorial" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso de la Editorial" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public DefaultTableModel MostrarTablaEditorial() throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select * from editorial;");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Codigo Editorial");
        modelo.addColumn("Nombre");
        while (rs.next()){
            Object [] fila = new Object[2];
            for (int i=0;i<2;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
        return modelo;
    }
     
     public void ActualizarEditorial(Editorial ed){
        String sql = "update editorial set nombre_editorial = '"+ed.getNombre()+"' where cod_editorial = "+ed.getCod()+";";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Editorial actualizada exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion de la Editorial" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion de la Editorial" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public DefaultTableModel BuscarEditorial(Editorial ed) throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select * from editorial where cod_editorial = "+ed.getCod()+";");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Codigo Editorial");
        modelo.addColumn("Nombre");
        while (rs.next()){
            Object [] fila = new Object[2];
            for (int i=0;i<2;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
            return modelo;
    }
     
     public void EliminarEditorial(Editorial ed) throws SQLException{
            String sql = "delete from editorial where cod_editorial = "+ed.getCod()+"";
            try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Editorial borrada exitosamente", "Borrado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion de la Editorial" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion de la Editorial" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public void RegistrarCompra(Compra c){
          String sql = "insert into compra (rut_distribuidor, num_serie, folio_factura) values('"+c.getRutdis()+"', '"+c.getNumser()+"', '"+c.getFolio()+"');";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Compra guardada exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso de la Compra" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso de la Compra" + e, "error", 0);
            System.exit(0);
        }
     }
     
     public DefaultTableModel MostrarTablaCompra() throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select * from compra;");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Codigo Compra");
        modelo.addColumn("Rut Distribuidor");
        modelo.addColumn("Numero de Serie");
        modelo.addColumn("Folio Factura");
        while (rs.next()){
            Object [] fila = new Object[4];
            for (int i=0;i<4;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
        return modelo;
    }
     
     public void RegistrarFactura(Factura f){
          String sql = "insert into factura values ("+f.getFolio()+", "+f.getMetodo()+", "+f.getIva()+", '"+f.getFecha()+"', '"+f.getHora()+"');";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Factura guardada exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso de la Factura" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el ingreso de la Factura" + e, "error", 0);
            System.exit(0);
        }
     }
     
     public DefaultComboBoxModel ConstruirComboBoxMetodo(){
     DefaultComboBoxModel bosquejo_combo8 = new DefaultComboBoxModel();
     String sql = "select nombre_metodo_pago from metodo_pago;";
     try{
         sentencia = conexion.createStatement();
         rs = sentencia.executeQuery(sql);
         while(rs.next()){
             bosquejo_combo8.addElement(rs.getString("nombre_metodo_pago"));
         }
         sentencia.close();
         rs.close();
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error en el llenado");
     }
     return bosquejo_combo8;
    }
     
     public DefaultTableModel BuscarCompra(Compra c) throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select * from compra where cod_compra = "+c.getCod()+";");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Codigo Compra");
        modelo.addColumn("Rut Distribuidor");
        modelo.addColumn("Numero Serie");
        modelo.addColumn("Folio Factura");
        while (rs.next()){
            Object [] fila = new Object[4];
            for (int i=0;i<4;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
            return modelo;
    }
     
     public void ActualizarCompra(Compra c){
        String sql = "update compra set rut_distribuidor = '"+c.getRutdis()+"', num_serie = "+c.getNumser()+", folio_factura = "+c.getFolio()+" where cod_compra = "+c.getCod()+";";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Compra actualizada exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion de la Compra" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion de la Compra" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public void EliminarCompra(Compra c) throws SQLException{
            String sql = "delete from compra where cod_compra = "+c.getCod()+"";
            try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Compra borrada exitosamente", "Borrado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion de la Compra" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion de la Compra" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public DefaultTableModel BuscarFactura(Factura f) throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select folio_factura, nombre_metodo_pago, valor_iva_factura, fecha_compra_factura, hora_compra_factura  from factura, metodo_pago where folio_factura = "+f.getFolio()+" && factura.cod_metodo_pago = metodo_pago.cod_metodo_pago;");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Folio Factura");
        modelo.addColumn("Metodo de Pago");
        modelo.addColumn("Valor IVA");
        modelo.addColumn("Fecha de Compra");
        modelo.addColumn("Hora de Compra");
        while (rs.next()){
            Object [] fila = new Object[5];
            for (int i=0;i<5;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
            return modelo;
    }
     
     public DefaultTableModel MostrarTablaFactura() throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select folio_factura, nombre_metodo_pago, valor_iva_factura, fecha_compra_factura, hora_compra_factura  from factura, metodo_pago where factura.cod_metodo_pago = metodo_pago.cod_metodo_pago;");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Folio Factura");
        modelo.addColumn("Metodo de Pago");
        modelo.addColumn("Valor IVA");
        modelo.addColumn("Fecha de Compra");
        modelo.addColumn("Hora de Compra");
        while (rs.next()){
            Object [] fila = new Object[5];
            for (int i=0;i<5;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
        return modelo;
    }
     
     public void ActualizarFactura(Factura f){
        String sql = "update factura set cod_metodo_pago = "+f.getMetodo()+", valor_iva_factura = "+f.getIva()+", fecha_compra_factura = '"+f.getFecha()+"', hora_compra_factura = '"+f.getHora()+"' where folio_factura = "+f.getFolio()+";";
        try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Factura actualizada exitosamente", "Guardado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion de la Factura" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la actualizacion de la Factura" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public void EliminarFactura(Factura f) throws SQLException{
            String sql = "delete from factura where folio_factura = "+f.getFolio()+"";
            try{
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Factura borrada exitosamente", "Borrado", 1);
            sentencia.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion de la Factura" + e, "error", 0);
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la eliminacion de la Factura" + e, "error", 0);
            System.exit(0);
        }
    }
     
     public DefaultTableModel MostrarTablaDetalleFactura(Factura f) throws SQLException{
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("select factura.folio_factura, nombre_metodo_pago, valor_iva_factura, fecha_compra_factura, hora_compra_factura, compra.num_serie, compra.rut_distribuidor,"
                + " precio_referencia, precio_referencia * (valor_iva_factura / 100), precio_referencia + (precio_referencia * (valor_iva_factura / 100))  from factura, metodo_pago, compra, libro where factura.folio_factura = "+f.getFolio()+""
                        + " && libro.num_serie = compra.num_serie && factura.folio_factura = compra.folio_factura &&"
                        + " factura.cod_metodo_pago = metodo_pago.cod_metodo_pago;");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        modelo.addColumn("Folio Factura");
        modelo.addColumn("Metodo de Pago");
        modelo.addColumn("Valor IVA");
        modelo.addColumn("Fecha de Compra");
        modelo.addColumn("Hora de Compra");
        modelo.addColumn("Numero de Serie");
        modelo.addColumn("Rut Distribuidor");
        modelo.addColumn("Precio Referencia");
        modelo.addColumn("Precio IVA incl.");
        modelo.addColumn("Total");
        while (rs.next()){
            Object [] fila = new Object[10];
            for (int i=0;i<10;i++)
            fila[i] = rs.getObject(i+1);
            modelo.addRow(fila); 
        }
        return modelo;
    }
}
    
