package test.ds.linkedlist;

/**
 * 链表相关的基本操作以及算法
 * 
 * @author lenovo
 * 
 */
public class MyLinkedList {
	private Node head = null;

	/*
	 * =======================8.1.1添加新结点，根据索引删除结点，排序，输出==========================
	 * 
	 */
	/**
	 * 在单链表的尾部加入新的结点
	 * 
	 * @param data
	 */
	public void add(int data) {
		Node node = new Node(data);// 新建结点
		if (head == null) {// 当前单链表为空
			head = node;
		} else {
			Node tmp = head;
			while (tmp.next != null) {// 如果不为空则循环找到尾部结点
				tmp = tmp.next;
			}
			tmp.next = node;// 在尾部插入新的结点
		}
	}

	/**
	 * 返回链表的头结点
	 * 
	 * @return
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * 删除指定索引的结点
	 * 
	 * @param index
	 * @throws Exception
	 */
	public boolean delete(int index) {
		if (index < 1 || index > size())
			return false;// 检查index值是否合法
		if (index == 1) {// 如果是删除头结点
			head = head.next;
			return true;
		}

		int i = 2;// 循环标识
		Node preNode = head;// 指定一个当前结点的前结点
		Node curNode = head.next;// 指定当前结点
		while (curNode != null) {
			if (i == index) {
				preNode.next = curNode.next;
			}
			preNode = curNode;
			curNode = curNode.next;
			i++;
		}
		return true;
	}

	public int size() {
		Node tmp = head;
		int count = 0;
		while (tmp != null) {
			count++;
			tmp = tmp.next;
		}
		return count;
	}

	/**
	 * 对给定单链表排序，返回头结点
	 * 
	 * @return
	 */
	public Node orderList() {
		Node nextNode = null;// 指定当前结点的下一个结点
		Node curNode = head;// 指定当前结点
		while (curNode.next != null) {
			nextNode = curNode.next;
			while (nextNode != null) {
				if (curNode.data > nextNode.data) {
					int temp = curNode.data;
					curNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode = nextNode.next;// 内存循环
			}
			curNode = curNode.next;// 外层循环
		}
		return head;
	}

	public void printList() {
		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.data + "\t");
			tmp = tmp.next;
		}
	}

	public void printList(Node head) {
		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.data + "\t");
			tmp = tmp.next;
		}
	}

	/*
	 * =======================8.1.1添加新结点，根据索引删除结点，排序，输出==========================
	 * 
	 */

	/**
	 * 8.1.2如何从链表中删除重复数据
	 */
	public void deleteDup() {
		Node curNode = head;// 指定当前结点
		while (curNode != null) {
			Node tmpNode = curNode;// 指定一个临时结点，用于内循环
			while (tmpNode.next != null) {
				if (curNode.data == tmpNode.next.data)
					tmpNode.next = tmpNode.next.next;
				else
					tmpNode = tmpNode.next;
			}
			curNode = curNode.next;
		}
	}

	/**
	 * 8.1.3如何找出单链表中倒数第k个元素
	 * 
	 * 算法1：遍历这个链表求出链表长度n，接着再次遍历链表找到第n-k个元素
	 * 算法2：设置两个指针，第二个指针比第一个指针先前移k步，接着第一个指针和第二个指针一起后移，
	 * 当第二个指针指向null时，第一个指针指向倒数第k个元素(如下代码为算法2的实现)
	 * 
	 * @param k
	 * @return
	 */
	public Node findElem(int k) {
		Node t1 = head;
		Node t2 = head;
		for (int i = 0; i < k; i++) {
			t2 = t2.next;
		}
		while (t2 != null) {
			t1 = t1.next;
			t2 = t2.next;
		}
		return t1;
	}

	/**
	 * 8.1.4 如何实现单链表的反转 算法：当结点的的指针指向前驱时，后继结点的指针断掉了，需要用另外一个变量标明当前结点后继结点
	 */
	public void ReverseList() {
		// 设置三个指针分别指向当前结点，当前结点的前驱，当前节点的后继
		Node preNode = null;
		Node curNode = head;// 初始时当前结点指向头结点
		Node nextNode = null;

		// 1、指明后继结点；2、反转；3、前驱结点后移；4、当前结点后移
		while (curNode != null) {
			nextNode = curNode.next;// 先指明当前结点的后继
			curNode.next = preNode;// 反转，当前结点的后继指向前驱结点
			preNode = curNode;// 前驱结点后移
			curNode = nextNode;// 移动当前结点
		}
		head = preNode;
	}

	/**
	 * 8.1.5 如何从尾到头输出单链表 算法1：将链表的指针反转，改变链表的方向，然后从头到尾输出
	 * 算法2：从头到尾遍历链表，没经过一个结点，把该节点放到一个栈中，当遍历完整个链表后再次栈中弹出链表
	 * 算法3：采用递归，没访问一个结点，先递归输出它后面的结点，在输出结点本身
	 */
	public void printListReversely(Node head) {
		if (head != null) {
			printListReversely(head.next);
			System.out.println(head.data);
		}
	}

	/**
	 * 8.1.6 如何寻找单链表的中间结点 算法1：先遍历单链表的长度n，然后遍历找到n/2即可找到单链表的中间结点
	 * 算法2：有两个指针同时从头结点开始遍历，快指针一次走两部，慢指针一次走一步， 当快指针到链表的尾部时，慢指针正好指向链表的中间位置。
	 * 
	 * @return
	 */
	public Node searchMid() {
		Node quick = head;// 初始时快慢指针同时指向头结点
		Node slow = head;
		while (quick != null && quick.next.next != null && slow.next != null) {
			quick = quick.next.next;// 快指针一次跨两边
			slow = slow.next;// 慢指针一次跨一步
		}
		return slow;
	}

}
