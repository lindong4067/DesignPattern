package _08_filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月22日	
* @time 	: 下午2:41:26
* @version 	: V-0.0.1
* @description	: 过滤男士
*/
public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("male")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
