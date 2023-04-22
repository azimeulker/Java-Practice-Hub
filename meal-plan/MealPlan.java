import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 *
 * @author Al Hochbaum
 * @version 1.1
 */
public class MealPlan
{
    public static void main(String[] args)
    {

		DecimalFormat formatter = new DecimalFormat("$#,#00.00");

		String totalCostOfVisitFormatted = "";

		boolean continueTask = true;

		int lengthOfVisit = 0;

		double mealPlanCode = 0.00,
			   totalCostOfVisit = 0.00;

		do
		{
			// Enter in days of visit.
			lengthOfVisit = getDays("Enter the number of days of the visit: ");

			continueTask = lengthOfVisit != 0;

			if(continueTask)
			{
				//Enter in the Meal plan for the visit
				mealPlanCode = getMealPlan("Enter the meal code plan (A, B, N): ");

				// calculation and out put of total cost of the visit
				totalCostOfVisit = preformCalculation(lengthOfVisit, mealPlanCode);

				System.out.printf("The total cost of the visit is %s.%n%n", totalCostOfVisitFormatted = formatter.format(totalCostOfVisit));
			}
		} while(continueTask);
		//end of main
    }

    // days method
    public static int getDays(String prompt)
    {
		Scanner keyboard = new Scanner(System.in);

		String numberOfDays = "";

		int length = 0,
			counter = 0;

		do
		{
			counter = 0;

			System.out.printf("%s", prompt);

			numberOfDays = keyboard.nextLine();
			length = numberOfDays.length();

			for(int i = 0; i < length; i++)
			{
				if(Character.isDigit(numberOfDays.charAt(i)))
				{
					counter++;
				}
			}
		} while(counter != length);

		return Integer.parseInt(numberOfDays);
	}
    // Meal plan method
	public static double getMealPlan(String prompt)
	{
		Scanner keyboard = new Scanner(System.in);

		double mealPlanValue = 0.00;

		String userInput = "";

		do
		{
			System.out.printf("%s", prompt);

			userInput = keyboard.nextLine();

			switch(userInput.toUpperCase().charAt(0))
			{
				case 'A':
					mealPlanValue = 169.00;
					break;
				case 'B':
					mealPlanValue = 112.00;
					break;
				case 'N':
					mealPlanValue = 99.99;
					break;
				default:
					mealPlanValue = 0.00;
			}
		} while(userInput.length() != 1 || mealPlanValue == 0.00);

		return mealPlanValue;
	}
   // Calculation method
	public static double preformCalculation(int lengthOfVisit, double mealPlanRate)
	{
		return mealPlanRate * lengthOfVisit;
	}
 }