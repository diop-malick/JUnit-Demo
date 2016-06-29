package demo3;

import org.junit.Test;

public class TestThrowable {

	/* permet de v�rifier qu'un Throwable Exception a bien �t� d�clench�  
	 */
	
	
	@Test(expected=IllegalArgumentException.class)
    public void divisionAvecUnNombre() {
        Operations.diviser(1);
    }

    @Test(expected=ArithmeticException.class)
    public void divisionAvecDeuxNombresDontUnZero() {
        Operations.diviser(10, 0);
    }

    @Test(expected=ArithmeticException.class)
    public void divisionAvecDeuxNombres() {
        Operations.diviser(10, 5);
    }
}


