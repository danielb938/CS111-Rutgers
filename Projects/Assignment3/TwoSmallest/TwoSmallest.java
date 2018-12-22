public class TwoSmallest {

	public static void main(String[] args) {
		System.out.print("What is the terminating value?: ");  
		double terminator = IO.readDouble();  

		System.out.print("What are your numbers?: "); 
		
		//first number 
		double number = IO.readDouble(); 

		while (number == terminator) { 
			IO.reportBadInput(); 
			System.out.print("What are your numbers?: ");  
			number = IO.readDouble();   
		}

		//second number
		double number2 = IO.readDouble(); 

		while (number2 == terminator) { 
			IO.reportBadInput();
			System.out.print("What are your numbers?: ");
			number2 = IO.readDouble();   
		} 

		double smallest = 0; 
		double small = 0;

		if (number < number2) {  
			smallest = number;  
			small = number2; 	 
		}
		if (number2 < number) { 
			smallest = number2; 
			small = number; 
		} 
		if (number == number2) {
			smallest = number;
			small = number2; 
		}
		 
		double number3 = IO.readDouble(); 

		while (number3 != terminator) {    
				if (number3 <= smallest) { 
					small = smallest; 
					smallest = number3;    	   
				}
				if (number3 > smallest && number3 < small) { 
					small = number3; 
				}

			number3 = IO.readDouble();
		}

		IO.outputDoubleAnswer(smallest);
		IO.outputDoubleAnswer(small);
	}
}