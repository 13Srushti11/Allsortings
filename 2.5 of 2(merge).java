//srushti madani
//Merge sort

import java.util.*;

class Test{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[]{10,20,30,21,29,56,45,67};
	Merge mr = new Merge();
	mr.MergeSort(arr);
	System.out.println("Sorted Array::");
	mr.print(arr);
	}
}


class Merge{
	int temp,i,j,min,minindex;
	
	public int[] MergeSort(int arr[]){
	
	
	return arr;
}
	
  public void print(int arr[]){
	for(int i = 0 ;i<arr.length ; i++){
		System.out.print(arr[i] + " ");
	}
	}
}
	