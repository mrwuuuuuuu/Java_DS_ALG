package test.ds.stack_queue;

/**8.2.3 �������O(1)��ʱ�临�Ӷ���ջ����СԪ��</br>
 * ˼�룺</br>
 * 1������ÿ�γ�ջ�ͽ�ջ�����ܻ�ʹջ����СԪ�ط����仯�����Կ�����һ��������ջ�ռ����洢ÿ�ν�ջ�ͳ�ջ֮�����СԪ�ء�</br>
 * 2����СԪ��ջ��ջ��Ԫ�أ����ǵ�ǰԪ��ջ�е���СԪ�ص�ֵ��</br>
 * 3����СԪ��ջ����Ԫ��ջ�е�Ԫ�ؽ���ջ�����޸�ջ��Ԫ�ء�</br>
 * @author lenovo
 *
 */
public class FindMin {
	
	MyStack_Linkedlist elemStack;//���ڴ������
	MyStack_Linkedlist minStack;//���ڴ�ŵ�ǰ�����е���СԪ��
	
	public FindMin(){//��ʼ��
		elemStack=new MyStack_Linkedlist();
		minStack=new MyStack_Linkedlist();
	}
	
	public void push(Object obj){//��Ԫ��ѹ��ջ
		elemStack.push(obj);//Ԫ��ѹ������ջ
		if(minStack.isEmpty()){//��ʱ�����СԪ��ջΪ��
			minStack.push(obj);//��ǰԪ��ѹ��ջ
		}else{
			if((int)obj<(int)minStack.peek()){//����СԪ��ջ��Ϊ�գ���Ƚ�ѹ��Ԫ��ջ�����ݺ���СԪ��ջջ��Ԫ�ص�ֵ
				minStack.push(obj);//���С���򽫵�ǰ��ջ��Ԫ��ѹ����СԪ��ջ
			}
		}
	}
	
	public Object pop(){
		Object topData=elemStack.pop();//Ԫ��ջ�е�Ԫ�س�ջ
		if(topData==minStack.peek()){//�����СԪ��ջջ��Ԫ�أ��뵱ǰ��ջ��Ԫ�رȽ�
			minStack.pop();//�����ջԪ������СԪ��ջջ��Ԫ����ȣ���СԪ��ջ��Ԫ�س�ջ
		}
		return topData;
	}
}
