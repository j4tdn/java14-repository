package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class DateUtils {
	
	private static SimpleDateFormat simpleDateFormat = null;
	
	private DateUtils() {}
	
	public static java.sql.Date toSqlDate(LocalDate localDate) {
		Objects.requireNonNull(localDate, "localDate cannot be null");
		return java.sql.Date.valueOf(localDate);
	}
	
	public static Date toUtilDate(LocalDate localDate, String pattern) {
		Objects.requireNonNull(localDate, "localDate cannot be null");
		simpleDateFormat = new SimpleDateFormat(pattern);
		Date utilDate = null;
		
		try {
			utilDate = simpleDateFormat.parse(localDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return utilDate;
	}
}
