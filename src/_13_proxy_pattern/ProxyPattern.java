package _13_proxy_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月24日	
* @time 	: 上午9:18:53
* @version 	: V-0.0.1
* @description	: 代理模式，减少内存占用
*/
public class ProxyPattern {

	public static void main(String[] args) {
		Image image = new ProxyImage("text01.jpg");
		System.out.println("第一次打开图片");
		image.display(); //从磁盘加载
		System.out.println("第二次打开图片");
		image.display(); //直接显示
		System.out.println("第三次打开图片");
		image.display(); //直接显示
	}

}
