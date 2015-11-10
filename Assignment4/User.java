public class User extends TypesOfAccounts {
		
		private String name;
		private String lastName;
		private String email;
		private String username;
		private String password;
		private String confirmPassword;
		private AccountTypes accountType;
		
		public User(){
			this.name = "";
			this.lastName = "";
			this.email = "";
			this.username = "";
			this.password = "";
			this.confirmPassword = "";
			this.accountType = AccountTypes.guest;
		}
		public User(String name){
			this.name = name;
			this.lastName = "";
			this.email = "";
			this.username = "";
			this.password = "";
			this.confirmPassword = "";
			this.accountType = AccountTypes.guest;
		}
		public User(String name, String lastName){
			this.name = name;
			this.lastName = lastName;
			this.email = "";
			this.username = "";
			this.password = "";
			this.confirmPassword = "";
			this.accountType = AccountTypes.guest;
		}
		public User(String name, String lastName, String email){
			this.name = name;
			this.lastName = lastName;
			this.email = email;
			this.username = "";
			this.password = "";
			this.confirmPassword = "";
			this.accountType = AccountTypes.guest;
		}
		public User(String name, String lastName, String email, String username){
			this.name = name;
			this.lastName = lastName;
			this.email = email;
			this.username = username;
			this.password = "";
			this.confirmPassword = "";
			this.accountType = AccountTypes.guest;
		}
		public User(String name, String lastName, String email, String username, String password){
			this.name = name;
			this.lastName = lastName;
			this.email = email;
			this.username = username;
			this.password = password;
			this.confirmPassword = "";
			this.accountType = AccountTypes.guest;
		}
		public User(String name, String lastName, String email, String username, String password, AccountTypes accountType){
			this.name = name;
			this.lastName = lastName;
			this.email = email;
			this.username = username;
			this.password = password;
			this.confirmPassword = "";
			this.accountType = accountType;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirmPassword() { 
			return confirmPassword;
		}
		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		public AccountTypes getAccountType() {
			return accountType;
		}

		public void setAccountType(AccountTypes accountType) {
			this.accountType = accountType;
		}
		public String toString(){
			return "Name is "+ this.name + ", last name is " + this.lastName +
					", email is " + this.email + ", username is " + this.username + ", password is " + this.password +
					", and account type is " + this.accountType + ".";
		}
		

	}

