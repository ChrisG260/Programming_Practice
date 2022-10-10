package com.leetcode.mergeLinkedList;


//class ListNode implements java.io.Serializable  {
//    int val;
//    ListNode next;
//    ListNode() {this.val = 0;}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//    public void addArray(int[] arr) {
//   	 if(arr.length < 1) return;
//   	 this.val = arr[0];
//   	 for(int i = 1; i < arr.length; i++) {
//   		 this.add(arr[i]);    		 
//   	 }
//    }
//    public void add(int value) {
//	   	 if(this.next == null) {
//	   		 this.next = new ListNode(value);
//	   	 }
//	   	 else
//	   	 {
//		    	 ListNode head = this.next;
//		    	 while(head.next != null) head = head.next;
//		    	 head.next = new ListNode(value);
//	   	 }
//    }
//    
//    public boolean hasNext() {
//    	return next != null;
//    }
//    
//    public int getNextValue() {
//    	return hasNext() ? next.val : Integer.MAX_VALUE;
//    }
//    
//    public ListNode insert(ListNode p) {
//    	if(p == null) return p;
//    	
//    	if(p.val <= this.val) {
//    		p.next = this;
//    		return p;
//    	} else {
//	    	ListNode list = this;
//	    	while(p.val > list.getNextValue()) list = list.next;
//	    	p.next = list.next;
//	    	list.next = p;
//    	}
//    	
//    	return this;
//    	
//    }
//    
//    @Override
//    public String toString() {
//    	return this.val + "->" + next;
//    }
//    	
//}

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



public class Soultion {
	
	static public ListNode insert(ListNode a, ListNode p) {
		if(p == null) return p;
		
		if(p.val <= a.val) {
			p.next = a;
			return p;
		} else {
	    	ListNode list = a;
	    	while(list != null &&  p.val > getNextValue(list)) list = list.next;
	    	p.next = list.next;
	    	list.next = p;
		}
		
		return a;
		
	}
	static public boolean hasNext(ListNode a) {
		return a.next != null;
	}
	
	static public int getNextValue(ListNode a) {
		return hasNext(a) ? a.next.val : Integer.MAX_VALUE;
	}
	
    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode node = list2;
        while(node != null) {
        	list1 = insert(list1, new ListNode(node.val));
        	node = node.next;
        }

    	return list1;
    }

	public static void main(String[] args) {
		ListNode node1 = new ListNode();
		ListNode node2 = new ListNode();
		
		node1.addArray(new int[] {1,2,4});
		node2.addArray(new int[] {1,3,4});
		
		ListNode node = mergeTwoLists(node1, node2);
		
		int t = 0;
		t++;
	}

}

