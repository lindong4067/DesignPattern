package _04_builder_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月21日	
* @time 	: 上午10:28:08
* @version 	: V-0.0.1
* @description	: 食物条目
*/
public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
