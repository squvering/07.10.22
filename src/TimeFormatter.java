public class TimeFormatter {
    public static String sep(String s, int i) {
        if(i > 1)
            s += ", ";
        else if(i > 0)
            s += " and ";
        return s;
    }

    public static int boolToInt(Boolean a) {
        return a ? 1 : 0;
    }

    public static String formatDuration(int seconds) {
        String s="";
        if(seconds == 0)
            return "now";
        int years, days, hours, minutes;

        minutes = seconds / 60;
        seconds %= 60;

        hours = minutes / 60;
        minutes %= 60;

        days = hours / 24;
        hours %= 24;

        years = days / 365;
        days %= 365;

        int i = boolToInt(seconds > 0) + boolToInt(minutes > 0) + boolToInt(hours > 0) + boolToInt(days > 0) + boolToInt(years > 0);
        if (years > 0) {
            s+= "" + years;
            if (years > 1)
                s+= " years";
            else
                s+= " year";
            s = sep(s, --i);
        }

        if (days > 0 && i > 0) {
            s+= "" + days;
            if (days > 1)
                s+= " days";
            else
                s+= " day";
            s = sep(s, --i);
        }

        if (hours > 0 && i > 0) {
            s+= "" + hours;
            if (hours > 1)
                s+= " hours";
            else
                s+= " hour";
            s = sep(s, --i);
        }

        if (minutes > 0 && i > 0) {
            s+= "" + minutes;
            if (minutes > 1)
                s+= " minutes";
            else
                s+= " minute";
            s = sep(s, --i);
        }

        if (seconds > 0 && i > 0) {
            s+= "" + seconds;
            if (seconds > 1)
                s+= " seconds";
            else
                s+= " second";
            s = sep(s, --i);
        }
        return s;
    }
}