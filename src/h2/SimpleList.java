package h2;

public class SimpleList {
	Node head = new Node(Integer.MIN_VALUE);

	public SimpleList() {
		Node node = new Node(Integer.MIN_VALUE);
		head = node;
	}

	public Node getFirst() {
		return head.next;
	}

	public Node getLast() {
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		return node;
	}

	public void append(int newValue) {
		Node newNode = new Node(newValue);
		Node lastNode = getLast();
		lastNode.next = newNode;
	}

	public Node findFirst(int value) {
		Node node = head;

		while (node.value != value) {
			if (node.next == null) {
				return null;
			}
			node = node.next;
		}

		return node;
	}

	public boolean insertAfter(int preValue, int newValue) {
		if (findFirst(preValue) == null) {
			return false;
		}

		Node newNode = new Node(newValue);
		Node firstValue = findFirst(preValue);
		newNode.next = firstValue.next;
		firstValue.next = newNode;
		return true;
	}

	public boolean delete(int value) {
		if (findFirst(value) == null) {
			return false;
		}
		Node firstValue = findFirst(value);
		Node preValue = head;
		while (preValue.next != firstValue) {
			preValue = preValue.next;
		}
		preValue.next = firstValue.next;
		firstValue.next = null;
		return true;
	}
}
