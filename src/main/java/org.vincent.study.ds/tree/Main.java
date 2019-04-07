package org.vincent.study.ds.tree;

public class Main {
	public static void main(String[] args) {
		BinaryTree bTree=new BinaryTree();
		int[] preOrder={1,2,4,8,9,5,10,3,6,7};
		int[] inOrder={8,4,9,2,10,5,1,6,3,7};
		bTree.initTree(preOrder, inOrder);
		bTree.postOrder();
	}

}
