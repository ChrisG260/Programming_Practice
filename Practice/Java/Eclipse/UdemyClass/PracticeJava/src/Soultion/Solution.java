package Soultion;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    static public String addStrings(String num1, String num2) {
        String result = "";
        
    	Deque<Character> n1q = new ArrayDeque<>(); 
    	Deque<Character> n2q = new ArrayDeque<>();
        
        if(num1.length() > num2.length()) {
            for(Character c : num1.toCharArray()) n1q.add(c);
            for(Character c : num2.toCharArray()) n2q.add(c);
        }else {
            for(Character c : num1.toCharArray()) n2q.add(c);
            for(Character c : num2.toCharArray()) n1q.add(c);
        }
        

        char rem = '0';
        while(!n1q.isEmpty()) {
        	char n1 = n1q.removeLast();
        	char n2 = n2q.isEmpty() ? '0' : n2q.removeLast();
        	String added = String.valueOf((rem - '0') + (n1 - '0') + (n2 - '0'));
        	if(added.length() > 1) {
				rem = added.charAt(0);
				result = added.charAt(added.length() - 1 ) + result;
			}else {
				rem = '0';
				result = added + result;
			}
        } 
        
		if(rem != '0') {
			String added = String.valueOf((rem - '0'));
			result = added + result;
		}
//	
        
//    	char[] n1 = num1.toCharArray();
//    	char[] n2 = num2.toCharArray();
//    	int index;
//    	char rem = '0';
//    	if(n1.length > n2.length) {
//    		index = n1.length - 1;
//    		for(int i = n2.length - 1; i >= 0; i--) {
//    			String added = String.valueOf((rem - '0') + (n1[index] - '0') + (n2[i] - '0'));
//    			if(added.length() > 1) {
//    				rem = added.charAt(0);
//    				result = added.charAt(added.length() - 1 ) + result;
//    			}else {
//    				rem = '0';
//    				result = added + result;
//    			}
//    			index--;
//    		}
//    		while(rem != '0' && index >=0) {
//    			String added = String.valueOf((rem - '0') + (n1[index] - '0'));
//    			if(added.length() > 1) {
//    				rem = added.charAt(0);
//    				result = added.charAt(added.length() - 1 ) + result;
//    			}else {
//    				rem = '0';
//    				result = added + result;
//    			}
//    			index--;
//    		}
//    		if(rem != '0') {
//    			String added = String.valueOf((rem - '0'));
//    			result = added + result;
//    		}
//    		for(int i = index; i >= 0; i--) {
//    			String added = String.valueOf((n1[i] - '0'));
//    			result = added + result;
//    		}
//    		
//    	}else {
//    		index = n2.length - 1;
//    		for(int i = n1.length - 1; i >= 0; i--) {
//    			String added = String.valueOf((rem - '0') + (n2[index] - '0') + (n1[i] - '0'));
//    			if(added.length() > 1) {
//    				rem = added.charAt(0);
//    				result = added.charAt(added.length() - 1 ) + result;
//    			}else {
//    				rem = '0';
//    				result = added + result;
//    			}
//    			index--;
//    		}
//    		while(rem != '0' && index >=0) {
//    			String added = String.valueOf((rem - '0') + (n2[index] - '0'));
//    			if(added.length() > 1) {
//    				rem = added.charAt(0);
//    				result = added.charAt(added.length() - 1 ) + result;
//    			}else {
//    				rem = '0';
//    				result = added + result;
//    			}
//    			index--;
//    		}
//    		if(rem != '0') {
//    			String added = String.valueOf((rem - '0'));
//    			result = added + result;
//    		}
//    		for(int i = index; i >= 0; i--) {
//    			String added = String.valueOf((n2[i] - '0'));
//    			result = added + result;
//    		}
//    	}
    	
    	return result;
    }
    
	public static void main(String[] args) {
		
		System.out.println(addStrings("9", "99"));
		System.out.println(addStrings("9133", "0"));
		System.out.println(addStrings("999", "999"));
		System.out.println(addStrings("1", "9"));
		System.out.println(addStrings("11", "123"));
		System.out.println(addStrings("456", "77"));

		
		System.out.println(addStrings("0", "0"));
	}

}
