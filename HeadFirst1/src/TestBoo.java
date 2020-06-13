class SonOfBoo extends Boo {
	public SonOfBoo(String s) {
		super("42");
	}
}

public class TestBoo {
	public static void main(String[] args) {
		SonOfBoo sonOfBoo = new SonOfBoo("");
		System.out.println(sonOfBoo.getClass());
	}
}
