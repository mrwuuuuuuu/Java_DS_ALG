package test.ds.tree;

public class BinaryNode {
	public Integer data;;
	public BinaryNode left;
	public BinaryNode right;
	
	public BinaryNode(){
		this.data=null;
		this.left=null;
		this.right=null;
	}
	
	public BinaryNode(BinaryNode left,int obj,BinaryNode right){
		this.left=left;
		this.data=obj;
		this.right=right;
	}
	
	public BinaryNode(int obj){
		this(null,obj,null);
	}
}
