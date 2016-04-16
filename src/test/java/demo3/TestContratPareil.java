package demo3;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.hamcrest.core.IsSame;
import org.junit.Assert;
import org.junit.Test;

public class TestContratPareil {

	/* Contrat "pareil" : IsSame */
	/*
	 * Le contrat v�rifie que l'instance pass�e en premier param�tre de
	 * l'assertion et celle pass�e en param�tre du contrat sont les m�mes.
	 */

	@Test
	public void pareil() {
		// Remarque : c'est la m�me instance � cause du cache
		Assert.assertThat("texte", IsSame.sameInstance("texte"));
	}

	@Test
	public void pareil2() {
		// Remarque : c'est la m�me instance � cause du cache
		assertSame("should be same", "texte", "texte");
	}

	@Test
	public void pasPareil() {
		// Remarque : ce n'est pas la m�me instance parce que new String() force
		// une nouvelle instance.
		Assert.assertThat(new String("texte"), IsSame.sameInstance("texte"));
		assertNotSame("should not be same Object", new Object(), new Object());
	}

	@Test
	public void pasPareil2() {
		// Remarque : ce n'est pas la m�me instance parce que new String() force
		// une nouvelle instance.
		assertNotSame("should not be same Object", new String("texte"), "texte");
	}

}
