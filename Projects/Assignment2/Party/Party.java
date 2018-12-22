public class Party {
	public static void main(String[] args) {
		
		//First Problem
		System.out.print("Enter the number of people attending the party: ");
		int numPeople = IO.readInt();
		


		//Second Problem
		System.out.print("Enter the number of slices of pizza each person should be able to eat: ");
		int numEatSlice = IO.readInt();	
		int totalSlices = numPeople * numEatSlice; 


		//Third Problem
		System.out.print("Enter the number of cans of soda each person should be able to drink: ");	
		int numDrinkCan = IO.readInt();
		int totalCans = numPeople * numDrinkCan;


		//Fourth Problem
		System.out.print("Enter the cost of a pizza pie: ");		
		double numCostPie = IO.readDouble();
		


		//Fifth Problem
		System.out.print("Enter the number of slices in a pizza pie: ");
		int numSlicePie = IO.readInt();
		int numPies = totalSlices / numSlicePie;

		if (totalSlices % numSlicePie > 0) {
			numPies = numPies + 1; 
		}


		//Sixth Problem
		System.out.print("Enter the cost of a case of soda: ");
		double numCostCase = IO.readDouble();
		


		//Seventh Problem
		System.out.print("Enter the number of cans in a case of soda: ");
		int numCanCase = IO.readInt();
		int numCase = totalCans / numCanCase; 

		if (totalCans % numCanCase > 0) {
			numCase = numCase + 1;
		}
		
		//Price of hosting party
		double pizzaPrice = numPies * numCostPie;
		double casePrice = numCase * numCostCase;
		double total = pizzaPrice + casePrice;
		IO.outputDoubleAnswer(total);
	}
}