package Banco;

/**
 *
 * This class is inherited from the class Cuenta, furthermore is use for specialize in create attributes for a Cuenta corriente
 *
 * @author Julio Luna and Cristhian Villamarin
 */
public class Corriente extends Cuenta {
    private int nroMaxCheques;
    private SecuencialCheque secuencuaCh;

    /**
     *
     * This constructor inicializate the attributes for the specialize class Corriente
     *
     * @param saldo
     * @param numero
     */
    public Corriente(double saldo, String numero) {
        super(saldo, numero);
    }

    /**
     *
     * This method is for get access to the private attribute nroMaxCheques
     *
     * @return nroMaxCheques
     */
    public int getNroMaxCheques() {
        return nroMaxCheques;
    }

    /**
     *
     * This method is for validate the attribute nroMaxCheques
     *
     * @param nroMaxCheques
     */
    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }


    /**
     *
     * This method is for get access to the private attribute secuencuaCh
     *
     * @return nroMaxCheques
     */
    public SecuencialCheque getSecuencuaCh() {
        return secuencuaCh;
    }

    /**
     *
     * This method is for validate the attribute secuencuaCh
     *
     * @param secuencuaCh
     */
    public void setSecuencuaCh(SecuencialCheque secuencuaCh) {
        this.secuencuaCh = secuencuaCh;
    }

}
