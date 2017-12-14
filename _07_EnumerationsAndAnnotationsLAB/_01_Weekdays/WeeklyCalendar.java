package _07_EnumerationsAndAnnotationsLAB._01_Weekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyCalendar {

    private List<WeeklyEntry> entries;

    public WeeklyCalendar(){
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes){
        this.entries.add(new WeeklyEntry(weekday, notes));
    }

    public Iterable<WeeklyEntry> getWeeklySchedule(){
        Collections.sort(entries, WeeklyEntry.BY_WEEKDAY);
        return this.entries;
    }
}
