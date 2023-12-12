package mock.exam;

interface Readable {
	public void readBook();

	public void setBookMark();
}

abstract class Book implements Readable {
//class Book implements Readable {
	public void readBook() {
	};

//	public void setBookMark() {
//	};
}

//class EBook extends Book {
abstract class EBook extends Book {
	public void readBook() {
	};
}

public class Q11 {

}
