
package relacionejercicios;

import java.util.Scanner;

public class Palindromos {
    
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in); 
        
        System.out.println("Introduce la palabra");
        String palabra = t.nextLine();
        
        for (int i = 0; i < palabra.length(); i++) {
            
            
            
//            System.out.println(palabra.charAt(i));            
        }
        
        
        
    }
    
    public static boolean comprobarPalindromo(String palabra, int i){
        boolean palindro = false;
        if((0+i)<((palabra.length()-1)-i)){
            if(palabra.charAt(0+i)==palabra.charAt((palabra.length()-1)-i)){
                comprobarPalindromo(palabra, i+1);
                palindro = true;
            }
            else{
            
            }
        }
        return palindro;
    }
}