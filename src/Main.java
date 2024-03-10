import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ZADANIE1
        /*System.out.println("Podaj a:");
        double a = scanner.nextDouble();
        System.out.println("Podaj b:");
        double b = scanner.nextDouble();
        System.out.println("Podaj c:");
        double c = scanner.nextDouble();
        rownaniekwadratowe(a, b, c);
       //ZADANIE2
        System.out.println("Podaj x dla funkcji a:");
        double x1 = scanner.nextDouble();
        System.out.println("wartosc a: " + oblicza(x1));

        System.out.println("Podaj x dla funkcji b:");
        double x2 = scanner.nextDouble();
        System.out.println("wartosc b: " + obliczb(x2));

        System.out.println("Podaj x dla funkcji c:");
        double x3 = scanner.nextDouble();
        System.out.println("wartosc c: " + obliczc(x3));
        //ZADANIE3
        System.out.println("Podaj x, y, z:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        sortowanie(x, y, z);
        //ZADANIE4
        System.out.println("Czy pada deszcz?(true/false):");
        boolean czypada = scanner.nextBoolean();
        System.out.println("Czy jest autobus na przystanku?(true/false):");
        boolean czyjestautobus = scanner.nextBoolean();
        wyswietlkomunikat(czypada, czyjestautobus);
        //ZADANIE 5
        System.out.println("czy jest znizka na samochod?(true/false):");
        boolean czyznizka = scanner.nextBoolean();
        System.out.println("czy otrzymales premie?(true/false):");
        boolean czypremia = scanner.nextBoolean();
        komunikatsamochod(czyznizka, czypremia);
        //ZADANIE 6
        System.out.println("wybierz operacje:");
        System.out.println("1. dodawanie");
        System.out.println("2. odejmowanie");
        System.out.println("3. mnozenie");
        System.out.println("4. dzielenie");
        System.out.println("5. reszta z dzielenia");

        int wybor = scanner.nextInt();
        System.out.println("podaj pierwsza liczbe:");
        double liczba1 = scanner.nextDouble();
        System.out.println("podaj druga liczbe:");
        double liczba2 = scanner.nextDouble();
        dzialanie(wybor, liczba1, liczba2);*/




    }
    //ZADANIE1
    public static void rownaniekwadratowe(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Rozwiązania równania: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("jest jedno rozwiazanie: x = " + x);
        } else {
            System.out.println("nie ma rozwiazan");
        }
    }
    //Zadanie 2
    // Funkcja a
    public static double oblicza(double x) {
        if (x > 0) {
            return 2 * x;
        } else if (x == 0) {
            return 0;
        } else {
            return -3 * x;
        }
    }

    // Funkcja b
    public static double obliczb(double x) {
        if (x >= 0) {
            return Math.pow(x, 2);
        } else {
            return x;
        }
    }

    // Funkcja c
    public static double obliczc(double x) {
        if (x > 2) {
            return 2 + x;
        } else if (x == 2) {
            return 8;
        } else {
            return x - 4;
        }
    }
    //ZADANIE3
    public static void sortowanie(double x, double y, double z) {
        double temp;
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        if (y > z) {
            temp = y;
            y = z;
            z = temp;
        }

        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        System.out.println("liczby rosnaco: " + x + ", " + y + ", " + z);
    }
    //ZADANIE 4
    public static void wyswietlkomunikat(boolean czypada, boolean czyjestautobus) {
        if (czypada && czyjestautobus) {
            System.out.println("wez parasol.\ndostaniesz sie na uczelnie.");
        } else if (czypada && !czyjestautobus) {
            System.out.println("nie dostaniesz sie na uczelnie.");
        } else if (!czypada && czyjestautobus) {
            System.out.println("dostaniesz sie na uczelnię.\nmilego dnai i pieknej pogody.");
        } else {
            System.out.println("milego dnia i pieknej pogody.");
        }
    }
    //ZADANIE 5
    public static void komunikatsamochod(boolean czyznizka, boolean czypremia) {
        if (!czyznizka || czypremia) {
            System.out.println("mozesz kupic samochod !\nzniżki na samochod nie ma");
        } else if (!czyznizka || !czypremia) {
            System.out.println("zakup samochodu trzeba odlozyc na pozniej...\nznizki na samochód nie ma");
        } else if (czyznizka || czypremia) {
            System.out.println("mozesz kupic samochod !");
        }
    }
    //ZADANIE 6
    public static void dzialanie(int wybor, double liczba1, double liczba2) {
        double wynik;

        switch (wybor) {
            case 1:
                wynik = liczba1 + liczba2;
                System.out.println("wynik dodawania: " + wynik);
                break;
            case 2:
                wynik = liczba1 - liczba2;
                System.out.println("wynik odejmowania: " + wynik);
                break;
            case 3:
                wynik = liczba1 * liczba2;
                System.out.println("wynik mnozenia: " + wynik);
                break;
            case 4:
                if (liczba2 != 0) {
                    wynik = liczba1 / liczba2;
                    System.out.println("wynik dzielenia: " + wynik);
                } else {
                    System.out.println("nie można dzielic przez zero");
                }
                break;
            case 5:
                if (liczba2 != 0) {
                    wynik = liczba1 % liczba2;
                    System.out.println("reszta z dzielenia: " + wynik);
                } else {
                    System.out.println("nie można dzielić przez zero");
                }
                break;
            default:
                System.out.println("zly wybor operacji");
        }
    }

}
