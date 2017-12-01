package _08_filter_pattern;

import java.util.List;

/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月22日	
* @time 	: 下午3:20:34
* @version 	: V-0.0.1
* @description	: 
*/
public class AndCriteria implements Criteria {
	
	private Criteria criteria01;
	private Criteria criteria02;
	
	public AndCriteria(Criteria criteria01, Criteria criteria02) {
		super();
		this.criteria01 = criteria01;
		this.criteria02 = criteria02;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> criteriaPersons1 = criteria01.meetCriteria(persons);
		List<Person> criteriaPersons2 = criteria02.meetCriteria(criteriaPersons1);
		return criteriaPersons2;
	}

}
