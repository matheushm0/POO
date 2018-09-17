public class Pessoa {

    private String nome;
    private String endereco;
    private String nascimento;

    public void setNome(String n){

        nome = n;
    }

    public String getNome(){

        return this.nome;

    }

    public void setEndereco(String e){

        endereco = e;

    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setNascimento(String nc) {
        nascimento = nc;
    }

    public String getNascimento(){

        return this.nascimento;
    }

    public String toString(){

       String str = "";
       str = str + "Nome: " + this.nome;
       str = str + "Endereço: " + this.endereco;
       str = str + "Data de Nascimento : " + this.nascimento;

       return str;
    }
}
