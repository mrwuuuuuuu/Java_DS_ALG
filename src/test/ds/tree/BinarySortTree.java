package test.ds.tree;

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
	
	/**ǰ�����
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
	
	/**�������
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
	
	/**�������
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
