package test.ds.sort;

/**冒泡排序基本思想：</br>
 * 比较相邻两个元素的大小，如果反序，则交换。</br>
 * 若按升序排列，每一趟被扫描的数据序列中的最大元素交换到最后的位置。</br>
 * @author Vincent
 */
public class BubbleSort {
	/**
	 * 冒泡排序的步骤：</br>
	 * 1、外循环从数组的末尾开始遍历，每次遍历序列中最大的数置于数组尾端</br>
	 * 2、内循环从数组的头部开始遍历到外循环标志位i结束</br>
	 * 3、内循环中当前遍历的数据和后一位数据反序则交换</br>
	 * 4、每一次内循环结束，当前序列中最大元素被至于数组末尾</br>
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort01(int[] arr){
		//外循环从尾到头，每次循环序列中最大元素被抛到最后位置
		for(int i=arr.length-1;i>0;i--){
			//内循环从头到i结束，如果arr[j]>arr[j+1]，则将较大的数放在后面
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					//交换
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}

		}
		return arr;
	}
	
	/**设置交换标识可以减少无谓的遍历
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort02(int[] arr){
		//设置交换标识
		boolean flag=true;
		//如果上一次遍历没有发生数据交换，则表示当前数据序列有序
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
			System.out.print("第"+(arr.length-i)+"次排序：");
			for(int x:arr){
				System.out.print(x+"\t");
			}
			System.out.println();
		}
		return arr;
	}
}
