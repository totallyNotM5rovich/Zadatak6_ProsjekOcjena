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
            int j = 0;
            int unesenaOcjena;
            do {
                if (j > 0) {
                    System.out.println("Neispravna ocjena! Unesite ispravnu ocjenu");
                }
                unesenaOcjena = Integer.parseInt(scanner.nextLine());
                j++;
            } while (unesenaOcjena < 1 || unesenaOcjena > 5);
            ocjene[i] = unesenaOcjena;
            zbrojOcjena += ocjene[i];
        }
        System.out.println("Prosjek unesenih ocjena je: " + (double)zbrojOcjena/brojOcjena);
    }
}
