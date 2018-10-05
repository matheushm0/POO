public class Pessoa {

    protected String nome;
    protected String cpf;
    protected String nascimento;
    protected String logradouro;
    protected String numero;
    protected String bairro;
    protected String cidade;
    protected String uf;

    public Pessoa(){

    }

    public Pessoa(String nome, String cpf, String nascimento, String logradouro, String numero, String bairro, String cidade, String uf) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
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
        str = str + "Nome: " +this.nome + "\n";
        str = str + "CPF: " + this.cpf + "\n";
        str = str + "Data de Nascimento: " +this.nascimento + "\n";
        str = str + "Logradouro: " + this.logradouro + "\n";
        str = str + "Número: " + this.numero + "\n";
        str = str + "Bairro: "+ this.bairro + "\n";
        str = str + "Cidade: "+ this.cidade + "\n";
        str = str + "UF: " + this.uf + "\n";

        return str;

    }

}

