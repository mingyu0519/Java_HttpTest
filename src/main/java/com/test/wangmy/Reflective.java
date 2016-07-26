package com.test.wangmy;

public class Reflective {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//		Class employee1 = new Employee().getClass();
//		System.out.println(employee1.getName());
//		Class employee2;
//		try {
//			employee2 = Class.forName("com.test.wangmy.Employee");
//			System.out.println(employee2.getName());
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		Class employee = Employee.class;
		Employee employee1 = (Employee) employee.newInstance();
		employee1.run();
		System.out.println(employee.getName());
	}

}

class Employee{
	public void run() {
		System.out.println("run , go away~");
	}
}