
/*
* File name: NemoReefTours.java
* Purpose: Nemo Reef Tours Management System
* Student Id: 12093185
* Student Name: Pragneshkumar Rameshbhai Suthar
* Last Modified by: Pragneshkumar Rameshbhai Suthar
* Last Modified Date: 03/1/2019
*/

import java.util.Scanner;

// The NemoReedTOurs class will allow staff at Nemo Reef Tours to compute the cost of a group of passengers to take the tour
public class NemoReefTours
{
	// Main method of Nemo Reef Tours program
	public static void main(String[] args)
	{
		// CHARGE_PER_PERSON is a Constant variable which store flat fee for one person
		final double CHARGE_PER_PERSON = 85.50;
		// minimumNumberOfPassengers variable is used to store Minimum number of
		// passenger among all value
		int minimumNumberOfPassengers = Integer.MIN_VALUE;
		// maximumNumberOfPassengers variable is used to store Maximum number of
		// passenger among all value
		int maximumNumberOfPassengers = Integer.MAX_VALUE;
		// averageNumberOfPassenger variable is used to store average number of
		// passengers
		double averageNumberOfPassenger = 0.00;
		// totalChargeCollected variable is used to hold Total charge at end
		double totalChargeCollected = 0.00;
		// Initialize maximumName variable which store Booking Name which has maximum
		// number of passengers
		String maximumName = "";
		// Initialize minimumName variable which store Booking Name which has minimum
		// number of passengers
		String minimumName = "";
		// Create inputBookingName scanner object which use to read booking name from
		// user
		Scanner inputBookingName = new Scanner(System.in);
		// Create inputNumberOfPassengers scanner object which use to read Number of
		// passengers from user
		Scanner inputNumberOfPassengers = new Scanner(System.in);
		// Create Constant variable N which is Highest in the Student id 12093185
		final int N = 4; // BM -- Changed by Marker
		// Create Constant variable STUDENT_ID which store student id
		final int STUDENT_ID = 12093185;
		// Different Constant variable which store different discount rate
		final int DISCOUNT_RATE_ZERO = 0;
		final int DISCOUNT_RATE_TEN = 10;
		final int DISCOUNT_RATE_FIFTEEN = 15;
		final int DISCOUNT_RATE_TWENTY = 20;
		// totalCharge variable which store Total charge for group of passengers
		double totalCharge;
		// This variable use to store Discount
		double discount;
		// This variable use to store Total number of passengers
		double totalPassengers = 0.00;
		// Display Welcome message
		System.out.println("Welcome to the Nemo Reef Tours Management System");
		System.out.println();
		// This variable use to increase counter
		int incrementNumber = 1;
		// for loop use to iterate till N
		for (int i = 0; i < N; i++)
		{
			// Read Booking name from user
			System.out.print("Please enter booking name " + incrementNumber + " ==> ");
			// store booking name into bookingName variable
			String bookingName = inputBookingName.nextLine();
			// This if condition check the booking name cannot be blank
			if (bookingName.length() == 0)
			{
				System.out.println("ERROR booking name cannot be blank");
				i--;
			}
			else
			{
				int count = 0;
				// While loop checks numberOfPassangers must be greater than zero
				while (count == 0)
				{
					System.out.print("Enter the number of passengers for " + bookingName + " ==> ");
					int numberOfPassengers = inputNumberOfPassengers.nextInt();
					if (numberOfPassengers <= 0)
					{
						System.out.println("ERROR number of passengers must be greater than zero");
						count = 0;
					}
					else
					{
						// totalPassengers variable store total number of passengers
						totalPassengers = numberOfPassengers + totalPassengers;
						count = 1;
						incrementNumber++;
					}
					/*
					 * This if condition check the passengers between 0 and 2 and calculate
					 * totalCharge, discount and totalChargeCollected
					 */
					if (numberOfPassengers > 0 && numberOfPassengers <= 2)
					{
						totalCharge = CHARGE_PER_PERSON * numberOfPassengers;
						discount = totalCharge * DISCOUNT_RATE_ZERO / 100;
						totalCharge = totalCharge - discount;
						totalChargeCollected = totalChargeCollected + totalCharge;
						// This statement use to display output of total charge for number of passengers
						System.out.printf("The tour charges for " + bookingName + " for " + numberOfPassengers
								+ " passenger(s) is $%.2f", totalCharge);
						System.out.println(" ");
					}
					/*
					 * This if condition check the passengers between 2 and 5 and calculate
					 * totalCharge, discount and totalChargeCollected
					 */
					else if (numberOfPassengers > 2 && numberOfPassengers <= 5)
					{
						totalCharge = CHARGE_PER_PERSON * numberOfPassengers;
						discount = totalCharge * DISCOUNT_RATE_TEN / 100;
						totalCharge = totalCharge - discount;
						totalChargeCollected = totalChargeCollected + totalCharge;
						System.out.printf("The tour charges for " + bookingName + " for " + numberOfPassengers
								+ " passenger(s) is $%.2f", totalCharge);
						System.out.println(" ");
					}
					/*
					 * This if condition check the passengers between 5 and 10 and calculate
					 * totalCharge, discount and totalChargeCollected
					 */
					else if (numberOfPassengers > 5 && numberOfPassengers <= 10)
					{
						totalCharge = CHARGE_PER_PERSON * numberOfPassengers;
						discount = totalCharge * DISCOUNT_RATE_FIFTEEN / 100;
						totalCharge = totalCharge - discount;
						totalChargeCollected = totalChargeCollected + totalCharge;
						System.out.printf("The tour charges for " + bookingName + " for " + numberOfPassengers
								+ " passenger(s) is $%.2f", totalCharge);
						System.out.println(" ");
					}
					/*
					 * This if condition check the passengers between 10 and more and calculate
					 * totalCharge, discount and totalChargeCollected
					 */
					else if (numberOfPassengers > 10)
					{
						totalCharge = CHARGE_PER_PERSON * numberOfPassengers;
						discount = totalCharge * DISCOUNT_RATE_TWENTY / 100;
						totalCharge = totalCharge - discount;
						totalChargeCollected = totalChargeCollected + totalCharge;
						System.out.printf("The tour charges for " + bookingName + " for " + numberOfPassengers
								+ " passenger(s) is $%.2f", totalCharge);
						System.out.println(" ");
					}
					/*
					 * This If condition use to find the maximum and minimum number of passengers
					 * from booking
					 */
					if (numberOfPassengers > 0)
					{
						if ((i == 0) || (numberOfPassengers > maximumNumberOfPassengers))
						{
							maximumNumberOfPassengers = numberOfPassengers;
							maximumName = bookingName;
						}
						if ((i == 0) || (numberOfPassengers < minimumNumberOfPassengers))
						{
							minimumNumberOfPassengers = numberOfPassengers;
							minimumName = bookingName;
						}
					}
				}
				System.out.println(" ");
			}
		}
		// averageNumberOfPassenger variable use to store Average number of passengers
		averageNumberOfPassenger = totalPassengers / N;
		// The below code is used to display Statistical information for Nemo Reef Tours
		System.out.println();
		System.out.println("Statistical information for Nemo Reef Tours");
		System.out.println();
		// Display Booking Name which has Maximum number of passengers
		System.out.println("Booking: " + minimumName + " has  the minimum number of  " + minimumNumberOfPassengers
				+ " passenger(s)");
		// Display Booking Name which has Minimum number of passengers
		System.out.println("Booking: " + maximumName + " has  the maximum number of  " + maximumNumberOfPassengers
				+ " passenger(s)");
		// Display Average number of passengers
		System.out.printf("The average number of passengers per booking is: %.2f passengers\n",
				averageNumberOfPassenger);
		// Display Total charges collected
		System.out.printf("The total charges collected is %.2f\n", totalChargeCollected);
		System.out.println();
		System.out.println();
		System.out.println("Thank you for using the Nemo Reef Tours Management System");
		System.out.println("Program written by " + STUDENT_ID);

	}

}
