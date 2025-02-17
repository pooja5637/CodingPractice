package com.practice.core.array;

import java.util.Arrays;
import java.util.LinkedList;

public class InsertElementMiddle {
	
	public static void main(String[] args) {
		
//		Integer[] arr = {10,20,40,50};
//		
//		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
//		
//		list.add(2, 30);
//		
//		//System.out.println(list);
//		
//		//Object[] arr1 =  list.toArray();
//		
//		arr = list.toArray(arr);
//		
//		
//		System.out.println(Arrays.toString(arr));

		

        // initial array of size 10
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        // element to be inserted
        int element = 30;

        // position at which element is to be inserted
        int position = 3;
        
        System.out.println("***************Using Arraylist***********************************");
        // print the original array
        Integer[] arr1 = {10,20,40,50};
        System.out.println("Initial Array:\n" + Arrays.toString(arr1));
        addElement(arr1, element,position);

        
        
        System.out.println("***************Using loop***********************************");
        // print the original array
        System.out.println("Initial Array:\n" + Arrays.toString(arr));

        // call the method to insert x in arr at position pos
        
        arr = insertX( arr, element , position);
        // print the updated array
        System.out.println("\nArray with " + element
                           + " inserted at position "
                           + position + ":\n"
                           + Arrays.toString(arr));


   }
		

	
	// Function to insert x in arr at position pos
    public static int[] insertX(int arr[],int x, int pos)
    {
    	// create a new array of size n+1
        int newarr[] = new int[arr.length + 1];
        
        for (int i = 0; i < newarr.length ; i++) {
        	
            if (i < pos - 1)
            	
                newarr[i] = arr[i];
            
            else if( i == pos-1)
            	 
            	newarr[i] = x;
            else 
            	
            	newarr[i] = arr[i-1];
            
        
        }
    	
    	return newarr;
    }
    
    
    // usimg arraylist
    
    public static void addElement(Integer[] arr, int element, int position) {
    	
    	LinkedList<Integer> list = new LinkedList<>(Arrays.asList(arr));
    	
    	list.add(position-1, element);
    	
    	arr = list.toArray(arr);
    	
    	// print the updated array
        System.out.println("\nArray with " + element
                           + " inserted at position "
                           + position + ":\n"
                           + Arrays.toString(arr));

    }
}
