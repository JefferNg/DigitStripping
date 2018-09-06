import java.util.Scanner;
public class DigitStripping
	{

		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				
				fillArray();
				reportAmountOfDigits();
				reportOddNumbers();
				addingDigits();
				roundingToNearestTen();
				

			}

		private static void fillArray()
			{
				
				
				int[] numbers = new int[6];
				
				System.out.println("Input a 6 digit number");
				int userNumbers = userInput.nextInt();				
				
				for(int i = 0; i < numbers.length; i++)
					{
						
						numbers[i] = userNumbers % 10;
						userNumbers = userNumbers / 10;
						
						
						
						
						
						System.out.println(numbers[i]);
						
					}
				
				
				
				
				
				
				
				
			}

		private static void reportAmountOfDigits()
			{
				
				System.out.println("Input numbers");
				int numbers = userInput.nextInt();
				
				
				
				
				
				
				
			}

		private static void reportOddNumbers()
			{
				// TODO Auto-generated method stub
				
			}

		private static void addingDigits()
			{
				// TODO Auto-generated method stub
				
			}

		private static void roundingToNearestTen()
			{
				// TODO Auto-generated method stub
				
			}

	}
