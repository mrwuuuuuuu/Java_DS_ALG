package org.vincent.study.ds.sort;
/**
 * 选择排序的原理：</br>
 * 对于给定一组记录，经过第一轮比较后得到最小的记录，然后将该记录与第一个记录的位置进行交换。</br>
 * 第而轮对不包括第一个记录的元素，重复如上操作。</br>
 * @author Vincent
 */
public class SelectionSort {
	/**算法1虽然可以实现排序，都是只要出现比当前元素小的数据就要交换，效率低
	 * @param arr
	 * @return
	 */
	public static int[] selectSort01(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){//两个元素的比较，arr[j]<arr[i]脚要交换
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	/**算法步骤：(每次内部循环结束后才移动数据)</br>
	 * 1、外层循环每次的值标记为临时最小值(temp)，并记录其下标(flag)</br>
	 * 2、内部循环遍历的值与temp做比较，temp记录当前最小的值，并用flag标记其下标</br>
	 * 3、将flag与i做比较，如果不等，则表示arr[i]后面有比其小的元素，此时再做交换</br>
	 * @param arr
	 * @return
	 */
	public static int[] selectSort02(int[] arr){
		int flag;
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			flag=i;//flag为当前最小值标识
			for(int j=i+1;j<arr.length;j++){//遍历arr[i]后面的元素
				if(temp>arr[j]){
					temp=arr[j];//temp为最小元素的值
					flag=j;//用flag记录最小值下标
				}
			}
			if(flag!=i){//最小值下标不为i，及arr[i]后面有比其小的元素
				arr[flag]=arr[i];
				arr[i]=temp;
			}
		}
		return arr;
	}
}
