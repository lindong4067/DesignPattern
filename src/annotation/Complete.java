package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月30日	
* @time 	: 下午1:54:28
* @version 	: V-0.0.1
* @description	: 
*/
public class Complete {
	
	@Todo(author="zhaolindong", priority=Todo.Priority.MEDIUM, status=Todo.Status.STARTED)
	@Author("Lyndon")
	private void method() {
		System.out.println("执行方法一");
	}
	
	public static void main(String[] args) {
		Class<Complete> comClass = Complete.class;
		Method[] methods = comClass.getMethods();
		for (Method method : methods) {
			Todo annotation = method.getAnnotation(Todo.class);
			if(annotation != null) {
				System.out.println(" Method Name : " + method.getName());
				System.out.println(" Author : " + annotation.author());
				System.out.println(" Priority : " + annotation.priority());
				System.out.println(" Status : " + annotation.status());
			}
		}
	}
}
