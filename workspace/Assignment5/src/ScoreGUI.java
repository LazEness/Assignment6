
import javax.swing.JOptionPane;
import java.util.Arrays;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScoreGUI extends Application {
	//;
	//double Scores[]=new double[4];
	//double Weight[]=new double[4];
	double weightedAverage;
	public static void main(String[] args) {
		launch(args);
		

	}



	@Override
	public void start(Stage primaryStage)  {
		int submit;
		double [] GradeArray = {0,0,0,0};
		double [] WeightArray = {0,0,0,0};
		primaryStage.setTitle("Grade Calculator");
		Label nameLabel = new Label("Name");
		Label weightQueryLabel = new Label("Please enter a list of the weight of each of the four grades indicated above in decimal form with a space in between each"); 
		Label gradeQueryLabel = new Label("Please enter a list of the four grades with a space in between each.");
		TextField nameTextField = new TextField();
		TextField weightTextField = new TextField();
		TextField gradeTextField = new TextField();
		Button calculateButton = new Button("Calculate");
		
		calculateButton.setOnAction(new EventHandler<ActionEvent>() { 
			@Override
			public void handle(ActionEvent arg0){
				Student student1 = new Student();
				student1.setName(nameTextField.getText());
				//double GradeInput = Double.parseDouble(gradeTextField.getText());
				String GradeInputS = gradeTextField.getText();
				String [] GradeArray = GradeInputS.split(" ");
				Double[] gradeNumbers = new Double[GradeArray.length];
				for(int i = 0;i < GradeArray.length;i++){
				   gradeNumbers[i] = Double.parseDouble(GradeArray[i]);
				   
				}
				//double WeightInput = Double.parseDouble(weightTextField.getText());
				String WeightInputS = weightTextField.getText();
				String [] WeightArray = WeightInputS.split(" ");
				Double[] weightNumbers = new Double[WeightArray.length];
				for(int j = 0;j < WeightArray.length;j++){
				   weightNumbers[j] = Double.parseDouble(WeightArray[j]);
				}
				student1.setAssignments(weightNumbers); 
				weightedAverage = Student.calculateAverage(weightNumbers, gradeNumbers);
				JOptionPane.showMessageDialog(null, "The weighted average is " + weightedAverage + ".");
				String letterGrade = null;
				if ((weightedAverage/10) >= 9){
					letterGrade = "A";
				}else if ((weightedAverage/10) >= 8){
					letterGrade = "B";
				}else if ((weightedAverage/10) >= 7){
					letterGrade = "C";
				}else if ((weightedAverage/10) >= 6){
					letterGrade = "C";
				}else if ((weightedAverage/10) >= 5){
					letterGrade = "D";
				}else {
					letterGrade = "F";	
				}
				student1.setLetterGrade(letterGrade);
				JOptionPane.showMessageDialog(null, "The student's grade is an " + letterGrade + ".");
				JOptionPane.showMessageDialog(null, student1.toString());
		}});
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.add(nameLabel,0,0);
		grid.add(gradeQueryLabel,0,2);
		grid.add(weightQueryLabel,0,4);
		grid.add(nameTextField,0,1);
		grid.add(gradeTextField,0,3);
		grid.add(weightTextField,0,5);
		grid.add(calculateButton,0,6);
		
		Scene scene = new Scene(grid,900,900);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		}
	}

	