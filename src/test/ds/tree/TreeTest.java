package test.ds.tree;

public class TreeTest {
	public static void main(String[] args) {
		int[] arr={30,21,23,24,33,40,41,10,11,31,18,36};
		
		BinarySortTree sortTree=new BinarySortTree();
		
		sortTree.buildTree(arr);
		
		System.out.println("ǰ�������");
		sortTree.preOrder();
		
		System.out.println("�������");
		sortTree.inOrder();
		
		System.out.println("���������");
		sortTree.postOrder();
	}

}
