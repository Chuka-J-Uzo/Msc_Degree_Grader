/* Practical Programming Assignment 1
 * Assessment Task (PART A) -
 * This program simulates the Module Grading in the "York grading project"
 * - It takes marks (e.g. 65) as parameter and returns a grade (e.g. “Good”)
 * - It can prompt the user for input from the keyboard and validate a mark in the range until a valid input has been taken
 */



import java.util.Scanner; // Import the "Scanner" function required for receiving input below.

public class ModuleGrader // Create Module Grader class here.
{
	// Then declare and assign our variables first
	int mark; // grade mark variable for "Grade module" method
	int mark_2; // grade mark variable for "Get Valid Module" Mark method
	int module_mark; // module marks variable for "Start Module Grading method" 
	
	
	public void gradeModule() //"Grade module method" starts here
	{
		
		// First create a new scanner object to receive user input
		Scanner input = new Scanner(System.in); 
		
		System.out.println("\n" + "Please enter your mark below to get your grade:" + "\n");
		// Then use scanner to accept a user mark input(Integer type)
		mark = input.nextInt(); 
		
		// Conditional statements below to evaluate user mark input and return appropriate grade
		if (mark >= 70 & mark <= 100 ) {
			System.out.println("Module grade: " + "Excellent!");
			} else if (mark >= 60 & mark <= 69 ) {
				System.out.println("Module grade: " +"Good!" );
				}else if (mark >= 50 & mark <= 59 ) {
					System.out.println("Module grade: " + "Satisfactory!");
					} else if (mark >= 40 & mark <= 49 ) {
						System.out.println("Module grade: " + "Compensatable fail!");
						} else if (mark >= 0 & mark <= 39 ) {
							System.out.println("Module grade: " + "Outright fail!");
							}//End of all conditional statements.		
	} //End of "Grade module method"
		
	
	public void getValidModuleMark() //"Get Valid Module Mark method" starts here
	{
		// First create a new scanner object to receive user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n" +"Please enter your mark below to get your grade:" + "\n");
		// Use scanner to accept a user mark input (integer type)
		mark_2 = input.nextInt();
		
		// Conditional statements below to receive and validate user mark input
		if (mark_2 >0 && mark_2 <=100 ) {
			System.out.println("Your mark entry, "+ mark_2 +" is "+"ACCEPTABLE!");
			} else{
				System.out.println("Wrong entry! Mark must be between 0 - 100:");
				}//End of all conditional statements.
	}// End of "Get Valid Module Mark method".	
		
	
	public void startModuleGrading() //"Start Module Grading method" begins here
	{
		// First create a new scanner object to receive user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n"+"*********** Module Grading Program *********" +"\n");
		System.out.println("Please enter a module mark you would like to grade.");
		// Then use scanner to accept a module mark input(Integer type)
		module_mark = input.nextInt();
		
		// Conditional statements below to receive and validate user module mark input
		if (module_mark>0 && module_mark <=100) {
			System.out.println("Your mark , "+ module_mark +" is "+"VALID!" + "\n");
			System.out.println("\n" + "If you would like to continue grading 'y' for YES or 'n' for NO" + "\n");
			} else if( module_mark >100) {
				System.out.println("Wrong entry! Mark must be between 0 - 100:");
			}
		
		String answer; // New variable to receive "yes" or "no" inputs
		answer = input.next();
		
		// Conditional statements below to receive and evaluate module mark input
		if (answer.equals("y")) {
			if (module_mark >= 70 & module_mark <= 100 ) {
				System.out.println("Module grade: " + "Excellent!");
				} else if (module_mark >= 60 & module_mark <= 69 ) {
	            	System.out.println("Module grade: " +"Good!" );
	            	}else if (module_mark >= 50 & module_mark <= 59 ) {
	                	System.out.println("Module grade: " + "Satisfactory!");
	                	} else if (module_mark >= 40 & module_mark <= 49 ) {
	                    	System.out.println("Module grade: " + "Compensatable fail!");
	                    	} else if (module_mark >= 0 & module_mark <= 39 ) {
	                    		System.out.println("Module grade: " + "Outright fail!");
	                    		}
			} else if(answer.equals("n")){
				System.out.println("Good bye!");
				} //End of all conditional statements.
			
	} //End of "Start Module Grading method" 		   
}//End of "Module Grader" class 
