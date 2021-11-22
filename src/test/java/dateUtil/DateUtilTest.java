package dateUtil;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DateUtilTest {

    @Test
    public void return_5_january_mondays() {
        List<LocalDate> mondaysOfJanuary = new ArrayList<>(List.of(
                LocalDate.parse("2017-01-02"),
                LocalDate.parse("2017-01-09"),
                LocalDate.parse("2017-01-16"),
                LocalDate.parse("2017-01-23"),
                LocalDate.parse("2017-01-30")
        ));
        assertEquals(mondaysOfJanuary, DateUtil.findAllMondays(2017, 1));
    }
}