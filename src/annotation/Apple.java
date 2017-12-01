package annotation;

import annotation.FruitColor.Color;

/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月30日	
* @time 	: 下午3:20:19
* @version 	: V-0.0.1
* @description	: 
*/
public class Apple {
	@FruitName("红富士苹果")
	private String appleName;
	@FruitColor(fruitColor=Color.RED)
	private String appleColor;
	@FruitProvider(id=1, name="山东红富士集团", address="陕西省西安市延安路89号")
	private String appleProvider;
	public String getAppleName() {
		return appleName;
	}
	public String getAppleColor() {
		return appleColor;
	}
	public String getAppleProvider() {
		return appleProvider;
	}
	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}
	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}
	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
	public void displayName() {
		System.out.println("水果的名字是：苹果");
	}
}
