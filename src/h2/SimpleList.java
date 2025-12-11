package h2;

public class SimpleList {
Node head = new Node(Integer.MIN_VALUE);
	public SimpleList() {
		 Node a= new Node(Integer.MIN_VALUE);
		 head = a;
	}
	
	public Node getFirst() {
		return head;
	}
	
	public Node getLast() {
		return head;
	}
	
	public void append(int newValue) {
		Node newNode = new Node(newValue);
	}
}
