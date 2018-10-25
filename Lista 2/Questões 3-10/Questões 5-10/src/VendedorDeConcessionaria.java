public class VendedorDeConcessionaria extends Pessoa{

    private String cargo;
    private double salario;

    public VendedorDeConcessionaria(String nome, String cpf, String nascimento, String logradouro, String numero, String bairro, String cidade, String uf, String cargo, double salario){

        super(nome,cpf,nascimento,logradouro,numero,bairro,cidade,uf);
        this.cargo = cargo;
        this.salario = salario;

    }

    public String getCargo(){

        return this.cargo;

    }

    public void setCargo(String cargo){

        this.cargo = cargo;

    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){

        this. salario = salario;

    }

    public String toString(){

        String str = "";

        str = str + "Nome: " +this.nome + "\n";
        str = str + "CPF: " + this.cpf + "\n";
        str = str + "Data de Nascimento: " +this.nascimento + "\n";
        str = str + "Logradouro: " + this.logradouro + "\n";
        str = str + "Número: " + this.numero + "\n";
        str = str + "Bairro: "+ this.bairro + "\n";
        str = str + "Cidade: "+ this.cidade + "\n";
        str = str + "UF: " + this.uf + "\n";
        str = str + "Cargo: " + this.cargo + "\n";
        str = str + "Salário: R$ " + this.salario + "\n";

        return str;

    }

    public void comissao(double valor){

        this.salario = this.salario + (valor*0.1);

        System.out.println("Novo salário: " + this.salario);


    }

}
