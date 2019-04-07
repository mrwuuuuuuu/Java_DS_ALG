package org.vincent.study.ds.tree;

public class BinaryNode {
	public Integer data;;
	public BinaryNode left;
	public BinaryNode right;
	int flag;
	
	public BinaryNode(){
		this.data=null;
		this.left=null;
		this.right=null;
		this.flag=0;
	}
	
	public BinaryNode(BinaryNode left,int data,BinaryNode right){
		this.left=left;
		this.data=data;
		this.right=right;
	}
	
	public BinaryNode(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
