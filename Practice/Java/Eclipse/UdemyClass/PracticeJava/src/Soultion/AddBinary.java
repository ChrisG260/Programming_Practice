package Soultion;

public class AddBinary {
	
    static public String addBinary(String a, String b) {

    	int lena = a.length();
    	int lenb = b.length();
    	int carry = 0;
    	
    	String res = "";
    	
    	int maxLen = Math.max(lena, lenb);
    	for(int i = 0; i < maxLen; i++) {
    		int p = i < lena ? a.charAt(lena - 1 - i) - '0' : 0;
    		int q = i < lenb ? b.charAt(lenb - 1 - i) - '0' : 0;
    		int tmp = p + q + carry;
    		carry = tmp/2;
    		res = tmp % 2 + res;
    	}
 
    	return (carry == 0) ? res : "1" + res;

        
    }

	public static void main(String[] args) {
		System.out.println(addBinary("1", "11"));
		System.out.println(addBinary("1010", "1011"));

	}

}
