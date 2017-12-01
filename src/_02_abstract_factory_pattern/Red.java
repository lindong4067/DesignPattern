package _02_abstract_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月20日	
* @time 	: 下午4:37:11
* @version 	: V-0.0.1
* @description	: 车身红色
*/
public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("喷涂：为车身喷涂红色……");
	}

}
