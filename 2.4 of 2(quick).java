//srushti madani
//Quick sort

import java.util.*;

class Test {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{ 10, 20, 30, 21, 29, 56, 45, 67 };
	    Quick qu = new Quick();
        qu.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array::");
        qu.print(arr);
    }
}


class Quick {
	int temp,i,j,min, minindex;

    public int[] quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
     return arr;
    }

    public int partition(int[] arr, int low, int high) {
      
   
    int pivot = arr[high]; 
    int i = (low - 1);

        for (int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
	
	public void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}


    public void print(int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
	