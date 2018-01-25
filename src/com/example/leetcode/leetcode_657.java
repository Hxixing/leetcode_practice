package com.example.leetcode;

public class leetcode_657 {

	/**
	 * Initially, there is a Robot at position (0, 0). 
	 * Given a sequence of its moves, judge if this robot makes a circle, 
	 * which means it moves back to the original place.

	    The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
		
		Example 1:
		Input: "UD"
		Output: true
		Example 2:
		Input: "LL"
		Output: false
	 * 
	 * */
	/**
	 * 题目大致意思是： 一个机器人处于（0，0）位置，给出一个由L,R,U,D组成的字符串，分别对应左移，友移，上移，下移
	 * 如果经过一系列移动之后回到原点，则返回true,否则false;
	 * "RRUDLULD"
	 * "LRUDLDR"
	 *  因为有互相消除的关系，不管走多少步，只要两两消除，就能回到原点，
	 *  所以：
	 *  	字符串中的字符为
	 *  		奇数，false
	 *  		偶数：
	 *  			全部消除，true;
	 *  			没有消除，false;
	 *  	
	 * */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution so  = new Solution();
		boolean isCircle = so.judgeCircle("UDLRRLDULDRRLLDUDDDUUULRR");
		System.out.println("isCircle: "+isCircle);
		boolean isCircle2 = so.judgeCircle("UURRDDLL");
		System.out.println("isCircle2: "+isCircle2);
	}
	
	static class Solution {
	    public boolean judgeCircle(String moves) {
	        char[] ch = moves.toCharArray();
	        int L_count = 0;
	        int R_count = 0;
	        int U_count = 0;
	        int D_count = 0;
	        
	        for(int i = 0; i < ch.length; i++){
	            switch(ch[i]){
	                case 'L':
	                    L_count++;
	                    break;
	                case 'R':
	                    R_count++;
	                    break;
	                case 'U':
	                    U_count++;
	                    break;
	                case 'D':
	                    D_count++;
	                    break;
	            }            
	        }
	        if(L_count - R_count == 0 && U_count - D_count == 0){
	            return true;
	        }else{
	            return false;
	        }
	        
	    }
	}

}
