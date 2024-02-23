package genericsandcollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Will Smith", "Manager");
		Employee emp2 = new Employee(102, "Nocholas Cage", "Staff");
		Employee emp3 = new Employee(103, "Jennifer Lopez", "HR");
		
		Employee emp4 = new Employee(102, "Nocholas Cage", "Staff");
		
		Set<Employee> allEmployees = new HashSet<>();
		
		System.out.println(emp2==emp4);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
		// hashcode of emp2 and emp4 has to be the same because these two objects are equals 
					//based on the equal method in EMployee class
		allEmployees.add(emp1);
		allEmployees.add(emp2);
		allEmployees.add(emp3);
		allEmployees.add(emp4);
		
		for(Employee eachEmp : allEmployees) {
			System.out.println(eachEmp);
		}
		
	}

}
