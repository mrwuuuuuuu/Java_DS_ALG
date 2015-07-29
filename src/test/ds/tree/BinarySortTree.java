package test.ds.tree;

import java.util.Stack;

public class BinarySortTree {
	BinaryNode root;
	
	public BinarySortTree(){
		root=null;
	}
	
	/**������������в����µĽ��
	 * @param data
	 */
	public void insert(int data){
		BinaryNode newNode=new BinaryNode(data);//�½����
		
		if(root==null){//��������Ϊ�գ����½��Ľ��Ϊ�����
			root=newNode;
			return;
		}
		
		BinaryNode current=root;//��ǰ���ָ������
		BinaryNode parent;//ָ�������
		
		while(true){//ѭ�����ҳ��½��ĺ���λ��
			parent=current;//�����ָ��ǰ���
			
			if(data<current.data){//����������ֵС�ڵ�ǰ����ֵ
				current=parent.left;//��ǰ���ָ�򸸽�������
				if(current==null){//�����ǰ���Ϊ��
					parent.left=newNode;//��������ڵ�Ϊ��ǰ������½��
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
	
	/**����һ�����ֵ�½�����������
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
	
	/**�ݹ�ǰ�����
	 * @param localRoot
	 */
	public void preOrder(){
		this.preOrder(root);
		System.out.println();
	}
	
	/**
	 * �ǵݹ�ǰ�����
	 */
	public void preTraverse(){
		Stack<BinaryNode> stack =new Stack<BinaryNode> ();
		
		BinaryNode current=this.root;//��ʼʱ��ָ������
		
		while(current!=null||!stack.isEmpty()){//��ǰ��㲻Ϊ�գ�����ջ��Ϊ��
			if(current!=null){
				System.out.print(current.data+"\t");//��ǰ��㲻Ϊ�գ������ǰ���ֵ
				stack.push(current);//���ŵ�ǰ�����ջ
				current=current.left;//����������
			}else {
				current=stack.pop();//�����ǰ���Ϊ�գ�����ջ��Ԫ��
				current=current.right;//����������
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
	
	/**�ݹ��������
	 * @param localRoot
	 */
	public void inOrder(){
		this.inOrder(root);
		System.out.println();
	}
	
	/**
	 * �ǵݹ��������
	 */
	public void inTraverse(){
		Stack<BinaryNode> stack=new Stack<BinaryNode>();
		BinaryNode current=this.root;
		
		while(current!=null||!stack.isEmpty()){
			if(current!=null){
				stack.push(current);//��ǰ��㲻Ϊ�գ�����ջ
				current=current.left;//����������
			}else {
				current=stack.pop();//��ǰ���Ϊ�գ�����ջ��Ԫ��
				System.out.print(current.data+"\t");//���ջ��Ԫ��
				current=current.right;//����������
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
	
	/**�ݹ�������
	 * @param localRoot
	 */
	public void postOrder(){
		this.postOrder(root);
		System.out.println();
	}
	
	/**
	 * �ǵݹ��������
	 */
	public void postTraverse(){
		Stack<BinaryNode> stack=new Stack<BinaryNode>();
		
		BinaryNode current=this.root;
		
		while(current!=null||!stack.isEmpty()){
			if(current!=null){
				stack.push(current);
				current=current.left;
			}else {
				current=stack.pop();
				if(current.flag==1){//
					System.out.print(current.data+"\t");
					current.flag=2;
				}
				if(current.right==null&&current.flag==0){
					System.out.print(current.data+"\t");
					current.flag=2;
				}
				if(current.right!=null&&current.flag==0){
					stack.push(current);
					current.flag=1;
				}
				current=current.right;
			}
		}
		System.out.println();
	}

}
