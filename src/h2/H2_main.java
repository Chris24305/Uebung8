package h2;

public class H2_main {
	public static void main(String[] args) {
		SimpleList A = new SimpleList();
		for (int i = 10; i < 20; i++) {
			A.append(i);
		}
		for (int i = 10; i < 20; i++) {
			System.out.print(A.findFirst(i).value + " ");
		}
		for (int i = 25; A.delete(i) == false; i--) {
			A.delete(i);
		}
		A.delete(14);
		A.insertAfter(15, 7);

	}
}
