
// enum Day {
//     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
// }

// public class Main1 {
//     public static void main(String[] args) {
//         Day today = Day.FRIDAY;
//         System.out.println(today);
//     }
// }



import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter today: ");
            String day = sc.nextLine().toUpperCase();

            switch (day) {
                case "MONDAY" ->
                    System.out.println("Start of the week");

                case "TUESDAY" ->
                    System.out.println("Second day of the week");

                case "WEDNESDAY" ->
                    System.out.println("Midweek");

                case "THURSDAY" ->
                    System.out.println("Fourth day of the week");

                case "FRIDAY" ->
                    System.out.println("End of the working week");

                case "SATURDAY" ->
                    System.out.println("Weekend");

                case "SUNDAY" ->
                    System.out.println("Last day of the week");

                default ->
                    System.out.println("Invalid day");
            }
        }
    }
}
