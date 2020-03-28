package org.vincent.datastructure.stack_queue;

/**用两个队列模拟栈
 * 入栈：
 * 出栈：
 * @author lenovo
 *
 */
public class MyStackByTwoQueue {
	MyQueue_Linkedlist q1=new MyQueue_Linkedlist();
	MyQueue_Linkedlist q2=new MyQueue_Linkedlist();
	
	public void push(Object obj){
		q1.put(obj);//每回数据存入q1
	}
	public Object pop(){
		if(q1.isEmpty()) return null;//如果q1为空则，模拟栈为空
		if(q1.size()==1){//如果q1还有一个元素，则出队列(模拟栈中只有一个元素)
			return q1.pop();
		}else {
			while(q1.size()!=1){//q1中元素个数不为1，则将q1中留一个元素，其它元素入队列q2
				q2.put(q1.pop());
			}
			while(!q2.isEmpty()){
				q1.put(q2.pop());//再将队列q2中元素入队列q1
			}
			return q1.pop();
		}
		
	}

}
