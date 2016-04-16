package demo3;

import org.junit.Test;

public class TestDureeLimitee {

	/* Test d'une dur�e limit�e */
	/*
	 * permet de v�rifier qu'un test ne d�passe pas une dur�e. Au del� de cette
	 * dur�e, le test passe en erreur. La dur�e en millisecondes est pass�e en
	 * param�tre � l'annotation.
	 */

	@Test(timeout = 1000)
	public void dureeRespectee() {

	}

	@Test(timeout = 1000)
	public void dureeNonRespectee() throws InterruptedException {
		Thread.sleep(10000);
	}
}
