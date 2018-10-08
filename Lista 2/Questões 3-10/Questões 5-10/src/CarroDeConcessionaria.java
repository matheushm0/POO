public class CarroDeConcessionaria extends Carro {

    private double valorDeVenda;

    public CarroDeConcessionaria(String marca, String modelo, String anoDeFabricacao,  String chassi, double valorDeVenda) {
        super(marca, modelo, anoDeFabricacao, chassi);
        this.valorDeVenda = valorDeVenda;
    }

    public double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public String toString(){

        String str = "";
        str = str + "Marca: " + this.marca + "\n";
        str = str + "Modelo: " + this.modelo + "\n";
        str = str + "Ano de Fabricação: " + this.anoDeFabricacao + "\n";
        return str;
    }

}