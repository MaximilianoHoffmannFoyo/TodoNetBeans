
package relacionejercicios;

import java.util.Scanner;

public class Palindromos {
    
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in); 
        
        System.out.println("Introduce la palabra");
        String palabra = t.nextLine();
        
        System.out.println(Palindromos.comprobarPalindromo(palabra, 0));
          
            
//            System.out.println(palabra.charAt(i));            
        
        
        
        
    }
    
//    public static boolean comprobarPalindromo(String palabra, int i){
//        boolean palindro = false;
//        if((0+i)<((palabra.length()-1)-i)){
//            if(palabra.charAt(0+i)==palabra.charAt((palabra.length()-1)-i)){
//                System.out.println("ciclo "+i);
//                palindro = comprobarPalindromo(palabra, i+1);
//            }
//            else{
//                return false;
//            }
//        }
//        return palindro;
//    }
    public static boolean comprobarPalindromo(String palabra, int i){
        boolean palindro = true;
        if((0+i)<((palabra.length()-1)-i)){
            if(palabra.charAt(0+i)==palabra.charAt((palabra.length()-1)-i)){
                System.out.println("ciclo "+i);
                palindro = comprobarPalindromo(palabra, i+1);
            }
            else{
                return false;
            }
        }
        return palindro;
    }
}