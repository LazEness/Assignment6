import java.util.Scanner;

public class Rectangle {;

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
	
		double  width, height, perimeter, area;

		System.out.println("Input width and height of a rectangle and I will return a perimeter and an area of that rectangle.");

		width = keyboard.nextDouble();

		height = keyboard.nextDouble();

		perimeter = (width * 2) + (height * 2);

		area = width * height;
		
		System.out.println("The perimeter of the rectangle is " + perimeter + " and the area is " + area);

	}

}