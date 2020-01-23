import java.util.ArrayList;
import java.util.Scanner;

/**
 * Most of the following methods are incomplete.
 * Complete all methods according to the provided
 * specifications. Your methods must also pass the
 * provided tests in ScannerMethodsTest,
 * along with other tests you will write.
 * 
 * @author Jacob Schrum
 * Last modified 5/28/18
 */
public class ScannerMethods {
	
	/**
	 * 6 points
	 * 
	 * Return the first int token contained in the provided
	 * Scanner, even if non-int tokens precede it. Non-int tokens
	 * preceding the first int are discarded. If no such int is found, 
	 * then throw an IllegalArgumentException. 
	 * @param scan Scanner containing tokens (at least one int token)
	 * @return The first int found in the scanner
	 */
	public static int firstInt(Scanner scan) {
	
	
		while(scan.hasNext()) {
			if(scan.hasNextInt()) {
				return scan.nextInt();
			}
			scan.next();
		}
		
	
		throw new IllegalArgumentException("The Scanner must contain an integer!");
	}
	
	/**
	 * 6 points
	 * 
	 * Count the number of tokens contained in a Scanner
	 * of a finite data stream (not from the console).
	 * All tokens that are counted are discarded from 
	 * the Scanner.
	 * @param scan Scanner on finite stream of data
	 * @return number of tokens in Scanner
	 */
	public static int countTokens(Scanner scan) {
		int counter = 0;
		while(scan.hasNext()) {
			scan.next();
		counter++;
		}
		
		return counter; // TODO
	}
	
	/**
	 * 6 points
	 * 
	 * Count number of lines contained in a Scanner
	 * of a finite data stream (not from the console).
	 * All lines that are counted are discarded from
	 * the Scanner.
	 * @param scan scan Scanner on finite stream of data
	 * @return number of lines in Scanner
	 */
	public static int countLines(Scanner scan) {
		int counter = 0;
		while(scan.hasNextLine()) {
			counter++;
			scan.nextLine();
		}
		return counter;
	}
	
	/**
	 * 7 points
	 * 
	 * Take all lines from a Scanner connected to a finite
	 * data source and store them in an ArrayList in the order
	 * they are encountered.
	 * @param scan Scanner of finite data stream (not console)
	 * @return ArrayList of String lines from Scanner
	 */
	public static ArrayList<String> getLines(Scanner scan) {
		ArrayList<String> linesAr = new ArrayList<String>();
		while(scan.hasNextLine()) {
			linesAr.add(scan.nextLine());
		}
		return linesAr;
	}
}
