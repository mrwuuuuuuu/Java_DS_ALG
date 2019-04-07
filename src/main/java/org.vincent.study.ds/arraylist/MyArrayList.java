package org.vincent.study.ds.arraylist;

/**�Լ�ʵ��ArrayList</br>
 * ArrayList�ĵײ�ʵ��Ϊ���飬�����а���Ų���ʱЧ�ʽϸߡ�</br>
 * ���ǽ��в��룬ɾ���Ȳ���ʱ�����ƶ������ݽ϶࣬Ч�ʵ͡�</br>
 * ArrayList�����̰߳�ȫ�ģ�����Ч�����VectorҪ�ߡ�</br>
 * @author Vincent
 *
 */
public class MyArrayList {
	private Object[] elementData;
	private int size;
	//����Ĭ�ϵ�ArrayList����
	private static final int DEFAULT_VALUE=10;
	
	public MyArrayList(){
		this(DEFAULT_VALUE);
	}
	
	//��ʼ��ArrayList�ĳ���
	public MyArrayList(int initialCapacity){
		if(initialCapacity<0){
			try {
				throw new Exception("size���ò�����");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.elementData=new Object[initialCapacity];//���ݸ���ֵ��ʼ������
	}
	public int size(){
		return size;
	}
	public boolean add(Object obj){
		//�������ݺ����ݵĿ���
		ensureCapacity();
		elementData[size++]=obj;
		return true;
	}
	
	/**
	 * ��ָ��λ�ò���ĳֵ
	 * @param index
	 * @param obj
	 * @return
	 */
	public void add(int index,Object obj){
		rangeCheck(index);
		ensureCapacity();
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		elementData[index]=obj;
		size++;
	}
	
	/**�ж�ArrayList�Ƿ�Ϊ��
	 * @return true or false
	 */
	public boolean isEmpty(){
		return size==0;
	}
	
	/**����ָ��λ�õĶ���
	 * @param index �±�
	 * @return 
	 */
	public Object get(int index){
		rangeCheck(index);
		return elementData[index];
	}
	
	/**�Ƴ�ָ��λ�õĶ���
	 * @param index �±�
	 */
	public Object remove(int index){
		rangeCheck(index);
		Object oldValue=elementData[index];
		int numMove=size-index-1;
		if(numMove>0){
			System.arraycopy(elementData, index+1, elementData, index, numMove);
		}
		elementData[--size]=null;
		return oldValue;
	}
	
	/**�Ƴ������Ķ���
	 * @param obj  ��������
	 * @return
	 */
	public boolean remove(Object obj){
		if(obj==null){
			for(int i=0;i<size;i++){
				if(elementData[i]==null){
					remove(i);
					return true;
				}
			}
		}else {
			for(int i=0;i<size;i++){
				if(obj.equals(elementData[i])){
					remove(i);
					return true;
				}
			}
		}
		return false;
			
	} 
	
	/**��ָ��λ���滻ĳֵ
	 * @param index
	 * @param obj
	 */
	public Object set(int index,Object obj){
		rangeCheck(index);
		Object oldValue=elementData[index];
		elementData[index]=obj;
		return oldValue;
	}
	
	/**��Χ���
	 * @param index
	 */
	private void rangeCheck(int index){
		if(index<0||index>=size){
			try {
				throw new Exception("size���ò�����");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * ����
	 */
	private void ensureCapacity(){
		if(size==elementData.length){
			Object[] newArray=new Object[size*2+1];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			this.elementData=newArray;//��elementDataָ���µ���������
		}
	}
	
	public static void main(String[] args) {
		MyArrayList list=new MyArrayList();
		list.add(1111);
		list.add(1111);
		list.add(3333);
		list.add(7777);
		list.add(5555);
		list.add(6666);
		list.add(7777);
		list.add(7777);
		list.add(7777);
		list.add(7777);
		System.out.println("test size():"+list.size());
		System.out.println("test get(1):"+list.get(1));
		System.out.println("test set(1,2222):"+list.set(1, 2222));
		System.out.println("test remove(5):"+list.remove(5));
		System.out.println("test remove(7777):"+list.remove((Object)7777));
		System.out.println("test isEmpty():"+list.isEmpty());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		
		
	}

}
