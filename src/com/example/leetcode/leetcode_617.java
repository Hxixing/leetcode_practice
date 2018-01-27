package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_617 {
	
	private static List<TreeNode> mNodeList;
	private static List<Integer> mResultList = new ArrayList<Integer>();
	private static TreeNode mTreeNode;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		initTree(list);
		mTreeNode = mNodeList.get(0);
		TreeNode  root = mNodeList.get(0);
		
		System.out.println("--------前序排序开始---------");
		preShow(mNodeList.get(0), mNodeList.get(0));
		System.out.println("--------前序排序结束---------");
		
		initTree(mResultList);
		
		
	}
	  
	public static void initTree(List<Integer> list){
		mNodeList = new ArrayList<TreeNode>();
		//初始化父节点
		for (int i = 0; i < list.size(); i++) {
			mNodeList.add(new TreeNode(list.get(i)));
		}
		//最后父节点位置
		int lastParentPosition = list.size() / 2 - 1;
		
		for (int parentIndex = 0; parentIndex < lastParentPosition; parentIndex++) {
			mNodeList.get(parentIndex).leftNode = mNodeList.get(parentIndex * 2 + 1);
			mNodeList.get(parentIndex).rightNode = mNodeList.get(parentIndex * 2 + 2);
			
		}
		// 最后一个父节点:因为最后一个父节点可能没有右孩子，所以单独拿出来处理  
		//建立左子树
		mNodeList.get(lastParentPosition).leftNode = mNodeList.get(lastParentPosition * 2 + 1);
		
		//建立右子树
		if(list.size() % 2 == 1){
			mNodeList.get(lastParentPosition).rightNode = mNodeList.get(lastParentPosition * 2 + 2);
		}
		
	}
	
	
	public static TreeNode preShow(TreeNode node,TreeNode node2){
		if(node == null && node2 == null){
            System.out.println("node,node2 == null,return null");
			return null;
		}
        if(node == null && node2 != null){
            System.out.println("node == null,node2.val: "+node2.val);
            return node2;
        }
        if(node != null && node2 == null){
            System.out.println("node2 == null,node.val: "+node.val);
            return node;
        }
        if(node != null && node2 != null){
		//根左右---前序排序
            node.val = node.val + node2.val;
            System.out.println("node.val: "+node.val);
            node.leftNode = preShow(node.leftNode,node2.leftNode);
            node.rightNode = preShow(node.rightNode,node2.rightNode);
        }
        return node;
	}

	static class TreeNode{
		int val;
		TreeNode leftNode;
		TreeNode rightNode;
		TreeNode (int x){
			leftNode = null;
			rightNode = null;
			val = x;
		}
		
		public String toString(){
			
			return "val: "+val;
		}
	}
	
	public void string(){
		
	}
	
}
