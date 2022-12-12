import java.util.Scanner;

class Aluno {
    String nome;
    int idade;
    float altura;
    float peso;
    int matricula;

    @Override
    public String toString() {
        return "nome:" + nome + " idade:" + idade + " altura:" + altura + " matricula:" + matricula;
    }
}

public class Exercicioprova2 {
    static Scanner leitor = new Scanner(System.in);

    public static Aluno cadastroAluno() {
        Aluno aluno = new Aluno();
        System.out.println("Qual o nome?");
        aluno.nome = leitor.next();
        System.out.println("Qual a idade?");
        aluno.idade = leitor.nextInt();
        System.out.println("Qual a altura?");
        aluno.altura = leitor.nextFloat();
        System.out.println("Qual o peso do aluno?");
        aluno.peso = leitor.nextFloat();
        System.out.println("Qual a matricula?");
        aluno.matricula = leitor.nextInt();
        return aluno;
    }

    public static void exibir(Aluno aluno[]) {
        int matricula;
        System.out.println("Qual a matricula?");
        matricula = leitor.nextInt();
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i].matricula == matricula) {
                System.out.println(aluno[i].toString());
                break;
            }
        }
    }

    public static void imc(Aluno aluno[]) {
        int matricula;
        System.out.println("Qual a matricula?");
        matricula = leitor.nextInt();
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i].matricula == matricula) {
                System.out.println(aluno[i].peso / (aluno[i].altura * aluno[i].altura));
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno[] = new Aluno[100];
        int op = 0;
        while (op != 2) {
            System.out.println("Digite 1 para cadastro:");
            System.out.println("Digite 2 para exibir aluno especifico :");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    for (int i = 0; i < aluno.length; i++) {
                        if (aluno[i] == null) {
                            aluno[i] = cadastroAluno();
                            break;
                        }
                    }
                    break;
                case 2:
                for (int i = 0; i < aluno.length; i++) {
                    exibir(aluno);
                }
                    break;

                default:

                    break;
            }
        }
    }
}
