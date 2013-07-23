package test.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	
	private static Calendar calendar = Calendar.getInstance();
	
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//原始date
		System.out.println(simpleDateFormat.format(date));
		//增加月份后date
		addMonth(date, 10);
		System.out.println(simpleDateFormat.format(date));
	}
	
	/**
	 * @param date
	 *        date 原始date
	 * @param offset
	 *        int 月份改变数木
	 */
	public static void addMonth(Date date, int offset){
		add(date, Calendar.MONTH, offset);
	}
	
	/**
	 * @param date
	 *        Date 原始date
	 * @param field
	 *        int 要修改的域，可以是Date,Month
	 * @param offset
	 */
	public static void add(Date date, int field, int offset){
		calendar.setTime(date);
		calendar.add(field, offset);
		date.setTime(calendar.getTimeInMillis());
	}

}
