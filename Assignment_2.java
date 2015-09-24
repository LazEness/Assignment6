
import java.util.Scanner;
public class Assignment_2 {

	public static void main(String[] args) {
		//Here I declared the variables as integers for the q section of the chart.
		int number1, number2, number4, number6;
		//Here I declared the variables as double for the q section of the chart.
		Double number3, number7, number8;
		//Here I declared the variable as a string for the q section of the chart.
		String number5;
		//Here I set each variable equal to it's proper expression.
		number1 = 1 / 2;
		number2 = 1 % 2;
		number3 = 1.0 / 2;
		number4 = 5 + 7 / 2;
		number5 = "Beat" + ' ' + "Army";
		number6 = 6 + 13 / 5 - 35 % 3;
		number7 = 3.5 * (5/4);
		number8 = (3.5 * 5)/4;
		//Here I output the value of the variables using printf formatting with %d, %f, and %s.
		System.out.printf("The following are the outputs for the chart for Assignment 2: %d, %d, %.1f, %d, %s, %d, %.1f, %.3f", number1, number2, number3, number4, number5, number6, number7, number8);
		//Here I ask for input from the user.
		System.out.println("Now please input 5 numbers and I will compute the sum and average of them.");
		//Here I declare the variables for the input as double.
		Double input1, input2, input3, input4, input5, sum, average;
		Scanner keyboard = new Scanner(System.in);
		//Here I set the variables equal to the keyboard input using keyboard.nextDouble().
		input1 = keyboard.nextDouble();
		input2 = keyboard.nextDouble();
		input3 = keyboard.nextDouble();
		input4 = keyboard.nextDouble();
		input5 = keyboard.nextDouble();
		//Here I compute the sum and average of the variables.
		sum = input1 + input2 + input3 + input4 + input5;
		average = (input1 + input2 + input3 + input4 + input5)/5;
		System.out.println("The sum of the numbers is " + sum + " and the average is " + average);
		
	}

}
