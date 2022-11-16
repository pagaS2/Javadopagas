import java.util.Scanner;

public class aritmetica {
    static float s(float n1, float n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2;

        System.out.println("informe a primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.println("informe a segunda nota: ");
        nota2 = sc.nextFloat();

        float media = s(nota1, nota2) / 2;
        
        System.out.println("media aritmetica: " + media);

        sc.close();
    }
}