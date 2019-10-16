package PublicLibrary;

public class MyArray
{

	public static void main(String[] args)
	{
		int[] myArrayInt = new int[0];
		double[] myArrayDouble = new double[0];
		String[] myArrayString = new String[0];
		
		myArrayInt = expandArrayInt(myArrayInt, 4);
		myArrayInt = expandArrayInt(myArrayInt, 20);
		myArrayInt = expandArrayInt(myArrayInt, 42);
		myArrayInt = expandArrayInt(myArrayInt, 45);
		myArrayInt = expandArrayInt(myArrayInt, 48);
		for (int i = 0; i < myArrayInt.length; i++)
		{
			System.out.println(myArrayInt[i]);
		}
		
		System.out.println(myArrayInt);
		
		myArrayDouble = expandArrayDouble(myArrayDouble, 4.7);
		myArrayDouble = expandArrayDouble(myArrayDouble, 2.775);
		myArrayDouble = expandArrayDouble(myArrayDouble, 42);
		myArrayDouble = expandArrayDouble(myArrayDouble, 45.98);
		myArrayDouble = expandArrayDouble(myArrayDouble, 48.003);
		for (int i = 0; i < myArrayDouble.length; i++)
		{
			System.out.println(myArrayDouble[i]);
		}
		
		System.out.println(myArrayDouble);
		
		myArrayString = expandArrayString(myArrayString, "a");
		myArrayString = expandArrayString(myArrayString, "ab");
		myArrayString = expandArrayString(myArrayString, "abc");
		myArrayString = expandArrayString(myArrayString, "ABC");
		myArrayString = expandArrayString(myArrayString, "efg");
		for (int i = 0; i < myArrayString.length; i++)
		{
			System.out.println(myArrayString[i]);
		}
			
		System.out.println(myArrayString);
		
		
	}
	// Method

	// Modifier: public static
	// Return type: int[]
	// Method Nmae expandArray
	// Parms: int [] myArray, int value

	
	// int
	public static int[] expandArrayInt(int[] myArray, int value)
	{
		int[] tempArray = new int[myArray.length + 1];
		for (int i = 0; i < myArray.length; i++)
		{
			tempArray[i] = myArray[i];
		}
		tempArray[tempArray.length - 1] = value;
		return tempArray;
	}

	// double
	public static double[] expandArrayDouble(double[] myArrayDouble, double value)
	{
		double[] tempArray = new double[myArrayDouble.length + 1];
		for (int i = 0; i < myArrayDouble.length; i++)
		{
			tempArray[i] = myArrayDouble[i];
		}
		tempArray[tempArray.length - 1] = value;
		return tempArray;
	}
	
	// String
		public static String[] expandArrayString(String[] myArrayString, String value)
		{
			String[] tempArray = new String[myArrayString.length + 1];
			for (int i = 0; i < myArrayString.length; i++)
			{
				tempArray[i] = myArrayString[i];
			}
			tempArray[tempArray.length - 1] = value;
			return tempArray;
		}
	
}
