package org.vincent.datastructure.stack_queue;

/**
 * 用单链表实现队列，需要指定头结点和尾结点。</br> 从尾部添加新结点，从头部弹出结点。</br>
 * 
 * @author lenovo
 */
public class MyQueue_Linkedlist {
	private Node head=null ;//指定头结点
	private Node tail=null ;//指定尾结点

	public boolean isEmpty() {
		return this.head==null&&this.tail==null;//当头结点等于尾结点时，表明队列为空
	}

	public void put(Object obj) {
		Node newNode = new Node(obj);
		if (!isEmpty()) { // 如果队列为空
			tail.next = newNode;
		} else {// 不为空，在尾部插入
			head=newNode;
		}
		tail=newNode;
	}

	/**从链表头开始出队列
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
