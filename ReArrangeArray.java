package pkg;

public class ReArrangeArray {
	
	/*
	 * Given a sorted array of positive integers. 
	 * Your task is to rearrange  the array elements alternatively 
	 * i.e first element should be max value, second should be min value, third should be second max,
	 *  fourth should be second min and so on.
	 * */

	int[] a,aux;
	int len;
	
	ReArrangeArray(int[] a,int len){
		this.a = a;
		this.aux = new int[len];
		this.len = len;
	}
	
	void rearrange(){
		/*
		* It uses an auxilary array to rearrange
		*/
		
		int max = len-1,min = 0,i=0;
		
		while( min <= (max/2) ){
			System.out.println("copying "+max+" to "+i);
			aux[i++]=a[max--];
			System.out.println("copying "+min+" to "+i);
			aux[i++]=a[min++];
			
		}
	}
	void printarr(){
		
		for(int i=0;i<len;i++){
			System.out.print(aux[i]+" ");
		}
		
		System.out.println();
	}
	
}
