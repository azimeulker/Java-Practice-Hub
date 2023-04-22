/*
 * Name: Azime Ulker
 *Program: Business Information Technology
 *Course: ADEV-1008 Programming 1
 *Created:2022-10-21
 */

/**
 *This program converts kilograms to pounds
 *
 *@author Azime Ulker
 *@version 1.0
 */

public class PoundConverter
{
    public static void main(String[] args)
    {

		//declares values
    	int number1 = 10;
    	int number2 = 50;
    	int number3 = 100;

    	//declares a value to make pount calculation
    	double pound = 0.454;

    	//create calculations
    	double convert1 = number1 * pound;
    	double convert2 = number2 * pound;
    	double convert3 = number3 * pound;

    	//outputs
    	System.out.println("10 kilograms is equal to " + convert1 + ".");
    	System.out.println("50 kilograms is equal to " + convert2 + ".");
    	System.out.println("100 kilograms is equal to " + convert3 + ".");
    }
}


