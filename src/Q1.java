import java.util.Scanner;

public class Q1 {
    public static void main (String[] args){

        int x = 1;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
