package _08_filter_pattern;

import java.util.List;

/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月22日	
* @time 	: 下午2:39:05
* @version 	: V-0.0.1
* @description	: 过滤标准
*/
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
