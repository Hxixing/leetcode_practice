package com.example.leetcode;

public class leetcode_760 {
	public static void main(String[] args) {
		Solution so = new Solution();
		int[] A = {12,28,46,32,50};
		int[] B = {50,12,32,46,28};
		
		int[] P = so.anagramMappings(A, B);
		for (int i = 0; i < P.length; i++) {
			System.out.println("P["+i+"]: "+P[i]);
		}
		System.out.println("Êä³ö½áÊø----------");
	}
	
	static class Solution {
	    public int[] anagramMappings(int[] A, int[] B) { 
	        int[] P = new int[A.length];
	        for(int i = 0; i < A.length; i++ ){
	            for(int j = 0; j < B.length; j++){
	                if(A[i] == B[j]){
	                    P[i] = j;
	                }
	            }
	        }
	        return P;
	    }
	}
	
}
