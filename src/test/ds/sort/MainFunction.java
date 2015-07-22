package test.ds.sort;

public class MainFunction {
	public static void main(String[] args) {
		int[] oldArray={49,38,65,97,76,13,27,49,88,98,108};
//		int[] newArray=InsertionSort.insertSort(oldArray);
//		int[] newArray=SelectionSort.selectSort02(oldArray);
//		int[] newArray=BubbleSort.bubbleSort01(oldArray);
//		int[] newArray=ShellSort.shellSort(oldArray);
//		int[] newArray=QuickSort.quickSort(oldArray, 0, oldArray.length-1);
//		int[] newArray=HeapSort.heapSort(oldArray);
		int[] newArray=MergeSortTest.mergeSort(oldArray,0,oldArray.length-1);
		System.out.print("排序的结果为:");
		for(int i=0;i<newArray.length;i++){
			System.out.print(oldArray[i]+"\t");
		}
	}

}
