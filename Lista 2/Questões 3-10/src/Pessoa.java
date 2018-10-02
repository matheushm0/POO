import java.util.Date;

public class Pessoa {

    private String nome;
    private String cpf;
    private Date nascimento;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String toString(){

        String str = "";
        str = str + "Nome: " +this.nome;
        str = str + "CPF: " this.cpf;
        str = str + "Data de Nascimento: " +this.nascimento;
        str = str + "Logradouro: " + this.logradouro;
        str = str + "Número: " + this.numero;
        str = str + "Bairro: "+ this.bairro;
        str = str + "Cidade: "+ this.cidade;
        str = str + "UF: " + this.uf;

        return str;

    }

}

