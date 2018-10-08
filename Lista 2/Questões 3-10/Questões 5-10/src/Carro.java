public class Carro extends Pessoa {

    protected String marca;
    protected String modelo;
    protected String anoDeFabricacao;
    protected Pessoa proprietario;
    protected String chassi;
    private double tanque;
    private double velocidadeFinal;

    public Carro(String nome, String cpf, String nascimento, String logradouro, String numero, String bairro, String cidade, String uf, String marca, String modelo, String anoDeFabricacao, Pessoa proprietario, String chassi) {
        super(nome, cpf, nascimento, logradouro, numero, bairro, cidade, uf);
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.proprietario = proprietario;
        this.chassi = chassi;
    }

    public Carro(String marca, String modelo, String anoDeFabricacao, String chassi) {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(String anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String toString() {

        String str = "";
        str = str + proprietario + "\n";
        str = str + "Marca: " + this.marca + "\n";
        str = str + "Modelo: " + this.modelo + "\n";
        str = str + "Ano de Fabricação: " + this.anoDeFabricacao + "\n";
        str = str + "Chassi: " + this.chassi + "\n";

        return str;
    }

    public void acelera(double v){

        this.velocidadeFinal += v;

        if(tanque > 0){
            System.out.println("O carro está acelerando de 0 km/h até " + v);
        }else{
            System.out.println("O tanque está vazio.");
        }
    }

    public void freiar (double v){

        this.velocidadeFinal -= v;

        if(velocidadeFinal > 0){
            System.out.println("O carro está freiando.");
        }
        else{
            System.out.println("O carro está parado,");
        }
    }

    public void abastecer(double v){
        this.tanque = v;

        if(tanque > 0){
            System.out.println("O tanque atualmente tem: " +v+ "L.");
        }
        else{
            System.out.println("O tanque está vazio.");
        }
    }
}