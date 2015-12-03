/**
 * @author Eli Brennan CSC200
 * @version 12/3/2015
 * 
 */
import java.util.Scanner;
public class DayDriver {

		public static void main(String [] args){
			// Initializes variables
			String inputDay;
			int inputDaysAdded;
			// creates a day construct
			Day day1 = new Day();
			Scanner keyboard1 = new Scanner(System.in);
			System.out.println("Please enter the day.");
			// gets input for day
			inputDay = keyboard1.nextLine();
			// uses Day methods to set the day up and print the day
			day1.setDay(inputDay);
			day1.findIndex();
			day1.printDay();
			// returns the day, the next day, and the previous day
			System.out.println("The day you have chosen is " + day1.getDay() + ".");
			System.out.println("The next day of the week is " + day1.nextDay() + ".");
			System.out.println("The previous day of the week is " + day1.previousDay() + ".");
			System.out.println("Now please input the amount of days you would like to add to"
					+ " the original day and I will calculate it for you.");
			inputDaysAdded = keyboard1.nextInt();
			// outputs the calculated day
			System.out.println("The calculated day is " + day1.calculateDay(inputDaysAdded) + ".");
		}
}
