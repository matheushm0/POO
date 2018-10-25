public class Carro extends Pessoa {

    protected String marca;
    protected String modelo;
    protected String anoDeFabricacao;
    protected Pessoa proprietario;
    protected String chassi;
    protected double tanque;
    protected double velocidadeFinal;

    public Carro(String marca, String modelo, String anoDeFabricacao, String chassi, double tanque, double velocidadeFinal) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.chassi = chassi;
        this.tanque = tanque;
        this.velocidadeFinal = velocidadeFinal;
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

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getVelocidadeFinal() {
        return velocidadeFinal;
    }

    public void setVelocidadeFinal(double velocidadeFinal) {
        this.velocidadeFinal = velocidadeFinal;
    }

    public void setAnoDeFabricacao(String anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String toString() {

        String str = "";
        str = str + "Marca: " + this.marca + "\n";
        str = str + "Modelo: " + this.modelo + "\n";
        str = str + "Ano de Fabricação: " + this.anoDeFabricacao + "\n";
        str = str + "Chassi: " + this.chassi + "\n";
        str = str + "Capacidade do tanque: " + this.tanque + "L" + "\n";
        str = str + "Velocidade final: " + this.velocidadeFinal + "km/h" + "\n";


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