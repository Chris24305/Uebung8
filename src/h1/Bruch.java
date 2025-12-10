package h1;

public class Bruch {
	int zaehler;
	int nenner;

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public int ggT(int x, int y) {
		if (x < y) {
			int z = x;
			x = y;
			y = z;
		}

		int i;
		while (true) {
			i = x % y;
			if (i == 0) {
				return y;
			}
			x = y;
			y = i;
		}
	}

	public void shorten() {
		int ggT = ggT(nenner, zaehler);
		nenner /= ggT;
		zaehler /= ggT;
	}

	public boolean hasSameValueAs(Bruch b) {
		this.shorten();
		b.shorten();
		return (this.nenner == b.nenner) && (this.zaehler == b.zaehler);
	}
}
