package relacionejercicios;

import java.util.Scanner;

public class Palindromos {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Introduce la palabra");
        String palabra = t.nextLine();

        System.out.println(Palindromos.comprobarPalindromoA(palabra));
        System.out.println(Palindromos.comprobarPalindromoB(palabra, 0));

//            System.out.println(palabra.charAt(i));            
    }

    public static boolean comprobarPalindromoA(String palabra) {
        boolean palindro = true;
        for (int i = 0; i < palabra.length(); i++) {
            if ((0 + i) < ((palabra.length() - 1) - i)) {
                if (!(palabra.charAt(0 + i) == palabra.charAt((palabra.length() - 1) - i))) {
                    return false;
                }
            }
        }
        return palindro;
    }

    public static boolean comprobarPalindromoB(String palabra, int i) {
        boolean palindro = true;
        if ((0 + i) < ((palabra.length() - 1) - i)) {
            if (palabra.charAt(0 + i) == palabra.charAt((palabra.length() - 1) - i)) {
                System.out.println("ciclo " + i);
                palindro = comprobarPalindromoB(palabra, i + 1);
            } else {
                return false;
            }
        }
        return palindro;
    }
}
