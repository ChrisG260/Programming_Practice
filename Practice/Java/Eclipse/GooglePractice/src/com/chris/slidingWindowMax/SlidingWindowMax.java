package com.chris.slidingWindowMax;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SlidingWindowMax {
	
	static public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1) return nums;
        
        int length = nums.length;
        
        int results[] = new int[length - k + 1];
        int arrCnt = 0;
                
        Deque<Integer> dq = new ArrayDeque<>();
        
        //get initial elements up to K
        for(int i = 0; i < k; i++) {
        	while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) dq.removeLast();
        	dq.addLast(i);
        }
        
        for(int i = k; i < length; i++) {

        	results[arrCnt] = nums[dq.peek()];
        	arrCnt++;
        	
        	//move window frame, first elment in queue no longer valid remove it
        	while(!dq.isEmpty() && dq.peek() <= i - k) dq.removeFirst();
        	
        	//remove element if current value greater than last one added
        	while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) dq.removeLast();
        	
        	dq.addLast(i);

        }
        
        results[arrCnt] = nums[dq.peek()];
        	
		return results;
    }

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] {-6,-10,-7,-1,-9,9,-8,-4,10,-5,2,9,0,-7,7,4,-2,-10,8,7}, 7)));
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] {9,10,9,-7,-4,-8,2,-6}, 5)));
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] {1,3,1,2,0,5}, 3)));
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] {7,2,4}, 2)));
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3)));
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] {1}, 1)));
		long endTime = System.currentTimeMillis();
		
		System.out.println("Timer " + (endTime - startTime) + " milliseconds");

	}

}
