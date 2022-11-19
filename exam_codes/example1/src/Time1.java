public class Time1
{
    private int hour;
    private int minute;
    private int second;

    public Time1 (int hour, int minute , int second)
    {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public void setHour(int h)
    {
        if (h >= 0 && h < 24)
            this.hour = h;
    }
    public void setMinute(int m)
    {   if (m >= 0 && m < 60)
             this.minute = m;
    }
    public void setSecond(int s)
    {
        if (s >= 0 && s < 60)
         this.second = s;
    }

    public String toUniversalString()
    {
        return  String.format("%02d:%02d:%02d", hour , minute , second);
    }
    public String toString()
    {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ?  12 : hour % 12) , minute , second, (hour < 12 ? "AM" : "PM"));
    }
}
