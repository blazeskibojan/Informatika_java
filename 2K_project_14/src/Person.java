public class Person {

	public Person(String string) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Person j;
		j = new Person("John");
		j.setAge(20);
		celebrateBirthday(j);
		System.out.println(j.getAge());
	}
	static void celebrateBirthday(Person p) {
		p.setAge(p.getAge() + 1);
		
	}
}
