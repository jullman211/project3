import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class DateTimeTwo {
	
	private Map<LocalDate, Integer> dateTextHash = new HashMap<LocalDate, Integer>();
	
	private Map<LocalDate, Integer> dateSorted = new TreeMap<LocalDate, Integer>();

	public void daysOfCurrentMonth() {
		// gets value of month
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH);
		
		// gets value of day
		LocalDate localTen = null;
		
		LocalDate localEighteen = null;

		switch (month) {
		case 0:
			localTen = LocalDate.of(year, Month.JANUARY, 10);
			localEighteen = LocalDate.of(year, Month.JANUARY, 18);
			break;
		case 1:
			localTen = LocalDate.of(year, Month.FEBRUARY, 10);
			localEighteen = LocalDate.of(year, Month.FEBRUARY, 18);
			break;
		case 2:
			localTen = LocalDate.of(year, Month.MARCH, 10);
			localEighteen = LocalDate.of(year, Month.MARCH, 18);
			break;
		case 3:
			localTen = LocalDate.of(year, Month.APRIL, 10);
			localEighteen = LocalDate.of(year, Month.APRIL, 18);
			break;
		case 4:
			localTen = LocalDate.of(year, Month.MAY, 10);
			localEighteen = LocalDate.of(year, Month.MAY, 18);
			break;
		case 5:
			localTen = LocalDate.of(year, Month.JUNE, 10);
			localEighteen = LocalDate.of(year, Month.JUNE, 18);
			break;
		case 6:
			localTen = LocalDate.of(year, Month.JULY, 10);
			localEighteen = LocalDate.of(year, Month.JULY, 18);
			break;
		case 7:
			localTen = LocalDate.of(year, Month.AUGUST, 10);
			localEighteen = LocalDate.of(year, Month.AUGUST, 18);
			break;
		case 8:
			localTen = LocalDate.of(year, Month.SEPTEMBER, 10);
			localEighteen = LocalDate.of(year, Month.SEPTEMBER, 18);
			break;
		case 9:
			localTen = LocalDate.of(year, Month.OCTOBER, 10);
			localEighteen = LocalDate.of(year, Month.OCTOBER, 18);
			break;
		case 10:
			localTen = LocalDate.of(year, 1, 10);
			localEighteen = LocalDate.of(year, Month.NOVEMBER, 18);
			break;
		case 11:
			localTen = LocalDate.of(year, Month.DECEMBER, 10);
			localEighteen = LocalDate.of(year, Month.DECEMBER, 18);
			break;
		}
		DayOfWeek dayOfFifteen = DayOfWeek.from(localTen);
		DayOfWeek dayOfLast = DayOfWeek.from(localEighteen);
		
		System.out.println("The tenth day of this month is " + dayOfFifteen.name() + " and eighteenth is " + dayOfLast.name());
		
	}

	public void daysOfAnyMonth(int month, int year) {
		
		LocalDate localFifteen = null;
		
		LocalDate lastDay = null;
		
		// day 15
		switch (month) {
		case 1:
			localFifteen = LocalDate.of(year, Month.JANUARY, 15);
			break;
		case 2:
			localFifteen = LocalDate.of(year, Month.FEBRUARY, 15);
			break;
		case 3:
			localFifteen = LocalDate.of(year, Month.MARCH, 15);
			break;
		case 4:
			localFifteen = LocalDate.of(year, Month.APRIL, 15);
			break;
		case 5:
			localFifteen = LocalDate.of(year, Month.MAY, 15);
			break;
		case 6:
			localFifteen = LocalDate.of(year, Month.JUNE, 15);
			break;
		case 7:
			localFifteen = LocalDate.of(year, Month.JULY, 15);
			break;
		case 8:
			localFifteen = LocalDate.of(year, Month.AUGUST, 15);
			break;
		case 9:
			localFifteen = LocalDate.of(year, Month.SEPTEMBER, 15);
			break;
		case 10:
			localFifteen = LocalDate.of(year, Month.OCTOBER, 15);
			break;
		case 11:
			localFifteen = LocalDate.of(year, Month.NOVEMBER, 15);
			break;
		case 12:
			localFifteen = LocalDate.of(year, Month.DECEMBER, 15);
			break;
		}
		
		// get last day
		switch (month) {
		case 1:
			lastDay = LocalDate.of(year, Month.JANUARY, 31);
			break;
		case 2:
			if((year % 4) == 0) {
				lastDay = LocalDate.of(year, Month.FEBRUARY, 29);
				break;
			}
			else {
				lastDay = LocalDate.of(year, Month.FEBRUARY, 28);
				break;
			}
			
		case 3:
			lastDay = LocalDate.of(year, Month.MARCH, 31);
			break;
		case 4:
			lastDay = LocalDate.of(year, Month.APRIL, 30);
			break;
		case 5:
			lastDay = LocalDate.of(year, Month.MAY, 31);
			break;
		case 6:
			lastDay = LocalDate.of(year, Month.JUNE, 30);
			break;
		case 7:
			lastDay = LocalDate.of(year, Month.JULY, 31);
			break;
		case 8:
			lastDay = LocalDate.of(year, Month.AUGUST, 31);
			break;
		case 9:
			lastDay = LocalDate.of(year, Month.SEPTEMBER, 30);
			break;
		case 10:
			lastDay = LocalDate.of(year, Month.OCTOBER, 31);
			break;
		case 11:
			lastDay = LocalDate.of(year, Month.NOVEMBER, 30);
			break;
		case 12:
			lastDay = LocalDate.of(year, Month.DECEMBER, 31);
			break;
		}
	
		DayOfWeek dayOfFifteen = DayOfWeek.from(localFifteen);
		DayOfWeek dayOfLast = DayOfWeek.from(lastDay);
		
		System.out.println("For the year (" + year + ") and month (" + month + 
				"), the fifteenth day is " + dayOfFifteen.name() +
				" and the last day is " + dayOfLast.name());
	}

	public void compareYear() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new FileReader("Dates.txt"));
		
		String strg;
		int yearInteger; 
		int monthInteger;
		int dayInteger;
		int differenceYear;
		int differenceMonth;
		int differenceDay;
		
		int counterKey = 1;
		
		int yearNow = Calendar.getInstance().get(Calendar.YEAR);
		int monthNow = Calendar.getInstance().get(Calendar.MONTH);
		int dayNow = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		
		
		
		while(((strg = br.readLine()) != null)) {
			
				String[] dateText = strg.split("\\.");
				
				monthInteger = Integer.parseInt(dateText[0]);
				dayInteger = Integer.parseInt(dateText[1]);
				yearInteger = Integer.parseInt(dateText[2]);
		
				LocalDate formatLocal = LocalDate.of(yearInteger, monthInteger, dayInteger);
				
				dateTextHash.put(formatLocal, counterKey);
				dateSorted.put(formatLocal, counterKey);
				
				differenceYear = Math.abs(2019 - yearInteger);
				differenceMonth = Math.abs(monthInteger - 10) ;
				differenceDay = Math.abs(dayInteger - 10);
				
				if((monthNow < monthInteger) || differenceMonth ==0) {
					differenceYear = differenceYear - 1;
					//if(differenceYear == 0) {
						if(dayInteger != 31) {
								differenceMonth = monthNow + 1;
						}
						else {
							differenceMonth = monthNow;
						}
						if(differenceYear == 0) {
							differenceDay = 40 - dayInteger;
						}
//						else if() {
//							
//						}
				}

				if (((yearInteger % 4 == 0) && (yearInteger % 100!= 0)) || (yearInteger %400 == 0)) {
					System.out.println(yearInteger + " is a leap year, and Difference: " + differenceYear 
							+ " years, " + differenceMonth + " months, and " + differenceDay +" days.");
				}

			    else {
			    	System.out.println(yearInteger + " is not a leap year, and Difference: " + differenceYear 
							+ " years, " + differenceMonth + " months, and " + differenceDay +" days.");
			    }
				counterKey++;
		}
		
		br.close();
	}

	public void dateHashMap() {
		dateTextHash.forEach((key, value) -> System.out.println(key + ":" + value));
	}

	public void dateHashMapSorted() {
		dateSorted.forEach((key, value) -> System.out.println(key + ":" + value));
	}



	

}
