package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {

        var birthday = LocalDate.of(year, month, day);
        var today = LocalDate.now();

        var formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        StringBuilder s = new StringBuilder();
        int count = 0;

        while (birthday.isBefore(today) || birthday.isEqual(today)) {
            s.append(count++)
              .append(" - ")
              .append(birthday.format(formatter))
              .append(" - ")
              .append(birthday.getDayOfWeek()
                              .getDisplayName(TextStyle.SHORT, Locale.US))
                              .append(System.lineSeparator());
            birthday = birthday.plusYears(1);
        }
        return s.toString();
    }
}
