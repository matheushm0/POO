public class Aluno extends Pessoa{

    private String matricula;
    private String instituicao;

    public Aluno(String nome, String cpf, String nascimento, String logradouro, String numero, String bairro, String cidade, String uf, String matricula, String instituicao) {
        super(nome, cpf, nascimento, logradouro, numero, bairro, cidade, uf);
        this.matricula = matricula;
        this.instituicao = instituicao;
    }

    public String getMatricula(){

        return this.matricula;

    }

    public void setMatricula(String matricula){

        this.matricula = matricula;

    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
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
        str = str + "Matrícula: " + this.matricula + "\n";
        str = str + "Instituição: " + this.instituicao + "\n";

        return str;

    }
}
