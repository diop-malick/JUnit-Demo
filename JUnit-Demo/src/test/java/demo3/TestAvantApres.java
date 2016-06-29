package demo3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAvantApres {

	/*
	 *  Pr�paration avant et d�montage apr�s chaque test d'un cas de test.
	 *  Ces annotations permettent d'indiquer une m�thode qui sera ex�cut�e avant
	 * chaque test et un m�thode qui sera ex�cut�e apr�s chaque test.
	 */

	@Before
	public void avantTest() {
		System.out.println("------------------------");
		System.out.println("Avant Test");
	}

	@After
	public void apresTest() {
		System.out.println("Apr�s Test");
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
