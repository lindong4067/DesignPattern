package _04_builder_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月21日	
* @time 	: 上午11:45:16
* @version 	: V-0.0.1
* @description	: 演示建造者模式点餐
*/
public class BuiderPattern {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		System.out.println("Veg Meal");
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("Total Price : " + vegMeal.getCost());
		
		System.out.println("======================================");
		System.out.println("Non-Veg Meal");
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println("Total Price : " + nonVegMeal.getCost());
		
	}

}
