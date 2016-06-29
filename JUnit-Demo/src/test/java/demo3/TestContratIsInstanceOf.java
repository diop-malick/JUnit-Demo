package demo3;

import java.io.Serializable;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;

public class TestContratIsInstanceOf {

	/* Contrat "classe de l'instance" : IsInstanceOf */
	/*
	 * Le contrat v�rifie que l'instance pass�e en premier param�tre de
	 * l'assertion est de la classe pass�e en param�tre du contrat.
	 *
	 * l'assertion �choue si l'instance n'est pas de la bonne classe.
	 */

	@Test
	public void classeDeString() {
		Assert.assertThat("texte", IsInstanceOf.instanceOf(String.class));
	}

	@Test
	public void classeDeSerializable() {
		Assert.assertThat("texte", IsInstanceOf.instanceOf(Serializable.class));
	}

	@Test
	public void classeDeCharSequence() {
		Assert.assertThat("texte", IsInstanceOf.instanceOf(CharSequence.class));
	}

	@Test
	public void classeDeInteger() {
		Assert.assertThat("texte", IsInstanceOf.instanceOf(Integer.class));
	}
}
