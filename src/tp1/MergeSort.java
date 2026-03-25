package tp1;

public final class MergeSort {

	private MergeSort() {
	}

	public static Node<Integer> sort(Node<Integer> head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		Node<Integer> mid = getMiddle(head);
		Node<Integer> rightHead = mid.getNext();
		mid.setNext(null);
		Node<Integer> left = sort(head);
		Node<Integer> right = sort(rightHead);
		return merge(left, right);
	}

	private static Node<Integer> getMiddle(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head.getNext();
		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}

	private static Node<Integer> merge(Node<Integer> a, Node<Integer> b) {
		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}
		if (a.getInfo().compareTo(b.getInfo()) <= 0) {
			a.setNext(merge(a.getNext(), b));
			return a;
		}
		b.setNext(merge(a, b.getNext()));
		return b;
	}
}
