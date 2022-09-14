package Immutable;

public class CustomMI {

	public static void main(String[] args) {

		String s = new String();
		Test t = new Test();
		CustomMI c = new CustomMI();

		CustomMI.delete(s);
		CustomMI.delete(t);
		CustomMI.delete(c);
	}
	public static void delete(Object obj) {
		if (obj instanceof Deletable) {
			//details for delete
			System.out.println("obj delete");
		} else {
			System.out.println("obj not delete");
		}
	}
}
interface Deletable {
}
class Test implements Deletable {
}