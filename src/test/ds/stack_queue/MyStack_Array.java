package test.ds.stack_queue;

public class MyStack_Array {

	private Object[] stack;//��ʼ��һ����������ģ��ջ
	private int size;//ջ��Ԫ�صĴ�С

	public MyStack_Array() {
		stack = new Object[10];//���������ʼ������
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Object peek() {//����ջ��Ԫ�أ���ɾ��
		if (!isEmpty()) {
			return stack[size - 1];
		}
		return null;
	}

	public Object pop(){//����ջ��Ԫ�أ���ɾ��
		Object obj=peek();
		stack[size-1]=null;//ɾ��
		size--;
		return obj;
	}

	public boolean push(Object obj) {
		ensureCapacity(size+1);//����
		stack[size++]=obj;
		return true;
	}

	private void ensureCapacity(int size) {
		int len=stack.length;
		if(size>len){
			Object[] newStack=new Object[stack.length*2];//�µ�����Ϊԭ����������������
			System.arraycopy(stack, 0, newStack, 0, stack.length);//��ԭ�������鿽����������
			stack=newStack;//ԭ���������ָ��������
		}
	}

}
