
import java.util.Scanner;

public class Kvadraty {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(int i = a; i <= b ; i++){
            if(i == (int)(Math.sqrt(i))* Math.sqrt(i)){
                System.out.print((i + " "));
            }
        }

    }
}
