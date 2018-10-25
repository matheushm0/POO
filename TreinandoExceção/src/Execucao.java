import java.util.Scanner;
import java.lang.IllegalArgumentException;
public class Execucao{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o nome da nova Lâmpada: ");
        String s = sc.nextLine();
        System.out.printf("Informe o tipo da Lâmpada: ");

        try{
            char c = sc.next().charAt(0);

            if(c != 'F' && c != 'I') {
                throw new IllegalArgumentException("IllegalArgumentException");
            }
        }
        catch(IllegalArgumentException e){
                System.out.println("O tipo permitido só é F ou I");
        }

        FabricaLampada nl = new FabricaLampada(c,s);
        System.out.println(nl);
        nl.FabricaLampada(c);
    }
}