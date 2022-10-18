/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variablesitipusdades;

import java.util.Scanner;

/**
 *
 * @author Mister Andriy
 */
public class CalculadoraSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Primer número: ");
        int num1 = teclat.nextInt();
        
        System.out.println("Operació: ");
        char op = teclat.next().charAt(0);
        
        System.out.println("Segon número: ");
        int num2 = teclat.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacio = num1 * num2;
        int divisio = num1 / num2;
        int modul = num1 % num2;
        
        switch (op){
            case '+':
                System.out.println("Resultat: " + suma);
                break;
            case '-':
                System.out.println("Resultat: " + resta);
                break;
            case '*':
                System.out.println("Resultat: " + multiplicacio);
                break;
            case '/':
                System.out.println("Resultat: " + divisio);
                break;    
            case '%':
                System.out.println("Resultat: " + modul);
                break;
      
    }
    }
    
}
