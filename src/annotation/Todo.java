package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月30日	
* @time 	: 上午11:52:26
* @version 	: V-0.0.1
* @description	: 注解
*/
@Target(value = { ElementType.METHOD })
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Todo {
	public enum Priority {LOW, MEDIUM, HIGH}
	public enum Status {STARTED, NOT_STARTED}
	String author() default "lLyndon";
	Priority priority() default Priority.LOW;
	Status status() default Status.NOT_STARTED;
}
