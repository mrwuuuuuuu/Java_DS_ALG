package test.ds.sort;

/**插入排序算法思想：</br>
 * 给定一组指定记录，假设第一个记录自成有序序列，其余记录无序。</br>
 * 接着从第二个记录开始，按照大小依次将当前处理的记录插入前面有序序列中。</br>
 * @author Vincent
 */
public class InsertionSort {
	/**算法执行步骤：</br>
	 * 1、将当前处理的记录赋给temp(空出当前记录的位置，便于前面数据移动)</br>
	 * 2、对有序序列，从后往前遍历，直到当前处理的记录(j>=0&&temp<arr[j]为false为止)</br>
	 * 3、每次被遍历到得数据后移一位，为待插入的数据留出空位</br>
	 * 4、将当前处理记录放于arr[j+1]处</br>
	 * @param arr
	 * @return
	 */
	public static int[] insertSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int j;
			int temp=arr[i];
			for(j=i-1;j>=0&&temp<arr[j];j--){//每次需要比较当前已排好序的最后一个元素，与其后一位元素
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
		return arr;
	}
}
