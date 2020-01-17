package org.amalitech.isogram;
import java.lang.reflect.Array;
import java.util.*;
public class IsogramTest {
	
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word:");
		String [] text= {"\"","anA", "abc", "dell", "Demographic","aca", "isogram", "moOse"};
		String [] test= new String[8];
		boolean check = true;
		int count =0;
		for(int i= 0; i<text.length;i++) {
			test[i] =text[i].toLowerCase();
			
	        int len = test[i].length(); 
	  
	        char [] arr = test[i].toCharArray(); 
	  
	        Arrays.sort(arr);
	        for (int j = 0; j < len-1; j++) { 
	            if (arr[j] == arr[j + 1]) { 
	               check =false;
	               break;
	        }else {
	        	check = true;
	        	count++;
	        }
			
		}
	    System.out.println( text[i] + " ---- " + check + count );
		}
        
	}
	}



