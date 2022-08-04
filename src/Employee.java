
public class Employee {
	private String empno;
	private String name;
	private int salary;
	private String hiredate;
	
	Employee(String empno, String name){			//method이름이 class이름과 똑같고 리턴타입이 없으면 생성자라고 한다 Constructor
		System.out.println("방금 개체가 생성되었습니다.");
		this.empno = empno;
		this.name = name;
	}
	
//	public void setEmpno(String empno) {
//		this.empno = empno;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void myPrint() {
		System.out.printf("%s, %s, %d, %s",this.empno,this.name, this.salary , this.hiredate);
	}
}
