package Banco;

/**
 *
 * This class is inherited from the class Cuenta, furthermore is use for specialize in create attributes for a Cuenta corriente
 *
 * @author Julio Luna and Cristhian Villamarin
 */

public class Ahorro extends Cuenta {
    private double interesAnual;


    /**
     *
     * This constructor add initial value to the private attribute interestAnnual
     *
     * @param saldo
     * @param numero
     * @param interesAnual
     */
    public Ahorro(double saldo, String numero, double interesAnual) {
        super(saldo, numero);
        this.interesAnual = interesAnual;
    }

    /**
     *
     * This method is used to overwrite the attribute numero, adding the initials CTA-AH to each account number
     *
     * @return "CTA-AH-".concat(super.getNumero());
     */
    @Override
    public String getNumero() {
        return "CTA-AH-".concat(super.getNumero());
    }

    /**
     *
     * This method is for get access to the private attribute interesAnual
     *
     * @return interesAnual
     */

    public double getInteresAnual() {
        return interesAnual;
    }


    /**
     * This method returns a boolean value depending on the condition about if the attribute monto is more than zero
     *
     * @param monto
     * @return true
     */

    private boolean isMontoValido(double monto) {
        return monto > 0;
    }

    /**
     *
     * This method is for assignate a value in the atrribute monto, depending of the established condition
     *
     * @param monto
     */

    public void retirar(double monto) {
        if (isMontoValido(monto)) {
            setSaldo( getSaldo() - monto);
        } else {
            throw new IllegalArgumentException("El monto no es válido");
        }
    }
}
