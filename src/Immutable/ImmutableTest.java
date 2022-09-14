package Immutable;

public class ImmutableTest {
	
	public static void main(String[] args) {
		
		Address add=new Address (123, "Pune");
		Student s1=new Student(10, "Ram", add);
		System.out.println("Before ="+s1);
		s1.getAdd().setCity("Kolhapur");
		System.out.println("After ="+s1);		
	}

}
final class Student{
	private final int roll;
	private final String name;
	private final Address add;
	public Student(int roll, String name, Address add) {
		this.roll = roll;
		this.name = name;
		Address adn=new Address(add.getPin(),add.getCity());
		this.add = adn;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public Address getAdd() {
		Address adn=new Address(add.getPin(),add.getCity());
		return adn;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}
	
	
	
}
class Address{
	int pin;
	String city;
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	}
