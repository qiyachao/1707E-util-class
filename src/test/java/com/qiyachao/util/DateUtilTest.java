package com.qiyachao.util;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		
	}

	@Test
	public void testGetDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2019, 10, 8);
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	@Test
	public void testSql() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		//将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
		//将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串。
		Date date = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String d1 = df.format(date);
		String d2 = df.format(date2);
		
		String sql2 = sql.replace("{1}", d1).replace("{2}", d2);
		System.out.println(sql2);
	}
}
