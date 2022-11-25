package _09_composite_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月23日	
* @time 	: 上午9:51:30
* @version 	: V-0.0.1
* @description	: 
*/
public class CompositePattern {

	public static void main(String[] args) {
		Employee CEO = new Employee("马云", "CEO", 30000);
		Employee headSales = new Employee("王坚", "销售主管", 20000);
		Employee headMarketing = new Employee("张小龙", "市场主管", 20000);
		Employee market1 = new Employee("小明","市场部", 10000);
		Employee market2 = new Employee("小红","市场部", 10000);
		Employee sales1 = new Employee("小白","销售部", 10000);
		Employee sales2 = new Employee("小薇","销售部", 10000);
		
		CEO.add(headSales);
		CEO.add(headMarketing);
		
		headSales.add(sales1);
		headSales.add(sales2);
		
		headMarketing.add(market1);
		headMarketing.add(market2);
		
		//公司的所有员工
		System.out.println(CEO);
		for(Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for(Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}

}
