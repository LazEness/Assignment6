
/**
 * Author: Eli Brennan
 * Class: CSC200
 */
import javax.swing.JOptionPane;
public class ClassExercise3_5 {
	
	public static void main(String[] args) {
		
		// Set the string role equal to user input.
		// User is prompted with JOptionPane.
		
		String role = JOptionPane.showInputDialog(null, "Enter your role from the following choices:"
				+ " Administrator, Faculty, Staff, Student, Guest.");
		
		
		// Here I use switch case to add the choices.
		switch(role) {
			case "Administrator": System.out.println("Welcome <Administrator>!");
				break;
			case "Faculty": System.out.println("Welcome <Faculty>!");
				break;
			case "Staff": System.out.println("Welcome <Staff>!");
				break;
			case "Student": System.out.println("Welcome <Student>!");
				break;
			case "Guest": System.out.println("Welcome <Guest>!");
				break;
			default: System.out.println("Invalid Input");
				break;	
			
		}
		
		
	}
		
	
}

