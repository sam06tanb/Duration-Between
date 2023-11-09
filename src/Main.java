import java.time.Duration;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LocalDate TempoAgora = LocalDate.now();

        System.out.print("How many days you want to go back: ");
        int date1 = sc.nextInt();
        LocalDate past = TempoAgora.minusDays(date1);

        System.out.print("How many days you want to go to the future: ");
        int date2 = sc.nextInt();
        LocalDate future = TempoAgora.plusDays(date2);
        System.out.println("Data 1: " + past);
        System.out.println("Data 2: " + future);

        Duration t1 = Duration.between(past.atTime(0, 0), future.atTime(0, 0));

        System.out.println("Tempo entre: " + t1.toDays());

        sc.close();
        }
    }
