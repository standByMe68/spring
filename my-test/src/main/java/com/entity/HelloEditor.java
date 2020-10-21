package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:test.properties")
public class HelloEditor {

	@Autowired
	@Value("${name}")
	TypeTest typeTest;

	public TypeTest getTypeTest() {
		return typeTest;
	}

	public void setTypeTest(TypeTest typeTest) {
		this.typeTest = typeTest;
	}
}
