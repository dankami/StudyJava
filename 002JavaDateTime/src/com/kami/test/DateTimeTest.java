package com.kami.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//时间
		Date date = new Date();
		System.out.println(date);
		
		//时间戳
		long ts = date.getTime();
		System.out.println(ts);
		
		//格式化时间
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(date));
		
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		System.out.println(df2.format(date));
		
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		//创建一个自己的时间
		try {
			Date myDate = sdf.parse("2013-01-04");
			System.out.println(myDate);
			System.out.println(sdf.format(myDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
