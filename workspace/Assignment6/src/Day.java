/**Day class that has various methods to manipulate the day
 * @author Eli Brennan CSC200
 * @version 12/3/2015
 * 
 */
public class Day {
	
		String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		private String day; 
		int index; 
		
			/**Day Constructor
			 * 
			 */
			public Day(){
				this.day = "";
			}
			/**Loaded Day Constructor
			 * @param day         A String day that is part of the week. 
			 */
			public Day(String day){
				this.day = day;
			}
			
			/**Method that returns the day.
			 * 
			 */
			public String getDay() {
				return day;
			}
			/**Method that sets the day.
			 * @param day         A String day that is part of the week.      
			 */
			public void setDay(String day) {
				this.day = day;
			}
			
			
				/**This methods associates the string with an index to use in other methods using switch case
				 * 
				 * 
				 */
			public void findIndex(){
				switch(day.toLowerCase()){
				case "monday": index = 0;
					break;
				case "tuesday": index = 1; 
					break;
				case "wednesday": index = 2;
					break;	
				case "thursday": index = 3;
					break;
				case "friday": index = 4;
					break;
				case "saturday": index = 5;
					break;
				case "sunday": index = 6;
					break;
				default: index = 0;
					break;
				}
			}
			
				/** Method to return next day
				 * @return days				Days is the array created in this class from Monday to Sunday.
				 */
			public String nextDay(){
				if (index != 6){
					return days [index + 1];
				}else{
					return days[0];
				}
			}
				/** Method to return previous day
				 * @return days				Days is the array created in this class from Monday to Sunday.
				 */
			public String previousDay(){
				if (index != 0){
					return days[index - 1];
				}else{
					return days[6];
				}
				
			}
				/** This method uses some basic math to make sure the remainder doesn't mess with the answer
				 * @param daysAdded						Number of days that will be added.
				 * @return days[this.index]            The day of the week.
				 */
			public String calculateDay(int daysAdded){
				if(index + (daysAdded % 7) > 7){
					this.index = (index + (daysAdded % 7)) -7;
					return days[this.index];
				}else{
					this.index = index + (daysAdded % 7);
					return days[this.index];
				}
			}
				/** Prints the day
				 */
			public void printDay(){
				System.out.println(day);
			}
					
}
