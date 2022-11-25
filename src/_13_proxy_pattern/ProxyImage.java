package _13_proxy_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月24日	
* @time 	: 上午9:15:05
* @version 	: V-0.0.1
* @description	: 代理类
*/
public class ProxyImage implements Image {
	
	private String fileName;
	private RealImage realImage;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
