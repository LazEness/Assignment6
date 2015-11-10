import javax.swing.JOptionPane;
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

public class GUI<AccountTypes> extends Application {
	//Here are the account types that I have created with enum type.

	public static void main(String[] args) {
		launch(args);
		

	}

	@Override
	public void start(Stage primaryStage)  {
		int submit;
		User user1 = new User();
		primaryStage.setTitle("Authentication");
		Text PasswordHelp = new Text();
		Text EmailError = new Text();
		Text Error = new Text();
		Text PasswordError = new Text();
		Text PasswordError2 = new Text();
		PasswordHelp.setText("Password must include one character from each category: \n Uppercase characters, Lowercase characters, Base 10 digits,\n and Nonalphanumeric characters");
		EmailError.setText("Email is invalid.");
		Error.setText("The highlighted fields cannot be empty.");
		PasswordError.setText("Password mismatch.");
		PasswordError2.setText("Password needs one character from each list.");
		Label passwordHelpLabel = new Label("");
		Label errorLabel = new Label("");
		Label emailErrorLabel = new Label("");
		Label passwordErrorLabel = new Label("");
		Label passwordErrorLabel2 = new Label("");
		Error.setFill(Color.RED);
		EmailError.setFill(Color.RED);
		PasswordError.setFill(Color.RED);
		PasswordError2.setFill(Color.RED);
		Label nameLabel = new Label("Name");
		Label lastNameLabel = new Label("Last Name");
		Label emailLabel = new Label("Email");
		Label usernameLabel = new Label("Username");
		Label passwordLabel = new Label("Password");
		Label confirmPasswordLabel = new Label("Confirm Password");
		TextField nameTextField = new TextField();
		TextField lastNameTextField = new TextField();
		TextField emailTextField = new TextField();
		TextField usernameTextField = new TextField();
		PasswordField passwordTextField = new PasswordField();
		PasswordField confirmPasswordTextField = new PasswordField();
		ComboBox<AccountTypes> accountTypesComboBox = new ComboBox<>();
		Button signUpbtn = new Button("Sign Up");
		accountTypesComboBox.getItems().setAll( (AccountTypes[]) TypesOfAccounts.AccountTypes.values());
		signUpbtn.setOnAction(new EventHandler<ActionEvent>() { 
			String inputUsername = "";
			String inputPassword = "";
			String confirmPassword = "";
			String inputName = "";
			String inputLastName = "";
			String inputEmail = "";
			
			//AccountTypes inputAccountType = AccountTypes.guest;
			@Override
			public void handle(ActionEvent arg0) {
				String inputConfirmPassword;
				inputName = (nameTextField.getText());
				user1.setName(inputName);
				inputLastName = lastNameTextField.getText();
				user1.setLastName(inputLastName);
				inputEmail = emailTextField.getText();
				user1.setEmail(inputEmail);
				inputUsername = usernameTextField.getText().toLowerCase();
				user1.setUsername(inputUsername);
				inputPassword = passwordTextField.getText();
				user1.setPassword(inputPassword);
				inputConfirmPassword = confirmPasswordTextField.getText();
				user1.setConfirmPassword(inputConfirmPassword);
				
				if (inputEmail.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")){
					EmailError.setVisible(false);
				}
				if (!inputPassword.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}")){
					PasswordError2.setVisible(true);
				}
				if (!inputLastName.equals("")){
					lastNameTextField.setStyle("-fx-border-color: transparent;");
					Error.setVisible(false);	
				}
				if (!inputName.equals("")){
					nameTextField.setStyle("-fx-border-color: transparent;");
					Error.setVisible(false);	
				}
				if (!inputEmail.equals("")){
					emailTextField.setStyle("-fx-border-color: transparent;");
					Error.setVisible(false);	
				}
				if (!inputPassword.equals("")){
					passwordTextField.setStyle("-fx-border-color: transparent;");
					Error.setVisible(false);	
				}
				if (!inputConfirmPassword.equals("")){
					confirmPasswordTextField.setStyle("-fx-border-color: transparent;");
					Error.setVisible(false);
				}
				if (!inputUsername.equals("")){
					usernameTextField.setStyle("-fx-border-color: transparent;");
					Error.setVisible(false);	
				}
				if (inputUsername.equals("")){
					usernameTextField.setStyle("-fx-border-color: red;");
					Error.setVisible(true);
				}
				
				if (inputPassword.equals("")){
					passwordTextField.setStyle("-fx-border-color: red;");
					Error.setVisible(true);
				}
				if (inputConfirmPassword.equals("")){
					confirmPasswordTextField.setStyle("-fx-border-color: red;");
					Error.setVisible(true);
				}
				if (!inputConfirmPassword.equals(inputPassword)){
					PasswordError.setVisible(true);
				}
				if (inputConfirmPassword.equals(inputPassword)){
					PasswordError.setVisible(false);
				}
				if (inputEmail.equals("")){
					emailTextField.setStyle("-fx-border-color: red;");
					Error.setVisible(true);
				}
				
				if (inputName.equals("")){
					nameTextField.setStyle("-fx-border-color: red;");
					Error.setVisible(true);
				}
				
				if (inputLastName.equals("")){
					lastNameTextField.setStyle("-fx-border-color: red;");
					Error.setVisible(true);
				}	
				if (!inputEmail.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")){
					EmailError.setVisible(true);
				}
				if (inputPassword.matches("(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])")){
					PasswordError2.setVisible(false);
				}
				if (!Error.isVisible() && !EmailError.isVisible() && (!PasswordError.isVisible())){
					JOptionPane.showMessageDialog(null, user1.toString());
				}
			}});
		GridPane grid = new GridPane();
		grid.add(PasswordHelp,3,5);
		grid.add(Error,0,7);
		Error.setVisible(false);
		grid.add(EmailError,3,2);
		EmailError.setVisible(false);
		grid.add(PasswordError,2,4);
		grid.add(PasswordError2,3,4);
		PasswordError.setVisible(false);
		PasswordError2.setVisible(false);
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.add(nameLabel,0,0);
		grid.add(nameTextField,1,0);
		grid.add(lastNameLabel,0,1);
		grid.add(lastNameTextField,1,1);
		grid.add(emailLabel,0,2);
		grid.add(emailTextField,1,2);
		grid.add(usernameLabel,0,3);
		grid.add(usernameTextField,1,3);
		grid.add(passwordLabel,0,4);
		grid.add(passwordTextField,1,4);
		grid.add(confirmPasswordLabel, 0,5);
		grid.add(confirmPasswordTextField, 1,5);
		grid.add(accountTypesComboBox,0,6);
		grid.add(signUpbtn,1,7);
		
		Scene scene = new Scene(grid,900,900);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		}
	}

	
