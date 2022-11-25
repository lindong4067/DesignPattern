package _08_filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月22日	
* @time 	: 下午3:18:25
* @version 	: V-0.0.1
* @description	: 
*/
public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>(); 
			for (Person person : persons) {
				if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
					singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
