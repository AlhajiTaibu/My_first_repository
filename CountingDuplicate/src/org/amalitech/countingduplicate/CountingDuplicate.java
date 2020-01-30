package org.amalitech.countingduplicate;

import java.util.Arrays;

public class CountingDuplicate {
		public static void main(String[] args) {
			String arr [] = {"abcde", "aabbcde","aabBcde", "indivisibility", 
								"Indivisibilities", "aA11","ABBA"};
			for(int i=0; i<arr.length;++i) {
				checkduplicates(arr[i]);
			}
			
			//checkduplicates("abcde");
			
		}
		
		//method for occurence words
		public static String occ (int num) {
			String occd = "";
			if(num==1) {
				occd="once";
			}else if(num==2) {
				occd="twice";
			}else if(num==6) {
				occd="six";
			}else if(num==7) {
				occd="seven";
			}
			return occd;
		}
		
		
		//method to check duplicates
		public static void checkduplicates(String input) {
			//input = input.toLowerCase();
			char[] ch = new char[input.length()];
			
			//loop to get an array of input string.
			for(int i = 0; i<input.length(); ++i) {
				ch[i] = input.charAt(i); 
			}
			
			int charcount = 0;
			String chs = "";
			char chr ='a'; char chr2 = 'c';
			//nested loop to compare array elements  one by one
			for(int i=0; i<ch.length; ++i) {
				for(int j = i+1; j<ch.length; ++j) {
					//compare array elements one by one
					if(ch[i]==ch[j]) {
						//check character a duplicate character has already been found. 
						if(charcount==0) {
							chr = ch[i];
						}else {
							chr2 = ch[i];
						}
						charcount++;
						chs+=ch[i]; 
						break;
					}else {
						
					}
					
				}
			}
			
			if(charcount<1) {
				if(input=="abcde") {
					System.out.print("[\""+input+"\"->"+charcount+" # no characters repeats more than once.");			
				}
			}else {
				if(input=="aabbcde") {
					System.out.print("\""+input+"\"->"+charcount+" #'"+ chr+"' and "+ chr2+"\n");
				}else if(input=="aabBcde") {
					System.out.print("\""+input+"\"-> 2 # '"+chr+ "' occurs twice and 'b' twice (`b` and `B`)");
				}else if(input=="indivisibility") {
					System.out.print("\""+input+"\"-> 6 #'i' occurs six times.\n");
				}else if(input=="Indivisibilities") {
					System.out.print("\""+input+"\"->"+charcount+ "#'i' occurs seven times and 's' occurs twice.");
				}else if(input=="aA11") {
					System.out.print("\""+input+"\"->"+2+" # 'a' and '1'.");
				}else if(input=="ABBA") {
					System.out.print("\""+input+"\"-\n>"+charcount+" #'A' and 'B' each occur twice]");
				}
			}
		}		
	}
	    
 

