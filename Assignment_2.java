
import java.util.Scanner;
public class Assignment_2 {

	public static void main(String[] args) {
		int q1, q2, q4, q6;
		Double q3, q7, q8;
		String q5;
		q1 = 1 / 2;
		q2 = 1 % 2;
		q3 = 1.0 / 2;
		q4 = 5 + 7 / 2;
		q5 = "Beat" + ' ' + "Army";
		q6 = 6 + 13 / 5 - 35 % 3;
		q7 = 3.5 * (5/4);
		q8 = (3.5 * 5)/4;
		System.out.printf("The following are the outputs for the chart for Assignment 2: %d, %d, %.1f, %d, %s, %d, %.1f, %.3f", q1, q2, q3, q4, q5, q6, q7, q8);
		System.out.println("Now please input 5 numbers and I will compute the sum and average of them.");
		Double in1, in2, in3, in4, in5, sum, average;
		Scanner keyboard = new Scanner(System.in);
		in1 = keyboard.nextDouble();
		in2 = keyboard.nextDouble();
		in3 = keyboard.nextDouble();
		in4 = keyboard.nextDouble();
		in5 = keyboard.nextDouble();
		sum = in1 + in2 + in3 + in4 + in5;
		average = (in1 + in2 + in3 + in4 + in5)/5;
		System.out.println("The sum of the numbers is " + sum + " and the average is " + average);
		
	}

}
