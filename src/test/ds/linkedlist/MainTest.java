package test.ds.linkedlist;

public class MainTest {
public static void main(String[] args) {
	MyLinkedList list=new MyLinkedList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	
	list.printList();
	System.out.println();
	list.ReverseList();
	list.printList();
}	

}
