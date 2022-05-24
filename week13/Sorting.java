import java.util.Arrays;

/**
 * 
 * @author datn1
 *
 **/
public class Sorting { 
	public static void main(String[] args) {
		int [] ages = {1,18,17,15,4,8,19,26}; 
		System.out.println(Arrays.toString(ages)); 
		bubbleSort(ages); 
		System.out.println(Arrays.toString(ages));
	
	}	
	//MergeSort, quickSort, InsertionSort, SelectionSort, Trie 
	public static void bubbleSort(int[] arr) { 
		for( int i = 0; i < arr.length-1; i++) { 
			for (int j=0; j<arr.length-i -1; j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]= arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^  arr[j+1] ;
				}
			}
		}
		
		/*
		 *  First inner loop 
		 *  {1,18,17,15,4,8,19,26}; 
		 *  if 1 > 18 
		 *  {1,18,17,15,4,8,19,26}; 
		 *  if 18 > 17, swap 
		 *  {1,17,18,15,4,8,19,26}; 
		 *  if 18 > 15, swap 
		 *  {1,17,15,18,4,8,19,26}; 
		 *  if 18 > 4 swap 
		 *  {1,17,15,4,18,8,19,26}; 
		 *  if 18 > 8 swap 
		 *  {1,17,15,4,8,18,19,26}; 
		 *  if 18 > 19 
		 *  {1,17,15,4,8,18,19,26};
		 *  if 19> 26 
		 *  * {1,17,15,4,8,18,19,26}; 
		 *  * Second inner
		 *  if 1 > 17 
		 *  {1,17,15,4,8,18,19,26}; 
		 *  if 17 > 15 swap 
		 *  {1,15, 17, 4,8,18,19,26}; 
		 *  if 17 >4  swap 
		 *  {1,15, 4,17,8,18,19,26}; 
		 *  if 17>8 swap 
		 *  {1,15, 4,8,17,18,19,26): 
		 *  if 17 > 18 
		 *  {1,15, 4,8,17,18,19,26}; 
		 *  if 18> 19 
		 *  {1,15, 4,8,17,18,19,26};
         * 
         *  Third inner loop
         *  
         *  
         *  
         */

	}
}

