package demo3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAvantApresEnsemble {
	/*
	 * Pr�paration avant et d�montage apr�s l'ensemble de tests d'un cas de
	 * tests
	 * ========================================================================
	 * Ces annotations permettent d'indiquer une m�thode qui sera ex�cut�e avant
	 * l'ensemble des tests d'un cas de tests et une m�thode qui sera ex�cut�e
	 * apr�s l'ensemble des tests d'un cas de tests.
	 */
	
	@BeforeClass
    public static void avantTests() {
        System.out.println("------------------------");
        System.out.println("Avant Tests");
        System.out.println("------------------------");
    }
    
    @AfterClass
    public static void apresTests() {
        System.out.println("------------------------");
        System.out.println("Apr�s Tests");
        System.out.println("------------------------");
    }
    
    @Test
    public void premierTest() {
        System.out.println("Premier Test");
    }

    @Test
    public void deuxiemeTest() {
        System.out.println("Deuxi�me Test");
    }

    @Test
    public void troisiemeTest() {
        System.out.println("Troisi�me Test");
    }
}
