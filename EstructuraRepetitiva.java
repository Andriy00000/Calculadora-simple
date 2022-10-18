/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variablesitipusdades;

/**
 *
 * @author Mister Andriy
 */
public class EstructuraRepetitiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //17/10/2022
        // volem escriure per pantalla els 5 primers numeros 
        
        System.out.println(1);
        System.out.println("2");
        System.out.println('3');
        System.out.println("4");
        System.out.println("5");
        
        // ara volem escriure els 1000 primers numeros
        // farem servir una estructura reretitiva while
        
        //inicialitzem algunes variables
        int num = 1;
        
        while (num <= 1000) {
            // executa aquest bloc d'instruccions
            System.out.println(num);
            // ha d'haver algun canvi de variable que porti a la condicio a fals
            // si no es quedaria en bucle infinit
            num++; // num = num + 1
        }
        
        // visualizar els numeros del 1000 al 0
        // cal vigilar amb el valor d'inici, la condicio i l'increment
        int num1 = 1000;
        
        while (num1 >= 0) {
            // executa aquest bloc d'instruccions
            System.out.println(num1);
            // ha d'haver algun canvi de variable que porti a la condicio a fals
            // si no es quedaria en bucle infinit
            num1--; // num = num + 1
        }
        
        //imprimir nomes els valors parells
         int num2 = 0;
        
        while (num2 < 1000) {
            // executa aquest bloc d'instruccions
            if (num2 % 2 == 0) {
                System.out.println(num2);
            }
            // ha d'haver algun canvi de variable que porti a la condicio a fals
            // si no es quedaria en bucle infinit
            num2++; // num = num + 1
        }
    }
    
}
