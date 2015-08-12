package test.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
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
			if(current!=null){//����������������㡭������ջ
				stack.push(current);
				current=current.left;
			}else {
				current=stack.pop();//�統ǰ���û�����㣬�򵯳�ջ��Ԫ�ز����Ϊ��ǰ���
				if(current.flag==1){//��ǰΪ���ݽ��
					System.out.print(current.data+"\t");
					current.flag=2;//�ý���ѱ�����
				}
				if(current.right!=null&&current.flag==0){
					stack.push(current);
					current.flag=1;//��ʾΪ���ݽ��
				}
				if(current.right==null&&current.flag==0){//��ǰ����ҽ��Ϊ��
					System.out.print(current.data+"\t");
					current.flag=2;//�ý���ѱ�����
				}
				
				
				current=current.right;
			}
		}
		System.out.println();
	}
	
	/**
	 * �������Ĳ������
	 */
	public void layerTraverse(){
		this.layerTraverse(root);
	}
	public void layerTraverse(BinaryNode root){
		//��������Ϊ�շ���
		if(root==null) return;
		//���ö������洢��㣬�ﵽ���������Ŀ��
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		//�����������
		queue.add(root);
		//������в�Ϊ�գ�ѭ��
		while(!queue.isEmpty()){
			//����ͷԪ�س��У������
			BinaryNode current=queue.poll();
			System.out.print(current.data+"\t");
			//��Ԫ�ص����ӽ�㲻Ϊ�գ���Ӷ�β����
			if(current.left!=null)
				queue.add(current.left);
			//��Ԫ�ص��Һ��ӽ�㲻Ϊ�գ���Ӷ�β����
			if(current.right!=null)
				queue.add(current.right);
		}
	 
	}
}
