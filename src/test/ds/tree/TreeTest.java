package test.ds.tree;

public class TreeTest {
	public static void main(String[] args) {
		int[] arr={30,21,23,24,33,40,41,10,11,31,18,36};
		
		BinarySortTree sortTree=new BinarySortTree();
		
		sortTree.buildTree(arr);
		
		System.out.print("ǰ�������");
		sortTree.preOrder();
		System.out.print("�ǵݹ�ǰ��");
		sortTree.preTraverse();
		System.out.println();
		
		System.out.print("���������");
		sortTree.inOrder();
		System.out.print("�ǵݹ��У�");
		sortTree.inTraverse();
		System.out.println();
		
		System.out.print("���������");
		sortTree.postOrder();
		System.out.print("�ǵݹ��");
		sortTree.postTraverse();
		
		System.out.print("���������");
		sortTree.layerTraverse();
		
		
	}

}
