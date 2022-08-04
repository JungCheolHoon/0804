
public class ConstructorDemo {
	public static void main(String[] args) {
		Employee jimin = new Employee("2022-001","한지민");
//		jimin.setEmpno("2022-002");
//		jimin.setName("한지민");
		jimin.setSalary(1000000);
		jimin.setHiredate("2022-08-04");
		jimin.myPrint();		
		
		
	}
}
