package test.ds.linkedlist;

public class LinkedListALG {
	/**
	 * 8.1.7 ��μ��һ�������Ƿ��л� �㷨��һ����ָ���һ����ָ�룬��ָ��ÿ������������ָ��ÿ����һ�룬����ָ��ͬʱ��ǰ�ƶ���
	 * ÿ���ƶ���ָ�붼Ҫ����ָ�����Ƚϣ�ֱ���������ֹͣ����ʾ�л��������ָ����ֱ��null���ʾ�޻���
	 * 
	 * @param node
	 * @return
	 */
	public boolean isLoop(Node head) {
		Node quick = head;
		Node slow = head;
		if (quick == null)
			return false;// ����Ϊ��
		while (quick != null && quick.next != null) {
			quick = quick.next.next;// ��ָ��������
			slow = slow.next;// ��ָ����һ��
			if (quick == slow)
				return true;// �����ָ��׷����ָ�����л�
		}
		return false;
	}

	/**
	 * 8.1.8����ڲ�֪��ͷָ��������ɾ��ָ����� ��Ϊ���������
	 * 1������ɾ���Ľ��Ϊ�����β��㣬���޷�ɾ������Ϊɾ�����޷�ʹ��ǰ������nextָ��Ϊ�ա�
	 * 2������ɾ���Ľ�㲻��β��㣬�����ͨ�����������������̽���ֵ��Ȼ��ɾ����̽�㡣
	 * 
	 * @param n
	 * @return
	 */
	public boolean deleteNode(Node n) {
		if (n == null || n.next == null)
			return false;// ��Ӧ��һ�����

		// ��ǰ��������̽�㽻��ֵ
		int temp = n.data;
		n.data = n.next.data;
		n.next.data = temp;

		// ɾ����̽��
		n.next = n.next.next;
		return true;

	}

	/**
	 * 8.1.9����ж����������Ƿ��ཻ ������������ཻ����ô���Ǳض�����ͬ��β���
	 * �㷨���ֱ����������������¼���ǵ�β��㣬���β���������ʾ���������ཻ
	 * @param h1
	 * @param h2
	 * @return
	 */
	public boolean isIntersect(Node h1, Node h2) {
		Node tmp1 = h1;
		Node tmp2 = h2;

		while (tmp1.next != null) {// �ҵ�����һ��β���
			tmp1 = tmp1.next;
		}
		Node tail1 = tmp1;

		while (tmp2.next != null) {// �ҵ��������β���
			tmp2 = tmp2.next;
		}
		Node tail2 = tmp2;

		return tail1 == tail2;
	}

	/**
	 * 8.1.10������������ཻ���ҳ������ཻ�ĵ�һ����� �����������
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
			return null;// ������������ཻ�����ؿ�

		Node t1 = h1;
		Node t2 = h2;

		// |len1-len2|��ʾ�����������ĳ��ȣ�������������d����������������Ҫ����ͬ�Ĳ����ཻ
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
		//ѭ����ֱ��t1==t2��ʾ���������ཻ
		while (t1 != t2) {
			t1 = t1.next;
			t2 = t2.next;
		}
		return t1;
	}
}
