/**
 * Program used to help with lab #11 of Business Statistics.
 *
 * @author Enrico Carlos Tubigan
 * @version 0.9
 */
public class NumericDescriptiveMeasures
{
	public static void main(String[] args)
	{
		// INSERT DATA SET HERE.
		int[] data = {52, 65, 56, 55, 62, 52, 57, 51, 53, 60, 49, 64,
					  69, 62, 66, 53, 67, 53, 54, 68, 60, 66, 66, 62, 65};

		// Prints out array.
		System.out.printf("Original Array: \n%s\n\n", formatArray(data));

		// Prints out array, but its sorted in ascending order.
		System.out.printf("Sorted Array: \n%s\n\n", formatArray(sortArray(data)));

		// Prints out Mean & Median
		System.out.printf("Mean of the Data Set: %f.\n\n", getMean(data));
		System.out.printf("Median of the Data Set: %f.\n\n", getMedian(data));

	}

	/**
	 * Returns a String of the array.
	 *
	 * @param dataSet The array to be used.
	 * @return The array as a String.
	 */
	public static String formatArray(int[] dataSet)
	{
		int[] arrayCopy = copyArray(dataSet);

		String textArray = "[";

		for(int i = 0; i < arrayCopy.length; i++)
		{
			textArray += i != arrayCopy.length - 1 ? arrayCopy[i] + ", " : arrayCopy[i] + "]";

			textArray += (i + 1) % 10 == 0 ? "\n " : "";
		}

		return textArray;
	}

	/**
	 * Returns a copy of a given array.
	 *
	 * @param toCopy The array to be copied.
	 * @return The copied array.
	 */
	private static int[] copyArray(int[] toCopy)
	{
		int[] newCopy = new int[toCopy.length];

		for(int i = 0; i < toCopy.length; i++)
		{
			newCopy[i] = toCopy[i];
		}

		return newCopy;
	}

	/**
	 * Sort a given array in ascending order.
	 *
	 * @param dataSet The array that will be sorted.
	 * @return The sorted array.
	 */
	private static int[] sortArray(int[] dataSet)
	{
		int[] arrayToSort = copyArray(dataSet);

		for(int i = arrayToSort.length - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(arrayToSort[j] > arrayToSort[j+1])
				{
					int valuePlaceholder = arrayToSort[j];

					arrayToSort[j] = arrayToSort[j+1];

					arrayToSort[j+1] = valuePlaceholder;

				}
			}
		}

		return arrayToSort;
	}

	/**
	 * Calculates and returns the mean of a data set.
	 *
	 * @param dataSet The set of data to be calculated.
	 * @return The mean of the data set.
	 */
	public static double getMean(int[] dataSet)
	{
		int[] dataToCalculate = copyArray(dataSet);

		double mean = 0;

		for(int i = 0; i < dataToCalculate.length; i++)
		{
			mean += dataToCalculate[i];
		}

		return (double)(mean / dataToCalculate.length);
	}

	/**
	 * Calculates and returns the median of a data set.
	 * The data set does not need to be sorted before hand.
	 *
	 * @param dataSet The data set to be calculated.
	 * @return The median of the data set.
	 */
	public static double getMedian(int[] dataSet)
	{
		int[] arrayToCalculate = sortArray(copyArray(dataSet));

		double median = 0;

		if(arrayToCalculate.length % 2 == 0)
		{
			int middleIndex = arrayToCalculate.length / 2;

			median = (arrayToCalculate[middleIndex] + arrayToCalculate[middleIndex-1]) / 2;
		}
		else
		{
			int middleIndex = (arrayToCalculate.length - 1) / 2;

			median = arrayToCalculate[middleIndex];
		}

		return median;
	}

	/**
	 * Calculates and returns the mode of a data set.
	 *
	 * @param dataSet The data set to be calculated.
	 * @return The mode of the data set.
	 */
	public static int getMode(int[] dataSet)
	{
		// WORK IN PROGRESS
		int[] arrayToCalculate = copyArray(dataSet);

		return 0;
	}
}