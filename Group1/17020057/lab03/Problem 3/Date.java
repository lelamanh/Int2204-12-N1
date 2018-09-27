public class Date
{
    private int day, month, year;

    public static void main(String[] args) 
    {
        Date a = new Date(1, 1, 2003);
        Date b = a.prevDate();
        a.getDate();
        b.getDate();
    }
    // initialize a date with day, month and year
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        this.validator();
    }

    // initialize a date with same propeties as a
    public Date(Date a)
    {
        this(a.day, a.month, a.year);
        this.validator();
    }

    // print this date to stdout
    public void getDate()
    {
        if (day < 10) System.out.print(0);
        System.out.print(day + "/");
        if (month < 10) System.out.print(0);
        System.out.print(month + "/");
        System.out.println(year);
    }

    // return next date of this date
    public Date nextDate()
    {
        int rday = day + 1;
        int rmonth = month;
        int ryear = year;
        if (rday > lastDay(month, year)) 
        {
            rday = 1;
            rmonth++;
            if (rmonth > 12)
            {
                rmonth = 1;
                ryear++;
            }
        }
        Date result = new Date(rday, rmonth, ryear);
        return result;
    }

    // return prev date of this date
    public Date prevDate()
    {
        int rday = day - 1;
        int rmonth = month;
        int ryear = year;
        if (rday == 0)
        {
            rmonth--;
            if (rmonth == 0) 
            {
                rmonth = 12;
                ryear--;
            }
            rday = lastDay(rmonth, ryear);
        }
        Date result = new Date(rday, rmonth, ryear);
        return result;
    }

    // return the last day of this month
    private int lastDay(int month, int year)
    {
        if (month == 2) 
        {
            if (year % 4 == 0) return 29;
            return 28;
        }
        int lastDay = 30;
        if ((month <= 7 && month % 2 == 1)||(month > 7 || month % 2 == 0)) lastDay++;
        return lastDay;
    }

    // throw IllegalAccessException if this date is not valid
    private void validator()
    {
        if (day < 1 || month < 1 || year < 1 || month > 12) 
        {
            throw new IllegalArgumentException("Invalid date!!!");
        }
        if (day > this.lastDay(month, year)) throw new IllegalArgumentException("Invalid date!!!");
    }

    /**
     * @return the day
     */
    public int getDay() 
    {
        return day;
    }


    /**
     * @param day the day to set
     */
    public void setDay(int day) 
    {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() 
    {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) 
    {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() 
    {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) 
    {
        this.year = year;
    }
}