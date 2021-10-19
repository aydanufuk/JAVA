import java.util.ArrayList;


public class TwoDimArrayList {
	public static void main(String[] args) {

		int n = 2;

		ArrayList<ArrayList<Integer>> arr2d_list = new ArrayList<ArrayList<Integer>>(n);
		
		
		ArrayList<Integer> inner_list_1 = new ArrayList<Integer>();

		inner_list_1.add(5);
		inner_list_1.add(10);
		inner_list_1.add(15);
		inner_list_1.add(20);

		arr2d_list.add(inner_list_1);

		ArrayList<Integer> inner_list_2 = new ArrayList<Integer>();

		inner_list_2.add(2);
		inner_list_2.add(4);
		inner_list_2.add(6);
		inner_list_2.add(8);

		arr2d_list.add(inner_list_2);
		int arr2d_list_size = arr2d_list.size();
		
		System.out.println("2 dimensional main arraylist contains " + arr2d_list_size+ " lists");
		
		for (int i = 0; i < arr2d_list.size(); i++) {
			System.out.println("inner list " + (i + 1) + " has " + arr2d_list.get(i).size()+ " elements");
			for (int j = 0; j < arr2d_list.get(i).size(); j++) {
				
				System.out.print(arr2d_list.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}
}
