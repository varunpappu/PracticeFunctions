##Sum of two numbers in an ArrayList is equal to the Target
##If a target is achieved the values in that Index should not be used again.

##Eg: ArrayList { -9, 1, 0 , 0 , 5, 5, 3, 3} and target = 8
##Result: {-9, 1}, {5, 3}, {5 ,3} and not {-9,1}, {5,3}, {5,3}, {5,3},{5,3}


public static void SumofTwoNumbers(ArrayList<Integer> arr, int target) {
		ArrayList<Integer> duplicate = arr;
		for (int i = 0; i < arr.size() - 1; i++) {
			for (int j = 1; j < arr.size(); j++) {
				if (duplicate.get(i) + duplicate.get(j) == target) {
					System.out.println("{" + duplicate.get(i) + ", "
							+ duplicate.get(j) + "}");
					duplicate.set(i, 0);
					duplicate.set(j, 0);
				}
			}
		}
}