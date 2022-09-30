//inserion sort
//srushti madani


import java.util.*;

class Test{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[]{12,4,11,10,3,21};
	Insertion sr = new Insertion();
	sr.insertionSort(arr);
	System.out.println("Sorted Array::");
	sr.print(arr);
	}
}


class Insertion{
	int i,j,x,temp;
	public int[] insertionSort(int arr[]){
	
	for(i = 1 ;i<arr.length; i++){
		x = arr[i];
		j = i - 1;
		
	while(j>=0 && x < arr[j]){
	     temp = arr[j + 1];
		 arr[j+1] = arr[j];
		 arr[j] = temp;
		 j--;
	}
	
	//arr[j+1] = x;
	
}
return arr;
}

public void print(int arr[]){
	for(int i = 0 ;i<arr.length ; i++){
		System.out.print(arr[i] + " ");
}
}
}
	