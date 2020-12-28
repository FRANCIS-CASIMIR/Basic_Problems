package pkg;

public class Main {

	static int[][] sol;
	
	public static void main(String[] a)
	{
		int [][] p =new int[][]{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}
				};
		int[] x = new int[]{10,28,100,200};		
		
		
		ReArrangeArray ra= new ReArrangeArray(x, 4);
		ra.printarr();
		//ra.rearrange();
		//ra.printarr();
	}
	
	static void rotate_90_Degree_naiveSolution(int[][] arr,int n){
		
		
		// read by row and write by column
		sol=new int[n][n];
		
		for(int i=0;i<n;i++){
			
			for(int j=0,k=n-1;j<n;j++,k--){
				
				sol[k][i] = arr[i][j];
			}
			
		}
			
	}
	
	static void printarr(int n,int[][] arr){
		
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println();
	}
	
}
