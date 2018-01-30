package com.example.leetcode;

public class leetcode_771 {
	
	/**
	 * 
	 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
	 * 
	 * 
	 * 
	 * */
	
	/***
	 * 
	 * 第一个字符串里面的每一个字符叫做“钻石”，第二个字符串里面的字符叫做“石头”。
	 * 遍历第一个字符串的字符，与第二个字符串的字符对比，匹配上就ok
	 * 
	 * 
	 * /
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static class Solution {
	    public int numJewelsInStones(String J, String S) {
	        char[] jewels = J.toCharArray();
	        char[] stones = S.toCharArray();
	        int count = 0;
	        for(int i = 0; i < jewels.length;i++){
	            for(int j = 0;j <stones.length;j++){
	                if(jewels[i] == stones[j]){
	                    count++;
	                }
	            }
	        }
	        System.out.println("count: "+count);
	        return count;
	    }
	}

}
