package sit707_tasks;

import java.time.Month;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

public class Holiday {
	private Set<MonthDay> holidays;

    public Set<MonthDay> getHolidays() {
		return holidays;
	}

	public void setHolidays(Set<MonthDay> holidays) {
		this.holidays = holidays;
	}

	public Holiday() {
        holidays = new HashSet<>();
    }

    public void addHoliday(int month, int day) {
    	if (month < 1 || month > 12 || day < 1 || day > Month.of(month).maxLength()) {
            throw new IllegalArgumentException("Invalid month or day");
        }
        MonthDay holiday = MonthDay.of(month, day);
        holidays.add(holiday);
    }

    public void removeHoliday(int month, int day) {
        MonthDay holiday = MonthDay.of(month, day);
        holidays.remove(holiday);
    }

    public boolean isHoliday(int month, int day) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }
        
        if (day < 1 || day > Month.of(month).maxLength()) {
            throw new IllegalArgumentException("Invalid day for the specified month");
        }

        MonthDay date = MonthDay.of(month, day);
        return holidays.contains(date);
    }
		

}
