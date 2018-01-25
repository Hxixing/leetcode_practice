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
	 * ��Ŀ������˼�ǣ� һ�������˴��ڣ�0��0��λ�ã�����һ����L,R,U,D��ɵ��ַ������ֱ��Ӧ���ƣ����ƣ����ƣ�����
	 * �������һϵ���ƶ�֮��ص�ԭ�㣬�򷵻�true,����false;
	 * "RRUDLULD"
	 * "LRUDLDR"
	 *  ��Ϊ�л��������Ĺ�ϵ�������߶��ٲ���ֻҪ�������������ܻص�ԭ�㣬
	 *  ���ԣ�
	 *  	�ַ����е��ַ�Ϊ
	 *  		������false
	 *  		ż����
	 *  			ȫ��������true;
	 *  			û��������false;
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
