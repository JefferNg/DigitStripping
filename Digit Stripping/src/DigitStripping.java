import java.util.Scanner;
public class DigitStripping
	{

		static Scanner userInput = new Scanner(System.in);
		static int numbers;
		static int digits;
		static int[] userNumbers;
		static int sum;
		
		public static void main(String[] args)
			{
				
				//fillArray();
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
				numbers = userInput.nextInt();
				int originalNumber = numbers;
				
				digits = 0;
				
				while(numbers != 0)
				{		
					numbers = numbers / 10;										
					digits++;			
				}
				
				numbers = originalNumber;
				
				System.out.println(digits);
				
				userNumbers = new int[digits];
			}

		private static void reportOddNumbers()
			{
				int oddNumbers = 0;
				for(int i = 0; i < userNumbers.length; i++)
					{
						
						userNumbers[i] = numbers % 10;
						numbers = numbers / 10;
						
						if(userNumbers[i] % 2 == 1)
							{
								
								oddNumbers++;
								
							}
						
						
						
					}
				
				System.out.println(oddNumbers);
				
				
				
				
				
				
				
				
				
				
			}

		private static void addingDigits()
			{
				
				sum = 0;
				
				for(int i = 0; i < userNumbers.length; i++)
					{
						
						sum += userNumbers[i];
						
						
						
					}
				
				
				System.out.println(sum);
				
				
			}

		private static void roundingToNearestTen()
			{
				
				sum = sum / 10;
				
				System.out.println(sum + "0");
				
				
				
			}

	}
