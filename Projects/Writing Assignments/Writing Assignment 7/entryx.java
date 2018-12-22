public class entryx {
	public static void main(String[] args) {
		char[][] myArray = { {'x','g','x'}, {'d','x','x'}, {'x','x','g'}, {'x','x','x','x','x'} };
		
		System.out.println(findRow(myArray));
	}
	public static int findRow(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != 'x') {
					break;
				}
				count++;
				if (count == arr[i].length) { //if count equals the amount of 'x''s then return the index
					return i;
				}
			}//end inner for loop
		}//end outer for loop
		return -1;
	}
}