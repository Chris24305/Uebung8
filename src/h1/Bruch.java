package h1;

public class Bruch {
	public int zaehler, nenner;

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public int ggT(int x, int y) {
		if (x == 0||y==0) {
			return 1;
		}
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
		if ((this.nenner == b.nenner) && (this.zaehler == b.zaehler)) {
			return true;
		}
		if ((this.nenner == 0) && (b.nenner == 0)) {
			return true;
		}
		if ((this.zaehler == 0) && (b.zaehler == 0)) {
			return true;
		}
		return false;
		
	}
}
