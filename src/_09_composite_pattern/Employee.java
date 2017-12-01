package _09_composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月22日	
* @time 	: 下午3:53:58
* @version 	: V-0.0.1
* @description	: 
*/
public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}
	public void add(Employee e) {
		subordinates.add(e);
	}
	public void remove(Employee e) {
		subordinates.remove(e);
	}
	public List<Employee> getSubordinates(){
		return subordinates;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinates=" + subordinates
				+ "]";
	}
	
}
