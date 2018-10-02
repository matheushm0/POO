import java.util.Scanner;
public class MainRetangulo {

    public static void main(String[] args) {

        Retangulo r = new Retangulo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o comprimento do retângulo: ");
        double c = sc.nextDouble();

        System.out.print("Informe a largura do retângulo: ");
        double l = sc.nextDouble();

        r.setLength(c);
        r.setWidth(l);

        System.out.println(r);

        r.Verifica(c,l);
    }
}
