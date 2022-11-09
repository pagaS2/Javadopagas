import java.util.Scanner; 
public class Main
{ 
  
 public static void main(String[] args) { 
      
     double n1, n2, mediaN, mediaA; 
     Scanner sc = new Scanner(System.in); 
      
     System.out.println("informe a nota 1:"); 
      
     n1 = sc.nextDouble(); 
      
     System.out.println("informe a nota 2:"); 
      
     n2 = sc.nextDouble(); 
      
     System.out.println("informe o valor da media para aprovação:"); 
     mediaN = sc.nextDouble();
      
     mediaA = (n1 + n2) / 2; 
      
     if(mediaA >= mediaN) 
     { 
         System.out.println("Aprovado"); 
     } 
     else 
     { 
         System.out.println("Reprovado"); 
     } 
     System.out.println("Sua media: " +mediaA); 
     sc.close();
 } 
}