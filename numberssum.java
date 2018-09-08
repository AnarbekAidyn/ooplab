
import java.util.Scanner;

public class numberssum {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        long b = scanner.nextInt();
        long k = 0;
        for(long i = 1; i <= b; i++){
            long a = scanner.nextInt();
            k+=a;
        }
        System.out.println(k);

    }
}
