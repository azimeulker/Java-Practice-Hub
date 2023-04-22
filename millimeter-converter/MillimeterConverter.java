/*
 * Name: Azime Ulker
 *Program: Business Information Technology
 *Course: ADEV-1008 Programming 1
 *Created:2022-10-21
 */

/**
 *This program converts inches to millimeters.
 *
 *@author Azime Ulker
 *@version 1.0
 */

public class MillimeterConverter
{
	public static void main(String[] args)
	{
		//declares variables
		int number1 = 2;
		int number2 = 5;
		int number3 = 10;

		//declares variables to calculate millimeter
		double millimeter = 25.4;

		//creates calculations
		double cal1 = number1 * millimeter;
		double cal2 = number2 * millimeter;
		double cal3 = number3 * millimeter;

		//output

		System.out.println("2 inches is equal to " + cal1 + ".");
		System.out.println("5 inches is equal to " + cal2 + ".");
		System.out.println("10 inches is equal to " + cal3 + ".");
	}
}