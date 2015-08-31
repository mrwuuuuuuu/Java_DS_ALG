package test.ds.sort;

/**希尔排序基本思想：</br>
 *1、从对直接插入排序的分析得知，其算法复杂度为O(n^2)，但是若待排序的序列为“正序”时，其时间复杂度可提高至O(n)。</br>
 *2、因此“希尔排序”，排序对“直接插入排序算法”进行改进获得了一种新的插入排序算法。</br>
 *3、先将整个待排记录分割成若干子序列分别进行直接插入排序，待整个序列基本有序时，再对全体记录进行一次直接插入排序。</br>
 * @author Vincent
 *
 */
public class ShellSort {

	/**希尔排序基本步骤：</br>
	 *1、将一个数据序列分成若干组，每一组由若干相隔一段距离的元素(d)组成,在每一个组内采用直接插入排序进行排序。</br>
	 *2、增量初始值d=Array.length/2,每趟逐渐缩小，直到最后值为1。</br>
	 *3、随着增量的减小，组数也减小，组内元素个数增加，整个序列接近有序。</br>
	 *4、当增量为1时，只有一组即整个序列，此时整个序列接近有序，直接使用“直接插入排序”。</br>
	 * @param arr
	 * @return
	 */
	public static int[] shellSort(int[] arr){
		int count=1;
		for(int d=arr.length/2;d>0;d/=2){//外部循环为d/2,d/4……1
			for(int i=d;i<arr.length;i++){//每一趟有若干个数组，每个元素在自己的数组内进行直接插入排序
				int j,temp=arr[i];
				for(j=i-d;j>=0;j-=d){//间隔为d
					if(arr[j]>temp)
						arr[j+d]=arr[j];//间隔为d
					else break;
				}
				arr[j+d]=temp;//间隔为d
			}
			System.out.print("第"+(count++)+"次排序：");
			for(int x:arr){
				System.out.print(x+"\t");
			}
			System.out.println();
		}
		return arr;
	}
}

