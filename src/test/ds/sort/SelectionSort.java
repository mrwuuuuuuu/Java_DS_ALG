package test.ds.sort;
/**
 * ѡ�������ԭ��</br>
 * ���ڸ���һ���¼��������һ�ֱȽϺ�õ���С�ļ�¼��Ȼ�󽫸ü�¼���һ����¼��λ�ý��н�����</br>
 * �ڶ��ֶԲ�������һ����¼��Ԫ�أ��ظ����ϲ�����</br>
 * @author Vincent
 */
public class SelectionSort {
	/**�㷨1��Ȼ����ʵ�����򣬶���ֻҪ���ֱȵ�ǰԪ��С�����ݾ�Ҫ������Ч�ʵ�
	 * @param arr
	 * @return
	 */
	public static int[] selectSort01(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){//����Ԫ�صıȽϣ�arr[j]<arr[i]��Ҫ����
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	/**�㷨���裺(ÿ���ڲ�ѭ����������ƶ�����)</br>
	 * 1�����ѭ��ÿ�ε�ֵ���Ϊ��ʱ��Сֵ(temp)������¼���±�(flag)</br>
	 * 2���ڲ�ѭ��������ֵ��temp���Ƚϣ�temp��¼��ǰ��С��ֵ������flag������±�</br>
	 * 3����flag��i���Ƚϣ�������ȣ����ʾarr[i]�����б���С��Ԫ�أ���ʱ��������</br>
	 * @param arr
	 * @return
	 */
	public static int[] selectSort02(int[] arr){
		int flag;
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			flag=i;//flagΪ��ǰ��Сֵ��ʶ
			for(int j=i+1;j<arr.length;j++){//����arr[i]�����Ԫ��
				if(temp>arr[j]){
					temp=arr[j];//tempΪ��СԪ�ص�ֵ
					flag=j;//��flag��¼��Сֵ�±�
				}
			}
			if(flag!=i){//��Сֵ�±겻Ϊi����arr[i]�����б���С��Ԫ��
				arr[flag]=arr[i];
				arr[i]=temp;
			}
		}
		return arr;
	}
}
