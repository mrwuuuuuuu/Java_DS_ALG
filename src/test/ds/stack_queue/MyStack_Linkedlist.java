package test.ds.stack_queue;

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
	
	public Object pop(){//用链表头弹出数据
		if(!isEmpty()){
			Object data=peek();
			top=top.next;
			return data;
		}
		return null;
	}
	
	public boolean push(Object obj){//从链表头加入数据
		Node newNode=new Node(obj);
		newNode.next=top;
		top=newNode;
		return true;
	}
}
