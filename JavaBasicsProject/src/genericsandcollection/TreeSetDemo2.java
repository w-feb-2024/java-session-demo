package genericsandcollection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Will Smith", "Manager");
		Employee emp2 = new Employee(102, "Jennifer Lopez", "Staff");
		Employee emp3 = new Employee(103, "Nocholas Cage", "HR");
		
		Employee emp4 = new Employee(102, "Nocholas Cage", "HR");
		
//		SortedSet<Employee> allEmp = new TreeSet<>();
		SortedSet<Employee> allEmp = new TreeSet<>(new EmployeeNameComparison());
		allEmp.add(emp1);
		allEmp.add(emp2);
		allEmp.add(emp3); // emp1.compareTo(emp3)
		allEmp.add(emp4);
		
		for(Employee emp: allEmp) {
			System.out.println(emp);
		}
	}

}
