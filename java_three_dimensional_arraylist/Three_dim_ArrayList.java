import java.util.ArrayList;

public class Three_dim_ArrayList {
	public static void main(String[] args) {
		
		int x = 2, y = 2, z = 2;
		
		ArrayList<ArrayList<ArrayList<String>>> arrList_3d = new ArrayList<>(x);
		
		for(int i = 0; i < x; i++) {
			arrList_3d.add(new ArrayList<ArrayList<String>> (y));
			for(int j = 0; j < y; j++) {
				arrList_3d.get(i).add(new ArrayList<String> (z));
			}
		}
		
		arrList_3d.get(0).get(0).add(0,"X");
		arrList_3d.get(0).get(0).add(1,"X");
		
		arrList_3d.get(0).get(1).add(0,"O");
		arrList_3d.get(0).get(1).add(1, "O");
		
		arrList_3d.get(1).get(0).add(0, "Y");
		arrList_3d.get(1).get(0).add(1, "Y");
		
		arrList_3d.get(1).get(1).add(0, "T");
		arrList_3d.get(1).get(1).add(1, "T");
		
		for(int i = 0; i < x; ++i) {
			for(int j = 0; j < y; ++j) {
				for(int k = 0; k < z; ++k) {
					System.out.println("Point (" +i+ "," +j+ ","+k+ ") is : " + arrList_3d.get(i).get(j).get(k) );
				}
			}
		}
		
		
	}

}
