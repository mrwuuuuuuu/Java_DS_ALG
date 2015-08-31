package test.ds.tree;

public class BinaryTree {
	private BinaryNode root;
	public BinaryTree(){
		root=null;
	}
	
	/**
	 * ������������ͺ�������ع�������
	 */
	public void initTree(int[] preOrder,int[] inOrder){
		this.root=initTree(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
	}
	
	public BinaryNode initTree(int[] preOrder,int start1,int end1,int[] inOrder,int start2,int end2){
		if(start1>end1||start2>end2) return null;
		
		//ȷ��������ֵ
		int rootData=preOrder[start1];
		//�½������
		BinaryNode root=new BinaryNode(rootData);
		
		//������������ҳ�������λ�ã�������������
		int rootIndex=findIndexInArray(inOrder, rootData, start2, end2);
		
		//offSet��ʾ������������������
		int offSet=rootIndex-start2-1;
		
		//�ݹ鹹��������
		BinaryNode left=initTree(preOrder, start1+1,start1+1+offSet, inOrder, start2, start2+offSet);
		//�ݹ鹹��������
		BinaryNode right=initTree(preOrder, start1+offSet+2, end1, inOrder, rootIndex+1, end2);
		
		root.left=left;
		root.right=right;
		return root;
	}
	//�ҵ�data��Array�����е�λ��
	private int findIndexInArray(int[] array,int data,int start,int end){
		for(int i=start;i<=end;i++){
			if(array[i]==data) return i;
		}
		return -1;
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
}
