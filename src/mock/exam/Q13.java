package mock.exam;

public class Q13 {

}

class CD {
	int r;

	CD(int r) {
		this.r = r;
	}
}

class DVD extends CD {
	int c;

	DVD(int r, int c) {
//		this(c);
		super(r);
//		super.r=r;
		this.c = c;
//		super(r);
//		this(c);
	}
}
