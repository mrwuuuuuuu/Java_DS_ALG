package org.vincent.study.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class BinarySortTree {
	BinaryNode root;
	
	public BinarySortTree(){
		root=null;
	}
	
	/**向二叉排序树中插入新的结点
	 * @param data
	 */
	public void insert(int data){
		BinaryNode newNode=new BinaryNode(data);//新建结点
		
		if(root==null){//如果根结点为空，则新建的结点为根结点
			root=newNode;
			return;
		}
		
		BinaryNode current=root;//当前结点指向根结点
		BinaryNode parent;//指定父结点
		
		while(true){//循环，找出新结点的合适位置
			parent=current;//父结点指向当前结点
			
			if(data<current.data){//如果插入结点的值小于当前结点的值
				current=parent.left;//当前结点指向父结点的左结点
				if(current==null){//如果当前结点为空
					parent.left=newNode;//父结点的左节点为当前插入的新结点
					return;
				}
			}else {
				current=parent.right;
				if(current==null){
					parent.right=newNode;
					return;
				}
			}
		}
	}
	
	/**根据一组给定值新建二叉排序数
	 * @param arr
	 */
	public void buildTree(int[] arr){
		for(int i=0;i<arr.length;i++){
			this.insert(arr[i]);
		}
	}
	
	
	public void preOrder(BinaryNode localRoot){
		if(localRoot!=null){
			System.out.print(localRoot.data+"\t");
			preOrder(localRoot.left);
			preOrder(localRoot.right);
		}
	}
	
	/**递归前序遍历
	 * @param localRoot
	 */
	public void preOrder(){
		this.preOrder(root);
		System.out.println();
	}
	
	/**
	 * 非递归前序遍历
	 */
	public void preTraverse(){
		Stack<BinaryNode> stack =new Stack<BinaryNode> ();
		
		BinaryNode current=this.root;//初始时，指向根结点
		
		while(current!=null||!stack.isEmpty()){//当前结点不为空，或者栈不为空
			if(current!=null){
				System.out.print(current.data+"\t");//当前结点不为空，输出当前结点值
				stack.push(current);//接着当前结点入栈
				current=current.left;//进入左子树
			}else {
				current=stack.pop();//如果当前结点为空，弹出栈顶元素
				current=current.right;//进入右子树
			}
		}
		System.out.println();
	}
	
	
	public void inOrder(BinaryNode localRoot){
		if(localRoot!=null){
			inOrder(localRoot.left);
			System.out.print(localRoot.data+"\t");
			inOrder(localRoot.right);
		}
	}
	
	/**递归中序遍历
	 * @param localRoot
	 */
	public void inOrder(){
		this.inOrder(root);
		System.out.println();
	}
	
	/**
	 * 非递归中序遍历
	 */
	public void inTraverse(){
		Stack<BinaryNode> stack=new Stack<BinaryNode>();
		BinaryNode current=this.root;
		
		while(current!=null||!stack.isEmpty()){
			if(current!=null){
				stack.push(current);//当前结点不为空，则入栈
				current=current.left;//进入左子树
			}else {
				current=stack.pop();//当前结点为空，弹出栈顶元素
				System.out.print(current.data+"\t");//输出栈顶元素
				current=current.right;//进入右子树
			}
		}
		System.out.println();
	}
	
	
	public void postOrder(BinaryNode localRoot){
		if(localRoot!=null){
			postOrder(localRoot.left);
			postOrder(localRoot.right);
			System.out.print(localRoot.data+"\t");
		}
	}
	
	/**递归后序遍历
	 * @param localRoot
	 */
	public void postOrder(){
		this.postOrder(root);
		System.out.println();
	}
	
	/**
	 * 非递归后续遍历
	 */
	public void postTraverse(){
		Stack<BinaryNode> stack=new Stack<BinaryNode>();
		
		BinaryNode current=this.root;
		
		while(current!=null||!stack.isEmpty()){
			if(current!=null){//将根结点的左结点的左结点……存入栈
				stack.push(current);
				current=current.left;
			}else {
				current=stack.pop();//如当前结点没有左结点，则弹出栈顶元素并标记为当前结点
				if(current.flag==1){//当前为回溯结点
					System.out.print(current.data+"\t");
					current.flag=2;//该结点已被弹出
				}
				if(current.right!=null&&current.flag==0){
					stack.push(current);
					current.flag=1;//表示为回溯结点
				}
				if(current.right==null&&current.flag==0){//当前结点右结点为空
					System.out.print(current.data+"\t");
					current.flag=2;//该结点已被弹出
				}
				
				
				current=current.right;
			}
		}
		System.out.println();
	}
	
	public void layerTraverse(){
		this.layerTraverse(root);
	}
	public void layerTraverse(BinaryNode root){
		if(root==null) return;
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			BinaryNode current=queue.poll();
			System.out.print(current.data+"\t");
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
				queue.add(current.right);
		}
	 
	}
}
