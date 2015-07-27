package test.ds.tree;

public class TreeTest {
	public static void main(String[] args) {
		int[] arr={30,21,23,24,33,40,41,10,11,31,18,36};
		
		BinarySortTree sortTree=new BinarySortTree();
		
		sortTree.buildTree(arr);
		
		System.out.println("前序遍历：");
		sortTree.preOrder();
		
		System.out.println("中序遍历");
		sortTree.inOrder();
		
		System.out.println("后序遍历：");
		sortTree.postOrder();
	}

}
