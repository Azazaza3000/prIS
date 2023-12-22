import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("input project begin date and end date in format dd.mm.yyyy");
        Scanner scanner = new Scanner(System.in);
        do {
            String input = scanner.next();
            LocalDate beginLocalDate = LocalDate.parse(input, dateTimeFormatter);
            Date begin = Date.from(Instant.from(beginLocalDate.atStartOfDay(ZoneId.systemDefault())));
            input = scanner.next();
            LocalDate endLocalDate = LocalDate.parse(input, dateTimeFormatter);
            Date end = Date.from(Instant.from(endLocalDate.atStartOfDay(ZoneId.systemDefault())));
            Project project = new Project();
            project.end = end;
            project.start = begin;
            System.out.println(project.getProjectCompletePercentage());
        }
        while(scanner.hasNext());
    }
}
