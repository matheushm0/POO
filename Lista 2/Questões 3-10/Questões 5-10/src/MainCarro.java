import java.util.Scanner;
public class MainCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cg, n3, cpf3, d3, l3, num3, b3, c3, uf3, mr, md, d, ch;
        double s, t, sp, v;

        System.out.println("Para começar primeiro crie uma concessionaria: ");

        System.out.printf("Informe a razão social: ");
        String rs = sc.nextLine();

        System.out.printf("Informe o nome de fantasia: ");
        String nf = sc.nextLine();

        System.out.printf("Informe o logradouro: ");
        String l = sc.nextLine();

        System.out.printf("Informe o número: ");
        String num = sc.nextLine();

        System.out.printf("Informe o bairro: ");
        String b = sc.nextLine();

        System.out.printf("Informe a cidade: ");
        String ct = sc.nextLine();

        System.out.printf("Informe a UF: ");
        String uf = sc.nextLine();

        System.out.println("Agora informe a quantidade de funcionários: ");
        int count = sc.nextInt();

        sc.nextLine();

        System.out.println("Crie os funcionários: ");

        for(int i = 0; i < count; i++){

            System.out.println("Defina um cargo: ");
            cg = sc.nextLine();

            System.out.println("Defina um salário: ");
            s = sc.nextDouble();

            sc.nextLine();

            System.out.printf("Informe o nome do funcionario: ");
            n3 = sc.nextLine();

            System.out.printf("Informe o CPF: ");
            cpf3 = sc.nextLine();

            System.out.printf("Informe a data de nascimento no formato dd/MM/yyyy: ");
            d3 = sc.nextLine();

            System.out.printf("Informe o logradouro: ");
            l3 = sc.nextLine();

            System.out.printf("Informe um número de telefone: ");
            num3 = sc.nextLine();

            System.out.printf("Informe o bairro: ");
            b3 = sc.nextLine();

            System.out.printf("Informe a cidade: ");
            c3 = sc.nextLine();

            System.out.printf("Informe a UF: ");
            uf3 = sc.nextLine();

            VendedorDeConcessionaria vdv = new VendedorDeConcessionaria(n3,cpf3,d3,l3,num3,b3,c3,uf3,cg,s);
            System.out.println(vdv);

        }

        System.out.println("Funcionários criados com sucesso.");

        System.out.println("Infome a quantidade de carros: ");
        int count1 = sc.nextInt();

        sc.nextLine();

        System.out.println("Adicione os carros: ");

        for(int j = 0; j < count1; j++){

            System.out.printf("Informe o número do chassi: ");
            ch = sc.nextLine();

            System.out.printf("Informe a marca: ");
            mr = sc.nextLine();

            System.out.printf("Informe o modelo: ");
            md = sc.nextLine();

            System.out.printf("Informe o ano de fabricação: ");
            d = sc.nextLine();

            System.out.printf("Informe a capacidade do tanque: ");
            t = sc.nextDouble();

            System.out.printf("Informe a velocidade final: ");
            sp = sc.nextDouble();

            System.out.printf("Informe o valor de venda do carro: ");
            v = sc.nextDouble();

            sc.nextLine();

            Carro cr = new Carro(mr,md,d,ch,t,sp);
            CarroDeConcessionaria cdc = new CarroDeConcessionaria(mr,md,d,ch,t,sp,v);
            System.out.println(cr);
            System.out.println(cdc);

        }

        System.out.println("Carros adicionados com sucesso.");

    }
}