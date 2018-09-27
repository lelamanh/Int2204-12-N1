public class Date {
    int day, year, month;
    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }
    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }
    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }
    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }
    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    Date(int d, int m, int y) {
        day = d; month = m; year = y;
    }
}