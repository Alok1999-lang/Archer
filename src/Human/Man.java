package Human;

class People
{

	void walk() {
		System.out.println("all are walking");
	}
}

public class Man extends People {
	public static void main(String[] args) {
		Man m = new Man();
		m.walk();

	}

}
