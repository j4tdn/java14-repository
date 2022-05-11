package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/* ZoneId
 * * <li>ACT - Australia/Darwin</li>
     * <li>AET - Australia/Sydney</li>
     * <li>AGT - America/Argentina/Buenos_Aires</li>
     * <li>ART - Africa/Cairo</li>
     * <li>AST - America/Anchorage</li>
     * <li>BET - America/Sao_Paulo</li>
     * <li>BST - Asia/Dhaka</li>
     * <li>CAT - Africa/Harare</li>
     * <li>CNT - America/St_Johns</li>
     * <li>CST - America/Chicago</li>
     * <li>CTT - Asia/Shanghai</li>
     * <li>EAT - Africa/Addis_Ababa</li>
     * <li>ECT - Europe/Paris</li>
     * <li>IET - America/Indiana/Indianapolis</li>
     * <li>IST - Asia/Kolkata</li>
     * <li>JST - Asia/Tokyo</li>
     * <li>MIT - Pacific/Apia</li>
     * <li>NET - Asia/Yerevan</li>
     * <li>NST - Pacific/Auckland</li>
     * <li>PLT - Asia/Karachi</li>
     * <li>PNT - America/Phoenix</li>
     * <li>PRT - America/Puerto_Rico</li>
     * <li>PST - America/Los_Angeles</li>
     * <li>SST - Pacific/Guadalcanal</li>
     * <li>VST - Asia/Ho_Chi_Minh</li>
 */
public class Ex03 {
	public static void main(String[] args) {
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
		LocalDateTime ldt=LocalDateTime.now(ZoneId.of("America/St_Johns"));
		System.out.println(df.format(ldt));
		LocalDate ld= ldt.toLocalDate();
		System.out.println("The last day of this month of "+" is: "+ld.lengthOfMonth());
		LocalDate ldTemp=LocalDate.of(ld.getYear(), ld.getMonth(), ld.getDayOfMonth());
		ldTemp=ldTemp.plusDays(20);
		System.out.println(ldTemp.getDayOfWeek() +" "+ldTemp.getDayOfMonth()+"-"+ldTemp.getMonth());
	}
}
