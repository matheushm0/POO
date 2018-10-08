public class Empresa {

    protected String razaoSocial;
    protected String nomeDeFantasia;
    protected String logradouro;
    protected String numero;
    protected String bairro;
    protected String cidade;
    protected String uf;

    public Empresa(String razaoSocial, String nomeDeFantasia, String logradouro, String numero, String bairro, String cidade, String uf) {
        this.razaoSocial = razaoSocial;
        this.nomeDeFantasia = nomeDeFantasia;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeDeFantasia() {
        return nomeDeFantasia;
    }

    public void setNomeDeFantasia(String nomeDeFantasia) {
        this.nomeDeFantasia = nomeDeFantasia;
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
        str = str + "Razão Social: " + this.razaoSocial + "\n";
        str = str + "Nome de Fantasia: " + this.nomeDeFantasia + "\n";
        str = str + "Logradouro: " + this.logradouro + "\n";
        str = str + "Número: " + this.numero + "\n";
        str = str + "Bairro: " + this.bairro + "\n";
        str = str + "Cidade: " + this.cidade + "\n";
        str = str + "UF: " + this.uf + "\n";

        return str;
    }

}
