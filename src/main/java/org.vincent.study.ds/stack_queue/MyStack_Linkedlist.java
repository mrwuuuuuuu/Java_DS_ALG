package org.vincent.study.ds.stack_queue;

/**用单链表实现栈，插入和删除都在表头进行，top始终指向表头
 * @author lenovo
 *
 */
public class MyStack_Linkedlist {
	Node top=null;
	
	public boolean isEmpty(){
		return top==null;
	}
	
	public Object peek(){
		if(!isEmpty()){
			return top.data;
		}
		return null;
	}
	
	public Object pop(){
		if(!isEmpty()){
			Object data=peek();
			top=top.next;
			return data;
		}
		return null;
	}
	
	public boolean push(Object obj){
		Node newNode=new Node(obj);
		newNode.next=top;
		top=newNode;
		return true;
	}
}
