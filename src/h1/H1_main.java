package h1;

public class H1_main {
	public static void main(String[]ars) {
		Bruch b = new Bruch(0,-7);
		System.out.println(b.zaehler+"/"+b.nenner);
		Bruch a = new Bruch(1, 49);
		System.out.println(a.zaehler+"/"+a.nenner);
		System.out.println("'a has the same Value as b' is "+b.hasSameValueAs(a));
	}
}
