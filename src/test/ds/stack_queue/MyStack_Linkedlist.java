package test.ds.stack_queue;

/**�õ�����ʵ��ջ�������ɾ�����ڱ�ͷ���У�topʼ��ָ���ͷ
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
	
	public Object pop(){//������ͷ��������
		if(!isEmpty()){
			Object data=peek();
			top=top.next;
			return data;
		}
		return null;
	}
	
	public boolean push(Object obj){//������ͷ��������
		Node newNode=new Node(obj);
		newNode.next=top;
		top=newNode;
		return true;
	}
}
