
package Clases;



/**
 * Clase Distribuidor.
 * @author Gabriela Troncoso.
 * @since 04/07/2017
 * @version 1.0
 */
public class Distribuidor {
    String rut, direccion, añoinicio, nombempr, comuna, region;
    int telefono;

    
    public Distribuidor(){
        this.rut = null;
        this.direccion = null;
        this.nombempr = null;
        this.añoinicio = null;
        this.comuna = null;
        this.region = null;
        this.telefono = 0;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombempr() {
        return nombempr;
    }

    public void setNombempr(String nombempr) {
        this.nombempr = nombempr;
    }

    public String getAñoinicio() {
        return añoinicio;
    }

    public void setAñoinicio(String añoinicio) {
        this.añoinicio = añoinicio;
    }

        

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
