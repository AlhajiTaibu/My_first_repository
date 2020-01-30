package org.amalitech.countingduplicate;

public class ClassTest {
	public static void main(String [] arg) {
	
		findDuplicateChars("indivisibilities");
		
		
	}
	 public static void findDuplicateChars(String str) {
	        System.out.print("\""+ str + "\"" +"->");
	        int count;
	        for(int i = 0; i < str.length(); i++) {
	            // get a character
	            char c = str.charAt(i);
	            //starting count for any character
	            count = 1;
	            //ignore spaces
	            if(c == ' ') 
	                continue;
	            for(int j = i + 1; j < str.length(); j++) {
	                 if(c == str.charAt(j)) {
	                     count++;
	                     // remove the char which is already counted
	                     str = str.substring(0, j) + str.substring(j+ 1);
	                 }
	            }
	            if(count > 1) {
	               System.out.print( count + " # " + c );
	               
	               
	            }
}
	        }
	 }
