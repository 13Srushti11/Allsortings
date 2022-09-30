//srushti madani
//Selection sort

import java.util.*;

class Test{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[]{10,20,30,21,29,56,45,67};
	Selection se = new Selection();
	se.SelectionSort(arr);
	System.out.println("Sorted Array::");
	se.print(arr);
	}
}


class Selection{
	int temp,i,j,min,minindex;
	
	public int[] SelectionSort(int arr[]){
	
	for(i = 0 ; i<arr.length-1; i++){
		min = arr[i];
		minindex = i;
		for(j = i+1 ;j<arr.length;j++){
			if(arr[j] < min){
				min = arr[j];
				minindex = j;
			}
		}
		if(minindex > i){
		temp = arr[i];
		arr[i] = arr[minindex];
		arr[minindex] = temp;
	}
	}
	return arr;
}
	
  public void print(int arr[]){
	for(int i = 0 ;i<arr.length ; i++){
		System.out.print(arr[i] + " ");
	}
	}
}
	