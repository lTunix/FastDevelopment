
package Clases;

/**
 * Clase Factura.
 * @author Marcos Fernandez.
 * @since 04/07/2017
 * @version 1.0
 */
public class Factura {
    int folio, metodo, iva;
    String fecha, hora;
    
    public Factura(){
        this.folio = 0;
        this.metodo = 0;
        this.iva = 0;
        this.fecha = null;
        this.hora = null;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getMetodo() {
        return metodo;
    }

    public void setMetodo(int metodo) {
        this.metodo = metodo;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
