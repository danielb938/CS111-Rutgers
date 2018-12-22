public class insertsort {
	public static void main(String[] args) {
		int[] array = {5,7,3,12,6,9,4,5,3,2};

		sort(array);
		printArray(array);
	}
	public static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) { //start at 1 bc we are comparing this to the first element of the sorted region
			int itemToInsert = a[i];
			
			//looking at sorted region
			for (int j = i - 1; j >= 0; j-- ) {
				if (a[j] > itemToInsert) {
					a[j + 1] = a[j];
					a[j] = itemToInsert;
				}
			}//end second for loop 
		}//end first for loop 
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}