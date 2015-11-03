import java.util.Scanner;


public class ClassExercise2_1 {
	
		public static void main(String[] args) {
				int first, second, third, fourth, fifth, sixth, seventh, eigth, ninth, tenth, sum, average; //Here I initialize the variables
						Scanner keyboard1 = new Scanner(System.in);//Here I create a new keyboard 1 and 2.
								Scanner keyboard2 = new Scanner(System.in);
										keyboard1.useDelimiter(","); //Delimeter is here and is a comma.
												//I use the \n to go to a new line during the instructions.
														System.out.println("Please enter 10 number each followed by a commma \n and I will find the average: ");
																//I set the user's numbers equal to each position with the comma being the delimiter.
																		first = keyboard1.nextInt();
																				second = keyboard1.nextInt();
																						third = keyboard1.nextInt();
																								fourth = keyboard1.nextInt();
																										fifth = keyboard1.nextInt();
																												sixth = keyboard1.nextInt();
																														seventh = keyboard1.nextInt();
																																eigth = keyboard1.nextInt();
																																		ninth = keyboard1.nextInt();
																																				tenth = keyboard1.nextInt();
																																						//To make it easy on myself I calculate the sum first, the the average. I know it is easy enough to just include it all in the same line.
																																								sum = first + second + third + fourth + fifth + sixth + seventh + eigth + ninth + tenth;
																																										average = sum / 10;
																																												//Here I print out the average.
																																														System.out.println("The average of the numbers is " + average + " .");
																																																
																																																		
																																																			}

																																																			}

