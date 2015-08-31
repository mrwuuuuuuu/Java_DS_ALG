package test.ds.sort;

public class MainFunction {
	public static void main(String[] args) {
		int[] oldArray={34,21,45,67,34,56,91,23,44,1,56,67,34,100,89};
//		int[] newArray=InsertionSort.insertSort01(oldArray);
//		int[] newArray=SelectionSort.selectSort02(oldArray);
		int[] newArray=BubbleSort.bubbleSort01(oldArray);
//		int[] newArray=ShellSort.shellSort(oldArray);
//		int[] newArray=QuickSort.quickSort(oldArray, 0, oldArray.length-1);
//		int[] newArray=HeapSort.heapSort(oldArray);
//		int[] newArray=MergeSortTest.mergeSort(oldArray,0,oldArray.length-1);
		System.out.print("排序的结果为:");
		for(int i=0;i<newArray.length;i++){
			System.out.print(oldArray[i]+"\t");
		}
	}

}
