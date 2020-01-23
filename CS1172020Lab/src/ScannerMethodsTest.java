import static org.junit.Assert.*;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This class has tests for the methods
 * in ScannerMethods. Those methods
 * must pass the tests in this class, some
 * of which must be written by you.
 * 
 * NOTE: Your tests must use the declared fileScanner
 *       as well as String Scanners which you define.
 * 
 * @author Jacob Schrum
 * Last modified 5/28/18
 */
public class ScannerMethodsTest {

	/**
	 * A file that will be created to test Scanner methods.
	 * The file should contain at least 10 lines that have
	 * a variety of different types of data. Test a broad
	 * range of possibilities.
	 */
	public static File file;
	public static Scanner fileScanner;
	
	// TODO: Define more lines of text.
	public static final String LINE1 = "This is the first line of text";
	public static final String LINE2 = "This is the 2 nd line of text";
	public static final String LINE3 = "90 This is the a number first";
	public static final String LINE4 = "This is a double last 2.2";
	public static final String LINE5 = "random a b c d f g 2.1 0.5 gh 20 k 2.7 random";
	public static final String LINE6 = "This is the 6sixth6 line of text";
	public static final String LINE7 = "This is 7 the seventh line of text 7";
	public static final String LINE8 = "This is the first line of text";
	public static final String LINE9 = "This is the first line of text";
	public static final String LINE10 = "This is the first line of text";

	/**
	 * 5 points
	 * 
	 * Create a file for a Scanner to read from.
	 * Code is executed before any tests are run.
	 * @throws FileNotFoundException Problem creating file
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws FileNotFoundException {
		file = new File("temp.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println(LINE1);
		pw.println(LINE2);
		pw.println(LINE3);
		pw.println(LINE4);
		pw.println(LINE5);
		pw.println(LINE6);
		pw.println(LINE7);
		pw.println(LINE8);
		pw.println(LINE9);
		pw.println(LINE10);
		// TODO: Write more lines defined in static final String variables above
		pw.close();
	}

	/**
	 * Delete the file created for the Scanner tests.
	 * Code is executed after all tests in this class.
	 */
	@AfterClass
	public static void tearDownAfterClass() {
		file.delete();
	}
	
	/**
	 * Create file scanner before each test.
	 * @throws FileNotFoundException problem reading file.
	 */
	@Before
	public void setUp() throws FileNotFoundException {
		fileScanner = new Scanner(file);
	}

	/**
	 * Close file scanner after each test
	 */
	@After
	public void tearDown() {
		fileScanner.close();
	}

	/**
	 * 5 points
	 */
	
	@Test
	public void testFirstInt() {
		// TODO: At least 4 tests. Be sure to cover a broad range of input/output possibilities.
		//       Use both the fileScanner and newly declared String Scanners.
		assertEquals(90, ScannerMethods.firstInt(new Scanner(LINE3)));
		assertEquals(20, ScannerMethods.firstInt(new Scanner(LINE5)));
		assertEquals(7, ScannerMethods.firstInt(new Scanner(LINE7)));
		assertEquals(2, ScannerMethods.firstInt(fileScanner));
		
		// Verify that an exception occurs
		
		
		
		boolean exception = false;
		try {
			// No ints in line
			// TODO: Method call that intended to create an exception
			assertEquals(1, ScannerMethods.firstInt(new Scanner("a b c d")));
		} catch(IllegalArgumentException e) {
			exception = true;
		}
		
		assertTrue(exception);
		
	}

	/**
	 * 6 points
	 */
	@Test
	public void testCountTokens() {
		// TODO: At least 6 tests. Be sure to cover a broad range of input/output possibilities.
		//       Use both the fileScanner and newly declared String Scanners.
		assertEquals(7, ScannerMethods.countTokens(new Scanner(LINE1)));
		assertEquals(8, ScannerMethods.countTokens(new Scanner(LINE2)));
		assertEquals(7, ScannerMethods.countTokens(new Scanner(LINE3)));
		assertEquals(6, ScannerMethods.countTokens(new Scanner(LINE4)));
		assertEquals(14, ScannerMethods.countTokens(new Scanner(LINE5)));
		assertEquals(79, ScannerMethods.countTokens(fileScanner));
	}

	/**
	 * 4 points
	 */
	@Test
	public void testCountLines() {
		assertEquals(10, ScannerMethods.countLines(fileScanner)); 
		assertEquals(5, ScannerMethods.countLines(new Scanner("a\rb\rc\rd\re")));
		
		// TODO: At least 2 tests. Make one test that reads from the fileScanner, 
		//       and another test that reads from a String Scanner with carriage returns.
	}


	/**
	 * 5 points
	 */
	@Test
	public void testGetLines() {
		ArrayList<String> lines = ScannerMethods.getLines(fileScanner);
		assertEquals(LINE1, lines.get(0));
		assertEquals(LINE2, lines.get(1));
		assertEquals(LINE3, lines.get(2));
		assertEquals(LINE4, lines.get(3));
		assertEquals(LINE5, lines.get(4));
		assertEquals(LINE6, lines.get(5));
		assertEquals(LINE7, lines.get(6));
		assertEquals(LINE8, lines.get(7));
		assertEquals(LINE9, lines.get(8));
		assertEquals(LINE10, lines.get(9));
		
		
		// TODO: Check all other lines in file
	}

}
