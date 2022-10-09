class Main {
	public static void main(String[] args) {
		SingleDimensionArray objectOfSDA = new SingleDimensionArray(12);
		// insert elements in array
		objectOfSDA.insert(0, 0);
		objectOfSDA.insert(1, 10);
		objectOfSDA.insert(2, 20);
		objectOfSDA.insert(1, 30);
		objectOfSDA.insert(11, 120);

		// search Element in the array
		objectOfSDA.searchElementInArray(120);
		// delete an element
		objectOfSDA.deleteElement(11);
		objectOfSDA.deleteElement(12);
	}
}
