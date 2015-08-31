package test.ds.tree;

public class TreeTest {
	public static void main(String[] args) {
		int[] arr={30,21,23,24,33,40,41,10,11,31,18,36};
		
		BinarySortTree sortTree=new BinarySortTree();
		
		sortTree.buildTree(arr);
		
		System.out.print("前序遍历：");
		sortTree.preOrder();
		System.out.print("非递归前：");
		sortTree.preTraverse();
		System.out.println();
		
		System.out.print("中序遍历：");
		sortTree.inOrder();
		System.out.print("非递归中：");
		sortTree.inTraverse();
		System.out.println();
		
		System.out.print("后序遍历：");
		sortTree.postOrder();
		System.out.print("非递归后：");
		sortTree.postTraverse();
		
		System.out.print("���������");
		sortTree.layerTraverse();
		
		
	}

}
