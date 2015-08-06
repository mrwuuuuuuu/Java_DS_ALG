package test.ds.stack_queue;

/**8.2.5如何使用连个栈模拟队列
 * 入队：直接将数据入栈S1
 * 出队：检查栈S2是否为空，为空直接将S1数据全部出栈入S2，接着从S2中弹出数据
 * @author lenovo
 */
public class MyQueueByTwoStack {
	private MyStack_Linkedlist s1=new MyStack_Linkedlist();
	private MyStack_Linkedlist s2=new MyStack_Linkedlist();
	
	public void put(Object obj){//入队的数据直接进入栈s1
		s1.push(obj);
	}
	
	public Object pop(){
		if(s2.isEmpty()){//出队时，检查栈s2是否为空
			while(!s1.isEmpty()){//s2为空时，将s1的数据全部弹出入s2
				s2.push(s1.pop());
			}
		}
		return s2.pop();//不为空，直接弹出s2栈顶元素
	}
	
	public boolean isEmpty(){
		return s1.isEmpty()&&s2.isEmpty();
	}

}
