import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);


        boolean salir = false;
        int opcion;

        while(!salir) {
            System.out.println("------TRES EN LÍNIA------");


            System.out.println("1. Nova Partida");
            System.out.println("2. Carregar partida");
            System.out.println("3. Configuració");
            System.out.println("4. Sortir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has escogido la opcion 1");
                    break;

                case 2:
                    System.out.println("Has escogido la opcion 2");
                    break;

                case 3:
                    System.out.println("Has escogido la opcion 3");
                    break;

                case 4:
                    System.out.println("Has escogido la opcion 4");
                    break;
            }
        }

    }
}