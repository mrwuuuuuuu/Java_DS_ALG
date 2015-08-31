package test.ds.stack_queue;

public class MyQueue_Array {
	private Object[] queue=null;
	private int size=0;
	
	public MyQueue_Array(){
		queue=new Object[10];
	}
	
	public boolean isEmpty(){
		return queue.length==0;
	}
	
	public int size(){
		return size;
	}
	
	public void put(Object obj){
		ensureCapacity(size+1);
		queue[size++]=obj;
	}
	
	public Object pop(){
		if(isEmpty()) return null;
		Object obj=queue[0];
		System.arraycopy(queue, 1, queue, 0, queue.length-1);
		size--;
		return obj;
	}
	
	private void ensureCapacity(int n){
		if(n>queue.length){
			Object[] newArray=new Object[size*2];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue=newArray;
		}
	}

}
