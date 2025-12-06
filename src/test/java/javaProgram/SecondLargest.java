package javaProgram;

import java.util.Arrays;

public class SecondLargest {
	 public static void main(String[] args) {
	        int[] arr = {10, 20, 4, 45, 99};

	        Arrays.sort(arr);
	        for(int r:arr) {
	        System.out.print(r+",");
	        }
	        int secondLargest = arr[arr.length - 2];

	        System.out.println("Second Largest: " + secondLargest);
	    }

}
