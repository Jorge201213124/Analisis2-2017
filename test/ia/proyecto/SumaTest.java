package ia.proyecto;

//import ia.proyecto.Suma;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumaTest extends junit.framework.TestCase{

   @Test
   public void testSumaPositivos() {
      System.out.println("Sumando dos números positivos ...");
       Suma S = new Suma(2, 3);
	int resultado = S.sumar();
        assertEquals("2 + 3 = ",5, resultado);
   }

   @Test
   public void testSumaNegativos() {
       System.out.println("Sumando dos números negativos ...");
       Suma S = new Suma(-2, -3);
       assertTrue(S.sumar() == -5);
   }

   @Test
   public void testSumaPositivoNegativo() {
       System.out.println("Sumando un número positivo y un número negativo ...");
       Suma S = new Suma(2, -3);
       assertTrue(S.sumar() == -1);
   }
}