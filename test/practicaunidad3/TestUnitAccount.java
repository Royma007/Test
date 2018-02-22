package practicaunidad3;

import junit.framework.TestCase;
//import static junit.framework.Assert.*;
/**
 *
 * @author Nayra Deniz
 */
public class TestUnitAccount extends TestCase {
    Account instance = new Account("Josefa Garcia","0001-2000-99-123456789",1500);
  
  public TestUnitAccount(String testName) {
    super(testName);
  }

  public void testSacar() throws Exception {
    System.out.println("Prueba del método sacar dinero");
    double cantidad =500.0;
    instance.sacar(cantidad);
    assertEquals(
            "Debe dar 1000 (1500 que tenía menos 500 que se retiran)",
            1000.0,
            instance.disponible()
    );
    
  }
  public void testIngresar() throws Exception {
    System.out.println("Prueba del método ingresar");
    double cantidad2 = 250;
    instance.ingresar(cantidad2);
    assertEquals(
            "Debe dar 1750 (1500 que tenía mas 250 que se añaden)",
            1750.0,
            instance.disponible()
    );
    assertNotNull("Debería tener valor",instance.disponible());
  }

}
