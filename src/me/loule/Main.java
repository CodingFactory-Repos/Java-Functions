package me.loule;

public class Main {

    public static void main(String[] args) {
        // Clear console
        System.out.print("\033[H\033[2J");

        /////////////////////////
        /* Exercise Functions */
        ///////////////////////
    
        // Fonction « min » : 2 entiers en paramètres, 1 entier en sortie
        System.out.println("min(3, 5) = " + min(3, 5));

        // Fonction « abs » : 1 entier en paramètre, 1 entier en sortie
        System.out.println("abs(-3) = " + abs(-3));

        // Fonction « sum » : 1 entier N en paramètre, 1 entier en sortie (somme des N entiers)
        System.out.println("sum(5) = " + sum(5));

        // Fonction « power » : 2 entiers en paramètres, 1 entier en sortie
        System.out.println("power(2, 4) = " + power(2, 4));

        // Fonction « stringMirror » : 1 string en paramètre, 1 string en sortie
        System.out.println("stringMirror(\"Hello World\") = " + stringMirror("Hello World"));

        // Fonction « displayMultTable » : 1 entier en paramètre, affichage de la table
        System.out.println("displayMultTable() = " + displayMultTable(5));

        // Fonction « isLeapYear » : 1 entier en paramètre, 1 booléen en sortie
        System.out.println("isLeapYear(2016) = " + isLeapYear(2020));

        // Fonction « isCorrectDate » : 3 entiers en paramètres, 1 booléen en sortie
        System.out.println("isCorrectDate(1, 1, 2000) = " + isCorrectDate(31, 12, 2000));
    }

    public static int min(int a, int b) {
        if(a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int abs(int a) {
        if(a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public static int sum(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int power(int a, int b) {
        int result = 1;
        for(int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static String stringMirror(String s) {
        String result = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static String displayMultTable(int n) {
        String result = "";
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                result += i * j + " ";
            }
            result += "\n";
        }
        return result;
    }

    public static boolean isLeapYear(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean isCorrectDate(int day, int month, int year) {
        if(day < 1 || day > 31) {
            return false;
        }
        if(month < 1 || month > 12) {
            return false;
        }
        if(year < 1) {
            return false;
        }
        if(month == 2) {
            if(isLeapYear(year)) {
                if(day > 29) {
                    return false;
                }
            } else {
                if(day > 28) {
                    return false;
                }
            }
        }
        if(month == 4 || month == 6 || month == 9 || month == 11) {
            if(day > 30) {
                return false;
            }
        }
        return true;
    }
}
