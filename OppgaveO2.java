import java.util.Scanner;

public class OppgaveO2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn poengsum: ");
        int poeng = scanner.nextInt();

        if (poeng < 0 || poeng > 100) {
            System.out.println("Ugyldig poengsum!");
        } else if (poeng >= 90) {
            System.out.println("Karakter: A");
        } else if (poeng >= 80) {
            System.out.println("Karakter: B");
        } else if (poeng >= 60) {
            System.out.println("Karakter: C");
        } else if (poeng >= 50) {
            System.out.println("Karakter: D");
        } else if (poeng >= 40) {
            System.out.println("Karakter: E");
        } else {
            System.out.println("Karakter: F");
        }

        scanner.close();
    }
}
