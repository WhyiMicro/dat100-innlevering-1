import java.util.Scanner;

public class OppgaveO1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("== Trinnskat kalkulator =====\n");
        System.out.print("Skriv inn årsinntekt: ");
        double inntekt = scanner.nextDouble();

        double trinnskatt = 0.0;

        // Satser
        double trinn1 = 208050;
        double trinn2 = 292850;
        double trinn3 = 670000;
        double trinn4 = 937900;
        double trinn5 = 1350000;

        double sats1 = 0.017;
        double sats2 = 0.040;
        double sats3 = 0.136;
        double sats4 = 0.166;
        double sats5 = 0.176;

        if (inntekt > trinn5) {
            trinnskatt += (inntekt - trinn5) * sats5;
            inntekt = trinn5;
        }

        if (inntekt > trinn4) {
            trinnskatt += (inntekt - trinn4) * sats4;
            inntekt = trinn4;
        }

        if (inntekt > trinn3) {
            trinnskatt += (inntekt - trinn3) * sats3;
            inntekt = trinn3;
        }

        if (inntekt > trinn2) {
            trinnskatt += (inntekt - trinn2) * sats2;
            inntekt = trinn2;
        }

        if (inntekt > trinn1) {
            trinnskatt += (inntekt - trinn1) * sats1;
        }

        System.out.print("Beregnet trinnskatt: " + trinnskatt + " kr");

        scanner.close();
    }
}
