package pkg;

public class InFirstButSecond {

	/*
	 * Given two arrays A and B of positive integers. 
	 * Your task is to find numbers which are present in the first array, 
	 * but not present in the second array.
	 * 
	 * https://practice.geeksforgeeks.org/problems/in-first-but-second
	 * 
	 * */
	
	// variables
	int[] arr1,arr2;
	int len1,len2;
	boolean NotFound;
	
	InFirstButSecond(int[] arr1,int len1,int[] arr2,int len2){
		this.arr1 = arr1;
		this.arr2 = arr2;
		this.len1 = len1;
		this.len2 = len2;
		NotFound = true;
	}
	
	
	void doSearch(){
		for(int i=0; i<len1;i++){
			
			NotFound = true;
			
			for(int j=0;j<len2;j++){
				
				if(arr1[i]==arr2[j]){
					
					NotFound = false;
					break;
				}
			}
			
			if(NotFound) System.out.println(arr1[i]);
		}
	}

}
