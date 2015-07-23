package test.ds.linkedlist;

public class LinkedListALG {
	/**
	 * 8.1.7 如何检测一个链表是否有环 算法：一个快指针和一个慢指针，快指针每次走两步，慢指针每次走一半，两个指针同时向前移动，
	 * 每次移动快指针都要和慢指针做比较，直到两者相等停止，表示有环。如果快指针先直到null则表示无环。
	 * 
	 * @param node
	 * @return
	 */
	public boolean isLoop(Node head) {
		Node quick = head;
		Node slow = head;
		if (quick == null)
			return false;// 链表为空
		while (quick != null && quick.next != null) {
			quick = quick.next.next;// 快指针走两步
			slow = slow.next;// 慢指针走一步
			if (quick == slow)
				return true;// 如果快指针追上慢指针则有环
		}
		return false;
	}

	/**
	 * 8.1.8如何在不知道头指针的情况下删除指定结点 分为两种情况：
	 * 1、若待删除的结点为链表的尾结点，则无法删除，因为删除后无法使其前驱结点的next指针为空。
	 * 2、若待删除的结点不是尾结点，则可以通过交换这个结点与其后继结点的值，然后删除后继结点。
	 * 
	 * @param n
	 * @return
	 */
	public boolean deleteNode(Node n) {
		if (n == null || n.next == null)
			return false;// 对应第一种情况

		// 当前结点与其后继结点交换值
		int temp = n.data;
		n.data = n.next.data;
		n.next.data = temp;

		// 删除后继结点
		n.next = n.next.next;
		return true;

	}

	/**
	 * 8.1.9如何判断两个链表是否相交 如果两个链表相交，那么它们必定有相同的尾结点
	 * 算法：分别遍历两个链表，并记录他们的尾结点，如果尾结点相等则表示两个链表相交
	 * @param h1
	 * @param h2
	 * @return
	 */
	public boolean isIntersect(Node h1, Node h2) {
		Node tmp1 = h1;
		Node tmp2 = h2;

		while (tmp1.next != null) {// 找到链表一的尾结点
			tmp1 = tmp1.next;
		}
		Node tail1 = tmp1;

		while (tmp2.next != null) {// 找到链表二的尾结点
			tmp2 = tmp2.next;
		}
		Node tail2 = tmp2;

		return tail1 == tail2;
	}

	/**
	 * 8.1.10如果两个链表相交，找出他们相交的第一个结点 如果两个链表
	 * @param h1
	 * @param h2
	 * @return
	 */
	public Node firstMeet(Node h1, Node h2) {
		Node tail1 = h1;
		Node tail2 = h2;

		int len1 = 1, len2 = 1;

		while (tail1.next != null) {
			tail1 = tail1.next;
			len1++;
		}
		while (tail2.next != null) {
			tail2 = tail2.next;
			len2++;
		}

		if (tail1 != tail2)
			return null;// 如果两个链表不相交，返回空

		Node t1 = h1;
		Node t2 = h2;

		// |len1-len2|表示两个链表相差的长度，长的链表先走d步，则两个量表需要走相同的步数相交
		if (len1 > len2) {
			int d = len1 - len2;
			while (d != 0) {
				t1 = t1.next;
				d--;
			}
		} else {
			int d = len2 - len1;
			while (d != 0) {
				t2 = t2.next;
				d--;
			}
		}
		//循环，直到t1==t2表示两个链表相交
		while (t1 != t2) {
			t1 = t1.next;
			t2 = t2.next;
		}
		return t1;
	}
}
