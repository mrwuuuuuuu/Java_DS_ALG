package test.ds.tree;

public class BinaryTree {
	private BinaryNode root;
	public BinaryTree(){
		root=null;
	}
	
	/**
	 * 根据先序遍历和后序遍历重构二叉树
	 */
	public void initTree(int[] preOrder,int[] inOrder){
		this.root=initTree(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
	}
	
	public BinaryNode initTree(int[] preOrder,int start1,int end1,int[] inOrder,int start2,int end2){
		if(start1>end1||start2>end2) return null;
		
		//确定根结点的值
		int rootData=preOrder[start1];
		//新建根结点
		BinaryNode root=new BinaryNode(rootData);
		
		//在中序遍历中找出根结点的位置，划分左右子树
		int rootIndex=findIndexInArray(inOrder, rootData, start2, end2);
		
		//offSet表示根结点的左子树结点个数
		int offSet=rootIndex-start2-1;
		
		//递归构建左子树
		BinaryNode left=initTree(preOrder, start1+1,start1+1+offSet, inOrder, start2, start2+offSet);
		//递归构建右子树
		BinaryNode right=initTree(preOrder, start1+offSet+2, end1, inOrder, rootIndex+1, end2);
		
		root.left=left;
		root.right=right;
		return root;
	}
	//找到data在Array数组中的位置
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
	
	/**递归后序遍历
	 * @param localRoot
	 */
	public void postOrder(){
		this.postOrder(root);
		System.out.println();
	}
}
