package test.ds.linkedlist;

/**
 * ������صĻ��������Լ��㷨
 * 
 * @author lenovo
 * 
 */
public class MyLinkedList {
	private Node head = null;

	/*
	 * =======================8.1.1����½�㣬��������ɾ����㣬�������==========================
	 * 
	 */
	/**
	 * �ڵ������β�������µĽ��
	 * 
	 * @param data
	 */
	public void add(int data) {
		Node node = new Node(data);// �½����
		if (head == null) {// ��ǰ������Ϊ��
			head = node;
		} else {
			Node tmp = head;
			while (tmp.next != null) {// �����Ϊ����ѭ���ҵ�β�����
				tmp = tmp.next;
			}
			tmp.next = node;// ��β�������µĽ��
		}
	}

	/**
	 * ���������ͷ���
	 * 
	 * @return
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * ɾ��ָ�������Ľ��
	 * 
	 * @param index
	 * @throws Exception
	 */
	public boolean delete(int index) {
		if (index < 1 || index > size())
			return false;// ���indexֵ�Ƿ�Ϸ�
		if (index == 1) {// �����ɾ��ͷ���
			head = head.next;
			return true;
		}

		int i = 2;// ѭ����ʶ
		Node preNode = head;// ָ��һ����ǰ����ǰ���
		Node curNode = head.next;// ָ����ǰ���
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
	 * �Ը������������򣬷���ͷ���
	 * ʹ���˼�ѡ��������ԣ�ֻ��������ֵ�����������λ�ã�curNode��ֵʼ���ǵ�ǰ��Сֵ��
	 * @return
	 */
	public Node orderList() {
		Node curNode = head;// ָ����ǰ���
		Node nextNode = null;// ָ����ǰ������һ�����
		while (curNode.next != null) {//�¸���㲻Ϊ��
			nextNode = curNode.next;//���¸���㸳ֵ
			while (nextNode != null) {//�¸���㲻Ϊ��
				if (curNode.data > nextNode.data) {//ֻ��������ֵ��curNode�洢��ֵʼ���ǵ�ǰ��Сֵ
					int temp = curNode.data;
					curNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode = nextNode.next;// �ڴ�ѭ��
			}
			curNode = curNode.next;// ���ѭ��
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
	 * =======================8.1.1����½�㣬��������ɾ����㣬�������==========================
	 * 
	 */

	/**
	 * 8.1.2��δ�������ɾ���ظ�����
	 */
	public void deleteDup() {
		Node curNode = head;// ָ����ǰ���
		while (curNode != null) {
			Node tmpNode = curNode;// ָ��һ����ʱ��㣬������ѭ��
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
	 * 8.1.3����ҳ��������е�����k��Ԫ��
	 * 
	 * �㷨1����������������������n�������ٴα��������ҵ���n-k��Ԫ��
	 * �㷨2����������ָ�룬�ڶ���ָ��ȵ�һ��ָ����ǰ��k�������ŵ�һ��ָ��͵ڶ���ָ��һ����ƣ�
	 * ���ڶ���ָ��ָ��nullʱ����һ��ָ��ָ������k��Ԫ��(���´���Ϊ�㷨2��ʵ��)
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
	 * 8.1.4 ���ʵ�ֵ�����ķ�ת
	 * �㷨�������ĵ�ָ��ָ��ǰ��ʱ����̽���ָ��ϵ��ˣ���Ҫ������һ������������ǰ����̽��
	 */
	public void ReverseList() {
		// ��������ָ��ֱ�ָ��ǰ��㣬��ǰ����ǰ������ǰ�ڵ�ĺ��
		Node preNode = null;
		Node curNode = head;// ��ʼʱ��ǰ���ָ��ͷ���
		Node nextNode = null;

		// 1��ָ����̽�㣻2����ת��3��ǰ�������ƣ�4����ǰ������
		while (curNode != null) {
			nextNode = curNode.next;// ��ָ����ǰ���ĺ��
			curNode.next = preNode;// ��ת����ǰ���ĺ��ָ��ǰ�����
			preNode = curNode;// ǰ��������
			curNode = nextNode;// �ƶ���ǰ���
		}
		head = preNode;
	}

	/**
	 * 8.1.5 ��δ�β��ͷ��������� 
	 * �㷨1���������ָ�뷴ת���ı�����ķ���Ȼ���ͷ��β���
	 * �㷨2����ͷ��β��������û����һ����㣬�Ѹýڵ�ŵ�һ��ջ�У�������������������ٴ�ջ�е�������
	 * �㷨3�����õݹ飬û����һ����㣬�ȵݹ����������Ľ�㣬�������㱾��
	 */
	public void printListReversely(Node head) {
		if (head != null) {
			printListReversely(head.next);
			System.out.println(head.data);
		}
	}

	/**
	 * 8.1.6 ���Ѱ�ҵ�������м��� 
	 * �㷨1���ȱ���������ĳ���n��Ȼ������ҵ�n/2�����ҵ���������м���
	 * �㷨2��������ָ��ͬʱ��ͷ��㿪ʼ��������ָ��һ������������ָ��һ����һ���� ����ָ�뵽�����β��ʱ����ָ������ָ��������м�λ�á�
	 * 
	 * @return
	 */
	public Node searchMid() {
		Node quick = head;// ��ʼʱ����ָ��ͬʱָ��ͷ���
		Node slow = head;
		while (quick != null && quick.next.next != null && slow.next != null) {
			quick = quick.next.next;// ��ָ��һ�ο�����
			slow = slow.next;// ��ָ��һ�ο�һ��
		}
		return slow;
	}
}
