public class Retangulo{

    private double length;
    private double width;

    public double getLength() {

        return this.length;
    }

    public void setLength(double length) {

        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public String toString(){

        String str = "";
        str = str + "Comprimento: " + this.length + "\n";
        str = str + "Largura: " + this.width;
        return str;
    }

    public void Verifica(double length, double width){

        double area;
        double perimetro;

        if((length > 0.0 && width > 0.0) && (length <= 20.0 && width <= 20.0)){

            area = length * width;
            perimetro = 2 * length + (2 * width);

            System.out.println("Área: " + area);
            System.out.println("Perímetro: " + perimetro);
        }
        else{

            System.out.println("O retângulo não possui as medidas necessárias.");

        }

    }
}

