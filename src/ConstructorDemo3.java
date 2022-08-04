/*
 * this()	: new 없이 생성자를 호출하기 위한 메소드
 * 1. 반드시 생성자 메소드에서만 사용해야 하고
 * 2. 생성자 메소드내의 반드시 첫번째 줄에 와야 한다.
 */
public class ConstructorDemo3 {
	public static void main(String[] args) {
		Sawon jimin = new Sawon();
		System.out.println(jimin.name +"\t" + jimin.salary);
	}
}

class Sawon{
	String name;
	int salary;
	public Sawon(String name, int salary) {
		this.name = name; 			//this method 는 생성자 첫줄에서 호출
		this.salary = salary;
	}
	public Sawon(String name) {
		this(name,5000);
//		new Sawon(name,500000);
	}
	public Sawon(int salary) {
		this("Unknown",salary);
		
		
//		new Sawon("Unknown",salary);
	}
	public Sawon() {
		this("Unknown",500000);
//		new Sawon("Unknown",500000);
	}
}