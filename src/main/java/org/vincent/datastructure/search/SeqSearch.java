package org.vincent.datastructure.search;

public class SeqSearch {
	/**
	 *  �����˳�����</br>
	 * ʱ�临�Ӷ�ΪO(n)</br>
	 * @param data �ַ�����
	 * @param element ������Ԫ��
	 */
	public static  void Search(String[] data,String element){
		for(int i=0;i<data.length;i++){
			if(data[i].equals(element)){
				System.out.println("˳�����"+element+":"+i);
			}
		}
	}
}
