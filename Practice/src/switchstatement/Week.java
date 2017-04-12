package switchstatement;

public class Week {

	public void taskToDo(Day day){
		switch(day){
		
		case MONDAY:
			System.out.println("I work and then I will work on CodeLab");
			break;
		case TUESDAY:
			System.out.println("CodeLab is due");
			break;
		case WEDNESDAY:
			System.out.println("Complete the Homework and submit");
			break;
		case THURSDAY:
			System.out.println("Start reading data structure book");
			break;
		case FRIDAY:
			System.out.println("Practice Git");
			break;
		case SATURDAY:
			System.out.println("Data structure class starts");
			break;
		case SUNDAY:
		    System.out.println("Homework is due and take the quiz");
			break;
		}
	}
}
