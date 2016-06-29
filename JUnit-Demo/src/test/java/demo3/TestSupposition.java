package demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class TestSupposition {

	/*
	 * Les suppositions sont pr�sentes dans JUnit depuis la version 4.4.
	 * 
	 * Une supposition v�rifie une condition. Si la condition n'est pas
	 * v�rifi�e, le test s'arr�te mais ne passe pas en erreur ou en �chec.
	 * 
	 * Les diff�rentes suppositions sont :
	 * 
	 * assumeNoException(java.lang.Throwable) : v�rifie qu'une op�ration s'est
	 * d�roul�e sans lever de Throwable
	 * 
	 * assumeNotNull(java.lang.Object...) : v�rifie qu'aucun des param�tres
	 * n'est � null.
	 * 
	 * assumeThat(T, org.hamcrest.Matcher) : v�rifie qu'une condition d�finie
	 * par contrat est respect�e (voir
	 * "Assertion sur une condition d�finie par contrat").
	 * 
	 * assumeTrue(boolean) : v�rifie que le param�tre est vrai.
	 */
	@Test
	public void verifierExistenceFichier() {
		final File lFile = new File("fichier.txt");
		Assert.assertTrue("Le fichier doit exister", lFile.exists());
	}

	@Test
    public void lireFichier() throws IOException {
        final File lFile = new File("fichier.txt");
        Assume.assumeTrue(lFile.exists());
        
        final FileInputStream lFileInputStream = new FileInputStream(lFile);
        final byte[] lBytes = new byte[16];
        lFileInputStream.read(lBytes);
        Assert.assertArrayEquals("Bonjour le monde".getBytes(), lBytes);
    }

	/*
	 * si le fichier n'existe pas, seul le test v�rifiant la pr�sence du fichier
	 * passe en �chec.
	 */
	
}