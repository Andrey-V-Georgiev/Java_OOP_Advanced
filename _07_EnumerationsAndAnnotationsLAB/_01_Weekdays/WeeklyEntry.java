package _07_EnumerationsAndAnnotationsLAB._01_Weekdays;

import java.util.Comparator;

public class WeeklyEntry {
    public final static Comparator<WeeklyEntry> BY_WEEKDAY = getCompByDay();

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Enum.valueOf(Weekday.class, weekday.toUpperCase());
        this.notes = notes;
    }

    private static Comparator<WeeklyEntry> getCompByDay() {
        return Comparator.comparing(e -> e.weekday);
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.weekday, this.notes);
    }
}

