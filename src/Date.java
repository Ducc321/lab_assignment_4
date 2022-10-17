public class Date {
    private int day;
    private int month;
    private int year;

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }

        if(other != null && this.getClass().equals(other.getClass())) {
            Date that = (Date) other;
            return this.day == that.day && this.month == that.month && this.year == that.year;
        }
        return false;
    }
}
