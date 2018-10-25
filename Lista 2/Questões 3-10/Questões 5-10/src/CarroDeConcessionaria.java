public class CarroDeConcessionaria extends Carro {

    private double valorDeVenda;

    public CarroDeConcessionaria(String marca, String modelo, String anoDeFabricacao, String chassi, double tanque, double velocidadeFinal, double valorDeVenda) {
        super(marca, modelo, anoDeFabricacao, chassi, tanque, velocidadeFinal);
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
        str = str + "Valor de venda: " + this.valorDeVenda + "\n";
        return str;
    }

}