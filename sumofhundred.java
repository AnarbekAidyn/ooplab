
import java.util.Scanner;

public class sumofhundred {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        long k = 0;
        for(long i = 1; i <= 100; i++){
            long a = scanner.nextInt();
            k+=a;
        }
        System.out.println(k);

        }
    }
