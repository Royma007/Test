/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaunidad3;

/**
 *
 * @author Nayra Deniz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account cuentita;
        double saldo;
        
        cuentita = new Account("Pepa Santana","3333-1111-99-123456789",200);
        
        operar(cuentita, 251, 's'); 
        operar(cuentita, 1011, 'i');
    }

    private static void operar(Account cuentita, double cantidad, char tipo_operacion) {
        double saldo;
        try
            
        {   
            if(tipo_operacion=='s')
            cuentita.sacar(-99);
        } catch (Exception e)
        {
            System.err.println(e.getMessage());
            System.out.println("Fallo al retirar");
        }
        try
        {
            if(tipo_operacion=='i')
            System.out.println("Ingreso en cuenta");
            cuentita.ingresar(-1695);
        } catch (Exception e)
        {
            System.err.println(e.getMessage());
            System.out.println("Fallo al ingresar");
        }
        saldo = cuentita.disponible();
        System.out.println("El saldo actual es"+ saldo );
    }

}
