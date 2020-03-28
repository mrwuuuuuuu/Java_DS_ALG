package org.vincent.datastructure.search;

public class BinarySearch_recur {
	/**
	 * 二分查找的递归算法</br>
	 * @param data 整型数组
	 * @param low 数组起始下标
	 * @param heigh 数组结束下标
	 * @param element 待查找元素
	 * @return 找到返回数组下标，未找到返回-1
	 */
	public static int Search(int[] data, int low, int heigh, int element) {
		if (low <= heigh) {
			int mid = (low + heigh) / 2;
			if (data[mid] == element)
				return mid;
			else if (data[mid] > element)
				return Search(data, low, mid - 1, element);
			else if (data[mid] < element)
				return Search(data, mid + 1, heigh, element);
		}
		return -1;

	}
}
