package test.ds.stack_queue;

public class MyStackByTwoQueue {
	MyQueue_Linkedlist q1=new MyQueue_Linkedlist();
	MyQueue_Linkedlist q2=new MyQueue_Linkedlist();
	
	public void push(Object obj){
		q1.put(obj);//ÿ�����ݴ���q1
	}
	public Object pop(){
		if(q1.isEmpty()) return null;//���q1Ϊ����ģ��ջΪ��
		if(q1.size()==1){//���q1����һ��Ԫ�أ��������(ģ��ջ��ֻ��һ��Ԫ��)
			return q1.pop();
		}else {
			while(q1.size()!=1){//q1��Ԫ�ظ�����Ϊ1����q1����һ��Ԫ�أ�����Ԫ�������q2
				q2.put(q1.pop());
			}
			while(!q2.isEmpty()){
				q1.put(q2.pop());//�ٽ�����q2��Ԫ�������q1
			}
			return q1.pop();
		}
		
	}

}
