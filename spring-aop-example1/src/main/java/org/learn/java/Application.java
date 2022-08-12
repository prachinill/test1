package org.learn.java;

import org.learn.java.aop.StringModifier;
//import org.springframework.beans.factory.BeanFactory; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		StringModifier modifier = context.getBean(StringModifier.class);
		String ourString = "There was a old man and he was just pacing around in the park";
		String modifiedString = modifier.replaceAllA(ourString);
		
		System.out.println(modifiedString);
		context.close();
		
	}

}
