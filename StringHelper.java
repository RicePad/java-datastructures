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
    


// 1. write basic scenario
// 2. write @test annotation
// 3. write void function and label it with appropriate scenario
// 4. use either assert, true or false. 
// 5. optional: @before and @after annotation
// 6. @BeforeClass: must be of static void. only executes ones before the class. use for the database connnection.
                    //concerns with performance.
// 7. @AfterClass:  must be of static void. only executes ones before the class. use for the database connnection.
                    //concerns with performance.

//8. assertArrayEquals(). Array comparisson with different memory addresses.
//9. @Test(expected=NullPointerException.class); use test a try and catch exception.
//10. @Test(timeout=100); use to test performance on how fast an algorithm is.

}