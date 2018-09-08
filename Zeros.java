
import java.util.Scanner;

public class Zeros {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        long b = scanner.nextInt();
        long k = 0;
        for(long i = 1; i <= b; i++){
            long a = scanner.nextInt();
            if(a == 0){
                k++;
            }
        }
        System.out.println(k);

    }
}
