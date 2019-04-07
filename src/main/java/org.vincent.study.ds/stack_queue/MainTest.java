package org.vincent.study.ds.stack_queue;

public class MainTest {
	public static void main(String[] args) {
		MyStackByTwoQueue stack=new MyStackByTwoQueue();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
