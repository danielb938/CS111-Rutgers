public class noElements {
	public static void main(String[] args) {
		int[] myArray = {3};
		int[] myArray2 = {4};

		System.out.println("The length of the first array is " + myArray.length); //length of an empty array is 0
		System.out.println(tester(myArray, myArray2));
	}
	public static boolean tester(int[] a, int[] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
				return false;
				}
			}
		}
		return true;
	}
}