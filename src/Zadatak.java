import java.util.Scanner;

public class Zadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj ocjena ciji prosjek racunate:");
        int brojOcjena = Integer.parseInt(scanner.nextLine());

        int[] ocjene = new int[brojOcjena];
        int zbrojOcjena = 0;
        for (int i = 0; i < brojOcjena; i++) {
            String poruka = (i == 0) ? "Unesite prvu ocjenu:" : "Unesite sljedecu ocjenu:";
            System.out.println(poruka);
            ocjene[i] = Integer.parseInt(scanner.nextLine());
            zbrojOcjena += ocjene[i];
        }
        System.out.println("Prosjek unesenih ocjena je: " + (double)zbrojOcjena/brojOcjena);
    }
}
