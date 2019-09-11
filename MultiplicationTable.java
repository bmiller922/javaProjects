package lj;

public class MultiplicationTable {
	public static void createTable(int k, int n){
		for (int i=1; i<=k; i++) {
			for (int j = i; j <= n*i; j+=i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//using a double loop to create ixj table
		createTable(10, 10);
		
	}

}
