package org.vincent.study.ds.stack_queue;

/**8.2.3 如何利用O(1)的时间复杂度求栈中最小元素</br>
 * 思想：</br>
 * 1、由于每次出栈和进栈都可能会使栈的最小元素发生变化，所以考虑用一个辅助的栈空间来存储每次进栈和出栈之后的最小元素。</br>
 * 2、最小元素栈的栈顶元素，都是当前元素栈中的最小元素的值。</br>
 * 3、最小元素栈根据元素栈中的元素进出栈，而修改栈顶元素。</br>
 * @author lenovo
 *
 */
public class FindMin {
	
	MyStack_Linkedlist elemStack;//用于存放数据
	MyStack_Linkedlist minStack;//用于存放当前数据中的最小元素
	
	public FindMin(){//初始化
		elemStack=new MyStack_Linkedlist();
		minStack=new MyStack_Linkedlist();
	}
	
	public void push(Object obj){//把元素压入栈
		elemStack.push(obj);//元素压入数据栈
		if(minStack.isEmpty()){//此时如果最小元素栈为空
			minStack.push(obj);//当前元素压入栈
		}else{
			if((int)obj<(int)minStack.peek()){//如最小元素栈不为空，则比较压入元素栈的数据和最小元素栈栈顶元素的值
				minStack.push(obj);//如果小，则将当前入栈的元素压入最小元素栈
			}
		}
	}
	
	public Object pop(){
		Object topData=elemStack.pop();//元素栈中的元素出栈
		if(topData==minStack.peek()){//获得最小元素栈栈顶元素，与当前出栈的元素比较
			minStack.pop();//如果出栈元素与最小元素栈栈顶元素相等，最小元素栈定元素出栈
		}
		return topData;
	}
}
