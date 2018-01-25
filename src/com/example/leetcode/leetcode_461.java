package com.example.leetcode;

public class leetcode_461 {
	
	/**
	 * The Hamming distance between two integers is the number of positions 
	 * at which the corresponding bits are different.
	 *
	 *	Given two integers x and y, calculate the Hamming distance.
	 * 
	 * */
	
	//https://zh.wikipedia.org/wiki/%E6%B1%89%E6%98%8E%E8%B7%9D%E7%A6%BB
	
	/**
	 * 
	 * 
	 * 在信息论中，两个等长字符串之间的汉明距离（英语：Hamming distance）
	 * 是两个字符串对应位置的不同字符的个数。
	 * 换句话说，它就是将一个字符串变换成另外一个字符串所需要替换的字符个数。
	 * 汉明重量是字符串相对于同样长度的零字符串的汉明距离，
	 * 也就是说，它是字符串中非零的元素个数：
	 * 对于二进制字符串来说，就是1的个数，所以11101的汉明重量是4。
	 * 
	 * */
	public static void main(String[] args) {
		
		Solution so = new Solution();
		int result  = so.hammingDistance(111, 42884);
		System.out.println("result: "+result);
	}
	//对象内部类;加static修饰则为--类级内部类
	static class Solution {
	    public int hammingDistance(int x, int y) {
	       return work(x,y);
	    }
	    
	    public int work(int x, int y){
	        int N = 31;
	        int sum = 0;
	        while(N > 0){
	            N--;
	            int x_t = x & 0x01;
	            int y_t = y & 0x01;
	            if(y_t != x_t){
	                sum++;
	            }
	            x = x >>1;
	            y = y >>1;
	        }
	        return sum;
	    }
	    
	}
	
}
