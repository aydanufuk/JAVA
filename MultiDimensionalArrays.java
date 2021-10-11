
public class MultiDimensionalArrays {
	public static void main(String[] args) {

		// creating 2d array

		int[][] arr2d = { 
							{ 1, 2, 3 }, 
							{ 4, 5, 6, 7 }, 
							{ 8 } 
						};

		// row number
		System.out.println("Row number: " + arr2d.length);

		// calculating the length of each row

		for (int idx = 0; idx < arr2d.length; ++idx) {
			System.out.println("Length of row " + (idx + 1) + ": " + arr2d[idx].length);
		}
		/*
		 * System.out.println("Length of row 1: " + arr2d[0].length);
		 * System.out.println("Length of row 2: " + arr2d[1].length);
		 * System.out.println("Length of row 3: " + arr2d[2].length);
		 */

		// printing the 2d array using loops
		System.out.println("printing the 2d array using loops");
		for (int idx = 0; idx < arr2d.length; ++idx) {
			for (int jdx = 0; jdx < arr2d[idx].length; ++jdx) {
				System.out.print(arr2d[idx][jdx] + " ");

			}
			System.out.println();
		}

		// printing the elements of the array using foreach loop
		System.out.println("Printing the elements using for each loop");
		for (int[] innerArray : arr2d) {
			for (int data : innerArray) {
				System.out.print(data + " ");
			}
			System.out.println();
		}

		// initializing 3d array

		int[][][] arr3d = { { 
								{ 1, 2, 3 }, 
								{ 4, 5, 6 }, 
							}, 
							{ 
								{ 7, 8, 9 }, 
								{ 10, 12,13} 
							} 
						};

		// printing the elements of 3dimensional array using for each loop
		System.out.println("printing the elements of 3dimensional array using for each loop");
		for (int[][] a2d : arr3d) {
			for (int[] a1d : a2d) {
				for (int item : a1d) {
					System.out.print(item + " ");
				}
			}
		}

		System.out.println("\n\n");
		// printing the elements with idexes
		System.out.println("printing the elements with idexes");
		for (int idx = 0; idx < 2; ++idx) {
			for (int jdx = 0; jdx < 2; ++jdx) {
				for (int kdx = 0; kdx < 3; ++kdx) {
					System.out.print(arr3d[idx][jdx][kdx] + " " );
				}
				System.out.println();
			}

		}

	}

}
