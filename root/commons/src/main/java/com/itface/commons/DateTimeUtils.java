package com.itface.commons;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class DateTimeUtils {

	public static String getNowDateTime(){
		 Calendar cal = Calendar.getInstance();
		 SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//hh是12小时制，HH是24小时制。oracle时间格式是：yyyy-mm-dd hh24:mi:ss
		 return sd.format(cal.getTime());
	}
}
