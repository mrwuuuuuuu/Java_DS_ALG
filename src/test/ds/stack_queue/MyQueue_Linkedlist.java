package test.ds.stack_queue;

/**
 * �õ�����ʵ�ֶ��У���Ҫָ��ͷ����β��㡣</br> ��β������½�㣬��ͷ��������㡣</br>
 * 
 * @author lenovo
 * 
 */
public class MyQueue_Linkedlist {
	private Node head=null ;//ָ��ͷ���
	private Node tail=null ;//ָ��β���

	public boolean isEmpty() {
		return this.head==null&&this.tail==null;//��ͷ������β���ʱ����������Ϊ��
	}

	public void put(Object obj) {
		Node newNode = new Node(obj);
		if (!isEmpty()) { // �������Ϊ��
			tail.next = newNode;
		} else {// ��Ϊ�գ���β������
			head=newNode;
		}
		tail=newNode;
	}

	/**������ͷ��ʼ������
	 * @return
	 */
	public Object pop() {
		Object obj = null;
		if (!this.isEmpty()) {
			obj = head.data;
			head = head.next;
			if(head==null) tail=null;
		}
		return obj;
	}

	public int size() {
		Node tmp = head;
		int size = 0;
		while (tmp != null) {
			size++;
			tmp = tmp.next;
		}
		return size;
	}

}
