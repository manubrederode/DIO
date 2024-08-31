package desafio2;

import java.time.LocalTime;

public class TimeFactory {

    public static LocalTime createTime(String timeString) {
        return LocalTime.parse(timeString);
    }
}
