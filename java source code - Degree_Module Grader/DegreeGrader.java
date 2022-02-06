/* Practical Programming Assignment 1
 * Assessment Task (PART B) -
 * This program simulates the Degree Classification Grading in the "York grading project"
 * - It can take four first attempt module results as parameters and return the degree classification   
 * - It can prompt the user to input from the keyboard all module averages
 */

import java.util.Scanner; // Import the "Scanner" function required for receiving input below.



public class DegreeGrader // Degree Grader class starts here.
{
	    // Then declare and assign our variables first
		int allModuleAv; // "All Module Average" variable 
		int IsmModlAv; // "Independent Study Module Average" variable 
		int nomCompFailCredits; // number of "Compensatable Failed Modules" variable 
		int noOutrightFailModls; // number of "Outright Failed Modules" variable 
		int results; // grade results variable 
		
		
		//"Grade Degree method" begins here and takes four parameters
		public void gradeDegree(int allModuleAv, int IsmModlAv, int nomCompFailCredits, int noOutrightFailModls) 	
		{
			// Conditional statements below to receive and evaluate four user inputed parameters
			if (allModuleAv >=70 && IsmModlAv >=70 && IsmModlAv <=100 && nomCompFailCredits == 0) {
				System.out.println("\n" + "Degree Classification: " +"Distinction!");
				} else if (allModuleAv >=60 && IsmModlAv >=60 && IsmModlAv <=69 && nomCompFailCredits <= 15) {
					System.out.println("\n" +"Degree Classification: " +"Merit!" );
					}else if (allModuleAv >=50 && IsmModlAv >=50 && IsmModlAv <=59 && nomCompFailCredits <= 30) {
						System.out.println("\n" + "Degree Classification: " +"Pass!" );
						}else if (IsmModlAv >=0 && IsmModlAv <=39 && nomCompFailCredits <= 30 && noOutrightFailModls ==2) {
							System.out.println("\n" + "Degree Classification: " +"Fail!" );
							} else {System.out.println("\n" + "Invalid entry combinations" );
			} // End of all conditional statements
		} //End of "gradeDegree" method
				
		
		
		public void getValidModuleMark() // "Get Valid Module Mark" method starts here
		{
			// First create a new scanner object to receive user input
			Scanner input = new Scanner(System.in);
			
			System.out.println("\n" + "Please enter an ISM Module Average to be evalUated: ");
			System.out.println("Note, Value below must be in the range of 0 - 100: " + "\n");
			// input ISM module average mark below 
			IsmModlAv = input.nextInt();
			// Conditional statements below testing for "VALIDITY"
			if (IsmModlAv >0 && IsmModlAv <=100) {
					System.out.println("Your ISM Module Average entry, "+ IsmModlAv +" is "+"ACCEPTABLE!");	
					} else {
						System.out.println("Wrong entry! Please enter a correct value:"  + "\n");
						}
			
			System.out.println("Now enter 'Number of Compensatable Fails' to be evaluated below: ");
			System.out.println("Note, Value below must be in the range of 0 - 180: " + "\n");
			// input number of Compensatable Failed Modules below 
			nomCompFailCredits = input.nextInt();
			// Conditional statements below to VALIDATE received input
			if (nomCompFailCredits >0 && nomCompFailCredits <=180) {
					System.out.println("Your Number of Compensatable Failed creditS, "+ nomCompFailCredits +" is "+"VALID!");
					} else {
						System.out.println("Wrong entry! Please enter a correct value:" + "\n");
						}
			
			System.out.println("Now enter 'Number of Outright Failed Modules' to be evaluated below: ");
			System.out.println("Note, Value below must be in the range of 0 - 11: " + "\n");
			// input number of Outright Failed Modules below
			noOutrightFailModls = input.nextInt();
			// Conditional statements below to VALIDATE received input
			if (noOutrightFailModls >0 && noOutrightFailModls <=11) {
				System.out.println("Your 'Number of Outright Failed Modules', "+ noOutrightFailModls +" is "+"VALID!");			
				} else {
					System.out.println("Wrong entry! Please enter a correct value:" + "\n");
					} // End of all conditional statements
		} // End of "Get Valid Module Mark" method 
		
		
		
		public void startDegreeGrading() // Start Degree Grading method starts here
		{
			Scanner input = new Scanner(System.in);
			System.out.println("\n" + "*********** Degree Classification Program *********" + "\n");
			System.out.println("Please enter results in range of 0 - 100 to be graded below: " + "\n");
			
			results = input.nextInt(); // receive results input for validation and grading
			
			// Conditional statements below to VALIDATE received input
			if (results>0 && results <=100) {
				System.out.println("Your mark , "+ results +" is "+"VALID!" + "\n");
				} else if(results >100) {
					System.out.println("INVALID entry! Program exiting."  + "\n");
					System.exit(0);
					}
			System.out.println("\n" + "Would you like to continue grading? 'y' for YES or 'n' for NO");
			String answer; // New variable to receive "yes" or "no" inputs
			answer = input.next();
			
			// Conditional statements below to receive and evaluate module grade input
			if(answer.equals("n")){
				System.out.println("Okay, thanks for trying. Goodbye!" + "\n");
				}
			if (answer.equals("y")) {
				if (results >= 70 & results <= 100 ) {
		        	System.out.println("Module grade: " + "Excellent!");
		        	} else if (results >= 60 & results <= 69 ) {
		            	System.out.println("Module grade: " +"Good!" );
		            	}else if (results >= 50 & results <= 59 ) {
		                	System.out.println("Module grade: " + "Satisfactory!");
		                	} else if (results >= 40 & results <= 49 ) {
		                    	System.out.println("Module grade: " + "Compensatable fail!");
		                    	} else if (results >= 0 & results <= 39 ) {
		                    		System.out.println("Module grade: " + "Outright fail!");
		                    		}  
				}// End of all conditional statements
			} // End of Degree Grading Method
		

}// End of Degree Grader class
