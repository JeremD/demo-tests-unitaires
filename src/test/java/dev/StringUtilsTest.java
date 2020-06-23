package dev;

import org.junit.Assert;
import org.junit.Test;

import dev.utlis.StringUtils;

/**
 * Unit test for simple App.
 */
public class StringUtilsTest {
   
	@Test
	public void testLevenshteinDistanceDifference() {
		int resultat = StringUtils.levenshteinDistance("chien", "chine");
		// distance attendu de 2
		Assert.assertEquals(2, resultat);
	}

	@Test (expected = NullPointerException.class)
	public void testLevenshteinDistanceNull() {
		int resultat = StringUtils.levenshteinDistance(null, null);
		// exception null attendu
		Assert.assertEquals(null, resultat);
	}
	
	
}
