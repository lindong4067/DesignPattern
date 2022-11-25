package _08_filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月22日	
* @time 	: 下午3:28:47
* @version 	: V-0.0.1
* @description	: 
*/
public class FilterPattern {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Robert","Male", "Single"));
		persons.add(new Person("John","Male", "Married"));
		persons.add(new Person("Laura","Female", "Single"));
		persons.add(new Person("Diana","Female", "Married"));
		persons.add(new Person("Mike","Male", "Single"));
		persons.add(new Person("Bobby","Male", "Married"));
		persons.add(new Person("Lily","Female", "Single"));
		
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));

		System.out.println("\nSingle Males: ");
		printPersons(singleMale.meetCriteria(persons));

		System.out.println("\nSingle Or Females: ");
		printPersons(singleOrFemale.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons){
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() 
				+", Gender : " + person.getGender() 
				+", Marital Status : " + person.getMaritalStatus()
				+" ]");
		}
	}  
}

