
package Banco;

/**
 *
 * This class is for validate the atrributes of the SecuencialCheque
 *
 * @author Julio Luna and Cristhian Villamarin
 */
public class SecuencialCheque {
    private String inicio;
    private String fin;

    /**
     *
     * This is a defect constructor, for that, does not receive attributes
     *
     */

    public SecuencialCheque() {
    }

    /**
     *
     * This method is for get access to the private attribute inicio
     *
     * @return inicio
     */

    public String getInicio() {
        return inicio;
    }

    /**
     * This method is for validate the attribute inicio
     *
     * @param inicio
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     *
     * This method is for get access to the private attribute fin
     *
     * @return fin
     */
    public String getFin() {
        return fin;
    }

    /**
     *
     * This method is for validate the attribute inicio
     *
     * @param fin
     */
    public void setFin(String fin) {
        this.fin = fin;
    }
}
