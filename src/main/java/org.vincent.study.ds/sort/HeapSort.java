package org.vincent.study.ds.sort;

public class HeapSort {
	private static void adjustHeap(int[] arr, int low, int high) {
		int i=low;//待处理的堆的根结点
		int j=i*2+1;//该根结点的左孩子结点
		int temp=arr[i];
		while(j<=high){
			if(j<high&&arr[j]>arr[j+1])//当左结点的值大于右节点的值时,j++（即arr[j]始终代表左右孩子结点中较小的结点）
				j++;
			if(temp>arr[j]){//如果堆的根结点大于左右孩子节点中较小的结点
				arr[i]=arr[j];//则将较小的孩子结点置于堆的根节点处
				i=j;//同时i与j下移一层，接着处理下一层的堆
				j=i*2+1;
			}else {
				j=high+1;//使while循环停止
			}
			arr[i]=temp;//将需要处理的堆的根结点放在正确的位置
		}
	}
	
	public static int[] heapSort(int[] arr) {
		int n=arr.length;//数组的长度，利用数组来存储完全二叉树
		
		//将原始数据调整为一个最小堆
		for(int i=n/2-1;i>=0;i--){//从完全二叉树的底部的第一个非叶结点开始调整最小堆
			adjustHeap(arr, i, n-1);
		}
		
		//进行堆排序
		for(int i=n-1;i>0;i--){//i每次指向堆中的最后一个叶子结点
			int temp=arr[0];//arr[0]每次都是堆中最小的元素
			arr[0]=arr[i];//将堆中最后一个叶结点与arr[0]交换
			arr[i]=temp;
			adjustHeap(arr, 0, i-1);//每次将最后一个叶结点置于堆顶时，都要重新调整整个堆
		}
		return arr;
	}
}
