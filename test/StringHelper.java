package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class StringHelper {

	public static String truncateAInFirst2Positions(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") 
				+ stringMinusFirst2Chars;
	}

	public static boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
    }
    
    @Test
    public void testTruncateA(){
        String message = "AABCD => BC";
        assertEquals("BC", truncateAInFirst2Positions("AABCD"), message);
    }

    

}