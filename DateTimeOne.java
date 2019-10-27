import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;


public class DateTimeOne extends MesoDateTimeOneAbstract {

	private String CSTValue;
	
	private String GMTValue;
	
	private String BSTValue;
	
	private String ASTValue;
	
	private String ZSTValue;
	
	private Map<String, String> dateTimeTree = new TreeMap<String, String>();
	
	private HashMap<String, String> dateTimeHash = new HashMap<String, String>();
	
	private Map<String, String> dateTimeTreeTwo = new TreeMap<String, String>();
	
	private LocalDateTime[] newSort;

	private String BSTValueOther;

	private String GMTValueOther;

	private String CSTValueOther;

	private String ASTValueOther;

	private String ZSTValueOther;
	
	public DateTimeOne() {
		CSTValue = "CST";
		GMTValue = "GMT";
		BSTValue = "BST";
		
	}
	
	@Override
	int getValueOfSecond() {
		
		LocalTime seconds = LocalTime.now();
		
		return seconds.getSecond();
	}

	@Override
	void dateTimeNow() {
		LocalDateTime dateAndTime = LocalDateTime.now();
		
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("M/dd/yyyy hh:mm a");
		
		System.out.println("Current Date/Time: " +dateAndTime.format(dateTimeFormat));

	}

	@Override
	void sleepForFiveSec() {
		// TODO QUESTION
		
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	void dateTimeDifferentZone() {
		// TODO Auto-generated method stub
		Date setCurrentTime = new Date();
		SimpleDateFormat dateTimeFormat = new SimpleDateFormat("M/dd/yyyy HH:mm");
		SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
		
		// GMT timezone
		dateTimeFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		GMTValue = dateTimeFormat.format(setCurrentTime);
		GMTValueOther = dateTimeFormatter.format(setCurrentTime);
		System.out.println("GMT: " + GMTValue);
		
		// BST timezone
		dateTimeFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		BSTValue = dateTimeFormat.format(setCurrentTime);
		BSTValueOther = dateTimeFormatter.format(setCurrentTime);
		System.out.println("BST: " + BSTValue);
		
		// CST timezone
		dateTimeFormat.setTimeZone(TimeZone.getTimeZone("CST"));
		CSTValue = dateTimeFormat.format(setCurrentTime);
		CSTValueOther = dateTimeFormatter.format(setCurrentTime);
		System.out.println("CST: " + CSTValue);
		
		dateTimeHash.put("GMT", GMTValue);
		dateTimeHash.put("BST", BSTValue);
		dateTimeHash.put("CST", CSTValue);
		
		dateTimeTree.put("GMT", GMTValue);
		dateTimeTree.put("BST", BSTValue);
		dateTimeTree.put("CST", CSTValue);
		
		
		dateTimeTreeTwo.put("BST",BSTValueOther);
		dateTimeTreeTwo.put("CST",CSTValueOther);
		dateTimeTreeTwo.put("GMT",GMTValueOther);
		
	}
	
	@Override
	void dateTimeOfOtherCity() {
		
		Date setCurrentTime = new Date();
		SimpleDateFormat dateTimeFormat = new SimpleDateFormat("hh:mm");
		
		// Time on serverd
		dateTimeFormat.setTimeZone(TimeZone.getTimeZone("CST"));
		System.out.println("Time on Server: " + dateTimeFormat.format(setCurrentTime));
		
		
		// GMT timezone
		dateTimeFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("GMT: " + dateTimeFormat.format(setCurrentTime));
		
		// BST timezone
		dateTimeFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		System.out.println("BST (90E): " + dateTimeFormat.format(setCurrentTime));
		
		// CST timezone
		dateTimeFormat.setTimeZone(TimeZone.getTimeZone("CST"));
		System.out.println("CST (90W): " + dateTimeFormat.format(setCurrentTime));
	}

	@Override
	void timeZoneHashMap() {
		// TODO Auto-generated method stub
		ASTValue = "10/01/2020 19:59";
		ZSTValue = "11/05/2018 19:59";
		ASTValueOther = "2020-10-01T19:59";
		ZSTValueOther = "2018-11-05T19:59";
		
		
		dateTimeHash.put("AST", ASTValue);
		dateTimeHash.put("ZST", ZSTValue);
		
		dateTimeTree.put("AST", ASTValue);
		dateTimeTree.put("ZST", ZSTValue);
		
		dateTimeTreeTwo.put("AST", ASTValueOther);
		dateTimeTreeTwo.put("ZST", ZSTValueOther);
		
		
		
		
		// print alphabet
		System.out.println("Print Style 1:");
		dateTimeHash.forEach((key, value) -> System.out.println(key + ":" + value));
		
		// print 
		System.out.println("Print Style 3:");
		dateTimeTree.forEach((key, value) -> System.out.println(key + ":" + value));
		
		System.out.println("Print Style 1:");
		dateTimeTreeTwo.forEach((key, value) -> System.out.println(value));
	}
}