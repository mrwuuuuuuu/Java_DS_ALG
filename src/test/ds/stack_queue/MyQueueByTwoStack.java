package test.ds.stack_queue;

/**8.2.5���ʹ������ջģ�����
 * @author lenovo
 *
 */
public class MyQueueByTwoStack {
	private MyStack_Linkedlist s1=new MyStack_Linkedlist();
	private MyStack_Linkedlist s2=new MyStack_Linkedlist();
	
	public void put(Object obj){//��ӵ�����ֱ�ӽ���ջs1
		s1.push(obj);
	}
	
	public Object pop(){
		if(s2.isEmpty()){//����ʱ�����ջs2�Ƿ�Ϊ��
			while(!s1.isEmpty()){//s2Ϊ��ʱ����s1������ȫ��������s2
				s2.push(s1.pop());
			}
		}
		return s2.pop();//��Ϊ�գ�ֱ�ӵ���s2ջ��Ԫ��
	}
	
	public boolean isEmpty(){
		return s1.isEmpty()&&s2.isEmpty();
	}

}
