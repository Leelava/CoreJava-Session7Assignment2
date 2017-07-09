package StringAssignments;

import java.util.Arrays;
// Program to split the strings into array, sort the array and then sort each word in the array
public class StringSort {

	public static void main(String[] args) {
		
			String s1 = "My name is Leela";// Let the string be
			
			System.out.println("String to be converted to array is " );
			System.out.println(s1);
			
			String [] array1 = s1.split(" ");//Split the string based on space delimiter.
			
			System.out.println("Array of strings after split");
			
			
			for (String a: array1)
			{
				System.out.println(a);
			}
			
			//Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
	       Arrays.sort(array1,String.CASE_INSENSITIVE_ORDER);// sorting the converted array based by ignoring the case
	       
	       System.out.println("Sorted Array of Strings is");
	       
	       for (String a: array1){
				System.out.println(a);
			}
	       for (int start=0; start<array1.length; start++  ){
	    	   
	       
	       char[] charArray = array1[start].toCharArray();Arrays.sort(charArray);
	       
	       System.out.println(charArray);
		}

	}
}