
package Clases;

/**
 * Clase Autor.
 * @author Gabriela Troncoso.
 * @since 04/07/2017
 * @version 1.0
 */
public class Autor {
    String Nombre, Apep, Apem;
    int cod;
    
    public Autor(){
        this.Nombre = null;
        this.Apep = null;
        this.Apem = null;
        this.cod = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getApep() {
        return Apep;
    }

    public void setApep(String Apep) {
        this.Apep = Apep;
    }

    public String getApem() {
        return Apem;
    }

    public void setApem(String Apem) {
        this.Apem = Apem;
    }
    
    
}
