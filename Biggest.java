
import java.util.Scanner;

public class Biggest {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a < b){
            System.out.println(2);
        }
        else if(b < a){
            System.out.println(1);
        }
        else{
            System.out.println(0);

        }

    }
}
