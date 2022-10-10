package com.leet.reverselinklist;

 class ListNode {
     int val;
     ListNode next;
     ListNode() {this.val = 0;}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     public void addArray(int[] arr) {
    	 if(arr.length < 1) return;
    	 this.val = arr[0];
    	 for(int i = 1; i < arr.length; i++) {
    		 this.add(arr[i]);    		 
    	 }
     }
     public void add(int value) {
    	 if(this.next == null) {
    		 this.next = new ListNode(value);
    	 }
    	 else
    	 {
	    	 ListNode head = this.next;
	    	 while(head.next != null) head = head.next;
	    	 head.next = new ListNode(value);
    	 }
     }
 }
 
 

public class Solution {
	
   public static ListNode reverseList(ListNode p, ListNode q) {         
      if(p == null)
         return q;                                             
      else {
    	 ListNode rest = p.next;       
         p.next = q;                                
         return reverseList(rest, p);     
      }
   }
	
    static public ListNode reverseList(ListNode head) {
//    	ListNode tail = head, newHead, p = head;
//    	
//    	if(head == null) return head;
//    	
//    	while(tail.next != null) tail = tail.next;
//    	
//    	newHead = tail;
//    	
//    	while(tail != head) {
//    		while(p.next != tail) p = p.next;
//    		tail.next = p;
//    		p.next = null;
//    		tail = tail.next;
//    		p = head;
//    	}
    	 
    	return reverseList(head, null);
    }
	public static void main(String[] args) {
		
		ListNode node = new ListNode();
		
		node.addArray(new int[] {1,2,3,4,5});
		
		node = reverseList(node);
		
		int t = 0;
		t++;
	}

}
