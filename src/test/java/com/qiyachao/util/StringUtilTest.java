package com.qiyachao.util;

import static org.junit.Assert.*;

import org.junit.Test;



public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength("");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str="ab c ";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String name = StringUtil.randomChineseString(10);
		System.out.print(name );
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 10; i++) {
			String name = StringUtil.generateChineseName();
			System.out.print(name +"   " );
			
		}
	}
	
	@Test
	public void isPhone() {
		boolean phone = StringUtil.isPhone("1354132235");
		
		System.out.println(phone);
		
	}
}
