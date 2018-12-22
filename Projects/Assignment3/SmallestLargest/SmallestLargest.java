public class SmallestLargest {

    public static void main(String[] args) {
        System.out.print("What is the terminating value?: "); 
        double terminator = IO.readDouble();  

        System.out.print("What are your numbers?:");
        double number = IO.readDouble();
        

        if (number == terminator) 
        {
        	IO.reportBadInput(); 
        	return; //ends program 
        }

        double biggest = number; 
        double smallest = number;

        
        double number2 = IO.readDouble();

        if (number2 == terminator) {
        	IO.reportBadInput();
        	return;
        }

        if (number2 > biggest) {
        	biggest = number2;
        }
        if (number2 < smallest) {
        	smallest = number2; 
        }



        while (number != terminator){
        	number = IO.readDouble(); 
        	if (number > biggest && number != terminator) {
        		biggest = number;
        	}
        	else if (number < smallest && number != terminator) {
        		smallest = number;
        	}

        }
        IO.outputDoubleAnswer(smallest);
        IO.outputDoubleAnswer(biggest);

    }
}
