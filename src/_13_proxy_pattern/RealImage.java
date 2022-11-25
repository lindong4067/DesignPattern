package _13_proxy_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月24日	
* @time 	: 上午9:10:34
* @version 	: V-0.0.1
* @description	: 
*/
public class RealImage implements Image {
	
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("加载：" + fileName);
	}
	
	@Override
	public void display() {
		System.out.println("显示：" + fileName);
	}

}
