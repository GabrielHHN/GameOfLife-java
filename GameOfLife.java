import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Hvor mange rader vil du ha?: ");
        int rader = Integer.parseInt(tastatur.nextLine());

        System.out.println("Hvor mange kolonner vil du ha?: ");
        int kolonner = Integer.parseInt(tastatur.nextLine());     

        Verden verden = new Verden(rader, kolonner);
        verden.tegn();

        System.out.println("\"Enter\" for å Fortsette, \"Space-Enter\" for å Stoppe: " );
        String fortsettelse = tastatur.nextLine();

        while (fortsettelse == "") {
            verden.oppdatering();
            verden.tegn();

            System.out.println("trykk \"Enter\" for å FORTSETTE, eller trykk \"Space-Enter\" for å STOPPE: " );
            fortsettelse = tastatur.nextLine();
        }
    }
}
