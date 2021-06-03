package Banco;

import java.time.LocalDate;

/**
 *
 * This clase is the father class of Ahorro and Corriente
 *
 * @author Julio Luna and Cristhian Villamarin
 */
public class Cuenta {
    private double saldo;
    protected String numero;
    private LocalDate fechaApertura;


    /**
     *
     * This constructor inicializate the attribute saldo, numero and fechaApertura
     *
     * @param saldo
     * @param numero
     */
    public Cuenta(double saldo, String numero) {
        setSaldo(saldo);
        this.numero = numero;
        fechaApertura = LocalDate.now();
    }


    /**
     * This method is for get access to the private attribute saldo
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }


    /**
     *
     * This method is final for for validate that the attribute saldo do not be negative
     *
     * @param saldo
     */
    public final void setSaldo(double saldo) {
        if( !validarSaldoNoNegativo(saldo)) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("Saldo Negativo");
        }

    }


    /**
     *
     * This method is for get access to the private attribute numero
     *
     * @return numero
     */
    public String getNumero() {
        return numero;
    }


    /**
     *
     * This method is for validate the attribute inicio
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }


    /**
     *
     * This method returns a boolean value depending on the condition about if the attribute saldo is less than zero
     *
     * @param saldo
     *  @return true or false
     */
    private boolean validarSaldoNoNegativo(double saldo) {
        return saldo < 0;
    }


    /**
     *
     * This method is for assignate a value in the atrribute monto, depending of the established condition
     *
     * @param monto
     */
    public void depositar(double monto) {
        if (monto > 0 ) {
            this.saldo = this.saldo + monto;
        } else {
            throw new IllegalArgumentException("Monto negativo");
        }
    }
}
