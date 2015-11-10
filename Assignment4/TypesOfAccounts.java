public class TypesOfAccounts{
public enum AccountTypes{
		administrator ("administrator"), guest("guest"), staff("staff"),
		student("student"), faculty("faculty");
		private final String accountType;

	    private AccountTypes( String accountType) {
	        this.accountType = accountType;
	    }
	}
}