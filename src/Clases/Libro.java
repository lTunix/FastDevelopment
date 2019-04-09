
package Clases;

/**
 * Clase Libro.
 * @author Marcos Fernandez.
 * @since 04/07/2017
 * @version 1.0
 */
public class Libro {
    String nom_edi, nom_est, titulo, ano_publicacion, nom_cate, nom_idio, nom_autor;
    int num_serie, isbn, precio, cant_pag;
    
    public Libro(){
        this.isbn = 0;
        this.titulo = null;
        this.ano_publicacion = null;
        this.num_serie = 0;
        this.nom_edi = null;
        this.nom_est = null;
        this.cant_pag = 0;
        this.precio = 0;
        this.nom_cate = null;
        this.nom_idio = null;
        this.nom_autor = null;
    }

    public String getNom_edi() {
        return nom_edi;
    }

    public void setNom_edi(String nom_edi) {
        this.nom_edi = nom_edi;
    }

    public String getNom_est() {
        return nom_est;
    }

    public void setNom_est(String nom_est) {
        this.nom_est = nom_est;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno_publicacion() {
        return ano_publicacion;
    }

    public void setAno_publicacion(String ano_publicacion) {
        this.ano_publicacion = ano_publicacion;
    }

    public String getNom_cate() {
        return nom_cate;
    }

    public void setNom_cate(String nom_cate) {
        this.nom_cate = nom_cate;
    }

    public String getNom_idio() {
        return nom_idio;
    }

    public void setNom_idio(String nom_idio) {
        this.nom_idio = nom_idio;
    }

    public String getNom_autor() {
        return nom_autor;
    }

    public void setNom_autor(String nom_autor) {
        this.nom_autor = nom_autor;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCant_pag() {
        return cant_pag;
    }

    public void setCant_pag(int cant_pag) {
        this.cant_pag = cant_pag;
    }

   
    
}
