package com.leetcode.removenthnodefromend;

import com.leetcode.ListNode.*;

public class Solution {
	
	static public ListNode removeNthFromEnd(ListNode head, int n) {
		
		if(head == null || (head.next == null && n == 1)) return null;
		
		ListNode p =head, t = head, d;
		
		int cnt = n - 1;
		int sz = 1;
		
		while(p.next != null) {
			if(cnt < 0) t = t.next;
			p = p.next;
			cnt--;
			sz++;
		}
		
		if(sz == n) {
			head = head.next;
			t.next = null;
		}else if(n < sz){
			d = t.next;
			if(d != null) {
				t.next = d.next;
				d.next = null;
			}else {
				t.next = null;
			}
		}
		
		return head;
        
    }

	public static void main(String[] args) {
		ListNode node1 = new ListNode();
		
		node1.addArray(new int[] {1,2,3,4,5});
		
		System.out.println(node1);
		node1 = removeNthFromEnd(node1, 2);
		System.out.println(node1);

	}

}
