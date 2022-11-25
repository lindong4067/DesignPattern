package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月30日	
* @time 	: 下午3:09:34
* @version 	: V-0.0.1
* @description	: 
*/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
	public enum Color{BULE, RED, GREEN};
	Color fruitColor() default Color.GREEN; 
}
