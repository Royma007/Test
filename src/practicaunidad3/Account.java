/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaunidad3;

/**
 *
 * @author Nayra Deniz
 */
public class Account {


    // Propiedades de la Clase Cuenta
    private String titular;
    private String ccc;
    private double balance;
    private double interes;

    /* Constructor sin argumentos */

    /**
     *
     */
    
    public Account ()
    {
    }
    // Constructor con parámetro para iniciar algunas propiedades de la clase

    /**
     *
     * @param nom
     * @param cuenta
     * @param sal
     */
        public Account (String nom, String cuenta, double sal)
    {
        titular = nom;
        ccc = cuenta;
        balance = sal;
    }
   // Método para asignar el nombre del titular de la cuenta

    /**
     *
     * @param nom: Indicar el nombre del titular Roy 22/02/2018 Hey!
     */
        public void setTitular(String nom)
    {
        titular=nom;
    }
    // Método que me devuelve el nombre del titular

    /**
     *
     * @return
     */
        public String getTitular()
    {
        return titular;
    }

    // Método que me devuelve el saldo disponible en cada momento

    /**
     *
     * @return
     */
         public double disponible()
    {
        return getBalance();
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
       */

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setBalance(getBalance() + cantidad);
    }



    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    
    public void sacar(double cantidad) throws Exception
    {
        if (cantidad < 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (disponible()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        setBalance(getBalance() - cantidad);
    }

    // Método que me devuelve el número de cuenta

    /**
     *
     * @return
     */
        public String getCCC()
    {
        return ccc;
    }

    /**
     * @param ccc the ccc to set
     */
    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }
}
