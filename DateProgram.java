package Math;

	/*
	 * Your goal is to write a method that, given a date, returns the first day of the next calendar quarter 
	 * for that date.  For instance, if we were to pass in 2/10/2000 to the method, 
	 * it would return 4/1/2000 -- the first day of the next calendar quarter. 
	 * The calendar quarters start on January 1st, April 1st, July 1st, and October 1st.
	 * Your java method takes an instance of our class SimpleDate (see below) and returns the first day of 
	 * the next calendar quarter as a SimpleDate.  We are not testing your knowledge of java.util.Date or 
	 * the Calendar API, which is why we created the SimpleDate as a simple data structure to track our date 
	 * information.
	 * Here is our SimpleDate class:
	 * Simple data structure representing a Date

	 public class SimpleDate {
	 protected int year = 0;
	 protected int month = 0;
	 protected int day = 0;
	 
	 public SimpleDate (int year, int month, int day) {...}
	 public void setDate (int year, int month, int day) {...}
	 public void setYear (int year) {...}
	 public int getYear () {...}
	 public void setMonth (int month) {...}
	 public int getMonth () {...}
	 public void setDay (int day) {...}
	 public int getDay () {...}
	}


	The method you implement should have the signature:

	public static SimpleDate getFirstDayOfNextQuarter (SimpleDate date)
	 */

	public class DateProgram {

	    protected int year;
	    protected int month;
	    protected int day;

	    // Constructor
	    public DateProgram(int year, int month, int day) {
	        this.year = year;
	        if ((month >= 1 && month <= 12))
	            this.month = month;
	        else {
	            System.out.println("Invalid Month");
	            System.exit(0);
	        }

	        if ((day >= 1 && day <= 31)) {
	            this.day = day;
	        } else {
	            System.out.println("Invalid Day");
	            System.exit(0);
	        }

	    }

	    // Display date method
	    public String displayDate(DateProgram date) {

	        return date.getYear() + "." + date.getMonth() + "." + date.getDay();

	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public int getYear() {

	        return year;
	    }

	    public void setMonth(int month) {
	        if ((month >= 1 && month <= 12)) {
	            this.month = month;
	        }

	        else {
	            System.out.println("Invalid month");

	        }
	    }

	    public int getMonth() {

	        return month;
	    }

	    public void setDay(int day) {

	        if ((day >= 1 && day <= 31)) {
	            this.day = day;
	        } else {
	            System.out.println("Invalid Day");

	        }

	    }

	    public int getDay() {

	        return day;
	    }

	    public DateProgram getFirstDayOfNextQuarter(DateProgram date) {

	        if (date.month >= 1 && date.month <= 3) {
	            date.setDay(1);
	            date.setMonth(4);
	        } else if (date.month >= 4 && date.month <= 6) {
	            date.setDay(1);
	            date.setMonth(7);
	        } else if (date.month >= 7 && date.month <= 9) {
	            date.setDay(1);
	            date.setMonth(10);
	        } else if (date.month >= 10 && date.month <= 12) {
	            date.setDay(1);
	            date.setMonth(1);
	            date.setYear(date.getYear() + 1);
	        }
	        return date;
	    }

	    // Mainmethid
	    public static void main(String[] args) {

	        DateProgram myDate = new DateProgram(2015, 7, 4);
	        String showDate = myDate.displayDate(myDate
	                .getFirstDayOfNextQuarter(myDate));
	        System.out.println(showDate);

	    }

	}
