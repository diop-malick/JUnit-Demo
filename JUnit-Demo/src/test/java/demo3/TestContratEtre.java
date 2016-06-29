package demo3;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsSame;
import org.junit.Assert;
import org.junit.Test;

public class TestContratEtre {

	/*
	 * Contrat "�tre" : Is
	 * 
	 * Le contrat v�rifie que l'instance pass�e en premier param�tre correspond
	 * � ce qui est pass� (classe, valeur, autre contrat) en param�tre du
	 * contrat. Ce contrat n'apporte pas de nouveau type de contrat :
	 * 
	 * si on passe une classe, cela correspond � un contrat
	 * "classe de l'instance"
	 * 
	 * si on passe une valeur, cela correspond � un contrat "�galit�"
	 * 
	 * si on passe un autre contrat, cela correspond � cet autre contrat
	 */


    @Test
    public void egal() {
        Assert.assertThat("texte", Is.is("texte"));
    }

    @Test
    public void pasEgal() {
        Assert.assertThat("Texte", Is.is("texte"));
    }

    @Test
    public void pareil() {
        Assert.assertThat("texte", Is.is(IsSame.sameInstance("texte")));
    }

    @Test
    public void pasPareil() {
        Assert.assertThat(new String("texte"), Is.is(IsSame.sameInstance("texte")));
    }
}
