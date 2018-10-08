public class Concessionaria extends Empresa{

    public Concessionaria(String razaoSocial, String nomeDeFantasia, String logradouro, String numero, String bairro, String cidade, String uf) {
        super(razaoSocial, nomeDeFantasia, logradouro, numero, bairro, cidade, uf);
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
