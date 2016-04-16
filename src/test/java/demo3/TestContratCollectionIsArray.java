package demo3;

import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArray.array;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class TestContratCollectionIsArray {

	/*
	 * Le contrat "IsArray" v�rifie que les �l�ments d'un tableau respecte un
	 * tableau de contrats (un contrat par �l�ment). La javadoc de ce contrat
	 * est disponible ici.
	 * 
	 * Le contrat "IsArrayContaining" v�rifie qu'un tableau contient au moins un
	 * �l�ment qui respecte un contrat pass� en param�tre ou qui est �gal � une
	 * valeur pass�e en param�tre. La javadoc de ce contrat est disponible ici.
	 * 
	 * Le contrat "IsCollectionContaining" v�rifie qu'une Collection contient
	 * des �l�ments qui respectent un ou des contrats pass�s en param�tres ou
	 * qui sont �gaux � une valeur ou des valeurs pass�es en param�tres. La
	 * javadoc de ce contrat est disponible ici.
	 * 
	 * Le contrat "IsIn" v�rifie qu'un objet est contenu dans une Collection, un
	 * tableau ou parmi les param�tres du contrat. La javadoc de ce contrat est
	 * disponible ici.
	 * 
	 * Le contrat "IsMapContaining" v�rifie qu'une Map contient une entr�e, une
	 * cl� ou valeur qui respecte un contrat ou qui sont �gaux � une valeur
	 * pass�e en param�tre. La javadoc de ce contrat est disponible
	 * 
	 */
	
	@Test
    public void elementsEgaux() {
        assertThat(new Integer[]{1, 2}, array(is(1), is(2)));
    }

    @Test
    public void elementsDifferents() {
        assertThat(new Integer[]{1, 2}, array(is(1), is(3)));
    }
}
