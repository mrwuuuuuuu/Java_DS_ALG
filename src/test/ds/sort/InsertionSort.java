package test.ds.sort;

/**���������㷨˼�룺</br>
 * ����һ��ָ����¼�������һ����¼�Գ��������У������¼����</br>
 * ���Ŵӵڶ�����¼��ʼ�����մ�С���ν���ǰ����ļ�¼����ǰ�����������С�</br>
 * @author Vincent
 */
public class InsertionSort {
	/**�㷨ִ�в��裺</br>
	 * 1������ǰ����ļ�¼����temp(�ճ���ǰ��¼��λ�ã�����ǰ�������ƶ�)</br>
	 * 2�����������У��Ӻ���ǰ������ֱ����ǰ����ļ�¼(j>=0&&temp<arr[j]ΪfalseΪֹ)</br>
	 * 3��ÿ�α������������ݺ���һλ��Ϊ�����������������λ</br>
	 * 4������ǰ�����¼����arr[j+1]��</br>
	 * @param arr
	 * @return
	 */
	public static int[] insertSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int j;
			int temp=arr[i];
			for(j=i-1;j>=0&&temp<arr[j];j--){//ÿ����Ҫ�Ƚϵ�ǰ���ź�������һ��Ԫ�أ������һλԪ��
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
		return arr;
	}
}
