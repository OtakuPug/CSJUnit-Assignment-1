import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * This class has tests for the methods
 * in SimpleStaticMethods. Those methods
 * must pass the tests in this class, some
 * of which must be written by you.
 * 
 * @author Jacob Schrum
 * Last modified 5/28/18
 */
public class SimpleStaticMethodsTest {

	/**
	 * These final variables are inputs and outputs for
	 * various test cases. You will need to define more
	 * in order to adequately test your code.
	 */
	
	// For testSumForEach() and testSumForEach()
	public static final int[] INT_ARRAY1 = new int[]{1,2,3,4,5,6,7,8,9};
	public static final int[] INT_ARRAY2 = new int[]{11,3,20,-62,100,5023,-32,83,1111111};
	public static final int[] INT_ARRAY3 = new int[]{1341,23,-420,-6234,12400,53023,-3,833,11111};
	public static final int[] INT_ARRAY4 = new int[]{-5,10};
	
	// For testSumForEach() and testSumForEach()
	public static final int INT_SUM1 = 45;
	public static final int INT_SUM2 = 1116257;
	public static final int INT_SUM3 = 72074;
	public static final int INT_SUM4 = 5;
	
	// For testZipMultiply(), testProduct(), and testAverages()
	public static final double[] DOUBLE_ARRAY1 = new double[]{1,2,3,4,5};
	public static final double[] DOUBLE_ARRAY2 = new double[]{6,7,8,9,0};
	public static final double[] DOUBLE_ARRAY3 = new double[]{-5,4,100000};
	public static final double[] DOUBLE_ARRAY4 = new double[]{1, 2, 7};
	public static final double[] DOUBLE_ARRAY5 = new double[]{6,3,7};
	public static final double[] DOUBLE_ARRAY6 = new double[]{6,88,9,1, 7};
	public static final double[] DOUBLE_ARRAY7 = new double[]{3,6,7,89,0};
	public static final double[] DOUBLE_ARRAY8 = new double[]{56,56,57,89};
	
	
	// For testProduct()
	public static final double DOUBLE_PRODUCT1 = 120;
	public static final double DOUBLE_PRODUCT3 = -2000000.0; 
	public static final double DOUBLE_PRODUCT5 = 126;
	public static final double DOUBLE_PRODUCT4 = 14;
	public static final double DOUBLE_PRODUCT2 = 0;
	
	// For testAverages()
	public static final double DOUBLE_AVERAGE1 = 3;
	public static final double DOUBLE_AVERAGE2 = 6;
	public static final double[] DOUBLE_AVERAGES = new double[]{DOUBLE_AVERAGE1, DOUBLE_AVERAGE2};
	public static final double DOUBLE_AVERAGE3 = 33333.0;
	public static final double DOUBLE_AVERAGE4 = 3.3333333333333335;
	public static final double[] DOUBLE_AVERAGES2 = new double[]{DOUBLE_AVERAGE3, DOUBLE_AVERAGE4};
	public static final double DOUBLE_AVERAGE5 = 5.333333333333333;
	public static final double DOUBLE_AVERAGE6 = 22.2;
	public static final double[] DOUBLE_AVERAGES3 = new double[]{DOUBLE_AVERAGE5, DOUBLE_AVERAGE6};
	
	// For testZipMultiply()
	public static final double[] ZIP_RESULT_1AND2 = new double[]{6,14,24,36,0};
	public static final double[] ZIP_RESULT_3AND4 = new double[]{-5.0, 8.0, 700000.0};
	public static final double[] ZIP_RESULT_5AND6 = new double[]{36.0, 264.0, 63.0};
	public static final double[] ZIP_RESULT_7AND8 = new double[]{168.0, 336.0, 399.0, 7921.0};
	public static final double[] ZIP_RESULT_2AND3 = new double[]{-30.0, 28.0, 800000.0};
	public static final double[] ZIP_RESULT_2AND4 = new double[]{6.0, 14.0, 56.0};
	// Allowable error in floating-point calculations
	public static final double EPSILON = 0.000001;
	
	/**
	 * 1 point
	 */
	@Test
	public void testSumStandardLoop() {
		assertEquals(INT_SUM1, SimpleStaticMethods.sumStandardLoop(INT_ARRAY1));
		assertEquals(INT_SUM2, SimpleStaticMethods.sumStandardLoop(INT_ARRAY2));
		assertEquals(INT_SUM3, SimpleStaticMethods.sumStandardLoop(INT_ARRAY3));
		assertEquals(INT_SUM4, SimpleStaticMethods.sumStandardLoop(INT_ARRAY4));
		// TODO: At least one more test case
	}

	/**
	 * 1 point
	 */
	@Test
	public void testSumForEach() {
		assertEquals(INT_SUM1, SimpleStaticMethods.sumForEach(INT_ARRAY1));
		assertEquals(INT_SUM2, SimpleStaticMethods.sumForEach(INT_ARRAY2));
		assertEquals(INT_SUM3, SimpleStaticMethods.sumForEach(INT_ARRAY3));
		assertEquals(INT_SUM4, SimpleStaticMethods.sumForEach(INT_ARRAY4));
		// TODO: At least one more test case (same as testSumStandardLoop())
	}

	/**
	 * 5 points
	 */
	@Test
	public void testZipMultiply() {
		double[] result1and2 = SimpleStaticMethods.zipMultiply(DOUBLE_ARRAY1, DOUBLE_ARRAY2);
		assertArrayEquals(ZIP_RESULT_1AND2, result1and2, EPSILON);
		double[] result3and4 = SimpleStaticMethods.zipMultiply(DOUBLE_ARRAY3, DOUBLE_ARRAY4);
		assertArrayEquals(ZIP_RESULT_3AND4, result3and4, EPSILON);
		double[] result5and6 = SimpleStaticMethods.zipMultiply(DOUBLE_ARRAY5, DOUBLE_ARRAY6);
		assertArrayEquals(ZIP_RESULT_5AND6, result5and6, EPSILON);
		double[] result7and8 = SimpleStaticMethods.zipMultiply(DOUBLE_ARRAY7, DOUBLE_ARRAY8);
		assertArrayEquals(ZIP_RESULT_7AND8, result7and8, EPSILON);
		double[] result2and3 = SimpleStaticMethods.zipMultiply(DOUBLE_ARRAY2, DOUBLE_ARRAY3);
		assertArrayEquals(ZIP_RESULT_2AND3, result2and3, EPSILON);
		double[] result2and4 = SimpleStaticMethods.zipMultiply(DOUBLE_ARRAY2, DOUBLE_ARRAY4);
		assertArrayEquals(ZIP_RESULT_2AND4, result2and4, EPSILON);
		
	}

	/**
	 * 3 points
	 */
	@Test
	public void testProduct() {
		assertEquals(DOUBLE_PRODUCT1, SimpleStaticMethods.product(DOUBLE_ARRAY1), EPSILON);
		assertEquals(DOUBLE_PRODUCT2, SimpleStaticMethods.product(DOUBLE_ARRAY2), EPSILON);
		assertEquals(DOUBLE_PRODUCT3, SimpleStaticMethods.product(DOUBLE_ARRAY3), EPSILON);
		assertEquals(DOUBLE_PRODUCT4, SimpleStaticMethods.product(DOUBLE_ARRAY4), EPSILON);
		assertEquals(DOUBLE_PRODUCT5, SimpleStaticMethods.product(DOUBLE_ARRAY5), EPSILON);
		
		// TODO: At least 3 more tests. Be sure to cover a broad range of input/output possibilities
	}

	/**
	 * 5 points
	 */
	@Test
	public void testSubStringAfter() {
		assertEquals("at", SimpleStaticMethods.subStringAfter('c', "cat"));
		assertEquals("at", SimpleStaticMethods.subStringAfter('b', "bat"));
		assertEquals("at", SimpleStaticMethods.subStringAfter('n', "gnat"));
		assertEquals("go", SimpleStaticMethods.subStringAfter('g', "doggo"));
		assertEquals("nospaces", SimpleStaticMethods.subStringAfter('h', "sentencewithnospaces"));
		assertEquals("smoothie", SimpleStaticMethods.subStringAfter('g', "bigsmoothie"));
		assertEquals("this is the text left", SimpleStaticMethods.subStringAfter(' ', "hello this is the text left"));
		assertEquals("ls &^%! pug )(!?><", SimpleStaticMethods.subStringAfter('0', "Symb0ls &^%! pug )(!?><"));
		assertEquals(" 5 70000 -0.00001 (1/2)", SimpleStaticMethods.subStringAfter('1', "numbers 2.0 1 5 70000 -0.00001 (1/2)"));
		assertEquals(" สยาม", SimpleStaticMethods.subStringAfter('?', "non-english? สยาม"));
		assertEquals("กรุงเทพมหานคร", SimpleStaticMethods.subStringAfter('ม', "ไมกรุงเทพมหานคร"));
		// TODO: At least 10 more tests. Be sure to cover a broad range of input/output possibilities
	}

	/**
	 * 5 points
	 */
	@Test
	public void testSameStart() {
		// You can directly fill these lists with values to conduct your tests
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(6);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		assertTrue(SimpleStaticMethods.sameStart(list1, list2));
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(0);
		list3.add(6);
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(5000);
		list4.add(8);
		list4.add(7);
		assertFalse(SimpleStaticMethods.sameStart(list3, list4));
		
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		list5.add(-500);
		list5.add((3));
		ArrayList<Integer> list6 = new ArrayList<Integer>();
		list6.add(-500);
		list6.add(5);
		list6.add(7);
		assertFalse(SimpleStaticMethods.sameStart(list5, list6));
		
		ArrayList<Integer> list7 = new ArrayList<Integer>();
		list7.add((2+5*5/6));
		ArrayList<Integer> list8 = new ArrayList<Integer>();
		list8.add(5+5-6);

		assertFalse(SimpleStaticMethods.sameStart(list7, list8));
		
		ArrayList<Integer> list9 = new ArrayList<Integer>();
		list9.add(100);
		list9.add(100789456);
		ArrayList<Integer> list10 = new ArrayList<Integer>();
		list10.add(100);
		list10.add(100789456);
		list10.add(4674567);
		list10.add(777777);
		list10.add(1234567876);
		list10.add(24525635);
		list10.add(234536450);
		list10.add(235356753);
		assertTrue(SimpleStaticMethods.sameStart(list9, list10));
		
		ArrayList<Integer> list11 = new ArrayList<Integer>();
		list11.add(0);
		list11.add(6);
		ArrayList<Integer> list12 = new ArrayList<Integer>();
		list12.add(5000);
		list12.add(8);
		list12.add(7);
		assertFalse(SimpleStaticMethods.sameStart(list11, list12));
		

		// TODO: At least 5 more tests. Be sure to cover a broad range of input/output possibilities
		//       Each test should create new ArrayLists from scratch and add elements to them before
		//       using either assertTrue or assertFalse to check
	}

	/**
	 * 5 points
	 */
	@Test
	public void testAverages() {
		double[][] case1 = new double[][]{DOUBLE_ARRAY1, DOUBLE_ARRAY2};
		assertArrayEquals(DOUBLE_AVERAGES, SimpleStaticMethods.averages(case1), EPSILON);
		double[][] case2 = new double[][]{DOUBLE_ARRAY3, DOUBLE_ARRAY4};
		assertArrayEquals(DOUBLE_AVERAGES2, SimpleStaticMethods.averages(case2), EPSILON);
		double[][] case3 = new double[][]{DOUBLE_ARRAY5, DOUBLE_ARRAY6};
		assertArrayEquals(DOUBLE_AVERAGES3, SimpleStaticMethods.averages(case3), EPSILON);
		
		// TODO: Write two additional tests for the averages method. 
		//       Be sure to cover a broad range of input/output possibilities.
		//       Each test consists of the declaration and initialization of
		//       a 2D array of expected results, followed by assertArrayEquals.
		//       Note that your additional test arrays should not all be the same size.
	}

}
