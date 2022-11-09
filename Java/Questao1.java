import java.util.Scanner;
 
public class Questao1 
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in); 
        float[] notas; 
 
        notas = new float[10];         
        
        for(int i=0; i < notas.length; i++) 
        {       
            System.out.println("Informe a nota: ");      
            notas[i] = sc.nextFloat(); 
        } 
         
        
        for(int i=0; i < notas.length; i++)  
        {       
            System.out.print("[" + (notas[i] * 2) + "]"); 
        }
        sc.close(); 
 } 
}