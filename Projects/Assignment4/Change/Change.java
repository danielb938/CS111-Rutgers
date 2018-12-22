public class Change {

	public static void main(String[] args) {
			change(-10, -1); 
			
		}

	public static void change(double saleTotal, double customerPayment) {
		
		double result = customerPayment - saleTotal; 
		int dollarAmount = (int) result; 
		int centsAmount = (int)( ( result - dollarAmount ) * 100 ); //
		
		if (saleTotal == 0 || saleTotal < 0) {
			IO.reportBadInput();
				int x = -1; 
				IO.outputIntAnswer(x);
				return;
		}
		if (result < 0){
				IO.reportBadInput();
				int x = -1; 
				IO.outputIntAnswer(x);
				return;
		}

		//130 Dollar Bill
		if (dollarAmount / 130 >= 1) { 
			IO.outputIntAnswer(dollarAmount / 130); 
			dollarAmount = dollarAmount - (130 * (dollarAmount / 130));
			
		}
		else if (!(dollarAmount / 130 >= 1)) {
			IO.outputIntAnswer(0);
		}

		//55 Dollar Bill
		if(dollarAmount / 55 >= 1) {
			IO.outputIntAnswer(dollarAmount / 55);
			dollarAmount = dollarAmount - (55 * (dollarAmount / 55));
		}
		else if (!(dollarAmount / 55 >= 1)) {
			IO.outputIntAnswer(0);
		}

		//25 Dollar Bill
		if(dollarAmount / 25 >= 1) {
			IO.outputIntAnswer(dollarAmount / 25);
			dollarAmount = dollarAmount - (25 * (dollarAmount / 25));
		}
		else if (!(dollarAmount / 25 >= 1)) {
			IO.outputIntAnswer(0);
		}

		//5 Dollar Bill
		if(dollarAmount / 5 >= 1) {
			IO.outputIntAnswer(dollarAmount / 5);
			dollarAmount = dollarAmount - (5 * (dollarAmount / 5));
		}
		else if (!(dollarAmount / 5 >= 1)) {
			IO.outputIntAnswer(0);
		}

		//1 Dollar Bill
		if(dollarAmount / 1 >= 1) {
			IO.outputIntAnswer(dollarAmount / 1);
			dollarAmount = dollarAmount - (1 * (dollarAmount / 1));
		}
		else if (!(dollarAmount / 55 >= 1)) {
			IO.outputIntAnswer(0);
		}

		//.75 Cents 
		
		if (centsAmount / 75 >= 1) { 
			IO.outputIntAnswer(centsAmount / 75); 
			centsAmount = centsAmount - (75 * (centsAmount / 75));
		}
		else if (!(centsAmount / 75 >= 1)) {
			IO.outputIntAnswer(0);
		}

		//.30 cents
		
		if (centsAmount / 30 >= 1) { 
			IO.outputIntAnswer(centsAmount / 30); 
			centsAmount = centsAmount - (30 * (centsAmount / 30));
		}
		else if (!(centsAmount / 30 >= 1)) {
			IO.outputIntAnswer(0);
		}
		
		//.1 cent 
		if (centsAmount / 1 >= 1) { 
			IO.outputIntAnswer(centsAmount / 1); 
			centsAmount = centsAmount - (1 * (centsAmount / 1));
		}
		else if (!(centsAmount / 1 >= 1)) {
			IO.outputIntAnswer(0);
		} 
	  }//end change Method
}//end class 