package _04_builder_pattern;

import java.util.ArrayList;
import java.util.List;

/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月21日	
* @time 	: 上午10:51:49
* @version 	: V-0.0.1
* @description	: 套餐
*/
public class Meal {
	
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for(Item item : items) {
			System.out.println("Item : "+item.name()+", Packing : "+item.packing().pack() + ", Price : "+item.price());
		}
	}
}
