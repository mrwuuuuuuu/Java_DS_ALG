package test.ds.sort;
/**
 * �鲢����Ļ���˼�룺</br>
 * ���õݹ�����μ������������л��ֳ�ΪԽ��ԽС�İ��ӱ�</br>
 * ������õݹ鷽�����ź���İ��ӱ�ϲ���ΪԽ��Խ����������С�</br>
 * @author Vincent
 */
public class MergeSortTest {
	/**�ϲ���������
	 * @param arr
	 * @param low
	 * @param mid
	 * @param high
	 */
	private static void mergeArray(int[] arr,int low,int mid,int high){
		int al=mid-low+1;//������Ԫ�ظ���
		int ar=high-mid;//������Ԫ�ظ���
		
		//�½���������
		int[] AL=new int[al];
		int[] AR=new int[ar];
		
		//��ԭ�����е�Ԫ�طֱ𸳸�����������
		 for(int i=0,k=low;i<al;i++,k++){//�������low��ʼ
			 AL[i]=arr[k];
		 }
		 for(int j=0,k=mid+1;j<ar;j++,k++){//�������mid+1��ʼ
			 AR[j]=arr[k];
		 }
		 
		 int l=0,r=0,a=low;
		 
		 //�ֱ�����������飬���кϲ�
		 while(l<al&&r<ar){
			 if(AL[l]<=AR[r])
				 arr[a++]=AL[l++];//ԭ������±�ÿ�δ�low��ʼ
			 else
				 arr[a++]=AR[r++];
		 }
		 
		 //����/��������û�кϲ���Ԫ�ؼ���ԭ����
		 while(l<al) arr[a++]=AL[l++];
		 while(r<ar)  arr[a++]=AR[r++];
	}
	
	/**�ݹ����mergeSort����������ԭ���飬ֱ��low<high������λ��
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	public static int[] mergeSort(int[] arr,int low,int high){
		//�ݹ黮������
		int mid=(low+high)/2;
		if(low<high){
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			mergeArray(arr,low,mid,high);
		}
		return arr;
	}
}
