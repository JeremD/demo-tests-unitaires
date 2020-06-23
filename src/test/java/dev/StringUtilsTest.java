package dev;

import org.junit.Assert;
import org.junit.Test;

import dev.utlis.StringUtils;

/**
 * Unit test for simple App.
 */
public class StringUtilsTest {
   
	@Test
	public void testLevenshteinDistance() {
		StringUtils stringUtils = new StringUtils();
		int resultat = stringUtils.levenshteinDistance("chien", "chine");
		// distance attendu de 2
		Assert.assertEquals(2, resultat);
	}
}
