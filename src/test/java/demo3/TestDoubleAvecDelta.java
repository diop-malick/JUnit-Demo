package demo3;

import org.junit.Assert;
import org.junit.Test;

public class TestDoubleAvecDelta {

	/*
	 * Cette assertion est pr�sente dans JUnit depuis la version 4.4.
	 * L'assertion d'�galit� pour les doubles sans delta est pass� en d�pr�ci� �
	 * partir de la version 4.5 de JUnit le param�tre delta permet de consid�rer
	 * que l'assertion est juste m�me s'il y a une diff�rence entre les valeurs,
	 * tant que cette diff�rence est inf�rieure au delta.
	 */

	@Test
	public void valeursExactementEgales() {
		final double lResultat = Operations.soustraire(5, 2.5);
		Assert.assertEquals(2.5, lResultat, 0);
	}

	@Test
	public void valeursAvecUneLegereDifference() {
		final double lResultat = Operations.soustraire(71.19, 98);
		Assert.assertEquals(-26.81, lResultat, 0.005);
	}

	@Test
	public void valeursAvecUneDifferenceTropImportante() {
		final double lResultat = Operations.soustraire(71.19, 98);
		Assert.assertEquals(-26.81, lResultat, 0);
	}
}
