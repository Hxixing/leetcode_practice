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
	 * ����Ϣ���У������ȳ��ַ���֮��ĺ������루Ӣ�Hamming distance��
	 * �������ַ�����Ӧλ�õĲ�ͬ�ַ��ĸ�����
	 * ���仰˵�������ǽ�һ���ַ����任������һ���ַ�������Ҫ�滻���ַ�������
	 * �����������ַ��������ͬ�����ȵ����ַ����ĺ������룬
	 * Ҳ����˵�������ַ����з����Ԫ�ظ�����
	 * ���ڶ������ַ�����˵������1�ĸ���������11101�ĺ���������4��
	 * 
	 * */
	public static void main(String[] args) {
		
		Solution so = new Solution();
		int result  = so.hammingDistance(111, 42884);
		System.out.println("result: "+result);
	}
	//�����ڲ���;��static������Ϊ--�༶�ڲ���
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
