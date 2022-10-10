package com.leetcode.reorderlist;

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
    
    @Override
    public String toString() {
    	return this.val + "->" + next;
    }
}



public class Soultion {
	
    static public void reorderList(ListNode head) {
        if(head == null) return;
        
        ListNode p = head, t = head;
        
        int cnt = 0;
        while(t.next != null) {t = t.next; cnt++;}
        
        int value = t.val;
        
        while(p.next != null && cnt >=0 ) {
        	t.next = p.next;
        	p.next = t;
        	p= p.next.next;
        	int end = cnt - 1;
        	while(end > 0) {t = t.next; end--;}
        	t.next = null;
        	cnt -= 2;
        }
    }

	public static void main(String[] args) {
		ListNode node1 = new ListNode();
		
		node1.addArray(new int[] {1});
		
		System.out.println(node1);
		reorderList(node1);
		System.out.println(node1);
		

	}

}

/*
 * Faster way
 * class Solution {
    ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode trav = head;
        ListNode next = null;
        
        while(trav != null){
            next = trav.next;
            trav.next = prev;
            prev = trav;
            trav = next;
        }
        
        return prev;
    }
    
    ListNode mid(ListNode head){
        ListNode s = head;
        ListNode f = head;
        
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    
    public void reorderList(ListNode head) {
        ListNode midNode = mid(head);
        ListNode secondList = midNode.next;
        //breaking from half
        midNode.next = null;
        
        ListNode firstList = head;
        secondList = rev(secondList);
        
        //to store next of 2 list have 2 pointer
        ListNode firstNext = head;
        ListNode secondNext = secondList;
        
        while(secondList != null){
            
            firstNext = firstNext.next;
            secondNext = secondNext.next;
            
            firstList.next = secondList;
            secondList.next = firstNext;
            
            firstList = firstNext;
            secondList = secondNext;
        }
        
    }
}
 */
  
 
