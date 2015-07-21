package test.ds.sort;

public class HeapSort {
	private static void adjustHeap(int[] arr, int low, int high) {
		int i=low;//������Ķѵĸ����
		int j=i*2+1;//�ø��������ӽ��
		int temp=arr[i];
		while(j<=high){
			if(j<high&&arr[j]>arr[j+1])//�������ֵ�����ҽڵ��ֵʱ,j++����arr[j]ʼ�մ������Һ��ӽ���н�С�Ľ�㣩
				j++;
			if(temp>arr[j]){//����ѵĸ����������Һ��ӽڵ��н�С�Ľ��
				arr[i]=arr[j];//�򽫽�С�ĺ��ӽ�����ڶѵĸ��ڵ㴦
				i=j;//ͬʱi��j����һ�㣬���Ŵ�����һ��Ķ�
				j=i*2+1;
			}else {
				j=high+1;//ʹwhileѭ��ֹͣ
			}
			arr[i]=temp;//����Ҫ����Ķѵĸ���������ȷ��λ��
		}
	}
	
	public static int[] heapSort(int[] arr) {
		int n=arr.length;//����ĳ��ȣ������������洢��ȫ������
		
		//��ԭʼ���ݵ���Ϊһ����С��
		for(int i=n/2-1;i>=0;i--){//����ȫ�������ĵײ��ĵ�һ����Ҷ��㿪ʼ������С��
			adjustHeap(arr, i, n-1);
		}
		
		//���ж�����
		for(int i=n-1;i>0;i--){//iÿ��ָ����е����һ��Ҷ�ӽ��
			int temp=arr[0];//arr[0]ÿ�ζ��Ƕ�����С��Ԫ��
			arr[0]=arr[i];//���������һ��Ҷ�����arr[0]����
			arr[i]=temp;
			adjustHeap(arr, 0, i-1);//ÿ�ν����һ��Ҷ������ڶѶ�ʱ����Ҫ���µ���������
		}
		return arr;
	}
}
