
package Clases;

/**
 * Clase Editorial.
 * @author Marcos Fernandez.
 * @since 04/07/2017
 * @version 1.0
 */
public class Editorial {
    String Nombre;
    int Cod;
    public Editorial(){
        this.Nombre = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCod() {
        return Cod;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }
    
    
}
