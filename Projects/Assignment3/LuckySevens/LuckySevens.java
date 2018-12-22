public class LuckySevens {
	public static void main(String[] args) {

		System.out.println("What is the lower end of the range?: ");
		int lowerBound = IO.readInt(); 

		System.out.println("What is the upper end of the range?: ");
		int upperBound = IO.readInt(); 

		if (lowerBound > upperBound) {
			int x = -1;
			IO.outputIntAnswer(x);
			return;
		}

		int numOfSevens = 0; 

		while (lowerBound <= upperBound) {
			int num = lowerBound;

			if (num < 0) {
				num = num * -1;

			}

			while ( num > 0) { 
					if (num % 10 == 7 ) {   
						numOfSevens++;
					}
					num/=10;	
				}
				lowerBound++;
		}
		IO.outputIntAnswer(numOfSevens);
	}
}