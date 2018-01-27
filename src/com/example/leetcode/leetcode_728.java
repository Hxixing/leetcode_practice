package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_728 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution so = new Solution();
		List list = new ArrayList<Integer>();
		list = so.selfDividingNumbers(1, 22);
	}
	
	static class Solution {
	    public List<Integer> selfDividingNumbers(int left, int right) {
	        int num = left;
	        boolean divisible = true;
	        List list = new ArrayList<Integer>();
	    	while(num <= right){
	    		divisible = true;
	        	char[] ch = (num+"").trim().toCharArray();
	        	int[] arr = new int[ch.length];
	        	for (int i = 0; i < ch.length; i++) {
					arr[i] = Integer.parseInt(ch[i]+"");
					//该数每一位都不可以为0
					if(arr[i] == 0 || num % arr[i] != 0){
						divisible = false;
					}
				}
		    	if(divisible){
		    		System.out.println(num+"is divisiabl!!, add it now----");
		    		list.add(num);
		    	}
		    	num++;
	        }
	    	return list;
	    }
	}
	
	
}	
