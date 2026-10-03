// 1185. Day of the Week
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDateTime myDateObj = LocalDateTime.of(year, month, day, 0, 0);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        if (formattedDate.contains("Mon")) {
            return "Monday";
        } else if (formattedDate.contains("Tue")) {
            return "Tuesday";
        } else if (formattedDate.contains("Wed")) {
            return "Wednesday";
        } else if (formattedDate.contains("Thu")) {
            return "Thursday";
        } else if (formattedDate.contains("Fri")) {
            return "Friday";
        } else if (formattedDate.contains("Sat")) {
            return "Saturday";
        } else if (formattedDate.contains("Sun")) {
            return "Sunday";
        } else {
            return "";
        }
    }
}
