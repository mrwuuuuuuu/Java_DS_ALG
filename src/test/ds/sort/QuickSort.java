package test.ds.sort;

/**快速排序是对冒泡排序的一种改进。</br>
 * 基本思想：</br>
 * 通过一趟排序将待排记录分割成独立的两部风，其中一部分记录的关键字比另一部分记录的关键字小，</br>
 * 接着对分别对这两部风记录继续进行排序，以达到整个序列有序。</br>
 * @author Vincent
 *
 */
public class QuickSort {
	/**利用关键字来划分子序列，在关键字左边的都比关键字小，在关键字右边的都比关键字大。</br>
	 * partion方法返回的是关键字所处的位置。</br>
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int partion(int[] arr,int low,int high){
		int privotKey=arr[low];//将数组的第一个元素设置为关键字。
		while(low<high){//low<high进行循环操作
			while(low<high&&arr[high]>=privotKey) high--;//从数组的尾部开始向前遍历，如果元素都比关键字大，下标high--
			if(low<high){//如果出现arr[high]<privotKey,则将arr[high]放在arr[low]的位置，即至于privotKey左边
				arr[low]=arr[high];
				low++;//下标low++
			} 
			while(low<high&&arr[low]<=privotKey) low++;//从另外一头开始遍历如果遍历到的元素都比privotKey小，下标low++
			if(low<high){//如果出现arr[low]>privotKey,则将arr[low]放在arr[high]的位置，即至于privotKey右边
				arr[high]=arr[low];
				high--;//移动完数据，下标high--
			}
			//继续循环上述操作，最后循环停止的条件为low=high，则找出了关键字应该存放的位置
		}
		arr[low]=privotKey;//循环停止则找出了关键字应该存放的位置，即关键字左边的序列都比关键字小，关键字右边的序列都比关键字大
		return low;//返回关键字所处的位置
	}
	
	/**quickSort方法根据每次获得的关键字所处的位置，分别对关键字左右两边的序列递归排序
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
