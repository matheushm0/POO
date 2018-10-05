import java.util.Scanner;
public class Main {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Pessoa\n2 - Aluno\n3 - Funcionario\n0 - Sair");
        int op = sc.nextInt();

        while(op != 0){
            switch(op){
                case 1:

                    sc.nextLine();

                    System.out.printf("Informe o nome da pessoa: ");
                    String n1 = sc.nextLine();

                    System.out.printf("Informe o CPF: ");
                    String cpf1 = sc.nextLine();

                    System.out.printf("Informe a data de nascimento no formato dd/MM/yyyy: ");
                    String d1 = sc.nextLine();

                    System.out.printf("Informe o logradouro: ");
                    String l1 = sc.nextLine();

                    System.out.printf("Informe um número de telefone: ");
                    String num1 = sc.nextLine();

                    System.out.printf("Informe o bairro: ");
                    String b1 = sc.nextLine();

                    System.out.printf("Informe a cidade: ");
                    String c1 = sc.nextLine();

                    System.out.printf("Informe a UF: ");
                    String uf1 = sc.nextLine();

                    Pessoa p = new Pessoa(n1,cpf1,d1,l1,num1,b1,c1,uf1);

                    System.out.println(p);

                    break;

                case 2:

                    sc.nextLine();

                    System.out.printf("Informe o nome do Aluno: ");
                    String n2 = sc.nextLine();

                    System.out.printf("Informe o CPF: ");
                    String cpf2 = sc.nextLine();

                    System.out.printf("Informe a data de nascimento no formato dd/MM/yyyy: ");
                    String d2 = sc.nextLine();

                    System.out.printf("Informe o logradouro: ");
                    String l2 = sc.nextLine();

                    System.out.printf("Informe um número de telefone: ");
                    String num2 = sc.nextLine();

                    System.out.printf("Informe o bairro: ");
                    String b2 = sc.nextLine();

                    System.out.printf("Informe a cidade: ");
                    String c2 = sc.nextLine();

                    System.out.printf("Informe a UF: ");
                    String uf2 = sc.nextLine();

                    System.out.printf("Informe a matrícula: ");
                    String mat = sc.nextLine();

                    System.out.printf("Informe a instituição de ensino: ");
                    String inst = sc.nextLine();

                    Aluno a = new Aluno(n2,cpf2,d2,l2,num2,b2,c2,uf2,mat,inst);
                    System.out.println(a);

                    break;

                case 3:

                    sc.nextLine();

                    System.out.println("Defina um cargo: ");
                    String cg = sc.nextLine();

                    System.out.println("Defina um salário: ");
                    double s = sc.nextDouble();

                    sc.nextLine();

                    System.out.printf("Informe o nome do funcionario: ");
                    String n3 = sc.nextLine();

                    System.out.printf("Informe o CPF: ");
                    String cpf3 = sc.nextLine();

                    System.out.printf("Informe a data de nascimento no formato dd/MM/yyyy: ");
                    String d3 = sc.nextLine();

                    System.out.printf("Informe o logradouro: ");
                    String l3 = sc.nextLine();

                    System.out.printf("Informe um número de telefone: ");
                    String num3 = sc.nextLine();

                    System.out.printf("Informe o bairro: ");
                    String b3 = sc.nextLine();

                    System.out.printf("Informe a cidade: ");
                    String c3 = sc.nextLine();

                    System.out.printf("Informe a UF: ");
                    String uf3 = sc.nextLine();

                    Funcionario f = new Funcionario(n3,cpf3,d3,l3,num3,b3,c3,uf3,cg,s);
                    System.out.println(f);

                default:
                    System.out.println("Digite uma opção valida.");
                    break;
        }

        System.out.println("1 - Pessoa\n2 - Aluno\n3 - Funcionario\n0 - Sair");
        op = sc.nextInt();

        }
    }
}