public class Student {

	private String name;
	private Double[] assignments = new Double[4];
	private String letterGrade;

	public Student(){
		this.name  = "";
		this.letterGrade = "";
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAssignments(Double[] weightNumbers){
		this.assignments = weightNumbers;
	}
	public Double[] getAssignments(){
		return assignments;
	}
	public void setLetterGrade(String letterGrade){
		this.letterGrade = letterGrade;
	}
	public String getLetterGrade(){
		return letterGrade;
	}
	public static double calculateAverage(Double[] weightNumbers, Double[] gradeNumbers){
		double weightedAverage = 0;
		Double [] weightGradeArray = new Double[4];
		for(int c = 0; c < weightNumbers.length; c++){
			weightGradeArray[c] = (weightNumbers[c] * gradeNumbers[c]);
		}
		for (double b : weightGradeArray){
    			weightedAverage += b;
		}
		return weightedAverage;
	}			
	public String toString(){
		return "Student name: " + this.name + " Student assignments: " + this.assignments + " Student letter grade: " + this.letterGrade + ".";
	}

		
}