package exercises.warmup;

public enum Weekday {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int numberOfDay;

    Weekday(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public boolean isWeekDay() {
        return numberOfDay == 1 || numberOfDay == 2 || numberOfDay == 3 || numberOfDay == 4 || numberOfDay == 5;
    }

    boolean isHoliday() {
       return !isWeekDay();
    }
    public boolean whichIsGreater( Weekday weekday){
        return this.compareTo(weekday) > 0;

    }

}