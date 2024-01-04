package main1;

public class Day19FindLinearSearch {
	
	public static int linearSearch(int[] arr, int k) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k)
				return i;
		}
		return k;
		
	}
	
	
	public static void main(String[] args) {
		int a[]= {1,3,4,6,7};
		int key=7;
		System.out.println("element is found at index:  "+linearSearch(a,key) );
	}

}
