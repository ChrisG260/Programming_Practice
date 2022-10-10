package com.leetcode.ListNode;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {this.val = 0;}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
    
    @Override
    public String toString() {
    	return this.val + "->" + next;
    }
}
