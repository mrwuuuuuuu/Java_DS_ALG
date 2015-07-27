package test.ds.tree;

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
	
	/**前序遍历
	 * @param localRoot
	 */
	public void preOrder(BinaryNode localRoot){
		if(localRoot!=null){
			System.out.print(localRoot.data+"\t");
			preOrder(localRoot.left);
			preOrder(localRoot.right);
		}
	}
	public void preOrder(){
		this.preOrder(root);
	}
	
	/**中序遍历
	 * @param localRoot
	 */
	public void inOrder(BinaryNode localRoot){
		if(localRoot!=null){
			inOrder(localRoot.left);
			System.out.print(localRoot.data+"\t");
			inOrder(localRoot.right);
		}
	}
	public void inOrder(){
		this.inOrder(root);
	}
	
	/**后序遍历
	 * @param localRoot
	 */
	public void postOrder(BinaryNode localRoot){
		if(localRoot!=null){
			postOrder(localRoot.left);
			postOrder(localRoot.right);
			System.out.print(localRoot.data+"\t");
		}
	}
	public void postOrder(){
		this.postOrder(root);
	}

}
