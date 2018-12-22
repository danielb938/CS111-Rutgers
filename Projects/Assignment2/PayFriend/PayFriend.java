public class PayFriend {
	public static void main(String[] args) {
		double moneyReceived = IO.readDouble();
		double moneyTotal = moneyReceived; 

		//Condition 1
		if (moneyReceived > 0 && moneyReceived <= 100) {
			moneyTotal = moneyTotal + 5; 
		}

		//Condition 2 
		if (moneyReceived > 100 && moneyReceived < 1000) {
			
			double threePercent = moneyTotal * 1.03;
			double six = moneyTotal + 6; 
			
			if (threePercent > six) {
				moneyTotal = threePercent;
			} else {
				moneyTotal = six;
			}
		}

		//Condition 3
		if (moneyReceived >= 1000 && moneyReceived < 10000) {
			double onePercent = moneyTotal * 1.01;
			double fifteen = moneyTotal + 15;

			if (onePercent > fifteen) {
				moneyTotal = onePercent;
			} else {
				moneyTotal = fifteen; 
			}
		}

		//Condition 4
		if (moneyReceived >= 10000) {
			moneyTotal = 10000 * 1.01;
	
		}
	
		if (moneyReceived > 10000) {
			if (moneyReceived > 10000 && moneyReceived <= 15000) {
				double extra = moneyReceived - 10000;
				extra = extra * 1.02;
				moneyTotal = moneyTotal + extra; 
			} else {
				
				moneyTotal = moneyTotal + (5000 * 1.02);	
			}
		}
		
		if (moneyReceived > 15000) {
			double extra2 = moneyReceived - 15000;
			double extra3 = extra2 * 1.03;
			moneyTotal = moneyTotal + extra3;
		}
		
		double fee = moneyTotal - moneyReceived;
		IO.outputDoubleAnswer(fee);
	}
}