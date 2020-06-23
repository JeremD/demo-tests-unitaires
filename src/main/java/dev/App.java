package dev;

import dev.utlis.StringUtils;

/**
 * Distance Levenshtein
 * 
 * Classe éxecutable
 *
 */
public class App {
	public static void main(String[] args) {

		try {
			int distanceLevenshtein = StringUtils.levenshteinDistance(null, "instance");
			System.out.println("Distance Levenshtein : " + distanceLevenshtein);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
