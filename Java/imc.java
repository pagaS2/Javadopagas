import java.util.Scanner; 
 
class pessoa { 
    String nome; 
    float peso, altura, imc; 
} 
 
public class imc{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        pessoa p1; 
        p1 = new pessoa(); 
 
        System.out.println("Escreva seu nome completo:"); 
        p1.nome = sc.next();
        sc.nextLine();
        System.out.println("Escreva seu peso: "); 
        p1.peso = sc.nextFloat(); 
        System.out.println("Escreva sua altura: "); 
        p1.altura = sc.nextFloat(); 
 
        p1.imc = p1.peso / (p1.altura * p1.altura); 
 
        System.out.println(p1.nome + " Seu imc é: " + "\t" + p1.imc); 
 
        sc.close(); 
    } 
}