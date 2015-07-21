package test.ds.sort;

/**���������Ƕ�ð�������һ�ָĽ���</br>
 * ����˼�룺</br>
 * ͨ��һ�����򽫴��ż�¼�ָ�ɶ����������磬����һ���ּ�¼�Ĺؼ��ֱ���һ���ּ�¼�Ĺؼ���С��</br>
 * ���ŶԷֱ�����������¼�������������Դﵽ������������</br>
 * @author Vincent
 *
 */
public class QuickSort {
	/**���ùؼ��������������У��ڹؼ�����ߵĶ��ȹؼ���С���ڹؼ����ұߵĶ��ȹؼ��ִ�</br>
	 * partion�������ص��ǹؼ���������λ�á�</br>
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int partion(int[] arr,int low,int high){
		int privotKey=arr[low];//������ĵ�һ��Ԫ������Ϊ�ؼ��֡�
		while(low<high){//low<high����ѭ������
			while(low<high&&arr[high]>=privotKey) high--;//�������β����ʼ��ǰ���������Ԫ�ض��ȹؼ��ִ��±�high--
			if(low<high){//�������arr[high]<privotKey,��arr[high]����arr[low]��λ�ã�������privotKey���
				arr[low]=arr[high];
				low++;//�±�low++
			} 
			while(low<high&&arr[low]<=privotKey) low++;//������һͷ��ʼ���������������Ԫ�ض���privotKeyС���±�low++
			if(low<high){//�������arr[low]>privotKey,��arr[low]����arr[high]��λ�ã�������privotKey�ұ�
				arr[high]=arr[low];
				high--;//�ƶ������ݣ��±�high--
			}
			//����ѭ���������������ѭ��ֹͣ������Ϊlow=high�����ҳ��˹ؼ���Ӧ�ô�ŵ�λ��
		}
		arr[low]=privotKey;//ѭ��ֹͣ���ҳ��˹ؼ���Ӧ�ô�ŵ�λ�ã����ؼ�����ߵ����ж��ȹؼ���С���ؼ����ұߵ����ж��ȹؼ��ִ�
		return low;//���عؼ���������λ��
	}
	
	/**quickSort��������ÿ�λ�õĹؼ���������λ�ã��ֱ�Թؼ����������ߵ����еݹ�����
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	public static int[] quickSort(int[] arr,int low,int high){
		if(low<high){
			int privotLoc=partion(arr, low, high);
			quickSort(arr, low, privotLoc-1);
			quickSort(arr, privotLoc+1, high);
		}
		return arr;
	}
}
