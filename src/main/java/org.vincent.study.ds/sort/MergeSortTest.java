package org.vincent.study.ds.sort;
/**
 * 归并排序的基本思想：</br>
 * 利用递归与分治技术将数据序列划分成为越来越小的半子表，</br>
 * 最后在用递归方法将排好序的半子表合并成为越来越大的有序序列。</br>
 * @author Vincent
 */
public class MergeSortTest {
	/**合并左右数组
	 * @param arr
	 * @param low
	 * @param mid
	 * @param high
	 */
	private static void mergeArray(int[] arr,int low,int mid,int high){
		int al=mid-low+1;//左数组元素个数
		int ar=high-mid;//右数组元素个数
		
		//新建左右数组
		int[] AL=new int[al];
		int[] AR=new int[ar];
		
		//将原数组中的元素分别赋给左右新数组
		 for(int i=0,k=low;i<al;i++,k++){//左数组从low开始
			 AL[i]=arr[k];
		 }
		 for(int j=0,k=mid+1;j<ar;j++,k++){//右数组从mid+1开始
			 AR[j]=arr[k];
		 }
		 
		 int l=0,r=0,a=low;
		 
		 //分别遍历左右数组，进行合并
		 while(l<al&&r<ar){
			 if(AL[l]<=AR[r])
				 arr[a++]=AL[l++];//原数组的下标每次从low开始
			 else
				 arr[a++]=AR[r++];
		 }
		 
		 //将左/右数组中没有合并的元素加入原数组
		 while(l<al) arr[a++]=AL[l++];
		 while(r<ar)  arr[a++]=AR[r++];
	}
	
	/**递归调用mergeSort方法，划分原数组，直到low<high不成立位置
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	public static int[] mergeSort(int[] arr,int low,int high){
		//递归划分序列
		int mid=(low+high)/2;
		if(low<high){
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			mergeArray(arr,low,mid,high);
		}
		return arr;
	}
}
