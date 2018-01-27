package com.example.leetcode;

import java.util.Arrays;

public class leetcode_561 {

	
	/***
	 * 
	 * 
	 * 
	 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

		Example 1:
		Input: [1,4,3,2]
		
		Output: 4
		Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
	 * 
	 * 
	 * 
	 * /
	 
	 /**
	  * 尽可能让两两数间距最小，然后去里面小的一个，就能求到尽可能大的值。
	  * 
	  * 
	  * / 
	 
	  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution so = new Solution();
		int[] nums = {1,4,2,3,7,12,43,56};
		int sum = so.arrayPairSum(nums);
		System.out.println("sum: "+sum);
	}

	static class Solution {
	    public int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int i = 0;
	        int sum = 0;
	        while(i<nums.length){
	            if(i % 2 == 0){
	                sum += nums[i];
	            }
	            i++;
	        }
	        return sum;
	    }
	}
	
}	
