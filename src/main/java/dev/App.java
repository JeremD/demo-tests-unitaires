package dev;

import dev.utlis.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int distanceLevenshtein = StringUtils.levenshteinDistance("distance", "instance");
    	System.out.println("Distance Levenshtein : " + distanceLevenshtein);
    }
}
