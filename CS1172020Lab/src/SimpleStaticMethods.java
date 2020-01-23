import java.util.ArrayList;

/**
 * Most of the following methods are incomplete.
 * Complete all methods according to the provided
 * specifications. Your methods must also pass the
 * provided tests in SimpleStaticMethodsTest,
 * along with other tests you will write.
 * 
 * @author Jacob Schrum
 * Last modified 5/28/18
 */
public class SimpleStaticMethods {

	/**
	 * This method is given, but you must write unit tests for it.
	 * 
	 * Compute the sum of elements in an array using
	 * a standard for loop 
	 * @param array integers
	 * @return sum of input array
	 */
	public static int sumStandardLoop(int[] array) {
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}
	
	/**
	 * 3 points
	 * 
	 * Compute the sum of elements in an array using
	 * a for-each loop
	 * @param array integers
	 * @return sum of input array
	 */
	public static int sumForEach(int[] array) {
		int total = 0;
		for(int x: array) {
			total += x;
		}
		return total; // TODO
	}

	/**
	 * 3 points
	 * 
	 * Given an array of doubles, return the product of all
	 * the numbers in the array.
	 * (if the array has length 0, a value of 1 will be returned)
	 * @param array of doubles
	 * @return product of all array values
	 */
	public static double product(double[] array) {
		int total = 1;
		if(array.length == 0) {
			return 1;
		} else {
			if(array.length > 0) {
				
				for(double x: array) {
					total *= x;
				}
				return total;
			}
		}
		return Double.NaN; 
	}

	/**
	 * 5 points
	 * 
	 * Takes two arrays and multiplies pairs of doubles from
	 * each array together to create a new array containing
	 * the products. Specifically, the i-th index of the
	 * result array contains a1[i]*a2[i]. The result array
	 * length equals that of the smaller input array. Extra
	 * elements in the larger input array (if sizes differ)
	 * are ignored.
	 * @param a1 array of doubles
	 * @param a2 array of doubles
	 * @return array of products of doubles from two input arrays
	 */
	public static double[] zipMultiply(double[] a1, double[] a2) {
		
		// result has length of shorter input array
		
		double[] result = new double[(int) Math.min(a1.length, a2.length)];
		double[] resultArray = new double[(int) result.length];
		for(int i = 0; i < result.length; i++) {
			resultArray[i] += (a1[i]*a2[i]); 
		}
	
		return resultArray;
	}
	
	/**
	 * 4 points
	 * 
	 * If a given character x is in a given string, then
	 * return the substring of characters after 
	 * the first occurrence of x.
	 * Otherwise return the empty string. 
	 * This can be accomplished without any loops at
	 * all if you use methods of the String class.
	 * Check the Java API for String.
	 * 
	 * @param x character to search for
	 * @param s string to get a substring from (not null)
	 * @return substring after first x, if it exists, else ""
	 */
	public static String subStringAfter(char x, String s) {
		
		int indexOfChar = s.indexOf(x);
		int sub1 = (indexOfChar+1);
		int sub2 = (s.length());
		if(sub2 <= s.length()) {
			String result = s.substring(sub1, sub2);
			return result;
		} else {
			return "";
		}
	}
	
	/**
	 * 5 points
	 * 
	 * Indicate if two ArrayLists of Integers start with the same
	 * sequence of elements. Specifically, the length of the shorter 
	 * list is used, and only those elements in the two lists are 
	 * compared. In other words, check if the beginning portion of 
	 * one list matches the entirety of another list. If either list
	 * is empty, then a result of true is returned.
	 * @param list1 First ArrayList of Integers
	 * @param list2 Second ArrayList of Integers
	 * @return Whether elements in shorter list match the
	 *         first elements of the longer list in the same order.
	 */
	public static boolean sameStart(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		int size = Math.min(list1.size(), list2.size());
		boolean result = false;
		for(int i = 0; i < size; i++) {
			
			if(!(list1.get(i).equals(list2.get(i)))) {
				return false;
			}
		}
		return true; // TODO
	}
	
	/**
	 * 5 points
	 * 
	 * Given a (potentially jagged) 2D array, treat each sub-array
	 * as a collection of numbers, and determine the average across
	 * those numbers. The final result is an array with one element for
	 * each sub-array in the input, which equals the average of the
	 * values in that sub-array. Simply put, given an array of arrays,
	 * return an array of averages.
	 * 
	 * @param arrayOfArrays array of arrays of numbers, where each sub-array has a length of at least 1
	 * @return array of averages of the sub-arrays of the input
	 */
	public static double[] averages(double[][] arrayOfArrays) {

		double[] result = new double[arrayOfArrays.length];

		//for each row
		for(int i = 0; i < arrayOfArrays.length; i++) {	
			
			//for each sub array index
			for(int j = 0; j < arrayOfArrays[i].length; j++) {
			
				result[i] += arrayOfArrays[i][j];
			
				if(j == (arrayOfArrays[i].length - 1)) {
					result[i] = result[i]/arrayOfArrays[i].length;
			
				}
				
				//TODO: complete sum
			}

		}
		// TODO
		return result;
	}
}
