package dateUtil;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DateUtil {

    public static List<LocalDate> findAllMondays(int year, int month) {
        List<LocalDate> mondays = new ArrayList<>();
        LocalDate localDate = LocalDate.of(year, month,1);
        LocalDate lastDayOfMonth = LocalDate.from(localDate).withDayOfMonth(localDate.lengthOfMonth());

        for (LocalDate date = localDate; date.isBefore(lastDayOfMonth); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                mondays.add(date);
            }
        }
        return mondays;
    }
}
