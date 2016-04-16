package demo3;

import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsSame;
import org.junit.Assert;
import org.junit.Test;

public class TestContratIsIsNot {

	/*
	 * Le contrat v�rifie que l'instance pass�e en premier param�tre ne
	 * correspond pas � ce qui est pass� (valeur ou autre contrat) en param�tre
	 * du contrat. Ce contrat n'apporte pas de nouveau type de contrat :
	 * 
	 * si on passe une valeur, cela correspond � un contrat "�galit�"
	 * 
	 * si on passe un autre contrat, cela correspond � cet autre contrat
	 */
	@Test
	public void egal() {
		Assert.assertThat("texte", IsNot.not("texte"));
	}

	@Test
	public void pasEgal() {
		Assert.assertThat("Texte", IsNot.not("texte"));
	}

	@Test
	public void pareil() {
		Assert.assertThat("texte", IsNot.not(IsSame.sameInstance("texte")));
	}

	@Test
	public void pasPareil() {
		Assert.assertThat(new String("texte"), IsNot.not(IsSame.sameInstance("texte")));
	}
}
