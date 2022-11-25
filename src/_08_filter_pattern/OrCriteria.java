package _08_filter_pattern;

import java.util.List;

/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月22日	
* @time 	: 下午3:25:17
* @version 	: V-0.0.1
* @description	: 
*/
public class OrCriteria implements Criteria {
	
	private Criteria criteria01;
	private Criteria criteria02;
	
	public OrCriteria(Criteria criteria01, Criteria criteria02) {
		super();
		this.criteria01 = criteria01;
		this.criteria02 = criteria02;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> criteriaPersons1 = criteria01.meetCriteria(persons);
		List<Person> criteriaPersons2 = criteria02.meetCriteria(persons);
		for (Person person : criteriaPersons2) {
			if(!criteriaPersons1.contains(person)) {
				criteriaPersons1.add(person);
			}
		}
		return criteriaPersons1;
	}

}
