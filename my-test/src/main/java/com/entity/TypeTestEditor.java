package com.entity;

import org.springframework.beans.propertyeditors.PropertiesEditor;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

/**
 * 使用属性编译的时候需要保证当前编译的类的名字是后面加上editor就行
 */
public class TypeTestEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(new TypeTest(text.toUpperCase()));
	}

}
