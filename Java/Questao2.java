import java.util.Scanner; 
import java.util.Random; 
public class Questao2 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Random bingo = new Random(); 
          
        int[] numeros; 
        int maior = 0, menor = 0, igual = 0, numero = 0; 
        numeros = new int[100]; 
 
        for(int i=0; i < numeros.length; i++){ 
            numeros[i] = bingo.nextInt(100); 
        } 
        System.out.println("informe o numero: "); 
        numero = sc.nextInt(); 
        for(int i=0; i < numeros.length; i++){ 
            System.out.print("[" + numeros[i] + "]"); 
            if( numeros[i] > numero) 
            maior++; 
            if(numeros[i] < numero) 
            menor++; 
            if(numeros[i] == numero) 
            igual++; 
        } 
        System.out.println("\nNumeros Maiores: "+ maior); 
        System.out.println("Numeros Menores: "+ menor); 
        System.out.println("Numeros Iguais: "+ igual); 
        sc.close(); 
    }  
}