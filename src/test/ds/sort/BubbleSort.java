package test.ds.sort;

/**ð���������˼�룺</br>
 * �Ƚ���������Ԫ�صĴ�С����������򽻻���</br>
 * �����������У�ÿһ�˱�ɨ������������е����Ԫ�ؽ���������λ�á�</br>
 * @author Vincent
 */
public class BubbleSort {
	/**
	 * ð������Ĳ��裺</br>
	 * 1����ѭ���������ĩβ��ʼ������ÿ�α�����������������������β��</br>
	 * 2����ѭ���������ͷ����ʼ��������ѭ����־λi����</br>
	 * 3����ѭ���е�ǰ���������ݺͺ�һλ���ݷ����򽻻�</br>
	 * 4��ÿһ����ѭ����������ǰ���������Ԫ�ر���������ĩβ</br>
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort01(int[] arr){
		//��ѭ����β��ͷ��ÿ��ѭ�����������Ԫ�ر��׵����λ��
		for(int i=arr.length-1;i>0;i--){
			//��ѭ����ͷ��i���������arr[j]>arr[j+1]���򽫽ϴ�������ں���
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					//����
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}

		}
		return arr;
	}
	
	/**���ý�����ʶ���Լ�����ν�ı���
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort02(int[] arr){
		//���ý�����ʶ
		boolean flag=true;
		//�����һ�α���û�з������ݽ��������ʾ��ǰ������������
		for(int i=arr.length-1;i>0&&flag;i--){
			flag=false;
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			System.out.print("��"+(arr.length-i)+"������");
			for(int x:arr){
				System.out.print(x+"\t");
			}
			System.out.println();
		}
		return arr;
	}
}
