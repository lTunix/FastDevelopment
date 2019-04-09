
package Clases;

/**
 * Clase Compra.
 * @author Gabriela Troncoso.
 * @since 04/07/2017
 * @version 1.0
 */
public class Compra {
    String rutdis, numser, folio;
    int cod;
    
    public Compra(){
        this.rutdis = null;
        this.numser = null;
        this.folio = null;
        this.cod = 0;
    }

    public String getRutdis() {
        return rutdis;
    }

    public void setRutdis(String rutdis) {
        this.rutdis = rutdis;
    }

    public String getNumser() {
        return numser;
    }

    public void setNumser(String numser) {
        this.numser = numser;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    
}
