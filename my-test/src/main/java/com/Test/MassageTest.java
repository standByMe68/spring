package com.Test;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.GregorianCalendar;
import java.util.Locale;

public class MassageTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		MessageSource massageSouce= (MessageSource) classPathXmlApplicationContext.getBean("myMessage");
		Object[] param = {"test", new GregorianCalendar().getTime()};
		String message = massageSouce.getMessage("common", param, Locale.US);
		System.out.println(message);
	}


}



