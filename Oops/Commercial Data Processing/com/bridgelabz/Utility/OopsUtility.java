/******************************************************************************
 *  Purpose: This is utility file which contains logic for files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Ranjith G C
 *  @since   03-06-2021
 *
 ******************************************************************************/

package com.bridgelabz.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class OOPsUtility {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * Purpose: for scanning integer from user
	 * 
	 * Identifier: json
	 * 
	 * @return returns int which is taken from console
	 */
	public static int integerScanner() {
		return scanner.nextInt();
	}

	/**
	 * Purpose: for scanning String from user
	 * 
	 * Identifier: json
	 * 
	 * @return returns string which is taken from console
	 */
	public static String stringScanner() {
		return scanner.next();
	}
	
	public static long longScanner() {
		return scanner.nextLong();
	}

	/**
	 * Purpose: for scanning String single word from user
	 * 
	 * Identifier: json
	 * 
	 * @return returns string which is taken from console
	 */
	public static String stringSingleWordScanner() {
		return scanner.next();
	}

	/**
	 * Purpose: for scanning Char from user
	 * 
	 * Identifier: json
	 * 
	 * @return returns char which is taken from console
	 */
	public static char charScanner() {
		return scanner.next().charAt(0);
	}

	
	/**
	 * Purpose: method for calculate total value of stock
	 * 
	 * @param numberOfShares input from program
	 * @param sharePrice     input from program
	 * @return returns the multiplication of numberOfShares sharePrice
	 */
	public static int calculateTotalValueOfStock(int numberOfShares, int sharePrice) {
		return numberOfShares * sharePrice;
	}

	/**
	 * Purpose: method for creating message using regex
	 * 
	 * @param fullname input from user
	 * @param mobile   input from user
	 * @return returns the message
	 */
	public static String message(String fullname, String mobile, String str) {

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String firstName = fullname.substring(0, fullname.indexOf(' '));
		String strInput = str;
		String str1 = strInput.replaceAll("<<name>>", firstName);
		String str2 = str1.replaceAll("<<fullname>>", fullname);
		String str3 = str2.replaceAll("xxxxxxxxxx", mobile);
		String str4 = str3.replaceAll("Date", dateFormat.format(date));

		return str4;

	}

}