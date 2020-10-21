package com.Test;

import com.entity.HelloEditor;
import com.entity.TypeTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CustomEnditorTest {

	public static void main(String[] args) {

		/**
		 * 需要手动的添加需要扫描注解的类所在的包
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com");
		HelloEditor helloEditor = (HelloEditor)context.getBean("helloEditor");
		System.out.println(helloEditor.getTypeTest().getName());

	}


}
