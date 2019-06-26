package com.kami.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ʱ��
		Date date = new Date();
		System.out.println(date);
		
		//ʱ���
		long ts = date.getTime();
		System.out.println(ts);
		
		//��ʽ��ʱ��
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(date));
		
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		System.out.println(df2.format(date));
		
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		//����һ���Լ���ʱ��
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
