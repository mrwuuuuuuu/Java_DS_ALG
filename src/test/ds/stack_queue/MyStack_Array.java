package test.ds.stack_queue;

public class MyStack_Array {

	private Object[] stack;//初始化一个数组用来模拟栈
	private int size;//栈内元素的大小

	public MyStack_Array() {
		stack = new Object[10];//构造器类初始化数组
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Object peek() {//返回栈顶元素，不删除
		if (!isEmpty()) {
			return stack[size - 1];
		}
		return null;
	}

	public Object pop(){//返回栈顶元素，并删除
		Object obj=peek();
		stack[size-1]=null;//删除
		size--;
		return obj;
	}

	public boolean push(Object obj) {
		ensureCapacity(size+1);//扩容
		stack[size++]=obj;
		return true;
	}

	private void ensureCapacity(int size) {
		int len=stack.length;
		if(size>len){
			Object[] newStack=new Object[stack.length*2];//新的数组为原来数组容量的两倍
			System.arraycopy(stack, 0, newStack, 0, stack.length);//将原来的数组拷贝给新数组
			stack=newStack;//原数组的引用指向新数组
		}
	}

}
