//Bubble sorting
//srushti madani

import java.util.*;

class Test{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[]{12,4,11,10,3,21};
	Bubble Bb = new Bubble();
	Bb.BubbleSort(arr);
	System.out.println("Sorted Array::");
	Bb.print(arr);
	}
}


class Bubble{
	int temp,i,j;
	
	public int[] BubbleSort(int arr[]){
	
	for(i = 0 ; i<arr.length-1; i++){
		for(j = 0 ; j<arr.length-i-1 ; j++){
		if(arr[j] > arr[j+1]){
			temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		 }
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
	